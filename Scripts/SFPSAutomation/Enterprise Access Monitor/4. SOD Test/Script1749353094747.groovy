import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (20)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (20)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (19)'))

//SOD Test
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (84)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (66)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage ERP Snapshot_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage SOD Test (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'),
	'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Create (2)'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File -- (2)'),
//	'0', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_Restricted AccessSOD DetectiveSOD Pr_810bc4 (2)'),
	1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_1456471471_3471_RAALL CERP RULESAR_A_742b0f'),
	'All', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE (9)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_1456471471_3471_RAALL CERP RULESAR_A_3047ab'),
	'EBiz', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE (9)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_1456471471_3471_RAALL CERP RULESAR_A_3ae5a5'),
	'EBizRule', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE (9)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_1456471471_3471_RAALL CERP RULESAR_A_420ef9'),
	'ENVREARCH', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Rule Tags_P30_RULE_TAG_MOVE (9)'))

//Set the current date & time as a variable
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
def currentDateTime = dateFormat.format(new Date())
def sodTst = 'SODTST' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME (11)'),
	sodTst)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS (9)'),
	'This SOD Test is initiated by QA Automation, for EBS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Create (4)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/h2_Job initiated SODTST_06022026_V2_2026020_f84369'),
	'Job initiated: SODTST_06022026_V2_202602060428.SOD Test initiated successfully.', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Job initiated SODTST_06022026_V2_202_1035a8'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Inbox (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Scheduler (1)'))
WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/input_Job Time_SCHEDULER_search_field (2)'),
	sodTst, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Go (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Remove Filter'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Inbox (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (84)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (66)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage ERP Snapshot_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage SOD Test_1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'),
	'EBizApp_JDBC_Env', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/input_Create_R169645132708451655_search_field (9)'),
	sodTst)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Go (2)'))
WebUI.delay(300)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Go (2)'))
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/td_Closed (1)'), 'Closed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Test Log (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Error'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Error'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Warning (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/input_Level_P10_LOG_LEVEL_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/label_Info (2)'))

WebUI.back()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_SODTST_06022026_V2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Test/button_Cancel (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/button_Remove Filter'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage SOD Test/a_Inbox (1)'))
WebUI.comment("SOD Test completed successfully")
WebUI.closeBrowser()