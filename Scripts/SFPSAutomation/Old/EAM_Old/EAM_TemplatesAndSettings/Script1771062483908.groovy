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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (7)'), 'kat')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (7)'), 
    'katadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (7)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (6)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_Email Configuration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -DataProbeEnterp_9ed873'), 
    'FSOD', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73'), 
    'Cancelling Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73'), 
    'Escalation Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -Action Approval_bc1e73'), 
    '- Please select one -', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/select_- Please select one -DataProbeEnterp_9ed873'), 
    '- Please select one -', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Email Configuration/span_Settings'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/input_Settings_R307838823214507554_ig_toolb_058319'), 
    'Enterprise Access Monitor')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Interval to First Reminder'), 
    'Interval to First Reminder')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_NUMBER'), 'NUMBER')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_This parameter defines how many days aft_db1eba'), 
    'This parameter defines how many days after the review creation, the first reminder will be sent')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Interval Days Between Reminders'), 
    'Interval Days Between Reminders')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_NUMBER'), 'NUMBER')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_This parameter defines how many days wil_0803fe'), 
    'This parameter defines how many days will elapse between sending reminders')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/button_concat(Search for , , Enterprise Acc_010a39'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/a_Inbox'))

