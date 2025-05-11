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

import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

//Launch another browser & login



WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'),
	'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katalon_admin'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/input_Delegate To_P4_DELEGATE_TO'))

WebUI.scrollToElement(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/input_Delegate To_a-PopupLOV-search apex-item-text'),120)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/input_Delegate To_a-PopupLOV-search apex-item-text'),
	'ANANDK1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/span_ANANDK1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/span_Start Date_oj-inputdatetime-calendar-i_558149'))

LocalDate futureDate = LocalDate.now().plusDays(2)

LocalDate todayDate = LocalDate.now()

String dayString = futureDate.format(DateTimeFormatter.ofPattern('d'))
String daytodayString = todayDate.format(DateTimeFormatter.ofPattern('d'))

String dynamicXPath = "//a[@href = '#' and (text() = '$daytodayString' or . = '$daytodayString')]"
TestObject dynamicDateObject = new TestObject()

dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

WebUI.enhancedClick(dynamicDateObject)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/a_11'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/span_Start Date_oj-inputdatetime-calendar-i_558149 - 2'))

futureDate = LocalDate.now().plusDays(2)

dayString = futureDate.format(DateTimeFormatter.ofPattern('d'))

dynamicXPath = "//a[@href = '#' and (text() = '$dayString' or . = '$dayString')]"

dynamicDateObject = new TestObject()

dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

WebUI.enhancedClick(dynamicDateObject)

WebUI.scrollToElement(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/button_Apply'),120)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/button_Apply'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/span_Breadcrumb_t-Icon'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/h2_Delegation successfully saved'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/button_Delegation successfully saved_t-Butt_833b95'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/button_katalon_admin'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification'))

//


WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'), 
1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_Create'))
def dateFormat = new SimpleDateFormat('ddMMyyyy_HHmmss')

def currentDateTime = dateFormat.format(new Date())

def dateTimeString = 'EBS_EACMSurvey_' + currentDateTime

WebUI.comment('The dateTimeString is: ' + dateTimeString)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/input_(Value Required)_P10_NAME'), 
    dateTimeString)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 
dateTimeString)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Popup Calendar End Date'))

futureDate = LocalDate.now().plusDays(2)

dayString = futureDate.format(DateTimeFormatter.ofPattern('d'))

dynamicXPath = "//a[@href = '#' and (text() = '$dayString' or . = '$dayString')]"

dynamicDateObject = new TestObject()

dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

WebUI.enhancedClick(dynamicDateObject)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Close'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_Terminate Access'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_Manual POST'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Create'))

String uacID = WebUI.getText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))

WebUI.comment('UAC ID is : ' + uacID)

WebUI.delay(1)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
def matcher = uacID =~ '(FSOD_[A-Z0-9_]+)'

String actualUACId = matcher ? (matcher[0])[1] : null

WebUI.comment('Extracted UAC ID: ' + actualUACId)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Scheduler'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/input_Job Time_SCHEDULER_search_field'), 
    actualUACId)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Go'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_concat(Row text contains , , FSOD_IN_0d64b8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Manage Workflow'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d'), 
    'EACM', true)
WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_9dc3ed'), 
1)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow - Level 1_wfReport_se_6de8f3'), 
    dateTimeString)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/span_Last Update Date_fa fa-search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Manage Workflow - Level 1 - EBiz_Test123'), 
    20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Manage Workflow - Level 2 - EBiz_Test123'), 
    20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/span_Last Updated By_fa fa-search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_Manage Workflow - Level 3 - EBiz_Test123'), 
    20)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_NA'), 'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_NA'), 'N/A')


WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_Last Updated By_fa fa-wrench'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'),
	'REASSIGN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'),
	'ESCALATION', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'),
	'REMINDER', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_Last Update Date_fa fa-wrench'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select any -Cancel'),
	'CANCEL', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Cancel'))


