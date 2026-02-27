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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us01n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY (2)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (2)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (2)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (2)'))

//Verifying the MTP Setups for -> Company Settings, Env.
//Datasource synchronization, MTP Object details & object items, and Objectset

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (3)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (3)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Company (2)'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Company/div_MonitorPaaS'), 25, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Company/a_Manage Environment'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (1)'), 
    'KTLNEBS_MonitorPaaS', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Go (1)'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_KTLNEBS_MonitorPaaS'), 'KTLNEBS_MonitorPaaS', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A (1)'), 'A', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , KTLNEBS_78bb73'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/a_Inbox (1)'), FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle'), FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Data Source'), FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_- Select an Environment -Coupa_Env1E_bcbb9d'), 
    10, FailureHandling.OPTIONAL)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Data Source/a_Completed'), 'Completed', FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Manage Object'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e'), 
    'AR Approval Limits', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_AR Approval Limits'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Object Details/div_MonitorPaaS'), 'MonitorPaaS', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Object Details/label_JDBC'), 'JDBC', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AMOUNT_FROM'), 'AMOUNT_FROM', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AMOUNT_TO'), 'AMOUNT_TO', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_REASON_CODE'), 'REASON_CODE', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_CURRENCY_CODE'), 'CURRENCY_CODE', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_LAST_UPDATE_DATE'), 'LAST_UPDATE_DATE', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_CREATION_DATE'), 'CREATION_DATE', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_LAST_UPDATED_BY'), 'LAST_UPDATED_BY', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

//WebUI.rightClick(findTestObject('Object Repository/Page_Add Object Items/label'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25), FailureHandling.OPTIONAL

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_CREATED_BY'), 'CREATED_BY', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_USER_ID'), 'USER_ID', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_DOCUMENT_TYPE'), 'DOCUMENT_TYPE', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_PRIMARY_FLAG'), 'PRIMARY_FLAG', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , AR Appr_08c992'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_Manage Object Set'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Object Set/input_Create_R137674426230792379_search_field'), 
    'AccountsPayable', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_Go'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_AccountsPayable'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Objectset/span_EBS R12.2'), 'EBS R12.2', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AddEdit Objectset/div_MonitorPaaS'), 25, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Objectset/option_AR Approval Limits'), 'AR Approval Limits', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Objectset/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_concat(Row text contains , , Account_12e1bf'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_Inbox'), FailureHandling.OPTIONAL)

//MTP -> Deploy, assign Approver and Reviewer, and Schedule

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Monitors'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a'),
	36, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_Deploy'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/input_Cancel_R433726316682115957_search_field'),
	'AR Approval Limits', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/button_Go'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/input_AR Approval Limits_f01'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/button_Deploy Objects'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/button_OK'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/h2_Monitor Created Successfully'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_Monitor Created Successfully_t-Butto_4161d3'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/input_Deploy_mngMonitos_search_field'),
	'AR Approval Limits', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_Go'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_AR Approval Limits'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/label_Consolidated Level'),
	'Consolidated Level', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/select_Select a valueChange TrackerOccurrence'),
	'Select a value\nChange Tracker\nOccurrence', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/div_Select a valueChange TrackerOccurrence'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_From Amount'), 'From Amount', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_To Amount'), 'To Amount', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Reason'), 'Reason', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Currency'), 'Currency', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Last Update Date'),
	'Last Update Date', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Creation Date'),
	'Creation Date', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Last Updated By'),
	'Last Updated By', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Created By'), 'Created By', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_User Name'), 'User Name', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Document Type'),
	'Document Type', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Primary Flag'), 'Primary Flag', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/span_People'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any One1164301711814158119098_a4add3'),
	'KATADMIN', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any OneApproverReviewer'),
	'Approver', true, FailureHandling.OPTIONAL)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/button_Popup Calendar Start Date'))
WebUI.setText(findTestObject('Object Repository/Page_Rule Approver/input_Start Date_P35_START_DATE'), '22-Jun-2025', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/a_22'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/button_Add Another'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any One1164301711814158119098_a4add3'),
	'KATALON_ADMIN', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any OneApproverReviewer'),
	'Reviewer', true, FailureHandling.OPTIONAL)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/button_Popup Calendar Start Date'))
