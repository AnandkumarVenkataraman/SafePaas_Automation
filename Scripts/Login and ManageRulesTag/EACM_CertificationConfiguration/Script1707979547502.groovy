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

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/a_Certification Configuration'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/a_Certification Configuration'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/label_No'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/label_No'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_Update'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_Update'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/a_Inbox'))

WebUI.closeBrowser()

