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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

//This is Workflow for a Single Env.
//For multi-Env's Workflow, pls. refer to -> Env_ReArchitecture

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))

//First, initiate a new UAR, for Identity based grouping Env.
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Analytics_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Access Certification_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/button_Manage Certification_B167126276549450183'))

def dateFormat = new SimpleDateFormat('ddMMyyyy_HHmmss')

def currentDateTime = dateFormat.format(new Date())

def singleEnvUAR_WF = 'WF_UAR_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Page_Initiate User Access/input_(Value Required)_P10_NAME'), singleEnvUAR_WF)

WebUI.setText(findTestObject('Object Repository/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 'This UAR is initiated by QA Automation; to test the Workflow, for a single Env.')

WebUI.delay(10)

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
TestObject dynamicDateObject = CustomKeywords.'Helper.enterDatePlusTwo'()

WebUI.enhancedClick(dynamicDateObject)
WebUI.comment("clickedOnElement")
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/a_Sa_ui-state-default ui-state-hover'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_Sa_ui-datepicker-close ui-state-defa_3b90c3'))

//select Terminate Access and Automatic POST
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/label_Terminate Access_u-radio'))
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_(Value Required)_u-radio'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_Ticket Creation_u-radio'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/a_Ticket Creation_infot'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Close_js-confirmBtn ui-button ui-cor_5ef4b5'))

//End -> selection of Terminate Access and Automatic POST

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

WebUI.comment("Certification job message: " + uacID)
WebUI.delay(1)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
def matcher = uacID =~ '(FSOD_[A-Z0-9_]+)'

String actualUACId = matcher ? (matcher[0])[1] : null

WebUI.comment('Extracted UAC ID: ' + actualUACId)
WebUI.delay(300)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/a_Manage Certification_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Page_Manage User Access/input_User Access_userAccessReport_search_field'),
	singleEnvUAR_WF)

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

//Workflow Actions
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (16)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Scheduler_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_MODULE'),
	1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_EACM_REQUEST'),
	1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_ENVIRONMENT_EACM'),
	2)
WebUI.delay(10) //delay of 10 seconds, in order for the Workflow to load

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/span_Last Update Date_fa fa-search (1)'))
WebUI.delay(10) //delay of 10 seconds, in order for Level-1 and Level-2 to render

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_Last Update Date_u-tL'),
	'EACM - Level 1 - Certification WF')
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_Last Updated By_u-tL'),
	'EACM - Level 2 - Role Group WF')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/span_Last Updated By_fa fa-search (1)'))
WebUI.delay(10) //delay of 10 seconds, in order for Level-3 to render

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_NA_u-tL'), 'EACM - Level 3 - User Access WF')

//Escalation
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_Last Updated By_fa fa-wrench (1)'))
WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P35_ACTIONS_AVAILABLE'),
	1)
WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_Original Approver_P35_ORIG_APPROVER'),
	1)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manager Name_P35_MANAGER_NAME'),
	'Test Escalation for Primary from QA Automation')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manager Email_P35_MANAGER_EMAIL'),
	'anandkumar.venkataraman@safepaas.com')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Cancel_B97669297740057722'))
WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Breadcrumbs_t-Alert-title'),
	'Escalation sent successfully')
WebUI.delay(10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Escalation sent successfully_t-Butto_d00ca4'))
WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_Last Updated By_fa fa-wrench (1)'))
WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P35_ACTIONS_AVAILABLE'),
	1)
WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_Original Approver_P35_ORIG_APPROVER'),
	2)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manager Name_P35_MANAGER_NAME'),
	'Test Escalation for Secondary from QA Automation')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manager Email_P35_MANAGER_EMAIL'),
	'anandkumar.venkataraman@safepaas.com')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Cancel_B97669297740057722'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Breadcrumbs_t-Alert-title'),
	'Escalation sent successfully')
WebUI.delay(10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Escalation sent successfully_t-Butto_d00ca4'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_Last Updated By_fa fa-wrench (1)'))
//WebUI.delay(10)
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P35_ACTIONS_AVAILABLE'),
//	1)
//WebUI.delay(5)
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_Original Approver_P35_ORIG_APPROVER'),
//	2)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manager Name_P35_MANAGER_NAME'),
//	'Test Escalation for Secondary from QA Automation')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manager Email_P35_MANAGER_EMAIL'),
//	'anandkumar.venkataraman@safepaas.com')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Cancel_B97669297740057722'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Breadcrumbs_t-Alert-title'),
//	'Escalation sent successfully')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Escalation sent successfully_t-Butto_d00ca4'))
WebUI.delay(10)
//End of Escalation

//Reminder
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_Last Updated By_fa fa-wrench (1)'))

WebUI.delay(20)

WebUI.focus(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P35_ACTIONS_AVAILABLE (2)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P35_ACTIONS_AVAILABLE (2)'),
	3)

WebUI.delay(20)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_Original Approver_P35_ORIG_APPROVER (2)'),
	1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Cancel_B97669297740057722 (2)'))
WebUI.delay(20)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Breadcrumbs_t-Alert-title_1'),
	'Reminder sent successfully')
WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Escalation sent successfully_t-Butto_d00ca4'))
WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_Last Updated By_fa fa-wrench (1)'))
WebUI.delay(20)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P35_ACTIONS_AVAILABLE (3)'),
	3)
WebUI.delay(20)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_Original Approver_P35_ORIG_APPROVER (3)'),
	2)
WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Cancel_B97669297740057722 (3)'))
WebUI.delay(20)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Breadcrumbs_t-Alert-title_1'),
	'Reminder sent successfully')
WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Escalation sent successfully_t-Butto_d00ca4'))

//End Reminder

WebUI.acceptAlert(FailureHandling.OPTIONAL)
