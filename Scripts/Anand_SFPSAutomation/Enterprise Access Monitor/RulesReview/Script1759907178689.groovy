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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (24)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (44)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (44)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (22)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (39)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (27)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (20)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rules_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules Review/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules Review/button_Manage Rules Review_B169333222925788909'))
//
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
def currentDateTime = dateFormat.format(new Date())
def rrSurvey = 'KTLN_RulesReviewSurvey_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/input_Name_P138_NAME'), 
    rrSurvey)
//
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/textarea_Description_P138_DESCRIPTION'), 
    'This is a test Rules Review survey, initiated by QA Automation')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/input_Start Date_P138_START_DATEinput'), 
    '17-Oct-2025')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/div_Cancel_t-Region-body'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/a_Inbox_oj-enabled oj-selected oj-hover oj-focus'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/span_End Date_oj-inputdatetime-calendar-ico_3eb258'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/a_Inbox_oj-enabled oj-hover oj-focus'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate Rules Review/button_Initate Rules Review_B169333442274788911'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules Review/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules Review/a'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rules Review Status/input_Send E-mail Reminder_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rules Review Status/button_Open_B169336967640788946'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rules Review Status/h2_Breadcrumb_t-Alert-title'), 
    'Reminder notifications were successfully sent')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rules Review Status/button_Reminder notifications were successf_4d5ade'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rules Review Status/td_TEST RULES REVIEW_t-Report-cell'), 
    'Open')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rules Review Status/a_Manage Rules_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules Review/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules Review/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_ARCPaaS_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Platform_a-TreeView-label (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (17)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (17)'))

//Launch the Rules Review as Rule owner and verify
WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (25)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (45)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (45)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a'))
WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_1'))
WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_2'))
WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_3'))
WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_4'))
WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_5'))
WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_6'))
WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_7'))
WebUI.back()

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/select_Rule In Scope_P144_RULE_IN_SCOPE'),
	'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/select_Activities Verified_P144_ACTIVITIES__ba84de'),
	'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/select_Exceptions Verified_P144_EXCEPTION_VERIFIED'),
	'Y', true)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/textarea_(Value Required)_P144_JUSTIFICATION'),
	'This is a test justification entered by QA Automation')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/input_Actions_selectAll'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/button_(Value Required)_B140580187855806807'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/h2_Breadcrumb_t-Alert-title'),
	'Changes successfully applied')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/button_Changes successfully applied_t-Butto_91b949'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/button_Review Rules - KTLN_RulesReview_OCT1_0824c3'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/h2_Breadcrumb_t-Alert-title_1'),
	'Review successfully submitted')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/h2_EBizApp_JDBC_Env_R175819398183426933_heading'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/button_Changes successfully applied_t-Butto_91b949'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (18)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (18)'))

//Verify the reports

//WebUI.closeBrowser()
