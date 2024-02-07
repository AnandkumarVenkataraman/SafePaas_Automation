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

WebUI.navigateToUrl('https://uat.safepaas.com/monitor/f?p=1000:101:::::')

WebUI.setText(findTestObject('Object Repository/Extract Data/input_Winter 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Extract Data/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Extract Data/input_New_P101_PASSWORD'), 'E9jDT7RxyN0+jhzlxRmzLQ==')

WebUI.click(findTestObject('Object Repository/Extract Data/button_Login'))

WebUI.click(findTestObject('Object Repository/Extract Data/span_MonitorPaaS_a-TreeView-toggle'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/span_Manage Snapshot_a-TreeView-toggle'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/a_Manage Object Set'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/a_KTLN_OBJECT_SET'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_UserEntry'), '349621', true)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/Extract Data/a_Manage Snapshot'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Extract Data/select_Select any oneKTLN_OBJECT_SET'), '5309', 
    true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Extract Data'))

WebUI.click(findTestObject('Object Repository/Extract Data/button_Extract Data'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_-- Select any one ---- Local File --_b47e4a'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Component (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/span_Extract Snapshot'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Object Sets (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/span_KTLN_OBJECT_SET'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Type (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Occurrences'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Change Tracker'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Security'))

WebUI.click(findTestObject('Object Repository/Extract Data/div_Security'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Datasource (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_KTLN_LocalFiles'))

WebUI.verifyElementClickable(findTestObject('Extract Data/td_UserEntry_KTLN'))

WebUI.setText(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 'Extract_KTLN_UserEntry_V2')

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Comments'))

WebUI.click(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'))

WebUI.setText(findTestObject('Object Repository/Extract Data/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'), 'Test Extract_KTLN_UserEntry_V2')

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Repeat'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_NeverMinutesDailyWeeklyMonthlyYearly'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Start Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Popup Calendar Start Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Create'))

WebUI.click(findTestObject('Object Repository/Extract Data/button_Create'))

