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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Company'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Company/div_Enterprise Access Monitor'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Company/a_Inbox'))

//Env.

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field'),
	'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A'), 'A')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_4f016a'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/a_Inbox'))

//Manage Activity

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Roles Manager_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Activity'))

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084'), 'EBiz_3')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_EBiz_3_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXSSCGL'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXPRRUN'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAEXDEPR'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXORIDE'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXSSDRB'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXDPRUN'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXWHTIF'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_EBizApp_JDBC_Env'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Manage Activity'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , EBiz_3,_e7827b'))

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084'), 'EBiz_4')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity/td_EBiz_4'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_EBiz_3_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXPIDEF'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FA_WEBADI_PHYSICAL_INVENTORY'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_1'))

//WebUI.rightClick(findTestObject('Object Repository/Page_Activity Entries/td_EBizApp_JDBC_Env (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_EBizApp_JDBC_Env (1)'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Manage Activity'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , EBiz_3,_e7827b'))

//Filter False-Positives

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/span_SOD Review Survey_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/a_Manage Rules'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'),
	2)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/div_GoActionsNo data found'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Filter False - Positives'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle - Attributes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_ADS_DEV'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_ADS Development'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle - Attributes'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Entries'))
WebUI.delay(3)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle - Entries'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/input_Report Settings_control_588075250577576698'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle - Users'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_Responsibility  Procurement Administrati_f99f6b'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_FND_MANAGE_PROXIES'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_Function'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle - Attributes'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Users'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_CLU'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle - Attributes'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/button_Cancel'))

//Exception Setup

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/span_Roles Manager_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Manage Exception Type'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Role'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Responsibility'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Menu'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Grant'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Request Group'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Concurrent Program'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Function'), 20)


//Remediation Plans
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/a_Manage Remediation Plan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_RISK'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Y'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_KTLN_UR'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Y'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_All User Responsibilities Violations'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_KTLN_S'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Y'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_KTLN_U'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Y'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_All User Violations'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_MITIGATIONS'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Y'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_Selected'), 20)

//WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_SOD Review_u-tC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/span_SOD Review_fa fa-remove'),
	20)

//SOD Review Setup - Manage Roles

WebUI.enhancedClick(findTestObject('Object Repository/Page_Remediation Plan/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Role Groups'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Role Groups/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'),
	2)

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Role Groups/div_EnvironmentSelect any oneCoupa_Env1EBiz_555136'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Role Groups/td_General Ledger'), 20)

WebUI.verifyElementChecked(findTestObject('Object Repository/Page_Manage Role Groups/input_General Ledger_f01'), 20, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Role Groups/td_Other Financials'), 20)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Role Groups/input_General Ledger_f01'), 0)
WebUI.verifyElementChecked(findTestObject('Object Repository/Page_Manage Role Groups/input_General Ledger_f01'), 20, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Role Groups/button_Map Roles'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Roles Mapping/td_ASSETS_VISION_SERVICES_RampD'),
	20, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Roles Mapping/span_Unassign Roles'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Roles Mapping/td_General Ledger'), 20, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Roles Mapping/button_Back'))

//SOD Review Setup - Manage Approval Assignments

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/a_Manage Approval Assignments'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R570861162460345_e11d0b'),
	'Other Financials')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Other Financials'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATADMIN Kat Admin'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_MARIAB1 Maria Brum'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Assignments'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , Other F_415edf'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R570861162460345_e11d0b'),
	'General Ledger')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_General Ledger'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATADMIN Kat Admin'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_MARIAB1 Maria Brum'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Assignments'))

//WebUI.doubleClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Assignments'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , Other F_415edf'), FailureHandling.OPTIONAL)

//SOD Review Configuration

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_SOD Review Configuration'))

WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/label_One Approver Response'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/label_One Approver Response'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/label_Both Approvers Responses'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/select_Coupa_Env1EBizApp_JDBC_EnvEBiz_SFTPG_591047'),
	2)

//WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/label_Violation Level'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/label_Violation Level'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/button_Update'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/button_Configuration successfully saved_t-B_99cb7f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SOD Review Configuration/a_Inbox'))

//Business Process

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Roles Manager_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Business Process'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Order to Cash'),
	20)

//Rule Tags
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/a_Manage Rule Tags'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/input_Create_R189436115360253186_search_field'),
	'KTLN_TEST')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/td_KTLN_TEST'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/button_concat(Row text contains , , KTLN_TE_cddbfc'), FailureHandling.OPTIONAL)

