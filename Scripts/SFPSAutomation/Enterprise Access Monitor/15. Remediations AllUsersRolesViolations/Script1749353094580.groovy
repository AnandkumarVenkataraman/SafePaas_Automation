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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Login/input_P101_COMPANY (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Login/input_P101_USERNAME (1) (1) (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Login/input_P101_PASSWORD (1) (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Login/button_Login (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/span_a-TreeView-toggle (1) (1) (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/span_a-TreeView-toggle (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/span_a-TreeView-toggle_1_2 (1) (1) (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/span_a-TreeView-toggle_1_2 (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/a_Actions (1) (1) (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Home/a_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any OneKTLN_APRIL18_V3KTLN_MA_f74cb9 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any OneKTLN_APRIL18_V3KTLN_MA_f74cb9 (1)'), 
    GlobalVariable.SOD_Test, true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Go (1) (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Go (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Actions (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Filter (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'Create Purchase Agreements vs. Manage Payables Activities')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Apply (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Actions (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Filter (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'Application Implementation Consultant[ORA_ASM_APPLICATION_IMPLEMENTATION_CONSULTANT_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Apply (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Actions (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Filter (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'), 
    'USER_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'svcerpintgusr')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Apply (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Apply (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/span_1 -                    4 of           _30b9b1'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/span_1 -                    4 of           _30b9b1'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_f01'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'), 
    'COMPKTLN_UR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'), 
    'COMPKTLN_UR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'), 
    'COMPKTLN_UR', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/input_P122_EXCEPTION_SCOPE'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Submit'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/All User Roles Violation/Page_Remediate Issues/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/input_P120_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/input_P120_JUSTIFICATION'), 
    GlobalVariable.Justification_AllUsersRoleViolation)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/button_Submit'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/button_Submit'))

WebUI.delay(20)

WebUI.closeBrowser()

