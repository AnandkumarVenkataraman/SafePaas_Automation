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

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY (12)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (12)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD (13)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn (12)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle (8)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Access Monitor_a-TreeView-toggle (4)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Roles Manager_a-TreeView-toggle (4)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Manage Remediation Plan_a-TreeView-label (4)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/a_Manage Mitigations_a-TreeView-label (2)'))

WebUI.closeBrowser()

