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

//Launch the SOD Review survey [at Aggregate Level] as Role-owner, and remediate
WebUI.openBrowser('')
WebUI.delay(5)
//Update the below url every time
WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SOD532C4D28706EB59C3FB881D4C497D719')
WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (21)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (41)'),
	'MARIAB1')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (41)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (19)'))
WebUI.delay(3)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Go_uacReport_actions_button'))
//WebUI.delay(30)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_Select Columns_a-Menu-labelContainer'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_Column_uacReport_column_name'),
//	'VERIFIED', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_Operator_uacReport_STRING_OPT'),
//	'is null', true)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Cancel_ui-button--hot ui-button ui-c_5aa9fd'))
//WebUI.delay(10)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span'))
//WebUI.delay(3)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/a'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/span_1'))
//WebUI.delay(3)
//
////set the rows per page to 1000
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Go_uacReport_actions_button'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Filter_uacReport_actions_menu_3i'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Rows Per Page_uacReport_actions_menu_fab44e (1)'))
//WebUI.delay(5)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Rows Per Page_uacReport_actions_menu_fab44e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/input_Verified_selectUnselectAll'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE'),
	3)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION'),
	'This is a test justification entered by QA Automation for an Aggregate Level survey, at Role-owner Level')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Review Actions_verifyAll'))
WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/h2_Breadcrumb_t-Alert-title'),
	'Selected records successfully verified')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Selected records successfully verifi_fd3559'))

//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE'),
//	3)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION_1'),
//	'This is a test justification entered by QA Automation for a Violation Level survey, at Role-owner Level ')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/input_Verified_selectUnselectAll'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Review Actions_verifyAll'))
//WebUI.delay(10)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/h2_Breadcrumb_t-Alert-title'),
//	'Selected records successfully verified')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Selected records successfully verifi_fd3559'))
//WebUI.delay(5)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Go_uacReport_actions_button'))
//WebUI.delay(5)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Rows Per Page_uacReport_actions_menu_3f0951'))
//WebUI.delay(5)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Verified is null_a-Button a-IRR-butt_44d252'))
//WebUI.delay(5)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/td_-_u-tL'), 'Remediation')
//WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Manage Violation/button_Verify Selection_submitClose'))
WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Thank You and Manage Review Action sen_69f61f/h2_Breadcrumb_R371469424557094181_heading'),
	'Thank You and Manage Review Action sent to Rule Owners')

WebUI.closeBrowser()
