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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (4)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (24)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (24)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (13)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Company Settings_a-TreeView-label (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_Users_t-Tabs-label (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900 (3)'), 
    'ANANDK')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_Submit_a-Button a-Toolbar-item (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_concat(Search for , , ANANDK, , )_a-_c68343'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (19)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Roles Manager_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Mitigations_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field'), 
    'KTLN_ADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/img_KTLN_ADMIN_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Define Security/button_Expected format DD-MON-RR_B296312701_fa54b8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/button_concat(Row text contains , , KTLN_AD_0067e2'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field'), 
    'ReadOnly')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/img_KTLN_ADMIN_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Define Security/button_Expected format DD-MON-RR_B296312701_fa54b8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/button_concat(Row text contains , , KTLN_AD_0067e2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/a_Manage EAM Roles_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/input_Assign EAM Roles_R167272238747558503__63586e'), 
    'ANANDK')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/button_Assign EAM Roles_R167272238747558503_9fe5db'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/input_Assign EAM Roles_R167272238747558503__63586e'), 
    'ReadOnly')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/button_Assign EAM Roles_R167272238747558503_9fe5db'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/img_ANANDK, ReadOnly_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/button_User_B298082823247946466'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/button_concat(Row text contains , , ANANDK,_19af90'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/button_concat(Row text contains , , ANANDK,_19af90'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EAM Roles/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (4)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (24)'), 
    'ANANDK')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/div_Logo left_row (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (24)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (19)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Define Scope_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT'), 
    '5888', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (19)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Detect Violations_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Environment_P0_ENVIRONMENT'), 
    '5888', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_1 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_1 (2)'))

WebUI.closeBrowser()

