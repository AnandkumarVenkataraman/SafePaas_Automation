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

WebUI.setText(findTestObject('Object Repository/DTP_New_Datasource/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/DTP_New_Datasource/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/DTP_New_Datasource/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/DTP_New_Datasource/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/DTP_New_Datasource/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/DTP_New_Datasource/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/DTP_New_Datasource/Page_Home/a_Manage Data Source'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_72b163'), 
    'NEW_CLOUDERP', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/a_NEW_CLOUDERP_DS'))

WebUI.click(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/a_NEW_CLOUDERP_DS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/label_Active'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/span_Yes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/label_Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/label_Type Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/select_- Select Any -Azure RESTDB2Local Fil_e3ef38'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/label_Security Protocol'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/select_- Select Any -User-Password'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/DTP_New_Datasource/Page_Manage Data Source/button_Cancel'))

WebUI.closeBrowser()

