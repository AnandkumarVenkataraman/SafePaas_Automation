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

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.click(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.verifyElementText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    '')

WebUI.setText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    'KTLN_SODTest_Jan21_V1')

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.delay(15)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/buttonsearch_expression_icon_link (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/buttonsearch_expression_icon_link (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/a_Banks Maintenance and Bank Account Reconc_3d19dd (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/a_Banks Maintenance and Bank Account Reconc_3d19dd (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Project Integration Specialist[ORA_PJF_PROJECT_INTEGRATION_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Application Implementation Consultant[ORA_ASM_APPLICATION_IMPLEMENTATION_CONSULTANT_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  Application Implemen_25f3b6 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    3 of           _0e833d (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    3 of           _0e833d (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1) - Copy'))

WebUI.click(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1) - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Menu-statusCol (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Project Billing Specialist[ORA_PJF_PROJECT_BILLING_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  Project Billing Spec_51d89c (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  Project Billing Spec_51d89c (1)'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'General Accounting Manager[ORA_GL_GENERAL_ACCOUNTING_MANAGER_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Icon icon-irr-no-results (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Icon icon-irr-no-results (1)'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Integration Specialist[ORA_FND_INTEGRATION_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  Integration Speciali_062988 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    3 of           _0e833d (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    3 of           _0e833d (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Menu-statusCol (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/buttonsearch_expression_icon_link (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/buttonsearch_expression_icon_link (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/a_Configuration and Transaction (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/a_Configuration and Transaction (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Menu-statusCol (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Project Integration Specialist[ORA_PJF_PROJECT_INTEGRATION_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    6 of           _c2e951'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    6 of           _c2e951'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Menu-statusCol (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Application Implementation Consultant[ORA_ASM_APPLICATION_IMPLEMENTATION_CONSULTANT_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  Application Implemen_25f3b6_1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                   15 of           _e93e5a'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                   15 of           _e93e5a'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Menu-statusCol (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Project Billing Specialist[ORA_PJF_PROJECT_BILLING_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  Project Billing Spec_51d89c_1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    7 of           _e1fbd6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    7 of           _e1fbd6'), 
    0)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'General Accounting Manager[ORA_GL_GENERAL_ACCOUNTING_MANAGER_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  General Accounting M_bbd616'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    1 of           _e353a0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                    1 of           _e353a0'), 
    0)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Actions (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_a-Menu-statusCol (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Filter (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1 (1) (1) (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/input_p_ignore_10 (1) (1)'), 
    'Integration Specialist[ORA_FND_INTEGRATION_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Apply (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_Start Entry Name  Integration Speciali_062988_1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                   10 of           _26b2d1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/span_1 -                   10 of           _26b2d1'), 
    0)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Mass Update Exceptions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/button_Mass Update Exceptions'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/Configuration and transaction checkbox'))

WebUI.click(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/Configuration and transaction checkbox'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/Bank maintenance and Bank account re-conciliation checkbox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/Bank maintenance and Bank account re-conciliation checkbox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/button_Next - Copy - Copy'), 
    0)

WebUI.verifyElementPresent(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/button_Next - Copy - Copy'), 
    0)

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/button_Next - Copy - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('deba1/ManageException_RolesWithConflict/Page_Mass Update Exceptions for Rules/button_Next - Copy - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/select_Select any oneRoles with ConflictsUs_50cbb0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/select_Select any oneRoles with ConflictsUs_50cbb0'), 
    'Roles with Conflicts', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/span_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/select_Role Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/input_p_ignore_10'), 
    'Project Integration Specialist[ORA_PJF_PROJECT_INTEGRATION_SPECIALIST_JOB], Application Implementation Consultant[ORA_ASM_APPLICATION_IMPLEMENTATION_CONSULTANT_JOB], Project Billing Specialist[ORA_PJF_PROJECT_BILLING_SPECIALIST_JOB], General Accounting Manager[ORA_GL_GENERAL_ACCOUNTING_MANAGER_JOB], Integration Specialist[ORA_FND_INTEGRATION_SPECIALIST_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/inputselectunselectall4'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/inputselectunselectall4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/button_Next'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Mass Update Exception/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Conflict Summary Report/select_WhyJustification 2 - RolesEAM402_TES_babce1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Conflict Summary Report/select_WhyJustification 2 - RolesEAM402_TES_babce1'), 
    'Justification 2 - Roles', true)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Conflict Summary Report/span_1 - 7'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Conflict Summary Report/span_1 - 7'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Conflict Summary Report/button_Submit for processing Exceptions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Conflict Summary Report/button_Submit for processing Exceptions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Violation/h2_Mass Update Exceptions created'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/a_Manage Exception - Copy'))

WebUI.click(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Violation/a_Manage Exception - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Actions - Copy'))

WebUI.click(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Actions - Copy'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Filter - Copy'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Filter - Copy'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/a_Justification 2 - Roles (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/a_Justification 2 - Roles (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Exception/span_1 -                    2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/span_1 -                    2'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/ManageException_RolesWithConflict/Page_Manage Exception/td_In Approval Progress'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/td_In Approval Progress'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/a_Logout'))

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_COMPANY (2) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_USERNAME (2) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_PASSWORD (2) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/button_Login (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_Inbox'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/buttonR163105974055422926_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/buttonR163105974055422926_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Banks Maintenance and Bank Account Re_d303f6'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Banks Maintenance and Bank Account Re_d303f6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Configuration and Transaction has bee_ee9afa'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Configuration and Transaction has bee_ee9afa'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/div_Expression'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/span_1 -                    2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_1 -                    2'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Configuration and Transaction has bee_ee9afa_1'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Configuration and Transaction has bee_ee9afa_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/div_To User Configuration and Transaction -_618a39'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    'Test approve1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Banks Maintenance and Bank Account Re_d303f6_1'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/a_The Banks Maintenance and Bank Account Re_d303f6_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/div_The Banks Maintenance and Bank Account _56d18f'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    'Test approve2')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Notification/button_Go'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_a-Icon icon-irr-no-results'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Home/button_katalon_admin - Copy'))

WebUI.click(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Home/button_katalon_admin - Copy'))

WebUI.verifyElementClickable(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Home/a_Logout - Copy'))

WebUI.click(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Home/a_Logout - Copy'))

WebUI.setText(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Login/input_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Login/input_P101_USERNAME'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Home/ManageException1'))

WebUI.click(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Home/ManageException1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/a_Justification 2 - Roles'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/a_Justification 2 - Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/td_Approved'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/td_Approved'))

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/span_1 -                    2'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RolewithConflict_ApprovalProcess/Page_Manage Exception/span_1 -                    2'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

