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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (4)'), 'KAT')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (55)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (55)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (32)'))

//Duplicate Entries in Entry Listing
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (53)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (35)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Violation Report_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_User Entry Attribute Access Listing_a-Tre_258751'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Environment_P0_ENVIRONMENT'), 
    'SAP_S4HANA', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 
    4)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/input_Schedule_R253154824105414010_search_field'), 
    'V_KONG_VWE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/button_Schedule_R253154824105414010_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4'), 
    'SAP_CO_PA_BASICDATA_DISPLAY.KE43.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4_1'), 
    'SAP_CO_PA_BASICDATA_VALUATION.KE41.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4_2'), 
    'SAP_CO_PA_BASICDATA_VALUATION.KE42.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4_3'), 
    'AuthObj_V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/span_Yes_a-IRR-pagination-label'), 
    '1 - 4 of 4')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/button_concat(Row text contains , , V_KONG__ae3099'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Duplicate Entries in Activity Sets
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (54)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (36)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Roles Manager_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rule Attributes_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (1)'),
	'SAPActivitySet')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_Activity Report_R242004504603843036__cd9013'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_SAPActivitySet_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/input_Entry for SAPActivitySet4_R2439637147_aa39b7'),
	'V_KONG_VWE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_Entry for SAPActivitySet4_R243963714_652b07'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Authorization Object_apex-edit-view'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Generate Condition UsageApplication Authorization_u-tL'),
	'SAP_CO_PA_BASICDATA_DISPLAY.KE43.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Generate Condition UsageApplication Auth_0c8ca4'),
	'SAP_CO_PA_BASICDATA_VALUATION.KE41.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Generate Condition UsageApplication Auth_0c8ca4_1'),
	'SAP_CO_PA_BASICDATA_VALUATION.KE42.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Generate Condition UsageApplication Auth_0c8ca4_2'),
	'AuthObj_V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_SAP_S4HANA_a-IRR-pagination-label'),
	'1 - 4 of 4')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_concat(Row text contains , , V_KONG__ae3099'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_-_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_-_apex-edit-page_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/input_Entry for SAPActivitySet4_R2439637147_aa39b7'),
	'ACTVT.03')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_Entry for SAPActivitySet4_R243963714_652b07'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Authorization Object_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Auth Field_Value_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_concat(Row text contains , , V_KONG__ae3099'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Breadcrumb_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_-_apex-edit-page_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/input_Entry for SAPActivitySet4_R2439637147_aa39b7'),
	'ACTVT.*')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_Entry for SAPActivitySet4_R243963714_652b07'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Authorization Object_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_concat(Row text contains , , V_KONG__ae3099'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_-_apex-edit-page_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/input_Entry for SAPActivitySet4_R2439637147_aa39b7'),
	'K_KEA_ERG')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_Entry for SAPActivitySet4_R243963714_652b07'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Authorization Object_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/button_concat(Row text contains , , V_KONG__ae3099'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_-_apex-edit-page_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_Entry Detail_u-tC'),
	'ACTVT.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_ACTVT_u-tC'), 'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_KATADMIN_u-tC'),
	'V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_V_KONG_VWE_u-tC'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_KATADMIN_u-tC_1'),
	'V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/td_V_KONG_VWE_u-tC_1'),
	'Authorization Object')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_-_apex-edit-page_5'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Activity_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Setup_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_concat(Row text contains , , SAPActi_45a20e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Verify other reports in Analytics
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (55)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (37)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Violation Report_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Application Access Report_a-TreeView-label'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/select_Environment_P0_ENVIRONMENT'),
	'SAP_S4HANA', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/a_User Listing and access_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/a_User Entry Access Listing_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Attribute Access Listing/a_User Entry Attribute Access Listing_a-Tre_258751'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE (1)'),
	'641', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE (1)'),
	'643', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE (1)'),
	'645', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE (1)'),
	'1245', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE (1)'),
	'1246', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE (1)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/a_Entry Listing_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/a_Entry Attributes_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Access Type_P13_RESPONSIBILITY_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/input_Search_a-PopupLOV-search apex-item-text (1)'),
	'/AIF/ARC_CREATE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Search_a-Button a-PopupLOV-doSearch (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/li_Select List 1 rows. Use arrow keys_a-Ico_131ab6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Access Type_P13_GO'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/span_Search_a-TreeView-label is-focused'),
	'SARA (Transactions)', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/select_Environment_P0_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Logout
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (26)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (27)'))

WebUI.closeBrowser()
