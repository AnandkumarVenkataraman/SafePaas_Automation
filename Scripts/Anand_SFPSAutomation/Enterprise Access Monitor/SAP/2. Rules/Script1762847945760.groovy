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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (5)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (56)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (56)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (33)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (56)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (38)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (27)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Define Scope_a-TreeView-label (7)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (7)'), 
    'SAP_S4HANA', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Actions_a-IRR-headerLink (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Search_R247793226539899118_sort_widge_30a3c6 (2)'), 
    'Revised')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Search_a-IRR-sortWidget-row (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Import Rules_R247793226539899118_sear_84acb9 (2)'), 
    'SAP Rule#1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Import Rules_R247793226539899118_sea_c93c8e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/button_Cancel_B248212826590003597'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Rule/span_Rule Attributes_t-Tabs-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/select_Go_a-Toolbar-selectList a-Toolbar-item'), 
    '785043841337073192', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/span_Sorted Ascending 2_a-GV-breakLabel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/span_Activity Group Code_a-GV-breakValue'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/span_AND_a-GV-breakLabel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/span_Activity Group Code_a-GV-breakValue_1'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/select_Go_a-Toolbar-selectList a-Toolbar-item'), 
    '155727125802185641', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/a_Define Scope_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , SAP Rul_485123'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , SAP Rul_485123'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (7)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (7)'))

//Rule without an Auth Field Value for a given Group, in both Activity Sets
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (57)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (39)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (28)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Define Scope_a-TreeView-label (8)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (8)'),
	'SAP_S4HANA', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Import Rules_R247793226539899118_sear_84acb9 (3)'),
	'SAP Rule#1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Import Rules_R247793226539899118_sea_c93c8e (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/button_Cancel_B248212826590003597 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Rule/span_Rule Attributes_t-Tabs-label (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/select_Activity One_P12_SET1_ACTIVITY'),
	'31007', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/select_Activity Two_P12_SET2_ACTIVITY'),
	'31008', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/li'), 'The condition for the Authorization Object should be AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/li_1'), 'At least one and at most one Authorization Object is allowed in a "Group"')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/li_2'), 'At least one Authorization Field Value is required in a "Group"')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/li_3'), 'Duplicate Authorisation Field Values are not allowed within a "Group"')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Sorted Ascending 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Auth Field_Value', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur'),
	'1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_1'),
	'Activity Set 1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Activity Set 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Authorization Object', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur'),
	'1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_1'),
	'Activity Set 1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Activity Set 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Authorization Object', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_2'),
	'2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_1'),
	'Activity Set 1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Activity Set 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Authorization Object', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur'),
	'1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_3'),
	'Activity Set 2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Sorted Ascending 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Auth Field_Value', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur'),
	'1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_3'),
	'Activity Set 2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Activity Set 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Authorization Object', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_2'),
	'2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_3'),
	'Activity Set 2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Activity Set 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Authorization Object', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_4'),
	'3', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_3'),
	'Activity Set 2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_Activity Set 1_ruleEntriesIG_ig_grid_vc_cur'),
	'Authorization Object', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_ACTVT_ruleEntriesIG_ig_grid_vc_cur'),
	'AND', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_5'),
	'4', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/td_AND_ruleEntriesIG_ig_grid_vc_cur_3'),
	'Activity Set 2', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/button_Next_B152912410789850396'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/li_Breadcrumb_a-Notification-item htmldbStdErr'),
	'ORA-20001: At least one Authorisation Field Value is required in a "Group" :-\nActivity Set: 1; Group: 2 | Activity Set: 2; Group: 2 | Activity Set: 2; Group: 3 | Activity Set: 2; Group: 4', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/a_Define Scope_t-Breadcrumb-label (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , SAP Rul_485123 (1)'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (8)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (8)'))

//Rule with AND Condition

//Rule with OR Condition

//Rule with AND & OR Condition

//Rule with * values

//Logout
//WebUI.closeBrowser()
