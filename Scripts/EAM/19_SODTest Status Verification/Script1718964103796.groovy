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

WebUI.setText(findTestObject('Object Repository/deba3/Dashboards/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.comment('Enter the company as kAT')

WebUI.setText(findTestObject('Object Repository/deba3/Dashboards/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.comment('Enter username as KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Dashboards/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Login/button_Login (1)'))

WebUI.comment('Click on Login button')

WebUI.verifyElementClickable(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle (1) - Copy'))

WebUI.click(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle (1) - Copy'))

WebUI.comment('Click on AccessPaaS navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1 (1) - 10'))

WebUI.click(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1 (1) - 10'))

WebUI.comment('Click on Enterprise Access Monitor navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1_2 (1) - 11'))

WebUI.click(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1_2 (1) - 11'))

WebUI.comment('Click on Detect Violation navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Manage SOD Test (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Manage SOD Test (1)'))

WebUI.comment('click on Manage SOD test')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.comment('Select the environment as "KTLN_CloudERP"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/select_Test NameTest DescriptionTypeRules C_f1cdd3'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/input_p_ignore_10'), GlobalVariable.SOD_Testnew)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Apply'))

WebUI.comment('Select the latest SOD test created')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture the details and verify the statu is closed')

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

