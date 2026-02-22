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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Winter 2026_P101_COMPANY (2)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (77)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (77)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (36)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (88)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_User Access Certification Details (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/button_User Access Certification_P7_UAC_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/input_Search_a-PopupLOV-search apex-item-text (1)'),
	'EBS_UAR_04022026')
WebUI.delay(60)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/span_EBS_UAR_04022026'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/button_User Access Certification_P7_UAC_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/input_Close_a-PopupLOV-search apex-item-text (1)'),
	'MULTIENV_UAR_06112')
WebUI.delay(60)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/span_MULTIEnv_UAR_06112'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/a_Inbox (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (14)'))

WebUI.closeBrowser()
