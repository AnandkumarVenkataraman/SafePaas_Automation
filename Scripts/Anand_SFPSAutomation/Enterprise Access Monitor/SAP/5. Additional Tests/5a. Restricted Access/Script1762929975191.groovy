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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (10)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (61)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (61)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

//Verify the Restricted Access Rule
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (38)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (69)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (51)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (38)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Define Scope_a-TreeView-label (14)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (13)'), 
    'SAP_S4HANA', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Import Rules_R247793226539899118_sear_84acb9 (8)'), 
    'SAP Restricted Access Rule#1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Import Rules_R247793226539899118_sea_c93c8e (6)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SAP Restricted Access Rule1_u-tL'), 
    'SAP Restricted Access Rule#1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SAP Restricted Access Rule1_u-tL_1'), 
    'HIGH')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_HIGH_u-tL'), 'Procure to Pay')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Procure to Pay_u-tL (1)'), 
    'Restricted Access')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Restricted Access_u-tL (1)'), 
    'Restricted Access')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Restricted Access_u-tL_1'), 
    'Approved')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span (5)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Set1 Activity_P9_SET1_GROUP'), 
    'SAPActivitySet5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Last Updated By_t-Report-cell (3)'), 
    'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell (3)'), 
    'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell (4)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell (4)'), 
    '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_1 (4)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell (2)'), 
    'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell (3)'), 
    'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_1 (4)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_2 (4)'), 
    '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_3 (4)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_1 (2)'), 
    'ACTVT.66')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.66_t-Report-cell (2)'), 
    'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_2 (4)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_4 (3)'), 
    '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_5 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_2 (2)'), 
    'CFAPPLC.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CFAPPLC.KE_t-Report-cell (2)'), 
    'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_3 (4)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_6 (3)'), 
    '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_7 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_3 (2)'), 
    'CO_VRGNG.KSPA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO_VRGNG.KSPA_t-Report-cell (3)'), 
    'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_4 (3)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_8 (3)'), 
    '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_9 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_4 (2)'), 
    'K_KA_TREC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO Inactive Hierarchies_t-Report-cell (3)'), 
    'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell (4)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_10 (3)'), 
    '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_11 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_5 (2)'), 
    'K_KEA_ERG')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Profitability Analysis Set Operating Con_4f0717 (2)'), 
    'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_1 (4)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_12 (3)'), 
    '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_13 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_6 (2)'), 
    'K_VRGNG')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO Bus. Trans., Actual Postings and Plan_f4a5f3 (2)'), 
    'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_2 (3)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_14 (3)'), 
    '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_15 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_7 (2)'), 
    'RMSID.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_RMSID_t-Report-cell (2)'), 
    'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_5 (3)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_16 (3)'), 
    '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_17 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_8 (2)'), 
    'S_SRMSY_CL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_SAP Records Management  General Authoriz_01ac27 (2)'), 
    'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_3 (3)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_18 (3)'), 
    '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_19 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_9 (2)'), 
    'TABLE.CE15')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_TABLE.CE15_t-Report-cell (2)'), 
    'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_6 (3)'), 
    'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_20 (3)'), 
    '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_21 (3)'), 
    'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Set1 Activity_P9_SET1_GROUP'), 
    'SAPActivitySet5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span_Approval Status_P9_APPROVAL_STATUS (1)'), 
    'Approved')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/a_Define Scope_t-Breadcrumb-label (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , SAP Res_416da1'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (13)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (13)'))

//Initiate the Restricted Access SOD Test

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (70)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (52)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (13)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Detect Violations_a-TreeView-label (8)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Environment_P0_ENVIRONMENT (7)'),
	'SAP_S4HANA', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Manage SOD Test_B169646823131451684 (5)'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_(Value Required)_P30_DS_ID (6)'),
//	'0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_Rule Tags_P30_RULE_TAG_LEFT (6)'),
	'Z_949', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE (7)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Rule Tags_u-tL (3)'),
	'SAP Restricted Access Rule#1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SAP Restricted Access Rule1_u-tL'),
	'RA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_RA_u-tL'), 'H')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_H_u-tL (2)'), 'RA')

//Set the SAP's SOD Test name; based on current date & time; i.e., system date & time
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
def currentDateTime = dateFormat.format(new Date())
def sapRASODTST = 'SAPRA_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME (9)'),
	sapRASODTST)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS (7)'),
	'This Restricted Access SOD Test is initiated by QA Automation, for SAP')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Cancel_B123623581915827245 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3 (5)'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/h2_Breadcrumb_t-Alert-title (5)'),
	'Job initiated: SAPRA_20112025_V1_202511192357.SOD Test initiated successfully.', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Job initiated SAPRA_20112025_V1_2025_a4f8f3'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Environment_P0_ENVIRONMENT (7)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (27)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Platform_a-TreeView-label (5)'))

WebUI.delay(15)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (70)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (52)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (13)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Detect Violations_a-TreeView-label (8)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Environment_P0_ENVIRONMENT (7)'),
	'SAP_S4HANA', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/input_Create_R169645132708451655_search_field (7)'),
	sapRASODTST)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Create_R169645132708451655_search_button (6)'))

WebUI.delay(300)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/td_Restricted Access_u-tL (1)'),
	'Closed', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Description_a-IRR-headerLink (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/button_Documentation_a-Button a-IRR-button _ce8d41 (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Record Count_a-IRR-headerLink (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Search_a-IRR-sortWidget-row (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/button_concat(Level  , , INFO, , )_a-Button_4401b0 (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Level_u-checkbox (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info_u-checkbox (4)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/span_Request_a-IRR-noDataMsg-text (4)'),
	'No data found.')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info_u-checkbox (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Level_u-checkbox (4)'))

WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_concat(Row text contains , , SAPRA_2_b4bb33'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Environment_P0_ENVIRONMENT (7)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (4)'))

//Manage Violations
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (71)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (53)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage SOD Test_a-TreeView-label (3)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_Environment_P74_ENVIRONMENT (4)'),
	'SAP_S4HANA', false)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/div_Search_PopupLov_74_P74_REQUEST_NAME_dlg'))
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_Request Name_P74_REQUEST_NAME_lov_btn (6)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_Search_a-PopupLOV-search apex-item-text (7)'),
	sapRASODTST)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_Select List 1 rows. Use arrow keys_pop_e9b563 (6)'))

WebUI.delay(120)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Actions_u-tL'),
	'SAP Restricted Access Rule#1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_INTRA_a-IRR-pagination-label (1)'),
	'1 - 2 of 2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Role_u-tL'), 'SAP_PS_RM_PRO_ADMIN[SAP_PS_RM_PRO_ADMIN]')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_Environment_P74_ENVIRONMENT (4)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (6)'))

//Analytics

//Logout
//WebUI.closeBrowser()
