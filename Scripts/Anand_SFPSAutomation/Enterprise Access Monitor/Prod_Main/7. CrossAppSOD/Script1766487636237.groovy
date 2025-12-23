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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Fall 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_OR CONTINUE WITH_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Login'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Enterprise IT Map'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Create'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/select_- Select any one -Coupa_Env1EBizApp__90e6c7'), 
    'EBizApp_JDBC_Env', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/select_- Please select any one -EntryUser E_fcc26f'), 
    'EBiz_SFTP', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/select_- Select any one -Coupa_Env1EBiz_SFT_11e0a1'), 
    2)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/select_- Please select any one -EntryUser E_fcc26f'), 
//    'FSOD.FSOD_USER_ALL', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/select_- Please select any one -Concurrent _8299bd'), 
//    '343', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Create (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/h2_Mapping successfully created'), 'Mapping successfully created')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Mapping successfully created_t-Butto_00317c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Help_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Define Scope_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Violation'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage SOD Test (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Create (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/select_-- Select any one ---- Local File --'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/select_Restricted AccessSOD DetectiveSOD Pr_810bc4'), 
    'DT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/select_471ALLCloud_RolesCloud_Rules_with_Pr_ccba8a'), 
    'EBiz', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Rule Tags_P30_RULE_TAG_MOVE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/select_Coupa_Env1EBizApp_JDBC_EnvEBiz_SFTPI_ece48c'), 
    '6579', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Cross Environments_P30_CROSS_ENVIRON_e9d7db'))
WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Sales Invoicing and AR Receipts'), 'Sales Invoicing and AR Receipts', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Asset Inquiry vs. General Ledger Rule2'), 
    'Asset Inquiry vs. General Ledger Rule2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Sales Invoicing and AR Receipts2'), 'Sales Invoicing and AR Receipts2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Asset Inquiry vs. General Ledger Rule31'), 
    'Asset Inquiry vs. General Ledger Rule31', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Asset Inquiry vs. General Ledger Rule'), 
    'Asset Inquiry vs. General Ledger Rule', FailureHandling.OPTIONAL)

//Set the run-time variable here, based on Date and Time
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
def currentDateTime = dateFormat.format(new Date())
def sodTstProd = 'CrossSOD' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), sodTstProd)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'), 'This CrossApp SOD Test is initiated by QA Automation')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Create (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/h2_Job initiated CROSSSODTST_V1_20251223050_5c0e33'), 
    'Job initiated: CROSSSODTST_V1_202512230506.SOD Test initiated successfully.', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Job initiated CROSSSODTST_V1_2025122_707952'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Company Settings_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Scheduler'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Job Time_SCHEDULER_search_field'), sodTstProd, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Go (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Row text contains , , CROSSSO_08517c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Help_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Define Scope_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage SOD Test'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Create_R169645132708451655_search_field'), sodTstProd)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Go (3)'))

WebUI.delay(300)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Closed'), 'Closed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Test Log'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Log id'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/label_Info'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/label_Warning'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/span_No data found'), 'No data found.')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/label_Warning'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/label_Info'))

WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_CROSSSODTST_V1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Row text contains , , crossso_3cd2b5'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Violation (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Request Name_P74_REQUEST_NAME_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Search_a-PopupLOV-search apex-item-text (1)'), 
    sodTstProd)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_CROSSSODTST_V1'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Help_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Dashboard_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Analytics_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Violations by User Report'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Test Name_P86_TEST_NAME_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Search_a-PopupLOV-search apex-item-text (2)'), 
    sodTstProd)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_CROSSSODTST_V1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Enterprise IT Map'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/body_Inbox                katalon_admin    _3a7cde'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Mappings Report_R275422977080048150_s_4fdaf0'), 
    'SFTP')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Go (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_EBizApp_JDBC_Env'), 'EBizApp_JDBC_Env')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Operations'), 'Operations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_EBiz_SFTP'), 'EBiz_SFTP')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Operations_1'), 'Operations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_Users'), 'Users')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_FSOD.FSOD_USER_ALL.USER_NAME  FSOD.FSOD__e2754c'), 
    'FSOD.FSOD_USER_ALL.USER_NAME = FSOD.FSOD_USER_ALL.USER_NAME')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/img_Join Condition_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Delete'))
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/h2_Mapping successfully deleted'), 'Mapping successfully deleted')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Mapping successfully created_t-Butto_00317c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Row text contains , , SFTP, ,_bafa7b'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Help_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Analytics_a-TreeView-toggle_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Rules'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03 (2)'), 
    'EBizApp_JDBC_Env', false)
WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03 (2)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_katalon_admin (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Logout (1)'))

WebUI.closeBrowser()
