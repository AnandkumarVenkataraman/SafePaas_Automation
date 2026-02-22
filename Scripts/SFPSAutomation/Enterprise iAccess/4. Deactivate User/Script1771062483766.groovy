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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (52)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (52)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (30)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (50)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (1)'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/input_Search_a-PopupLOV-search apex-item-text (1)'), 
    'AGUERIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Search_a-Button a-PopupLOV-doSearch (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_- Anne Gurin_popup-lov-highlight'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_B162774244382928185'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_End Date_R250713476385354904_ig_grid_vc_cur'), 
    'AGUERIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_AGUERIN_R250713476385354904_ig_grid_vc_cur'), 
    'Yes')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Step 1 of 4 - User Information Revie_cbb41d'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/h2_Breadcrumb_t-Alert-title (1)'), 
    'The user\'s deactivation request has been sent successfully!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_concat(The user, , s deactivation re_e9c826'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (1)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (50)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_1 (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (1)'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41 (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Request Type_u-tC (1)'), 
    'AGUERIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AGUERIN_u-tC'), 'Anne Guérin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC (1)'), 'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_KATADMIN_u-tC'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_1 (1)'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_2 (1)'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_3'), 'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC (1)'), 
    'Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Manager_u-tC (1)'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC (1)'), 'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_JCAREY_u-tC (1)'), 
    'Anandk Venkat')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL (1)'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC (1)'), 
    'DEACTIVATE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC (1)'), 
    'Approval Request Sent')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (1)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (24)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (52)'), 
    'JCAREY')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (52)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (30)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (4)'), 
    'AGUERIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Inbox_R163105974055422926_search_button (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a (4)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Approval Level_P23_APP_LEVEL (1)'), 
    '1-Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Level Type_P23_TYPE (1)'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Type_P23_ACCESS_TYPE (1)'), 
    'Deprovision')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_User Requestor_P23_FROM_USER (1)'), 
    'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Requested for User_P23_TO_USER (1)'), 
    'Guérin, Mrs. Anne')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Requested_P23_ACCESS_NAME (1)'), 
    '*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Description_P23_ACCESS_DESCRIPTION (1)'), 
    '*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Security Context Details_P23_SECURITY_CONTEXT (1)'), 
    'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Status_P23_STATUS (1)'), 
    'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Action_u-radio (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (3)'), 
    'Test Approval for Deactivation, by Level-1 manager')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_Deactivate User Request Approval_B20_ca0ff9'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_AccessPaaS_t-Alert-title (1)'), 
    'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AGUERIN_d8c490 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_1 (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_1 (5)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (52)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (52)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (30)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (50)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_2 (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (1)'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41 (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Request Type_u-tC (1)'), 
    'AGUERIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AGUERIN_u-tC'), 'Anne Guérin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_nobodylocalhost_u-tC (1)'), 
    'Request Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC (1)'), 'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_KATADMIN_u-tC'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_1 (1)'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_2 (1)'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_3'), 'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC (1)'), 
    'Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Manager_u-tC (1)'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC (1)'), 'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_JCAREY_u-tC (1)'), 
    'Anandk Venkat')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_1 (1)'), 
    'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Approved_u-tL (1)'), 
    'Test Approval for Deactivation, by Level-1 manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL (1)'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC (1)'), 
    'DEACTIVATE')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (1)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (50)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_3 (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (1)'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/input_Search_a-PopupLOV-search apex-item-text (1)'), 
    'AGUERIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Search_a-Button a-PopupLOV-doSearch (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_Select List 1 rows. Use arrow keys_a-Ico_131ab6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_B162774244382928185'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Step 1 of 4 - User Information Revie_cbb41d'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_Breadcrumb_a-Notification-item htmldbStdErr'), 
    'The selected user is not eligible for this action. A deactivation request was already approved')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_concat(The user, , s deactivation re_e9c826'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (1)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732_1 (1)'))

//Workflow
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (19)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Scheduler_a-TreeView-label (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_MODULE (1)'),
	3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_ENVIRONMENT'),
	2)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow_wfReport_search_field (2)'),
	'Anne')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Manage Workflow_wfReport_search_button'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow_wfReport_search_field (2)'),
	'Test Approval for Deactivation, by Level-1 manager')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Manage Workflow_wfReport_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_EIA - Deactivate User WF_u-tL'),
	'Completed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_concat(Row text contains , , Test ap_b505d5'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_concat(Row text contains , , Anne, ,_f65fe2'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_ENVIRONMENT'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_MODULE (1)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

//Verify in SFTP Folder
//This code will be added later

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_2 (3)'))

WebUI.closeBrowser()

