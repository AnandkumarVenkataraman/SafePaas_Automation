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

WebUI.selectOptionByValue(findTestObject('Object Repository/Extract Data/select_Attribute_KTLNAttributes-DTP701Entry_9d1214'), 
    '349761', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Apply Changes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/a_Manage Snapshot'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Extract Data/select_Select any oneKTLN_OBJECT_SET'), '5309', 
    true, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Extract Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Extract Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_-- Select any one ---- Local File --_b47e4a'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Component (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/span_Extract Snapshot'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Object Sets (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/span_KTLN_OBJECT_SET'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Type (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Occurrences'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Change Tracker'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Security'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/div_Security'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Datasource (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_KTLN_LocalFiles'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/td_Users_KTLN'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 'Extract_KTLN_Users_V3', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Name (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Comments'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Extract Data/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'), 'Test Extract_KTLN_Users', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Repeat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_NeverMinutesDailyWeeklyMonthlyYearly'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Popup Calendar Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Create'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Create'), FailureHandling.STOP_ON_FAILURE)

