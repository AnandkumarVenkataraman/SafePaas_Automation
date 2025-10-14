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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (18)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (38)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (38)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (16)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (17)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Setup_a-TreeView-label (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/select_Environment_P0_ENVIRONMENT (1)'),
	2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/td_Submit_t-Report-cell (1)'),
	'General Ledger')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/td_General Ledger_t-Report-cell'),
	'Other Financials')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/button_Create Role Group_B150175829224810110 (1)'))
WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Last Updated By_assignRoleGroupIg_ig_g_2e60ca'),
	'No data found')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Manage Roles Mapping_backBtn (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/a_Manage Role Groups_a-TreeView-label (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R570861162460345_e11d0b (2)'),
	'General Ledger')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Role Groups in Scope_R57086116246034_13d001'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/span (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Role Groups_a-TreeView-label (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_ADV_SUPPLY_CHAIN_SIM_PLANNER_u-tL'),
	'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes_u-tL'),
	'Yes')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , General_11bffa'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R570861162460345_e11d0b (2)'),
	'Other Financials')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Role Groups in Scope_R57086116246034_13d001'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_ADV_SUPPLY_CHAIN_SIM_PLANNER_u-tL'),
	'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes_u-tL'),
	'Yes')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/span (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Role Groups_a-TreeView-label (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , General_11bffa'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Workflow_a-TreeView-label (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/select_Environment_P130_ENVIRONMENT (1)'),
	2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/span (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/span_1 (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/select_Environment_P130_ENVIRONMENT (1)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)
WebUI.delay(2)


//Initiate Violation-level SOD Review Survey
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (34)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Detect Violations_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage Corrective Action_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage SOD Review_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Actions/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Actions/button_Manage Review Actions_B85695331295565220'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/select_(Value Required)_P181_SOD_REQUEST_ID'), 
    1)

//Set the run-time variable here, based on Date and Time
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
def currentDateTime = dateFormat.format(new Date())
def sodRVW_V = 'SODRVW_ViolationLevel_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/input_(Value Required)_P181_NAME'), 
    sodRVW_V)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/textarea_Description_P181_DESCRIPTION'), 
    'This is a test SOD Review Survey; initiated by QA Automation, at Violation Level')

String currentDate = CustomKeywords.'Helper.getCurrentDate'()
WebUI.comment(currentDate)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/input_(Value Required)_P181_START_DATE'), 
    currentDate)

String currentDatePlusTwo = CustomKeywords.'Helper.getDateAfterTwoDays'()
WebUI.comment(currentDatePlusTwo)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/input_(Value Required)_P181_END_DATE'), 
    currentDatePlusTwo)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/div_Expected format DD-Mon-YYYY_row'))
//WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/button_Initiate User Violation Survey_B8581_9ffd07'))
WebUI.delay(5)

//Manage Review Status and Scheduler -> for Violation Level

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Actions/h2_Breadcrumb_t-Alert-title'),
	'SOD Review survey job was initiated successfullyEmail will be sent to appropriate Role-Owner(s) (and Manager(s)), upon successful completion of the jobYou can check the status of the job FSOD_INITIATE_MRA_21632 at Administration -> Platform -> Scheduler', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Actions/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Actions/a_Manage Review Actions_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/input_Manage Review Status_R249123015355222_0c2ff8'),
	sodRVW_V)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_Manage Review Status_R24912301535522_f83c6f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/a'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/td_SODREVIEW_OCT14_V1_t-Report-cell'),
	'Open')
WebUI.delay(120) //giving a delay of 2min., in order for the survey to be generated

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_User Access_B92130881232458609'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/a'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/td_Send E-mail Reminder_t-Report-cell'),
	'ANANDK1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/td_ANANDK1_t-Report-cell'),
	'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/td_Open_t-Report-cell'),
	'MARIAB1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/td_MARIAB1_t-Report-cell'),
	'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/td_SODREVIEW_OCT14_V1_t-Report-cell_1'),
	'SODTST_09102025074354', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_User Access_B92130881232458609'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_concat(Row text contains , , SODREVI_6b6b00'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/select_Environment_P0_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (18)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Platform_a-TreeView-label (1)'))
WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/input_Job Time_SCHEDULER_search_field (1)'),
	'FSOD_INITIATE_MRA_', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Job Time_SCHEDULER_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/td_-_u-tL'), 'SUCCEEDED', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_concat(Row text contains , , FSOD_IN_172907'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (36)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (24)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Detect Violations_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage Corrective Action_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Review Actions_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/select_Environment_P0_ENVIRONMENT'),
	2)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/input_Manage Review Status_R249123015355222_0c2ff8'),
	sodRVW_V)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_Manage Review Status_R24912301535522_f83c6f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/a'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/input_Send E-mail Reminder_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_Open_B86115754532464026'))
WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/h2_Breadcrumb_t-Alert-title'),
	'Email reminder has been sent')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_Email reminder has been sent_t-Butto_8b503d'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/input_Open_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_Open_B86115754532464026'))
WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/h2_Breadcrumb_t-Alert-title'),
	'Email reminder has been sent')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_Email reminder has been sent_t-Butto_8b503d'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_User Access_B92130881232458609'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/button_concat(Row text contains , , SODREVI_6b6b00'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/select_Environment_P0_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Launch the SOD Review survey [at Violation Level] as Role-owner, and remediate
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (14)'))

//WebUI.closeBrowser()
//
//WebUI.openBrowser('')
WebUI.delay(5)

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SOD532C4D28706EB59C3FB881D4C497D719')
WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (21)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (41)'),
	'ANANDK1')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (41)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (19)'))
WebUI.delay(3)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Go_uacReport_actions_button'))
//WebUI.delay(30)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_Select Columns_a-Menu-labelContainer'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_Column_uacReport_column_name'),
//	'VERIFIED', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_Operator_uacReport_STRING_OPT'),
//	'is null', true)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Cancel_ui-button--hot ui-button ui-c_5aa9fd'))
//WebUI.delay(10)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span'))
//WebUI.delay(3)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/a'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_1'))
//WebUI.delay(3)
//
////set the rows per page to 1000
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Go_uacReport_actions_button'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Filter_uacReport_actions_menu_3i'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Rows Per Page_uacReport_actions_menu_fab44e (1)'))
//WebUI.delay(5)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Rows Per Page_uacReport_actions_menu_fab44e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/input_Verified_selectUnselectAll'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE'),
	3)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION'),
	'This is a test justification entered by QA Automation for a Violation Level survey, at Role-owner Level')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Review Actions_verifyAll'))
WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/h2_Breadcrumb_t-Alert-title'),
	'Selected records successfully verified')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Selected records successfully verifi_fd3559'))

//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE'),
//	3)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION_1'),
//	'This is a test justification entered by QA Automation for a Violation Level survey, at Role-owner Level ')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/input_Verified_selectUnselectAll'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Review Actions_verifyAll'))
//WebUI.delay(10)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/h2_Breadcrumb_t-Alert-title'),
//	'Selected records successfully verified')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Selected records successfully verifi_fd3559'))
//WebUI.delay(5)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Go_uacReport_actions_button'))
//WebUI.delay(5)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Rows Per Page_uacReport_actions_menu_3f0951'))
//WebUI.delay(5)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Verified is null_a-Button a-IRR-butt_44d252'))
//WebUI.delay(5)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_-_u-tL'), 'Remediation')
//WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Verify Selection_submitClose'))
WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Thank You and Manage Review Action sen_69f61f/h2_Breadcrumb_R371469424557094181_heading'),
	'Thank You and Manage Review Action sent to Rule Owners')

//WebUI.closeBrowser()

//Rule-owner
//WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SOD7A35E69CA7977138A40C474C6E18869E')
WebUI.maximizeWindow(FailureHandling.OPTIONAL)
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (18)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (38)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (38)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (16)'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE (1)'),
	5)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION (1)'),
	'This is a test override entered by QA Automation for a Violation Level survey, at Rule-owner Level')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/input_Violation Level_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Review Actions_verifyAll (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/h2_Breadcrumb_t-Alert-title (1)'),
	'Selected records successfully verified')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Selected records successfully verifi_fd3559 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_Anand Kumar Venkataraman_u-tL'),
	'Remediation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_Remediation_u-tL'),
	'Risk and Mitigation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_Risk and Mitigation_u-tL'),
	'KAT Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/a (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Verify Selection_submitClose (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Thank You/h2_Breadcrumb_R267063805622848493_heading'),
	'Thanks for validating the Users.')

WebUI.closeBrowser()
