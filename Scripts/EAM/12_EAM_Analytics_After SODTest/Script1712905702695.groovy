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

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Login/input_Winter 2024_P101_COMPANY (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Login/input_New_P101_PASSWORD (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_Help_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_Help_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_iAccess_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_iAccess_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_Dashboard_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_Dashboard_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_Analytics_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/span_Analytics_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/a_Violations by User Report (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_Home/a_Violations by User Report (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__877ce1 (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__877ce1 (1) (1)'), 
    'KTLN_SODTest_Apr13_V1', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Asset Txns vs. IT User & Role maintenance Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Project Accountant[ORA_PJF_PROJECT_ACCOUNTANT_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Rule Name, Start Entry Name_a-Icon ico_3f2984 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Rule Name, Start Entry Name_a-Icon ico_3f2984 (1) (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'AR vs. GL Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'user_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Akhil')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Rule Name, Start Entry Name_a-Icon ico_3f2984 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Rule Name, Start Entry Name_a-Icon ico_3f2984 (1) (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Banks Maintenance and Bank Account Reconciliation')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Application Implementation Consultant[ORA_ASM_APPLICATION_IMPLEMENTATION_CONSULTANT_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Integration Specialist[ORA_FND_INTEGRATION_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Configuration and Transaction')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Project Integration Specialist[ORA_PJF_PROJECT_INTEGRATION_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(0)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Project Billing Specialist[ORA_PJF_PROJECT_BILLING_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'General Accounting Manager[ORA_GL_GENERAL_ACCOUNTING_MANAGER_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Bank Account Reconciliation and Enter Customer Receipts')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'user_name', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Bank Account Reconciliation and Create Payments')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) - U1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'user_name', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) -U2 (1)'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Violation Status - U3 (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Exception Status - U4 (1)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_concat(Rule Name  , , Asset Txns vs._c7782a (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Create Purchase Agreements vs. Manage Payables Activities')

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Procurement Manager[ORA_PO_PROCUREMENT_MANAGER_JOB]')

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'violation_path_description', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Supplier Profile Inquiry')

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'violation_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'FND_MANAGE_FILE_IMPORT_AND_EXPORT_PRIV')

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'user_name', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.scrollToElement(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Remediation Status - U81'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Remediation Status - U81'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1) - U90'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1) - U90'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Create Payments vs. Enter Customer Receipts Rule')

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'user_name', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_svcerpintgusr  Service ERP integration User (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.scrollToElement(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Remediation Status - U81'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Remediation Status - U81'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1) - U90'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1) - U90'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/span_Select Columns_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Create Purchase Orders and Maintain AP Configurations')

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'start_entry_name', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/input_Expression_p_ignore_10 (1) (1)'), 
    'Buyer[ORA_PO_BUYER_JOB]')

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/select_Rule NameStart Entry NameViolation E_4d750d (1) (1)'), 
    'user_name', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Expression_uvrReport_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_ee548037  Delio Godard'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_ee548037  Delio Godard'))

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Apply (1) (1) - U80'))

WebUI.scrollToElement(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Remediation Status - U81'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/a_Remediation Status - U81'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1) - U90'))

WebUI.click(findTestObject('deba1/EAM_Analytics_Remediations/Page_User Violation Report/button_Remove StartEntryName (1) - U90'))

WebUI.closeBrowser()

