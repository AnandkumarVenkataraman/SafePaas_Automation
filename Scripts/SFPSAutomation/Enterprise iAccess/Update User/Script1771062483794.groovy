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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'AALLEN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Request Deactivate User_B162775359869928197'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/input_Role Group  Role_text_field apex-item-text (2)'), 
    'assets_f')

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/select_Role Group  Role_P5_ENTRY_REQUEST_LEFT'), 
    '1277902111', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Back_B160043427427310368'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_AALLEN - Arlene Allen_grid_ig_grid_vc_cur'), 
    'ASSETS_F', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_ASSETS_F_grid_ig_grid_vc_cur'), 
    'Assets Vision France', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/button_Back_B161484147755320297'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/h2_Breadcrumb_t-Alert-title'), 
    'Request Submitted. Please check after sometime')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Request Submitted. Please check afte_fe3187 (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/p'), 'Violation check in progress, the Submit Access button will be enabled upon completion and click on Refresh button.')
WebUI.delay(600)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Step 4 of 4 - Violations Review_B162_df356c'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Exception scope_u-tL'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_AALLEN_u-tL'), 
    'Depreciation vs. Inventory Rule2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Depreciation vs. Inventory Rule2_u-tL'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_SET_u-tL'), 'EBiz_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_EBiz_3_u-tL'), 
    'Assets Progress FR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Assets Progress FR_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Function_u-tL'), 
    'FAEXDEPR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_FAEXDEPR_u-tL'), 
    'Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/td_Extended Depreciation_u-tL'), 
    'Responsibility : Assets Progress FR->Menu : FA_MAIN->Menu : FA_DEPRN->Function : Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/span_-_a-IRR-pagination-label'), 
    '1 - 50')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Step 4 of 4 - Violations Review_B162_df356c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Step 4 of 4 - Violations Review_B162_1fed3d'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/h2_Breadcrumb_t-Alert-title'), 
    'Access Request Submitted. Please check after sometime')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Attribute Name_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Request status_u-tL'), 
    'ASSETS_F')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_ASSETS_F_u-tL'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Assets Vision France_u-tC'), 
    'Responsibility')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_1'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Request Type_u-tC'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC'), 'Arlene Allen')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC_1'), 'ASSETS_F')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_ASSETS_F_u-tC'), 'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC'), 
    '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC_1'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC'), 'Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Manager_u-tC'), 'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC'), 'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_JCAREY_u-tC'), 'Joseph carey')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC'), 
    'Approval Request Sent')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC'), 'UPDATE')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (22)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (23)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'JCAREY')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (3)'), 
    'AALLEN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Inbox_R163105974055422926_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Approval Level_P23_APP_LEVEL'), 
    '1-Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Level Type_P23_TYPE'), 
    'Primary')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Type_P23_ACCESS_TYPE'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_User Requestor_P23_FROM_USER'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Requested for User_P23_TO_USER'), 
    'Allen, Miss Arlene Nancy')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Requested_P23_ACCESS_NAME'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Description_P23_ACCESS_DESCRIPTION'), 
    'Assets Vision France Euro')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Security Context Details_P23_SECURITY_CONTEXT'), 
    'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Status_P23_STATUS'), 
    'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Action_u-radio'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (2)'), 
    'Test Approval by Level-1 Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Exception Scope_u-tL'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_AALLEN_u-tL'), 
    'Depreciation vs. Inventory Rule2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Depreciation vs. Inventory Rule2_u-tL'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SET_u-tL'), 
    'EBiz_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_EBiz_3_u-tL'), 
    'Assets Progress FR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Assets Progress FR_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Function_u-tL'), 
    'FAEXDEPR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_FAEXDEPR_u-tL'), 
    'Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Extended Depreciation_u-tL'), 
    'Responsibility : Assets Progress FR->Menu : FA_MAIN->Menu : FA_DEPRN->Function : Extended Depreciation')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_User Access Request Approval_B202484_77ab37'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_AccessPaaS_t-Alert-title'), 
    'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AALLEN,_21c57e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_2'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_1 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_1 (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_3'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_nobodylocalhost_u-tC'), 
    'Request Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_UPDATE_u-tC'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC_2'), 'Arlene Allen')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_1'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC_3'), 'ASSETS_F')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_ASSETS_F_u-tC_1'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC_2'), 
    '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC_3'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC_1'), 
    'Role Group Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Role Group Primary Owner_u-tC'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC_1'), 'ANANDK')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_ANANDK_u-tC'), 'ANANDK Anandkumar Venkataraman')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_1'), 
    'Approval Request Sent')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL_1'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC_1'), 
    'UPDATE')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_2 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_2 (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'ANANDK')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (3)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (3)'), 
    'AALLEN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Inbox_R163105974055422926_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tL'), 'Access Request')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Access Request_u-tL'), 'Primary Owner')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_1 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Approval Level_P23_APP_LEVEL_1'), 
    '2-Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Level Type_P23_TYPE'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Type_P23_ACCESS_TYPE'), 
    'Responsibility provision')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_User Requestor_P23_FROM_USER'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Requested for User_P23_TO_USER'), 
    'Allen, Miss Arlene Nancy')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Requested_P23_ACCESS_NAME'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Description_P23_ACCESS_DESCRIPTION'), 
    'Assets Vision France Euro')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Security Context Details_P23_SECURITY_CONTEXT'), 
    'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Status_P23_STATUS'), 
    'In Approval Progress')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Exception Scope_u-tL'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_AALLEN_u-tL'), 
    'Depreciation vs. Inventory Rule2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Depreciation vs. Inventory Rule2_u-tL'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SET_u-tL'), 
    'EBiz_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_EBiz_3_u-tL'), 
    'Assets Progress FR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Assets Progress FR_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Function_u-tL'), 
    'FAEXDEPR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_FAEXDEPR_u-tL'), 
    'Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Extended Depreciation_u-tL'), 
    'Responsibility : Assets Progress FR->Menu : FA_MAIN->Menu : FA_DEPRN->Function : Extended Depreciation')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Action_u-radio'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (2)'), 
    'Test Approval by Level-2 Primary')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_User Access Request Approval_B202484_77ab37'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_AccessPaaS_t-Alert-title'), 
    'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AALLEN,_21c57e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_3'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_4'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_UPDATE_u-tC_1'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC_4'), 'Arlene Allen')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_nobodylocalhost_u-tC_1'), 
    'Request Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_2'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC_5'), 'ASSETS_F')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_ASSETS_F_u-tC_2'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC_4'), 
    '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC_5'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC_2'), 
    'Role Group Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Role Group Secondary Owner_u-tC'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC_2'), 'MARIAB')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_MARIAB_u-tC'), 'MARIAB Maria B')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_alexis.majulsafepaas.com_u-tC'), 
    'Approval Request Sent')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_anandkumar.venkataramansafepaas.com_u-tC_2'), 
    'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Approved_u-tL'), 'Test Approval by Level-2 Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL_2'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC_2'), 
    'UPDATE')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_2 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_4'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'MARIAB')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Help_t-Tabs-link'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (3)'), 
    'AALLEN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Inbox_R163105974055422926_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Link_u-tL'), 'Access Request')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/td_Access Request_u-tL_1'), 'Secondary Owner')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Approval Level_P23_APP_LEVEL_2'), 
    '3-Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Level Type_P23_TYPE'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Type_P23_ACCESS_TYPE'), 
    'Responsibility provision')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_User Requestor_P23_FROM_USER'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Requested for User_P23_TO_USER'), 
    'Allen, Miss Arlene Nancy')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Requested_P23_ACCESS_NAME'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Access Description_P23_ACCESS_DESCRIPTION'), 
    'Assets Vision France Euro')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Security Context Details_P23_SECURITY_CONTEXT'), 
    'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Status_P23_STATUS'), 
    'In Approval Progress')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Exception Scope_u-tL'), 
    'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_AALLEN_u-tL'), 
    'Depreciation vs. Inventory Rule2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Depreciation vs. Inventory Rule2_u-tL'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_SET_u-tL'), 
    'EBiz_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_EBiz_3_u-tL'), 
    'Assets Progress FR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Assets Progress FR_u-tL'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Function_u-tL'), 
    'FAEXDEPR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_OPEN_a-IRR-pagination-label'), 
    '1 - 50')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_FAEXDEPR_u-tL'), 
    'Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/td_Extended Depreciation_u-tL'), 
    'Responsibility : Assets Progress FR->Menu : FA_MAIN->Menu : FA_DEPRN->Function : Extended Depreciation')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Action_u-radio'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (2)'), 
    'Test Approval by Level-3 Secondary')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_User Access Request Approval_B202484_77ab37'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_AccessPaaS_t-Alert-title'), 
    'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AALLEN,_21c57e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_5'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_5'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Request status_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_UPDATE_u-tC_1'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC_4'), 'Arlene Allen')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_nobodylocalhost_u-tC_2'), 
    'Request Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tC_2'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_AALLEN_u-tC_5'), 'ASSETS_F')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_ASSETS_F_u-tC_1'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC_4'), 
    '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Assets Vision France_u-tC_5'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary_u-tC_2'), 
    'Role Group Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Role Group Secondary Owner_u-tC'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y_u-tC_2'), 'MARIAB')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_MARIAB_u-tC'), 'MARIAB Maria B')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_alexis.majulsafepaas.com_u-tC_1'), 
    'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Approved_u-tL_1'), 
    'Test Approval by Level-3 Secondary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_-_u-tL_2'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending_u-tC_2'), 
    'UPDATE')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox_t-Button t-Button--icon t-Button--h_469732_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_2 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_6'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (31)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (51)'), 
    'AALLEN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (51)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Analytics_a-TreeView-label_6'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Attribute Name_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Documentation_a-Button a-IRR-button _ce8d41_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Request status_u-tL'), 
    'ASSETS_F')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_ASSETS_F_u-tL'), 
    'Assets Vision France')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Assets Vision France_u-tC'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a'), 'Approved')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732_1'))

//Workflow
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Scheduler_a-TreeView-label (3)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_MODULE (3)'),
	3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_ENVIRONMENT (2)'),
	2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Comments_a-IRR-headerLink (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Comments_a-IRR-headerLink (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Documentation_a-Button a-IRR-button _1a154e (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow_wfReport_search_field (4)'),
	'AALLEN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Manage Workflow_wfReport_search_button (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow_wfReport_search_field (4)'),
	'Assets Vision France')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Manage Workflow_wfReport_search_button (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_EIA - Access Request WF - Update Access_u-tL'),
	'Completed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_EIA - Access Request WF - Update Access_i_11bd81'))

WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Documentation_a-Button a-IRR-button _1a154e (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Documentation_a-Button a-IRR-button _ce8d41 (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_ENVIRONMENT (2)'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_(Value Required)_P37_MODULE (3)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (2)'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (22)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_7'))

WebUI.closeBrowser()
