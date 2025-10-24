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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (53)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (53)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (31)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (51)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (2)'), 
    '9329', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/input_Search_a-PopupLOV-search apex-item-text (2)'), 
    'QAAutomation_CreateUser')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Search_a-Button a-PopupLOV-doSearch (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_-_popup-lov-highlight'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_B162774244382928185 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_Identity Id_P114_IDENTITY_ID_DISPLAY'), 
    'QAAutomation_CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_First Name_P114_FIRST_NAME_DISPLAY'), 
    'QAAutomation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_Last Name_P114_LAST_NAME_DISPLAY'), 
    'CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_Employee Id_P114_EMPLOYEE_ID_DISPLAY'), 
    '1234')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_Email Id_P114_EMAIL_ID_DISPLAY'), 
    'anandkumar.venkataraman@safepaas.com')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_Department_P114_DEPARTMENT_DISPLAY'), 
    'FIELD OPERATIONS SOUTH WEST (10267)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_(Value Required)_P114_MANAGER_ID_DISPLAY'), 
    'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_(Value Required)_P114_MANAGER_EMAIL_DISPLAY'), 
    'anandkumar.venkataraman@safepaas.com')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_Manager First Name_P114_MANAGER_FIRST__b95d5a'), 
    'Joseph')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_Manager Last Name_P114_MANAGER_LAST_NA_261bea'), 
    'Carey')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Cancel_B248678237587309317'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/input_Role Group  Role_text_field apex-item-text (3)'), 
    'GL_RUSSIA_TAX')

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/select_Role Group  Role_P5_ENTRY_REQUEST_LEFT (1)'), 
    '1280472408', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Back_B160043427427310368 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_End date_grid_ig_grid_vc_cur'), 
    'QAAutomation_CreateUser - QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_QAAutomation_CreateUser - QAAutomation C_c2c7f1'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_QAAutomation CreateUser_grid_ig_grid_vc_cur'), 
    'GL_RUSSIA_TAX')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_GL_RUSSIA_TAX_grid_ig_grid_vc_cur'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_General Ledger Tax, Vision Russia_grid_i_9849d3'), 
    'Responsibility')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/button_Back_B161484147755320297 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/h2_Breadcrumb_t-Alert-title (1)'), 
    'Request Submitted. Please check after sometime')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Request Submitted. Please check afte_fe3187 (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/p (1)'), 'Violation check in progress, the Submit Access button will be enabled upon completion and click on Refresh button.')

WebUI.delay(600) //giving a max. delay of 10min., in order for the Violation chk. to complete

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Step 4 of 4 - Violations Review_B162_df356c (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Exception scope_u-tL (1)'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_QAAutomation CreateUser_u-tL'), 
    'Rule4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Rule4_u-tL'), 'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_SET_u-tL (1)'), 
    'SFTP_Env2_Act4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_SFTP_Env2_Act4_u-tL'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_General Ledger Tax, Vision Russia_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Function_u-tL (1)'), 
    'FND_FNDPOMSV')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/span_-_a-IRR-pagination-label (1)'), 
    '1 - 11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_FND_FNDPOMSV_u-tL'), 
    'Profile User Values')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Profile User Values_u-tL'), 
    'Responsibility : General Ledger Tax, Vision Russia->Menu : GL_SUPERUSER->Menu : GL_SU_MANAGER->Function : Profile User Values')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Step 4 of 4 - Violations Review_B162_1fed3d (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/h2_Breadcrumb_t-Alert-title (2)'), 
    'Access Request Submitted. Please check after sometime')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Attribute Name_a-IRR-headerLink (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Request status_u-tL (1)'), 
    'GL_RUSSIA_TAX')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_GL_RUSSIA_TAX_u-tL'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_General Ledger Tax, Vision Russia_u-tC'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Responsibility_u-tL'), 
    '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_-_u-tL'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_-_u-tC'), 'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Attribute Name_a-IRR-headerLink (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Cancel_B248678237587309317'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_Access Request Submitted. Please check a_8576bb'), 
    'A request to create this user has already been submitted and is currently in progress. Please wait for the workflow to complete or contact your administrator for further assistance')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5_1'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (2)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (51)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_1 (2)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41 (3)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    '9329', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _1a154e'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Request Type_u-tC (2)'), 
    'QAAutomation_CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_QAAutomation_CreateUser_u-tC'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC (2)'), 'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_KATADMIN_u-tC (1)'), 
    'GL_RUSSIA_TAX')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_GL_RUSSIA_TAX_u-tC'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_General Ledger Tax, Vision Russia_u-tC'), 
    '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_General Ledger Tax, Vision Russia_u-tC_1'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC (2)'), 
    'Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Manager_u-tC (2)'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC (2)'), 'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_JCAREY_u-tC (2)'), 
    'Joseph Carey')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC (2)'), 
    'Approval Request Sent')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL (2)'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC (2)'), 
    'CREATE')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (24)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (25)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (53)'), 
    'JCAREY')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (53)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (31)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (5)'), 
    'QAAutomation_CreateUser')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Inbox_R163105974055422926_search_button (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tR'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tL (1)'), 'Create User and Access Request')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Create User and Access Request_u-tL'), 
    'Manager')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a (5)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Approval Level_P23_APP_LEVEL (2)'), 
    '1-Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Level Type_P23_TYPE (2)'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Type_P23_ACCESS_TYPE (2)'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_User Requestor_P23_FROM_USER (2)'), 
    'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Requested for User_P23_TO_USER (2)'), 
    'QAAutomation CreateUser - QAAutomation_CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Requested_P23_ACCESS_NAME (2)'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Description_P23_ACCESS_DESCRIPTION (2)'), 
    'General Ledger Tax Responsibility for Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Security Context Details_P23_SECURITY_CONTEXT (2)'), 
    'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Status_P23_STATUS (2)'), 
    'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Action_u-radio (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (4)'), 
    'Test Approval for Create User at Level-1 Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Exception Scope_u-tL (1)'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_QAAutomation CreateUser_u-tL'), 
    'Rule4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Rule4_u-tL'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SET_u-tL (1)'), 
    'SFTP_Env2_Act4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SFTP_Env2_Act4_u-tL'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_General Ledger Tax, Vision Russia_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Function_u-tL (1)'), 
    'FND_FNDPOMSV')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_FND_FNDPOMSV_u-tL'), 
    'Profile User Values')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_OPEN_a-IRR-pagination-label (1)'), 
    '1 - 11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Profile User Values_u-tL'), 
    'Responsibility : General Ledger Tax, Vision Russia->Menu : GL_SUPERUSER->Menu : GL_SU_MANAGER->Function : Profile User Values')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_Create User Access Request Approval__670f13'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_AccessPaaS_t-Alert-title (2)'), 
    'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , QAAutom_6c1694'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_1 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_1 (6)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (53)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (53)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (31)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (51)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_2 (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    '9329', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _1a154e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Attribute Name_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_CREATE_u-tC'), 'QAAutomation_CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_QAAutomation_CreateUser_u-tC_1'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_2 (1)'), 
    'Request Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_1 (2)'), 'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_KATADMIN_u-tC_1'), 
    'GL_RUSSIA_TAX')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_GL_RUSSIA_TAX_u-tC_1'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_General Ledger Tax, Vision Russia_u-tC_3'), 
    '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_General Ledger Tax, Vision Russia_u-tC_4'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC_2 (1)'), 
    'Role Group Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Role Group Primary Owner_u-tC (1)'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC_1 (1)'), 'ANANDK')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_ANANDK_u-tC (1)'), 
    'ANANDK Anandkumar Venkataraman')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_ANANDK Anandkumar Venkataraman_u-tC'), 
    'anandkumar.venkataraman@safepaas.com')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_3'), 
    'Approval Request Sent')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL_1 (1)'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC_1 (1)'), 
    'CREATE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_4'), 
    'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Approved_u-tL (2)'), 
    'Test Approval for Create User at Level-1 Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL (2)'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC (2)'), 
    'CREATE')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_1 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (24)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_2 (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (53)'), 
    'ANANDK')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (53)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (31)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (5)'), 
    'QAAutomation_CreateUser')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Inbox_R163105974055422926_search_button (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tR_1'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tL (1)'), 'Create User and Access Request')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Create User and Access Request_u-tL_1'), 
    'Primary Owner')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_1 (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Approval Level_P23_APP_LEVEL_1 (1)'), 
    '2-Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Level Type_P23_TYPE (2)'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Type_P23_ACCESS_TYPE (2)'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_User Requestor_P23_FROM_USER (2)'), 
    'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Requested for User_P23_TO_USER (2)'), 
    'QAAutomation CreateUser - QAAutomation_CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Requested_P23_ACCESS_NAME (2)'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Description_P23_ACCESS_DESCRIPTION (2)'), 
    'General Ledger Tax Responsibility for Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Security Context Details_P23_SECURITY_CONTEXT (2)'), 
    'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Status_P23_STATUS (2)'), 
    'In Approval Progress')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Exception Scope_u-tL (1)'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_QAAutomation CreateUser_u-tL'), 
    'Rule4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Rule4_u-tL'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SET_u-tL (1)'), 
    'SFTP_Env2_Act4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SFTP_Env2_Act4_u-tL'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_General Ledger Tax, Vision Russia_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Function_u-tL (1)'), 
    'FND_FNDPOMSV')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_FND_FNDPOMSV_u-tL'), 
    'Profile User Values')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_OPEN_a-IRR-pagination-label (1)'), 
    '1 - 11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Profile User Values_u-tL'), 
    'Responsibility : General Ledger Tax, Vision Russia->Menu : GL_SUPERUSER->Menu : GL_SU_MANAGER->Function : Profile User Values')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Action_u-radio (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (4)'), 
    'Test Approval by Level-2 Primary')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_Create User Access Request Approval__670f13'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_AccessPaaS_t-Alert-title (2)'), 
    'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/select_Notifications_P1_NOTIFICATIONS'), 
    'Closed', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_-_u-tL'), 'Closed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , QAAutom_6c1694_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/select_Notifications_P1_NOTIFICATIONS'), 
    'Open', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_2 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_3 (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (53)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (53)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (31)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (51)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_3 (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    '9329', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _1a154e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Attribute Name_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_CREATE_u-tC_1'), 'QAAutomation_CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_QAAutomation_CreateUser_u-tC_2'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_QAAutomation CreateUser_u-tC'), 
    'anandkumar.venkataraman@safepaas.com')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_1 (2)'), 
    'Request Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_2 (2)'), 'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_KATADMIN_u-tC_2'), 
    'GL_RUSSIA_TAX')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_GL_RUSSIA_TAX_u-tC_2'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_General Ledger Tax, Vision Russia_u-tC_5'), 
    '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_General Ledger Tax, Vision Russia_u-tC_6'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC_3'), 
    'Role Group Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Role Group Secondary Owner_u-tC (1)'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC_2 (1)'), 'MARIAB')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_MARIAB_u-tC (1)'), 
    'MARIAB Maria B')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_MARIAB Maria B_u-tC'), 
    'anandkumar.venkataraman@safepaas.com')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_5'), 
    'Approval Request Sent')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL_2 (1)'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC_2 (1)'), 
    'CREATE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_6'), 
    'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Approved_u-tL_1 (1)'), 
    'Test Approval by Level-2 Primary')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_2 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (24)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_4 (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (53)'), 
    'MARIAB')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (53)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (31)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (5)'), 
    'QAAutomation_CreateUser')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Inbox_R163105974055422926_search_button (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tR_2'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tL (1)'), 'Create User and Access Request')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Create User and Access Request_u-tL_2'), 
    'Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_-_u-tL_1'), 'Open')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_2 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Approval Level_P23_APP_LEVEL_2 (1)'), 
    '3-Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Level Type_P23_TYPE (2)'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Type_P23_ACCESS_TYPE (2)'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_User Requestor_P23_FROM_USER (2)'), 
    'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Requested for User_P23_TO_USER (2)'), 
    'QAAutomation CreateUser - QAAutomation_CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Requested_P23_ACCESS_NAME (2)'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Description_P23_ACCESS_DESCRIPTION (2)'), 
    'General Ledger Tax Responsibility for Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Security Context Details_P23_SECURITY_CONTEXT (2)'), 
    'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Status_P23_STATUS (2)'), 
    'In Approval Progress')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Exception Scope_u-tL (1)'), 
    'QAAutomation CreateUser')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_QAAutomation CreateUser_u-tL'), 
    'Rule4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Rule4_u-tL'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SET_u-tL (1)'), 
    'SFTP_Env2_Act4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SFTP_Env2_Act4_u-tL'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_General Ledger Tax, Vision Russia_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Function_u-tL (1)'), 
    'FND_FNDPOMSV')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_FND_FNDPOMSV_u-tL'), 
    'Profile User Values')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_OPEN_a-IRR-pagination-label (1)'), 
    '1 - 11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Profile User Values_u-tL'), 
    'Responsibility : General Ledger Tax, Vision Russia->Menu : GL_SUPERUSER->Menu : GL_SU_MANAGER->Function : Profile User Values')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Action_u-radio (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (4)'), 
    'This is a test approval for Create User by Level-3 Secondary')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_Create User Access Request Approval__670f13'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_AccessPaaS_t-Alert-title (2)'), 
    'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_QAAutomation_CreateU_a-IRR-noDataMsg-text'), 
    'No data found.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/select_Notifications_P1_NOTIFICATIONS'), 
    'Closed', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_-_u-tL'), 'Closed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , QAAutom_6c1694_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/select_Notifications_P1_NOTIFICATIONS'), 
    'Open', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_3 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_5 (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (53)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (53)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (31)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (51)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_4 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    '9329', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _1a154e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Attribute Name_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_7'), 
    'Request Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_8'), 
    'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Approved_u-tL_2'), 
    'This is a test approval for Create User by Level-3 Secondary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC_2 (1)'), 
    'CREATE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL_3'), 'Executed')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT (2)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_3 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (51)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_5 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (2)'), 
    '9329', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/input_Search_a-PopupLOV-search apex-item-text (2)'), 
    'QAAutomation_CreateUser')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Search_a-Button a-PopupLOV-doSearch (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_-_popup-lov-highlight'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_B162774244382928185 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Request status_u-tL (1)'), 
    'GL_RUSSIA_TAX')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_GL_RUSSIA_TAX_u-tL'), 
    'General Ledger Tax, Vision Russia')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_General Ledger Tax, Vision Russia_u-tC'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_-_u-tC_1'), '24-OCT-25')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_-_u-tC_2'), 'Approved')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Attribute Name_a-IRR-headerLink (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Documentation_a-Button a-IRR-button _ce8d41_1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Cancel_B248678237587309317'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_Breadcrumb_a-Notification-item htmldbStdErr (1)'), 
    'A request to create this user has already been processed in the client system. Please run the snapshot for this user to be available for access provisioning')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5 (3)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT (2)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732_1 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (24)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_6 (1)'))

WebUI.closeBrowser()
