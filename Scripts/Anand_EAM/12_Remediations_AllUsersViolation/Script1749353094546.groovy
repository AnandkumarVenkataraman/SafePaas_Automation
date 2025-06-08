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

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_COMPANY (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_USERNAME (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_PASSWORD (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/div_AccessPaaS (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Manage Remediation Plan (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Manage Remediation Plan (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/span_a-Menu-statusCol (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c (1)'), 
    'GCA_WORKFLOW', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    '!=', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/input_p_ignore_10 (1)'), 
    'SOD Review')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c (1)'), 
    'GCA_ENABLED_FLAG', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/buttonR327963090047660484_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/buttonR327963090047660484_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Y (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Y (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c (1)'), 
    'GCA_END_DATE', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_is nullis not nullis in the lastis n_82401e (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/select_is nullis not nullis in the lastis n_82401e (1)'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/button_Apply (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Code (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Meaning (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Description (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Enabled (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_End Date (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/span_Remediate Issues'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediation Plan/a_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any OneKTLN_APRIL18_V3KTLN_MA_f74cb9 (1) - 9abc'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any OneKTLN_APRIL18_V3KTLN_MA_f74cb9 (1) - 9abc'), 
    GlobalVariable.SOD_Test, true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/buttonactionsReport_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/buttonactionsReport_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/a_Create Payments vs. Enter Customer Receipts Rule'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/a_Create Payments vs. Enter Customer Receipts Rule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60'), 
    'USER_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/buttonactionsReport_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/buttonactionsReport_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Remediate Issues/a_svcerpintgusr_U70'))

WebUI.click(findTestObject('deba1/ManageRemediationPlan/Page_Remediate Issues/a_svcerpintgusr_U70'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/span_1 -                   13 of           _a456d9'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/span_1 -                   13 of           _a456d9'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'), 
    'COMPKTLN_U', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/input_P122_EXCEPTION_SCOPE'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/input_P122_EXCEPTION_SCOPE'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/input_P122_EXCEPTION_SCOPE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/input_f01'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/input_f01'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Remediate Issues/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Add Remediation Action/input_P120_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Add Remediation Action/input_P120_JUSTIFICATION'), 
    GlobalVariable.Justification_AllUsersViolation)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Add Remediation Action/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Add Remediation Action/button_Submit'))

WebUI.delay(20)

WebUI.closeBrowser()

