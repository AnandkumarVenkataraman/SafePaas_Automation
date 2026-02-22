import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

//Single Env. UAR, and Analytics
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Analytics_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Access Certification_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/button_Manage Certification_B167126276549450183'))

def dateFormat = new SimpleDateFormat('ddMMyyyy_HHmmss')

def currentDateTime = dateFormat.format(new Date())

def singleEnvUAR1 = 'EBS_UAR_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Page_Initiate User Access/input_(Value Required)_P10_NAME'), singleEnvUAR1)

WebUI.setText(findTestObject('Object Repository/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 'This is a Role-group based UAR; for a single Env., initiated by QA Automation')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_(Value Required)_ui-datepicker-trigg_27f7b7'))

//LocalDate futureDate = LocalDate.now().plusDays(2)
//
//String dayString = futureDate.format(DateTimeFormatter.ofPattern('d'))
//WebUI.comment(dayString)
//
//String dynamicXPath = "//a[@href = '#' and (text() = '$dayString' or . = '$dayString')]"
//WebUI.comment(dynamicXPath)
//TestObject dynamicDateObject = new TestObject()
//
//dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
//
//WebUI.enhancedClick(dynamicDateObject)

//Replacing below code with method
//String dayString = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern('d'))
//
//WebUI.comment('Target Day: ' + dayString)
//
//String dynamicXPath = ('//a[@href=\'#\' and normalize-space(text())=\'' + dayString) + '\']'
//
//WebUI.comment('Dynamic XPath: ' + dynamicXPath)
//
//TestObject dynamicDateObject = new TestObject('dynamicDate')
//
//dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

//End of Replacing below code with method

TestObject dynamicDateObject = CustomKeywords.'Helper.enterDatePlusTwo'()

WebUI.enhancedClick(dynamicDateObject)

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/a_Sa_ui-state-default ui-state-hover'))
WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_Sa_ui-datepicker-close ui-state-defa_3b90c3'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/label_Terminate Access_u-radio'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_Initiate User Access Certification_B_c29e18'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/input_Role Group_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_Cancel_B284164618569469737'))

WebUI.delay(100)

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Certification/h2_Breadcrumb_t-Alert-title'), 'Certification job was initiated successfullyEmail will be sent to appropriate Owner(s) (and Manager(s)), upon successful completion of the job. You can check the status of the job FSOD_INITIATE_UAC_21636 at Administration -> Platform -> Scheduler')
//String uacID = WebUI.getText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
//
//WebUI.comment('UAC ID is : ' + uacID)
def successMsgObj = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f')

WebUI.waitForElementVisible(successMsgObj, 20, FailureHandling.STOP_ON_FAILURE)

String uacID = WebUI.getText(successMsgObj)

WebUI.comment('Certification job message: ' + uacID)

WebUI.delay(1)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
def matcher = uacID =~ '(FSOD_[A-Z0-9_]+)'

String actualUACId = matcher ? (matcher[0])[1] : null

WebUI.comment('Extracted UAC ID: ' + actualUACId)

WebUI.delay(300)
WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/a_Manage Certification_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Page_Manage User Access/input_User Access_userAccessReport_search_field'),
	singleEnvUAR1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/button_User Access_userAccessReport_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/a_Environment Name_reportLink'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_EBS_UAR_SEPT172025_V1_t-Report-cell'),
	'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Open_t-Report-cell'), '0')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Open_t-Report-cell_1'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Open_t-Report-cell_2'), '0')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Maria B_t-Report-cell'), 'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Anandkumar Venkataraman_t-Report-cell'),
	'Open')

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Access Validation/a_Access Certification_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/button_concat(Row text contains , , EBS_UAR_923da7'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
WebUI.callTestCase(findTestCase, null)