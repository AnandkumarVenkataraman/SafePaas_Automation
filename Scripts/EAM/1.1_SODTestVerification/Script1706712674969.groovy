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

WebUI.setText(findTestObject('Object Repository/deba3/Dashboards/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/Dashboards/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Dashboards/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle (1) - Copy'))

WebUI.click(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle (1) - Copy'))

WebUI.verifyElementClickable(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1 (1) - 10'))

WebUI.click(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1 (1) - 10'))

WebUI.verifyElementClickable(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1_2 (1) - 11'))

WebUI.click(findTestObject('deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1_2 (1) - 11'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Manage SOD Test (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Manage SOD Test (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/select_Test NameTest DescriptionTypeRules C_f1cdd3'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/input_p_ignore_10'), 'KTLN_SODTest_Feb2_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODTestVerification/Page_Manage SOD Test/button_Apply'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Inbox (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Inbox (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Dashboard (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/Page_Home/a_Dashboard (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/Dashboards/Page_Home/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/Page_Home/select_Select any oneKTLN_SODTest_Jan05_V2__779108 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/Dashboards/Page_Home/select_Select any oneKTLN_SODTest_Jan05_V2__779108 (1)'), 
    'KTLN_SODTest_Feb2_V1', true, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/Dashboards/Page_Home/h2_No of Users'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/Dashboards/Page_Home/h2_No of Users'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

