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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Home/a_Manage Data Source'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Home/a_Manage Data Source'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_060259'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_060259'), 
    'KTLNEBS_MonitorPaaS', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/a_KTLNEBS_MonitorPaaS_Vision122_DS'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/a_KTLNEBS_MonitorPaaS_Vision122_DS'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/input_Run script_f01'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/input_Run script_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/button_Synchronization'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/button_Synchronization'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/button_Syncronization processing in the bac_84b2b2'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/MonitorPaaS/1_Manage DataSource/Page_Manage Data Source/button_Syncronization processing in the bac_84b2b2'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser()