WebUI.setText(findTestObject('Object Repository/Page_Rule Approver/input_Start Date_P35_START_DATE'), '22-Jun-2025', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/a_22'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/button_Add Another'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/td_KATADMIN'), 'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/td_Approver'), 'Approver', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/td_KATALON_ADMIN'), 'KATALON_ADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/td_Reviewer'), 'Reviewer', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/a_Manage Monitors'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_concat(Row text contains , , AR Appr_08c992'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_Manage Result Set'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Result Set/button_Schedule'), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File --_c01b93'),
	'0', true, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/label_Occurrences'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File --_c01b93'),
	4, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_AP Employee Signing LimitsAP Employe_096c2f'),
	'361691', true, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_(Value Required)_P30_MULTI_OBJECT_ID_MOVE'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/label_Run Monitor_u-checkbox'), FailureHandling.OPTIONAL)
WebUI.delay(2)
//Setting the value
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')

def currentDateTime = dateFormat.format(new Date())

def mtpJob1 = 'MTP_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME (1)'),
	mtpJob1, FailureHandling.OPTIONAL)
	//'MTP_220625_v2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Create (1)'), FailureHandling.OPTIONAL)

//WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Result Set/h2_Snapshot successfully submitted'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Result Set/h2_Snapshot successfully submitted'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Result Set/button_Snapshot successfully submitted_t-Bu_ba886c'), FailureHandling.OPTIONAL)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Result Set/a_Manage Monitors'))


//Verify in DataProbe > Manage Snapshot

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Result Set/span_Setup_a-TreeView-toggle'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Result Set/a_Manage Snapshot'), FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/select_Select any oneAccountsPayableCERP_Ob_d1baf4 (1)'),
	1, FailureHandling.OPTIONAL)

WebUI.delay(180) //wait for a maximum of 3min. for the snapshot extract to complete
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/label_Auto Refresh_u-checkbox'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field (1)'),
//	'MTP_220620250251')
	mtpJob1, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Go (1)'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/a_Completed'), 'Completed', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/a_Completed'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Log id'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/button_Documentation_a-Button a-IRR-button _ce8d41'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Level'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/div_LevelInfoWarningError'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/span_No data found'),
	20, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/span_Assign MonitorPaaS Roles_a-TreeView-toggle'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Manage Snapshot'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/a_(SS)MTP_22062025021450_20250622021454'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Snapshot/span_Snapshot Details'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/select_Select any oneAR Approval Limits'),
	1, FailureHandling.OPTIONAL)
//WebUI.takeScreenshot()
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/td_-1000'), 20)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/td_5555'), 20)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/td_-'), 20)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/td_USD'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/a_Manage Snapshot'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_concat(Row text contains , , mtp_220_1e386a'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/a_Inbox'), FailureHandling.OPTIONAL)

//Verify in Snapshots tab and Result set tab

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (2)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Monitors (1)'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a (1)'),
	'AccountsPayable', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/input_Deploy_mngMonitos_search_field (1)'),
	'AR Approval Limits', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_Go (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_AR Approval Limits (1)'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/div_Consolidated Level'),
	20, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/span_Occurrence'),
	20, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/span_Snapshots'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Report/select_Select any One(SS)MTP_22062025032659_e96733'),
	1, FailureHandling.OPTIONAL)
WebUI.delay(2)
//WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Report/span_ResultSets'), FailureHandling.OPTIONAL)
WebUI.delay(2)
//WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_ResultSets/select_Select any OneMTP_22062025032659_202_86ac26'),
	1, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_ResultSets/a_Manage Monitors'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_concat(Row text contains , , AR Appr_08c992 (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_Inbox'), FailureHandling.OPTIONAL)


//Analytics

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (3)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_ConfigCompare_a-TreeView-toggle'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Open Incidents'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a'),
	'AccountsPayable', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_AR Approval Limits'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_- Select -MTP_22062025032659_20250622032703'),
	1, FailureHandling.OPTIONAL)
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/button_Schedule Download_t-Button t-Button-_3f5374'), FailureHandling.OPTIONAL)
//WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/button_Schedule Download_t-Button t-Button-_3f5374_1'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_- Select -MTP_22062025032659_20250622032703'),
	0, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/a_Inbox'), FailureHandling.OPTIONAL)

