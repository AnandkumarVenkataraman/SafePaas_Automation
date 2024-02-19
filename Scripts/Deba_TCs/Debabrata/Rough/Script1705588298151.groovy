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

WebUI.setText(findTestObject('Object Repository/Rough/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Rough/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Rough/Page_Login/input_P101_PASSWORD'), 'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.click(findTestObject('Object Repository/Rough/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Rough/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Rough/Page_Home/a_Manage Snapshot'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rough/Page_Manage Snapshot/select_Select any oneCERP_ObjSetEBizApp_JDB_4cd3ab'), 
    '5309', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Rough/Page_Manage Snapshot/button_Go'))

WebUI.click(findTestObject('Object Repository/Rough/Page_Manage Snapshot/button_Go'))

WebUI.rightClick(findTestObject('Object Repository/Rough/Page_Manage Snapshot/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Rough/Page_Manage Snapshot/button_Go'))

WebUI.click(findTestObject('Object Repository/Rough/Page_Manage Snapshot/button_Go'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Rough/Page_Manage Snapshot/a_Status code'))

WebUI.closeBrowser()

