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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (30)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (50)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (50)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (28)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage Monitors_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Change Tracker_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Object Set_P103_OBJSET'), 
    1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Incident Level_P103_INCIDENT_LVL'), 
    'Y', true)
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'LM', true)
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'L3', true)
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'L6', true)
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'LY', true)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'CUS', true)
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Incident Level_P103_INCIDENT_LVL'), 
    'A', true)
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/button_Timeframe_B339133044080054830'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Total Incidents_value'), 
    '2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Closed_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_label'), 'Overall Compliance Status', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Overall Compliance Status_progress-bar'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div'), '50 %', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Incident Level_P103_INCIDENT_LVL'), 
    'N', true)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Total Incidents_value_1'), 
    '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Closed_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_value_1 (1)'), 
    '0', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_1'), '100 %', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'LY', true)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Total Incidents_value_1'), 
    '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Closed_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_value_1 (1)'), 
    '0', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_1'), '100 %', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'L6', true)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Total Incidents_value_1'), 
    '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Closed_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_value_1 (1)'), 
    '0', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_1'), '100 %', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'L3', true)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Total Incidents_value_1'), 
    '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Closed_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_value_1 (1)'), 
    '0', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_1'), '100 %', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'LM', true)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Total Incidents_value_1'), 
    '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Closed_value (1)'), '1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_Pending_value_1 (1)'), 
    '0', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/div_1'), '100 %', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Timeframe_P103_TIMEFRAME'), 
    'LW', true)
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/button_Timeframe_B339133044080054830'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Object Set_P103_OBJSET'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (22)'))

WebUI.closeBrowser()