//Security

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_AccessPaaS_a-TreeView-toggle (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Analytics_a-TreeView-toggle'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage MonitorPaaS Roles'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage MonitorPaaS Roles/td_All_Access'), 'All_Access', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage MonitorPaaS Roles/td_MTP_ReadAccess'), 'MTP_ReadAccess'), FailureHandling.OPTIONAL

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage MonitorPaaS Roles/img_Actions_apex-edit-page'), FailureHandling.OPTIONAL)
//WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_CreateEdit Role/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage MonitorPaaS Roles/img_Actions_apex-edit-page'), FailureHandling.OPTIONAL)
//WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_CreateEdit Role/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage MonitorPaaS Roles/a_Assign MonitorPaaS Roles'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Assign MonitorPaaS Roles/input_Create_R609463236754029062_search_field'),
	'ANANDK1', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Assign MonitorPaaS Roles/button_Go'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assign MonitorPaaS Roles/td_MTP_ReadAccess'), 'MTP_ReadAccess', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Assign MonitorPaaS Roles/img_ANANDK1_apex-edit-page'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_User Assign Roles/label_MTP_ReadAccess'), 0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Assign Roles/button_Cancel'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Assign MonitorPaaS Roles/button_concat(Row text contains , , ANANDK1_5922d3'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Assign MonitorPaaS Roles/a_Inbox'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/button_katadmin'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Logout (1)'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY (3)'), 'KAT', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (3)'), 'ANANDK1', FailureHandling.OPTIONAL)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (3)'), 'Ioqy8emDrxi5mkiNQATzxQ==', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (3)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_AccessPaaS_a-TreeView-toggle (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Monitors'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a'),
	'AccountsPayable', true, FailureHandling.OPTIONAL)
WebUI.delay(2)
//WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Monitors/a_Inbox'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/button_anandk1 (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Logout_1'), FailureHandling.OPTIONAL)

//Approver and Reviewer

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (14)'), 'KAT', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (14)'),
	'KATADMIN', FailureHandling.OPTIONAL)

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (14)'),
	'Ioqy8emDrxi5mkiNQATzxQ==', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (13)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Begin Date (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Last Hour'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (1)'),
	'SafePaaS Incident', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (2)'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (1)'),
	'Approver', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (2)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_SafePaaS Incident - Approver'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/td_AR Approval Limits'),
	'AR Approval Limits', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/a_Click here to see the results'), FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a (1)'),
	'AccountsPayable', true, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/a_AR Approval Limits'), FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_- Select -MTP_24062025002338_20250624002343'),
	1, FailureHandling.OPTIONAL)
//WebUI.takeScreenshot()
WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_- Select -MTP_24062025002338_20250624002343'),
	0, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a (1)'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/a_Inbox (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_SafePaaS Incident - Approver'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/textarea_Comments_P3_NORES_TEXTAREA_1'),
	'Test approval by approver', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/label_Approve'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/button_Go'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Begin Date is in the last 1 hours_a-_b680df'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Begin Date is in the last 1 hours_a-_b680df'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Begin Date is in the last 1 hours_a-_b680df'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (2)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (3)'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (14)'), 'KAT', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (14)'),
	'KATALON_ADMIN', FailureHandling.OPTIONAL)

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (14)'),
	'Ioqy8emDrxi5mkiNQATzxQ==', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (13)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Begin Date (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Last Hour'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (1)'),
	'SafePaaS Incident', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (2)'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (1)'),
	'Reviewer', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (2)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_FYI- SafePaaS Incident - Reviewer'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/a_Click here to see the results'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a (1)'),
	'AccountsPayable', true, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/a_AR Approval Limits_1'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_- Select -MTP_24062025002338_20250624002343'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/button_Schedule Download_t-Button t-Button-_3f5374 (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/button_Schedule Download_t-Button t-Button-_3f5374_1 (1)'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_- Select -MTP_24062025002338_20250624002343'),
	0, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a (1)'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Resultset/a_Inbox_1'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_FYI- SafePaaS Incident - Reviewer'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/td_AR Approval Limits'),
	'AR Approval Limits', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Notification/button_Close'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_No data found'), 'No data found.', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Begin Date is in the last 1 hours_a-_b680df'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Begin Date is in the last 1 hours_a-_b680df'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Begin Date is in the last 1 hours_a-_b680df'), FailureHandling.OPTIONAL)

//Datasource Synchronization

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Data Source (1)'), FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_- Select an Environment -Coupa_Env1E_2c3357'),
	9, FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Page_Manage Data Source/input_Create_R119140564844328612_search_field'),
	'KTLNEBS_MonitorPaaS_Vision122_DS', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Go'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/input_Run script_f01'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Synchronization'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Data Source/h2_Syncronization processing in the background'),
	20, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Syncronization processing in the bac_84b2b2'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_concat(Row text contains , , KTLNEBS_3f831f'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Data Source/span_Running'), 20, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Inbox'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katalon_admin (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout_1 (1)'), FailureHandling.OPTIONAL)

WebUI.closeBrowser()