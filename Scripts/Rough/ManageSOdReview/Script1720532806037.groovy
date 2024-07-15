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

WebUI.setText(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/a_Inbox (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/a_Inbox (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/a_Manage Review Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/a_Manage Review Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Manage Review Actions/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Manage Review Actions/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    '5409', true)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_Home/a_SOD Review Configuration'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/label_Aggregated Level'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/label_Aggregated Level'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_Update'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_Update'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.closeBrowser()

