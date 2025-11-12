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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (6)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (57)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (57)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (34)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (17)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Environment_a-TreeView-label (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Breadcrumbs_B275422870878048149'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/select_(Value Required)_P47_PRIMARY_DS'), 
    '9069', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/select_(Value Required)_P47_SEC_OBJ'), 
//    '- Please select any one -', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/select_(Value Required)_P47_SECONDARY_DS'), 
    '5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/select_(Value Required)_P47_SEC_OBJ'), 
    'FSOD.FSOD_USER_ALL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/select_Stop Secondary Datasource Hierarchy _ed94f7'), 
    '481', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/button_Cancel_B289855814502879714'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/h2_Breadcrumbs_t-Alert-title'), 
    'Mapping successfully created')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mapping successfully created_t-Butto_00317c'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/input_Mappings Report_R275422977080048150_s_4fdaf0 (2)'), 
    'SAP_S4HANA')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mappings Report_R275422977080048150__6d4728 (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_SAP_S4HANA_u-tL'), 
    'Operations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Join Condition_u-tL (2)'), 
    'SAP_S4HANA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Operations_u-tL (2)'), 
    'EBizApp_JDBC_Env')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_EBizApp_JDBC_Env_u-tL'), 
    'Operations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Operations_u-tL_1'), 
    'Users')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Users_u-tL (1)'), 
    'FSOD.FSOD_USER_ALL.USER_NAME = FSOD.FSOD_USER_ALL.USER_NAME')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_concat(Row text contains , , SAP_S4H_081f15'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (58)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (40)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Detect Violations_a-TreeView-label (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Manage SOD Test_B169646823131451684 (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_(Value Required)_P30_DS_ID (3)'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_Test Objective_P30_TEST_TYPE_CODE'), 
    'DT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_Rule Tags_P30_RULE_TAG_LEFT (3)'), 
    'Z_949', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_Cross Environments_P30_CROSS_ENVIRON_b6ff31'), 
    '9069', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Cross Environments_P30_CROSS_ENVIRON_e9d7db'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Rule Tags_u-tL'), 'Z_AccessChecks_OR_Rule#4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_OR_Rule4_u-tL'), 
    'Z_AccessChecks_OR_Rule#4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_OR_Rule4_u-tL_1'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_u-tL'), 'L')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_L_u-tL'), 'DT')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_u-tL'), 'Z_949')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_949_u-tL'), 'Z_AccessChecks_OR_Rule#2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_OR_Rule2_u-tL'), 
    'Z_AccessChecks_OR_Rule#2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_OR_Rule2_u-tL_1'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_u-tL_1'), 'H')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_H_u-tL'), 'DT')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_u-tL_1'), 'Z_949')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_949_u-tL_1'), 'Z_AccessChecks_Rule#1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_Rule1_u-tL'), 
    'Z_AccessChecks_Rule#1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_Rule1_u-tL_1'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_u-tL_2'), 'M')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_M_u-tL'), 'DT')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_u-tL_2'), 'Z_949')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_949_u-tL_2'), 'Z_AccessChecks_OR_Rule#3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_OR_Rule3_u-tL'), 
    'Z_AccessChecks_OR_Rule#3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Z_AccessChecks_OR_Rule3_u-tL_1'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_u-tL_3'), 'H')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_H_u-tL_1'), 'DT')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_u-tL_3'), 'Z_949')

//Set the run-time variable here, based on Date and Time
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
def currentDateTime = dateFormat.format(new Date())
def sodTST = 'sapXsod_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME (6)'), 
    sodTST)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS (4)'), 
    'This is a test CrossApp SOD Test, initiated by QA Automation, for SAP')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Cancel_B123623581915827245 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3 (2)'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/h2_Breadcrumb_t-Alert-title (2)'), 
    'Job initiated: SAP_CROSSSODTST__202511120057.SOD Test initiated successfully.', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Job initiated SAP_CROSSSODTST__20251_6d372a'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/input_Create_R169645132708451655_search_field (4)'), 
    sodTST)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Create_R169645132708451655_search_button (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/td_-_u-tL (3)'), 'Running', FailureHandling.OPTIONAL)

WebUI.delay(300)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Create_R169645132708451655_search_button (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/td_SAP_S4HANA_u-tL'), 
    'Closed', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a (2)'))

WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Description_a-IRR-headerLink (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/button_Documentation_a-Button a-IRR-button _ce8d41 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Record Count_a-IRR-headerLink (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/div_Error_row (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Level_u-checkbox (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info_u-checkbox (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/span_Request_a-IRR-noDataMsg-text (2)'), 
    'No data found.')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info_u-checkbox (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Level_u-checkbox (2)'))

WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_concat(Row text contains , , SAP_CRO_39782d'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Manage SOD Test_a-TreeView-label (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_Request Name_P74_REQUEST_NAME_lov_btn (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_Search_a-PopupLOV-search apex-item-text (4)'), 
    sodTST)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_Select List 1 rows. Use arrow keys_pop_e9b563 (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_INTER_a-IRR-pagination-label (1)'), 
    '1 - 15 of 62')
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (17)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Environment_a-TreeView-label (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/input_Mappings Report_R275422977080048150_s_4fdaf0 (2)'), 
    'SAP_S4HANA')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mappings Report_R275422977080048150__6d4728 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/img_Join Condition_apex-edit-page (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/button_Update_B294018374226545313'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/h2_Breadcrumbs_t-Alert-title_1'), 
    'Mapping successfully deleted')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mapping successfully created_t-Butto_00317c'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/span_SAP_S4HANA_a-IRR-noDataMsg-text'), 
    'No data found')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_concat(Row text contains , , SAP_S4H_081f15'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (27)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (28)'))

WebUI.closeBrowser()
