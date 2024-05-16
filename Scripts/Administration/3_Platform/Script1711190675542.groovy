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

WebUI.comment('launch the url in IQA : https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.comment('Enter Company as KAT')

WebUI.setText(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.comment('Enter username as KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter Password')

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Login/button_Login'))

WebUI.comment('Click on login button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle'))

WebUI.comment('verify the Expand Navigation for administration is clickable')

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle'))

WebUI.comment('click on the Expand navigation for Administration')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/span_a-TreeView-toggle_1'))

WebUI.comment('click on the Expand navigation for Platform')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/a_Usage'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Home/a_Usage'))

WebUI.comment('click on Usage from Navigation menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_- Select -QAQA1QA2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_- Select -QAQA1QA2'), 
    'QA', true)

WebUI.comment('select the environment as QA')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_YearMonthWeekDay'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/select_YearMonthWeekDay'), 
    'M', true)

WebUI.comment('Select the Interval as Monthly')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar From Date'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar From Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/span_Prev'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/span_Prev'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_1'))

WebUI.comment('Select the start date')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar To Date'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Popup Calendar To Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_23'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_23'))

WebUI.comment('select the End date')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/button_Go'))

WebUI.comment('click on GO button')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_Release Update'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Usage/a_Release Update'))

WebUI.comment('Click on Release update from Navigation menu')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/span_a-TreeView-toggle'))

WebUI.comment('Click on Setup from Navigation menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/a_Manage Roles'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Release Update/a_Manage Roles'))

WebUI.comment('Click on Manage Roles')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_Platform/Page_Manage Roles/a_Assign Roles'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_Platform/Page_Manage Roles/a_Assign Roles'))

WebUI.comment('Click on Assign Roles')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

