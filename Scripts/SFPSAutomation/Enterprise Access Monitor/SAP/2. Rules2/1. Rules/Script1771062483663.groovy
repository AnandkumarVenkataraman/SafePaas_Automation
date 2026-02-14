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
	'ORA-20001: At least one Authorisation Field Value is required in a "Group" :-\nActivity Set: 1; Group: 2 | Activity Set: 2; Group: 2 | Activity Set: 2; Group: 3 | Activity Set: 2; Group: 4',
	FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Functions/a_Define Scope_t-Breadcrumb-label (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , SAP Rul_485123 (1)'),
	FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (8)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (8)'))

//Rule with AND Condition
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (61)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (43)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (31)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Define Scope_a-TreeView-label (11)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (10)'),
	'SAP_S4HANA', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Import Rules_R247793226539899118_sear_84acb9 (5)'),
	'Z_AccessChecks_Rule#1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Import Rules_R247793226539899118_sea_c93c8e (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_HCM_u-tL'), 'Incompatible Sets')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Incompatible Sets_u-tL (1)'),
	'SOD Detective')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SOD Detective_u-tL (1)'),
	'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_-_u-tL (1)'), 'SAPActivitySet4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SAPActivitySet4_u-tL (1)'),
	'SAPActivitySet5')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Last Updated By_t-Report-cell (1)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell (1)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_1 (1)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell (1)'),
	'4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_1 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell'),
	'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell (1)'),
	'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell_1 (1)'),
	'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_1 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_2 (1)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_3 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_1'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell (1)'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell_1 (1)'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_2 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_4 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_2'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell_3 (1)'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell_4 (1)'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell_5 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_3 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_5 (1)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_6 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_3'),
	'ACTVT.04')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.04_t-Report-cell (1)'),
	'ACTVT.04')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.04_t-Report-cell_1 (1)'),
	'ACTVT.04')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.04_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_4 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_7 (1)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_8 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_4'),
	'CEAPPL.KP')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CEAPPL.KP_t-Report-cell (1)'),
	'CEAPPL.KP')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CEAPPL.KP_t-Report-cell_1 (1)'),
	'CEAPPL.KP')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CEAPPL.KP_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_5 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_9 (1)'),
	'4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_10 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_5'),
	'KAPPL.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KAPPL.KE_t-Report-cell (1)'),
	'KAPPL.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KAPPL.KE_t-Report-cell_1 (1)'),
	'KAPPL.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KAPPL.KE_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_6 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_11 (1)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_12 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_6'),
	'K_KA_RCS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_KA_RCS_t-Report-cell (1)'),
	'K_KA_RCS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_KA_RCS_t-Report-cell_1 (1)'),
	'CO: Drill-down reporting - line-/column structures')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO Drill-down reporting - line-column st_b39ca5 (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_13 (1)'),
	'4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_14 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_7'),
	'SPART.$SPART')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_SPART.SPART_t-Report-cell (1)'),
	'SPART.$SPART')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_SPART.SPART_t-Report-cell_1 (1)'),
	'SPART.$SPART')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_SPART.SPART_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_7 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_15 (1)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_16 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_8'),
	'V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_V_KONG_VWE_t-Report-cell (1)'),
	'V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_V_KONG_VWE_t-Report-cell_1 (1)'),
	'Generate Condition: Usage/Application Authorization')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Generate Condition UsageApplication Auth_84bd71 (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_1 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_17 (1)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_17 (1)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_18 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_9'),
	'V_KONH_VKO')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_V_KONH_VKO_t-Report-cell (1)'),
	'V_KONH_VKO')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_V_KONH_VKO_t-Report-cell_1 (1)'),
	'Condition: Authorization for Sales Organizations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Condition Authorization for Sales Organi_bb3947 (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_2 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_19 (1)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_20 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_10'),
	'V_KONH_VKS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_V_KONH_VKS_t-Report-cell (1)'),
	'V_KONH_VKS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_V_KONH_VKS_t-Report-cell_1 (1)'),
	'Condition: Authorization for Condition Types')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Condition Authorization for Condition Ty_77ec7a (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_3 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_21 (1)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_22 (1)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_11'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_3 (1)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_4 (1)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_5 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_8 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_23 (1)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_24 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_12'),
	'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell_3 (1)'),
	'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell_4 (1)'),
	'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell_5 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_9 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_25 (1)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_26 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_13'),
	'ACTVT.66')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.66_t-Report-cell (1)'),
	'ACTVT.66')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.66_t-Report-cell_1 (1)'),
	'ACTVT.66')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.66_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_10 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_27 (1)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_28 (1)'),
	'Set2 Activity')

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/select_Select Pagination_X01_248231011536003638'),
	'16&pg_max_rows=15', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Last Updated By_t-Report-cell_1 (1)'),
	'CFAPPLC.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CFAPPLC.KE_t-Report-cell (1)'),
	'CFAPPLC.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CFAPPLC.KE_t-Report-cell_1 (1)'),
	'CFAPPLC.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell (1)'),
	'4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_29 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_14'),
	'CO_VRGNG.KSPA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO_VRGNG.KSPA_t-Report-cell (1)'),
	'CO_VRGNG.KSPA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO_VRGNG.KSPA_t-Report-cell_1 (1)'),
	'CO_VRGNG.KSPA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_1 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_2 (1)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_30 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_15'),
	'K_KA_TREC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_KA_TREC_t-Report-cell (1)'),
	'K_KA_TREC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_KA_TREC_t-Report-cell_1 (1)'),
	'CO: Inactive Hierarchies')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO Inactive Hierarchies_t-Report-cell (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_2 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_31 (1)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_32 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_16'),
	'K_KEA_ERG')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_KEA_ERG_t-Report-cell (1)'),
	'K_KEA_ERG')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_KEA_ERG_t-Report-cell_1 (1)'),
	'Profitability Analysis: Set Operating Concern')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Profitability Analysis Set Operating Con_4f0717 (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_3 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_33 (1)'),
	'4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_34 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_17'),
	'K_VRGNG')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_VRGNG_t-Report-cell (1)'),
	'K_VRGNG')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_K_VRGNG_t-Report-cell_1 (1)'),
	'CO: Bus. Trans., Actual Postings and Plan/act. Allocations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO Bus. Trans., Actual Postings and Plan_f4a5f3 (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_4 (1)'),
	'AND')

WebUI.mouseOver(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_35 (1)'))

WebUI.mouseOver(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_36 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_18'),
	'RMSID.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_RMSID_t-Report-cell (1)'),
	'RMSID.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_RMSID_t-Report-cell_1 (1)'),
	'RMSID.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CEAPPL.KP_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_5 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_37 (1)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_38 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_19'),
	'S_SRMSY_CL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_S_SRMSY_CL_t-Report-cell (1)'),
	'S_SRMSY_CL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_S_SRMSY_CL_t-Report-cell_1 (1)'),
	'SAP Records Management : General Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_SAP Records Management  General Authoriz_01ac27 (1)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_6 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_39 (1)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_40 (1)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_20'),
	'TABLE.CE15')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_TABLE.CE15_t-Report-cell (1)'),
	'TABLE.CE15')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_TABLE.CE15_t-Report-cell_1 (1)'),
	'TABLE.CE15')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_TABLE.CE15_t-Report-cell_2 (1)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_41 (1)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_42'),
	'Set2 Activity')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/a_Define Scope_t-Breadcrumb-label (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , Z_Acces_2ac8ac'),
	FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (10)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (11)'))
