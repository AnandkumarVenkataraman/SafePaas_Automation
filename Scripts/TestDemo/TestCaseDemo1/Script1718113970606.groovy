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

WebUI.verifyElementText(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_Spring 2024_P101_COMPANY'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_Spring 2024_P101_COMPANY'))

WebUI.setText(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.click(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setText(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_New_P101_PASSWORD'))

WebUI.setEncryptedText(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/button_Login'), 0)

WebUI.click(findTestObject('Object Repository/TestDemo/ManageRules/Page_Login/button_Login'))

WebUI.comment('Click on login button')

WebUI.verifyElementPresent(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_AccessPaaS'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.comment('Click on AccessPaaS Navigation menu')

WebUI.verifyElementPresent(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_Enterprise Access Monitor'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/TestDemo/ManageRules/Page_Home/a_Manage Rules'))

WebUI.closeBrowser()

