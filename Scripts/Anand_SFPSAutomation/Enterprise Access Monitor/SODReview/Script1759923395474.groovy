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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (19)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (19)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (19)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (18)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company (7)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/div_Enterprise Access Monitor'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/a_Manage Environment (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Create_R258165063082313757_search_field (2)'),
	'Coupa_Env1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_Go (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_A (2)'), 'A')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(Row text contains , , Coupa_E_2fb848'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_Manage Company'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_Settings (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/input_Settings_R307838823214507554_ig_toolb_058319 (2)'),
	'Enterprise Access Monitor')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/button_Go (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Interval to First Reminder (1)'),
	'Interval to First Reminder')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_5 (1)'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_NUMBER (2)'), 'NUMBER')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Interval Days Between Reminders (1)'),
	'Interval Days Between Reminders')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_3 (1)'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_NUMBER (2)'), 'NUMBER')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/button_concat(Search for , , Enterprise Acc_010a39 (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/span_Email Configuration'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -DataProbeEnterp_9ed873 (1)'),
	3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73 (1)'),
	'Generic', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Select a template OR create a new _80e157'),
	1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73 (1)'),
	'Cancelling Notification', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73 (1)'),
	'Escalation Notification', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73 (1)'),
	'Reassignment Notification', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73 (1)'),
	'Reminder Notification', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Select a template OR create a new _80e157'),
	1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rules (2)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Filter False - Positives (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Entries (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Users (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/button_Cancel (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/span_Roles Manager_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Manage Activity'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/input_Activity Report_R242004504603843036_s_342084'),
	'Coupa_APSpecialist')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_Coupa_APSpecialist_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Coupa_Env1'), 'Coupa_Env1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_AP Specialist Rule'),
	'AP Specialist Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_HIGH'), 'HIGH')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_AP Specialist Rule'),
	'AP Specialist Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Incompatible Sets'),
	'Incompatible Sets')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_SOD Detective'),
	'SOD Detective')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Coupa_APSpecialist2'),
	'Coupa_APSpecialist2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_View AP Reports'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_PERMISSION_apex-edit-view'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_View AP Reports (1)'),
//    20)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_View AP Reports (1)'),
//    'View AP Reports')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Coupa_Env1'), 'Coupa_Env1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Manage Activity'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_Coupa_APSpecialist_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Coupa_Env1'), 'Coupa_Env1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_AP Specialist Rule'),
	'AP Specialist Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_AP Specialist Rule'),
	'AP Specialist Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_HIGH'), 'HIGH')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Incompatible Sets'),
	'Incompatible Sets')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_SOD Detective'),
	'SOD Detective')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Coupa_APSpecialist1'),
	'Coupa_APSpecialist1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Entry'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_PERMISSION_apex-edit-view'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Manage Payments'),
//    20)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Manage Payments'),
//    20)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Manage Payments'),
//    20)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Coupa_Env1 (1)'),
//    20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Manage Activity'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_concat(Row text contains , , Coupa_A_a4bb87'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/a_Manage Business Process'))
WebUI.takeScreenshot()
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/a_Manage Rule Tags (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/input_Create_R189436115360253186_search_field (1)'),
	'Coupa')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/button_Go (1)'))
WebUI.takeScreenshot()
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/button_concat(Row text contains , , Coupa, _1c8400'), FailureHandling.OPTIONAL)


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/a_Manage Exception Type'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_ROLE (1)'), 'ROLE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_ROLE (1)'), 'ROLE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_ROLE (1)'), 'ROLE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_ROLE (1)'), 'ROLE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_No'), 'No')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_PERMISSION'), 'PERMISSION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_PERMISSION'), 'PERMISSION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_PERMISSION'), 'PERMISSION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_PERMISSION'), 'PERMISSION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_No'), 'No')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/a_Manage Remediation Plan (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/input_Create_R327963090047660484_search_field'),
	'Coupa_SODREVIEW')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_COUPA_SODREVIEW_1'),
	'COUPA_SODREVIEW_1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Coupa_SODReview_1 (1)'),
	'Coupa_SODReview_1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Coupa_SODReview_1 (1)'),
	'Coupa_SODReview_1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Y (1)'), 'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected (1)'),
	'Selected')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected (1)'),
	'Selected')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_SOD Review'), 'SOD Review')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/span_SOD Review_fa fa-check'),
	0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_COUPA_SODREVIEW_2'),
	'COUPA_SODREVIEW_2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Coupa_SODReview_2 (1)'),
	'Coupa_SODReview_2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Coupa_SODReview_2 (1)'),
	'Coupa_SODReview_2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Y (1)'), 'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_01-JUN-25'), '01-JUN-25')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected (1)'),
	'Selected')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_SOD Review'), 'SOD Review')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/span_SOD Review_fa fa-remove (1)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/button_concat(Row text contains , , Coupa_S_c8259a'), FailureHandling.OPTIONAL)

//Click Inbox
WebUI.click(findTestObject('Object Repository/Page_Remediation Plan/a_Inbox (1)'))

