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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (20)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (20)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (19)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rules (4)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_a5cb0e'), 
    3)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Approval Status (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Search_R247793226539899118_sort_widge_30a3c6'), 
    'approved')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Search_R247793226539899118_sort_widge_30a3c6'), 
    Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Rule Tags'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Search_R247793226539899118_sort_widge_30a3c6'), 
    'sftp')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Search_R247793226539899118_sort_widge_30a3c6'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(10)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Rule Tags contains , , sftp, _127162'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Rule Tags contains , , sftp, _127162'), FailureHandling.OPTIONAL)

//EAM Setup

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Rules/select_Environment_P0_ENVIRONMENT'), 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Monitor_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Roles Manager_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Setup_a-TreeView-label (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Attributes/a_Manage Rule Attributes_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (1)'),
	'SFTP_1')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Activity Report_R242004504603843036__cd9013'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_SFTP_1_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Activity/td_EBiz_SFTP_u-tL'), 'SFTP_Rule1', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_1 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_Change Organization_u-tL'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_Profile User Values Form_u-tL'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , SFTP_1,_aaf103'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (1)'),
	'SFTP_2')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Activity Report_R242004504603843036__cd9013'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_SFTP_1_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Activity/td_EBiz_SFTP_u-tL_1'), 'SFTP_Rule2', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_Request Sets User Mode Form_u-tL'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_1 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_Requests Run Form_u-tL'), 'EBiz_SFTP')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_Concurrent Request Form View Requests Mode_u-tL'),
	'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_3'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_-_u-tL'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_4'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_Profile User Values Form_u-tL (1)'),
	'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_5'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_SFM Profile User Values Form_u-tL'),
	'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_6'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_-_u-tL (1)'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_7'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_-_u-tL (2)'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , SFTP_1,_aaf103'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (1)'),
	'SFTP_3')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Activity Report_R242004504603843036__cd9013'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_SFTP_1_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Activity/td_EBiz_SFTP_u-tL_2'), 'SFTP_Rule3', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_Monitor Running Jobs - ADS_u-tL'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , SFTP_1,_aaf103'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (1)'),
	'SFTP_4')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Activity Report_R242004504603843036__cd9013'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_SFTP_1_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Activity/td_SFTP_Rule4_u-tL'), 'SFTP_Rule4', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_-_u-tL (3)'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_1 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Activity Entries/td_-_u-tL (4)'), 'EBiz_SFTP', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , SFTP_1,_aaf103'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/a_Manage Activity_a-TreeView-label'))
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/a_Manage Business Process_a-TreeView-label'))
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Attribute Grouping/a_Manage Attribute Groups_a-TreeView-label'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/input_Create_R189436115360253186_search_field (2)'),
	'SFTP')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/button_Create_R189436115360253186_search_button'))
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/button_concat(Row text contains , , SFTP, ,_bafa7b'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/a_Manage Rule Tags_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/select_Environment_P0_ENVIRONMENT'),
	3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/select_Environment_P0_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/a_Manage Exception Type_a-TreeView-label'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/input_Create_R327963090047660484_search_field (1)'),
	'EBS_REM')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/button_Create_R327963090047660484_search_button'))
WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_-_u-tL'), 'Selected', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected_u-tL'),
	'Single Notification', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_-_u-tL_1'), 'Selected', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected_u-tL_1'),
	'SOD Review', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_-_u-tL_2'), 'All User Violations', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_All User Violations_u-tL'),
	'Multiple Notifications', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_-_u-tL_3'), 'All User Responsibilities Violations', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_All User Responsibilities Violations_u-tL'),
	'Multiple Notifications', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_EBS_REM1_u-tC'),
	'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_EBS_REM2_u-tC'),
	'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_EBS_REM3_u-tC'),
	'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_EBS_REM4_u-tC'),
	'Y', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/button_concat(Row text contains , , EBS_REM_ee440d'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))


//SOD Test

//Analytics

//Exception

//Mass Update Exception

//Remediation

//Dashboard

//Mitigations

//Restricted Access SOD

//CrossApp SOD

//Security

//SOD Review Survey

//Rules Review

//WebUI.closeBrowser()

