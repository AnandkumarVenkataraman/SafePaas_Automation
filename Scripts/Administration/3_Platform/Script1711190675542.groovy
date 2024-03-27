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

WebUI.setText(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/a_Usage'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/a_Usage'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_- Select -QAQA1QA2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_- Select -QAQA1QA2'), 
    'QA', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_YearMonthWeekDay'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_YearMonthWeekDay'), 
    'M', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar From Date'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar From Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/span_Prev'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/span_Prev'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar To Date'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar To Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_23'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_23'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Go'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_Release Update'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_Release Update'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/a_Manage Roles'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/a_Manage Roles'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Manage Roles/a_Assign Roles'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Manage Roles/a_Assign Roles'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

