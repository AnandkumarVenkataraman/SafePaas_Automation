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

WebUI.verifyElementClickable(findTestObject('Login and Home Page/Page_Login/input_Fall 2022_P101_COMPANY'))

WebUI.setText(findTestObject('Login and Home Page/Page_Login/input_Fall 2022_P101_COMPANY'), 'fit')

WebUI.verifyElementClickable(findTestObject('Login and Home Page/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setText(findTestObject('Login and Home Page/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'fitadmin')

WebUI.verifyElementClickable(findTestObject('Login and Home Page/Page_Login/input_New_P101_PASSWORD'))

WebUI.setEncryptedText(findTestObject('Login and Home Page/Page_Login/input_New_P101_PASSWORD'), '/8aCOx33zqpWVrc/SpCYIw==')

WebUI.verifyElementClickable(findTestObject('Login and Home Page/Page_Login/button_Login'))

WebUI.click(findTestObject('Login and Home Page/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/button_fitadmin'))

WebUI.click(findTestObject('Object Repository/Login and Home Page/Page_Home/button_fitadmin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/a_My Profile'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/a_Logout'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/button_Help'))

WebUI.click(findTestObject('Object Repository/Login and Home Page/Page_Home/button_Help'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/a_Support'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/a_Documentation'))

WebUI.click(findTestObject('Object Repository/Login and Home Page/Page_Home/button_Help'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login and Home Page/Page_Home/img_Help_company-img-class'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/button_Inbox_t_Button_navControl'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login and Home Page/Page_Home/img_Inbox_AppLogoIco'))

WebUI.click(findTestObject('Object Repository/Login and Home Page/Page_Home/h1_My Inbox'))

WebUI.click(findTestObject('Object Repository/Login and Home Page/Page_Home/h1_My Inbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Login and Home Page/Page_Home/h1_My Inbox'), 'My Inbox')

WebUI.verifyElementText(findTestObject('Object Repository/Login and Home Page/Page_Home/label_Notifications'), 'Notifications')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page/Page_Home/select_OpenCanceledClosed'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Login and Home Page/Page_Home/select_OpenCanceledClosed'), 'Open', 
    true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Login and Home Page/Page_Home/select_OpenCanceledClosed'), 'Canceled', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Login and Home Page/Page_Home/select_OpenCanceledClosed'), 'Closed', true, FailureHandling.OPTIONAL)

