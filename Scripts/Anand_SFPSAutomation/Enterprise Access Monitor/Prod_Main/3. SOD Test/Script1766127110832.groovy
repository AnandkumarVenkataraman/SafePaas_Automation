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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://prod.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (14)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (64)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (64)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (75)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (57)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (15)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage SOD Test'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Create (1)'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File -- (1)'), 
//    '0', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_Restricted AccessSOD DetectiveSOD Pr_810bc4 (1)'), 
    1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_471ALLCloud_RolesCloud_Rules_with_Pr_ccba8a'), 
    'EBiz', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE (8)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Asset Inquiry vs. General Ledger Rule2'), 
    'Asset Inquiry vs. General Ledger Rule2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Asset Inquiry vs. General Ledger Rule'), 
    'Asset Inquiry vs. General Ledger Rule', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET'), 'SET', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_H'), 'H', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT'), 'DT', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz'), 'EBiz', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Sales Invoicing and AR Receipts'), 
    'Sales Invoicing and AR Receipts', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Sales Invoicing and AR Receipts_1'), 
    'Sales Invoicing and AR Receipts', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_1'), 'SET', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_H_1'), 'H', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_1'), 'DT', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_1'), 'EBiz', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Sales Invoicing and AR Receipts2'), 
    'Sales Invoicing and AR Receipts2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_2'), 'SET', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_L'), 'L', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_2'), 'DT', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_2'), 'EBiz', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Asset Inquiry vs. General Ledger Rule_1'), 
    'Asset Inquiry vs. General Ledger Rule', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Asset Inquiry vs. General Ledger Rule_2'), 
    'Asset Inquiry vs. General Ledger Rule', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_3'), 'SET', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_H_2'), 'H', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_3'), 'DT', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_3'), 'EBiz', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Asset Inquiry vs. General Ledger Rule31'), 
    'Asset Inquiry vs. General Ledger Rule31', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_Asset Inquiry vs. General Ledger Rule_3'), 
    'Asset Inquiry vs. General Ledger Rule', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_SET_4'), 'SET', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_H_3'), 'H', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_DT_4'), 'DT', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_4'), 'EBiz', FailureHandling.OPTIONAL)

//Set the run-time variable here, based on Date and Time
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
def currentDateTime = dateFormat.format(new Date())
def sodTstProd = 'SODTST_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME (10)'), 
    sodTstProd)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS (8)'), 
    'This SOD Test is initiated by QA Automation, for EBS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Create (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/h2_Job initiated SODTST_1912_V5_20251219015_4e0cf8'), 
    'Job initiated: SODTST_1912_V5_202512190158.SOD Test initiated successfully.', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Job initiated SODTST_1912_V5_2025121_c5496d'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (28)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Scheduler'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/td_SODTST_1912_V5_202512190158'), 
    'SODTST_1912_V5_202512190158', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (75)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (57)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (15)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage SOD Test'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/input_Create_R169645132708451655_search_field (8)'), 
    sodTstProd)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Go (1)'))

WebUI.delay(300) //wait for 5 min. for the SOD Test to complete

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/td_Closed'), 'Closed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Test Log (1)'))

WebUI.delay(45)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/button_Error Gateway Time-out_t-Button t-Bu_6e42e6'), FailureHandling.OPTIONAL)

WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_SODTST_1912_V5'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Test/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_concat(Row text contains , , SODTST__cc95e1'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katalon_admin (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Logout (1)'))

WebUI.closeBrowser()

