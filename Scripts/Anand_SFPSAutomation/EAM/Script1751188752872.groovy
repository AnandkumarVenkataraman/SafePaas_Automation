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

//WebUI.closeBrowser()

