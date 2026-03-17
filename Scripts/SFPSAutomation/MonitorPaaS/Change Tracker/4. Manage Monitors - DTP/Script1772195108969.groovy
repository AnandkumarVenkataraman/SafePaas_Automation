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

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (10)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (10)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (10)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (9)'))

//First, verify the Monitor in DataProbe
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Object (5)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- Select an Environment -Coupa_Env1E_696603 (2)'),
	'EBizApp_JDBC_Env', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- All -MonitorPaaSEnterprise Access _ba5c00 (1)'),
	'MonitorPaaS', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (1)'),
	'PR & PO Created')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_PR  PO Created By Same User'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_MonitorPaaS (2)'),
	'MonitorPaaS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC (1)'),
	'JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Use Snapshots (1)'),
	'Use Snapshots')
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items (4)'))
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/a_Manage Objects'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_Remove Filter (3)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- All -MonitorPaaSEnterprise Access _ba5c00 (1)'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- Select an Environment -Coupa_Env1E_696603 (2)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_Inbox (4)'))

//Verify the Monitor in Manage Monitors DTP
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Monitors (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/span_Manage Monitors DTP'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/select_- Select -STP_ObjSetO2C_ObjSetEBizAp_87e7a8'),
	'AccountsPayable', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_PR  PO Created By Same User'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/div_Consolidated Level (1)'),
	'Consolidated Level')
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/span_People (3)'))
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/a_Manage Monitors (3)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/select_- Select -STP_ObjSetO2C_ObjSetEBizAp_87e7a8'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_Inbox (4)'))

//Run snapshot extract for the DTP Monitor
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Snapshot (3)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/select_Select any oneAccountsPayableCERP_Ob_803579 (1)'),
	'AccountsPayable', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Extract Data (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/label_Occurrences (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File --_cf7579'),
	'EBiz_JDBC_DS', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_AP Employee Signing LimitsAP Employe_f6cb18'),
	'367581', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_(Value Required)_P30_MULTI_OBJECT_ID_MOVE (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/label_Run Monitor_u-checkbox (2)'))

//Set the current date & time variable for the Snapshot Extract
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')

def currentDateTime = dateFormat.format(new Date())

def dtpMTR1 = 'DTPSMTR_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME (14)'),
	dtpMTR1)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS (12)'),
	'This snapshot extract is initiated by QA Automation, for a DataProbe Monitor at Consolidated-Level + Occurrences')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Create (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Job initiated DTPMTP_1703_V1_t-Butto_cb24e4'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/label_Auto Refresh_u-checkbox (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field (2)'),
	dtpMTR1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/label_Auto Refresh_u-checkbox (1)'))
WebUI.delay(900)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/a_Completed (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info (5)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/span_No data found (3)'),
	'No data found.')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info (5)'))
WebUI.back()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/a_(SS)DTPMTP_1703_V1_20260317013656'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Snapshot/span_Snapshot Details (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/select_Select any onePR  PO Created By Same User'),
	1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/select_Select any onePR  PO Created By Same User'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Snapshot Details/a_Manage Snapshot (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Remove Filter (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/select_Select any oneAccountsPayableCERP_Ob_803579 (2)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/a_Inbox (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (35)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (43)'))
WebUI.closeBrowser()