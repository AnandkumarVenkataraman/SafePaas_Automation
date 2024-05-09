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

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Login/input_Spring 2024_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'), 
    'END_DATE', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_is nullis not nullis in the lastis n_82401e (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_is nullis not nullis in the lastis n_82401e (1)'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'), 
    'Rule Name', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    'Banks Maintenance and Bank Account Reconciliation')

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.scrollToElement(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/a_15'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/a_15'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_My Inbox'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_My Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Begin Date'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Begin Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Last Day'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Last Day'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/input_Expression_p_ignore_10'), 
    'Banks Maintenance and Bank Account Reconciliation')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Banks Maintenance and Bank Account Re_d303f6'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Banks Maintenance and Bank Account Re_d303f6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_RemoveRuleName Filter_U004'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_RemoveRuleName Filter_U004'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'), 
    'Rule Name', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    'Configuration and Transaction')

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.scrollToElement(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/a_15'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/a_15'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox_1'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_My Inbox'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_My Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/input_Expression_p_ignore_10'), 
    'Configuration and Transaction')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Configuration and Transaction has bee_ee9afa'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Configuration and Transaction has bee_ee9afa'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_concat(Rule Name  , , Configuration _30afa3'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_concat(Rule Name  , , Configuration _30afa3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'), 
    'Rule Name', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    'Bank Account Reconciliation and Enter Customer Receipts')

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.scrollToElement(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/a_18'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox_1'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/input_Expression_p_ignore_10'), 
    'Bank Account Reconciliation and Enter Customer Receipts')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Bank Account Reconciliation and Enter_ab725a'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Bank Account Reconciliation and Enter_ab725a'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/span_Define Scope_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_Manage Exception'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_concat(Rule Name  , , Configuration _30afa3'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_concat(Rule Name  , , Configuration _30afa3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f (1)'), 
    'Rule Name', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/input_Expression_p_ignore_10 (1)'), 
    'Bank Account Reconciliation and Create Payments')

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Apply - U002'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/img_File content_apex-edit-pencil'))

WebUI.scrollToElement(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/a_15'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.click(findTestObject('deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Modify Exception/button_Apply Changes - U001'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox_1'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Manage Exception/a_Inbox_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/input_Expression_p_ignore_10'), 
    'Bank Account Reconciliation and Create Payments')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Bank Account Reconciliation and Creat_697bee'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/a_The Bank Account Reconciliation and Creat_697bee'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/MassUpdateException_New/Page_Home/button_concat(Subject contains , , Configur_26b841'))

WebUI.closeBrowser()

