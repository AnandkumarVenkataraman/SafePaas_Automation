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

//Rule-owner
WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SOD7A35E69CA7977138A40C474C6E18869E')
WebUI.maximizeWindow(FailureHandling.OPTIONAL)
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (18)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (38)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (38)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (16)'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE (1)'),
	5)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION (1)'),
	'This is a test override entered by QA Automation for a Violation Level survey, at Rule-owner Level')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/input_Violation Level_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Review Actions_verifyAll (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/h2_Breadcrumb_t-Alert-title (1)'),
	'Selected records successfully verified')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Selected records successfully verifi_fd3559 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_Anand Kumar Venkataraman_u-tL'),
	'Remediation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_Remediation_u-tL'),
	'Risk and Mitigation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_Risk and Mitigation_u-tL'),
	'KAT Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/a (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Verify Selection_submitClose (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Thank You/h2_Breadcrumb_R267063805622848493_heading'),
	'Thanks for validating the Users.')

WebUI.closeBrowser()