//WebUI.click(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (4)'))
//
//WebUI.click(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (4)'))
//
//WebUI.click(findTestObject('Object Repository/Page_Home/a_Manage Role Groups (1)'))
//End clicking Inbox
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/a_Manage Role Groups'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/button_Map Roles'))
WebUI.takeScreenshot()
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Unassign Roles'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/td_Purchasing'),
	'Purchasing')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/td_Admin'), 'Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/td_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/td_Admin'), 'Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/td_ANANDK1 - Anand Kumar Venkataraman'),
	'ANANDK1 - Anand Kumar Venkataraman')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/td_MARIAB1 - Maria Brum'),
	'MARIAB1 - Maria Brum')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Back'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/a_Manage Approval Assignments (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R570861162460345_e11d0b (1)'),
	'Purchasing')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Purchasing (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_ANANDK1 Anand Kumar Venkataraman'),
	'ANANDK1 Anand Kumar Venkataraman')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_DPATEL Debabrata Patel'),
	'DPATEL Debabrata Patel')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/span_Assign Role Owners'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Assignments (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , Purchas_11e134'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_SOD Review Configuration (1)'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/label_Both Approvers Responses (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/label_Both Approvers Responses (1)'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/select_Coupa_Env1EBizApp_JDBC_EnvEBiz_SFTPG_99a385'),
	1)
WebUI.takeScreenshot()
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/a_Inbox (1)'))

//SOD Test
////WebUI.openBrowser('')

//WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (12)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (8)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (5)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rules (3)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010 (1)'),
	'9028', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Approval Status'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Approved'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Coupa_Rule1a'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Coupa_Rule1a'), 'Coupa_Rule#1a')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_HIGH'), 'HIGH')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Procure to Pay'), 'Procure to Pay')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Incompatible Sets'),
	'Incompatible Sets')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SOD Detective'), 'SOD Detective')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Coupa_3'), 'Coupa_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Coupa_4a'), 'Coupa_4a')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_ALL'), 'ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Coupa'), 'Coupa')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Coupa_4b'), 'Coupa_4b')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Coupa_3'), 'Coupa_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Approved'), 'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SOD Detective'), 'SOD Detective')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Incompatible Sets'),
	'Incompatible Sets')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_AM'), 'AM')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_HIGH'), 'HIGH')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Coupa_Rule1b'), 'Coupa_Rule#1b')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Coupa_Rule1b'), 0)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Import Rules_R247793226539899118_sear_84acb9 (1)'),
	'Coupa_Rule#1a')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Coupa_Rule1a'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Rules'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Rule Attributes'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Activities'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Exceptions'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_People'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_History'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Corrective Actions'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , Coupa_R_b9b430'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , Coupa_R_b9b430'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Create'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File --'),
	'0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_Restricted AccessSOD DetectiveSOD Pr_810bc4'),
	'DT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_1456471471_RAALL CERP RULESAR_Adjust_d84f42'),
	'All', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_1456471471_RAALL CERP RULESAR_Adjust_d5569a'),
	'Coupa', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME (2)'),
	'SODTest_Jul2_v1')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'),
	'SODTest_Jul2_v1')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Create (2)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/h2_Job initiated SODTEST_JUL2_V1_2025070201_5b498a'),
	0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Job initiated SODTEST_JUL2_V1_202507_bec54b'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/input_Create_R169645132708451655_search_field'),
	'SODTest_Jul2_v1')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Test Log'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Log id (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Level (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/div_LevelInfoWarningError (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/span_No data found (1)'),
	'No data found.')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Inbox'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (12)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (8)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Violation (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	'9028', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_(Value Required)_P74_REQUEST_NAME'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_Search_a-PopupLOV-search apex-item-text'),
	'SODTest_Jul2_v1')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_SODTEST_JUL2_V1'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_Submit_search_search_field'),
	'Coupa_Rule#1a')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_RequesterRequester'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Submit purchase requests'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_PERMISSION'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Create Purchase RequestsCreate Purchase _83ec4a'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Create Purchase Requests'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_ROLE  Requester-PERMISSION  Create Purch_05ec33'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_OPEN (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_1 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Coupa_3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Brittany.Gornick'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Brittany Gornick'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_- (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_INTER'), 0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_concat(Row text contains , , Coupa_R_b9b430'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_Dashboard_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_Analytics_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/a_Violations by User Report (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	'9028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any OneSODTEST_JUL2_V1SODTEST_5e39c7'),
	'12619', true)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Schedule_uvrReport_search_field'),
	'Coupa_Rule#1a')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Procure to Pay'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_SET (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Brittany.Gornick'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Brittany Gornick'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_ROLE'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_RequesterRequester'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Submit purchase requests'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_PERMISSION'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Create Purchase RequestsCreate Purchase _83ec4a'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Create Purchase Requests'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_ROLE  Requester-PERMISSION  Create Purch_05ec33'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_- (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Coupa_4a'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_- (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_- (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_- (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_- (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_- (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_- (1)'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_INTER'),
	0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_concat(Row text contains , , Coupa_R_b9b430'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Violation Matrix by User (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	'9028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any OneSODTEST_JUL2_V1SODTEST_5e39c7'),
	'12619', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/a_Intra Role Violation Details Report (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	'9028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneSODTEST_JUL2_V1SODTEST_81219f'),
	'12619', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/a_Aggregate Violations by User'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	'9028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneSODTEST_JUL2_V1SODTEST_81219f'),
	'12619', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/a_Inbox'))

//WebUI.closeBrowser()

