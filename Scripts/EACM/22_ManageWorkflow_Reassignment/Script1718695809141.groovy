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

WebUI.callTestCase(findTestCase('Other/EACM/Initiate Survey for Reassignment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Home/a_Manage Workflow'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Home/a_Manage Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd (1)'), 
    'Enterprise Access Certification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_8d6cb3 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_8d6cb3 (1)'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721 (1)'), 
    'INSTANCE_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/input_p_ignore_10 (1)'), 
    GlobalVariable.EACM_InitiateSurvey_Reassignment)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/span_fa fa-search (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/span_fa fa-search (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/h2_Manage Workflow - Level 2 - KTLN_TestSur_f17e5f (1)'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/h2_Manage Workflow - Level 2 - KTLN_TestSur_f17e5f (1)'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/a_Actions (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/a_Actions (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/i_fa fa-wrench (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/i_fa fa-wrench (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder (1)'), 
    'REASSIGN', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select any -ANANDK1MARIAB1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/select_- Please select any -ANANDK1MARIAB1'), 
    'DPATEL', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/buttonP35_NEW_APPROVER_lov_btn (1)'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/buttonP35_NEW_APPROVER_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/input_a-PopupLOV-search apex-item-text (1)'), 
    'KTLN_EAM_USER1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/span_MARIAB'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/span_MARIAB'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_Submit'))

WebUI.verifyElementClickable(findTestObject('deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 1213'))

WebUI.click(findTestObject('deba1/EACM_WorkflowReassignment/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 1213'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_katalon_admin - 330'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_katalon_admin - 330'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 331'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 331'))

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_COMPANY (1) (2)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_USERNAME (1) (2)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_PASSWORD (1) (2)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/button_Login (1) (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey_7008'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey_7008'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.delay(30)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/tr_SelectRow'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 102 (1)'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Not Verified', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Not Verified', true)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Not Verified', true)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Not Verified', true)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Not Verified', true)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 101 (1)'))

WebUI.doubleClick(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 101 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Terminate Access', true)

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 -U120'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 -U120'), 
    'Test Justification')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/span_Certified By (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/span_Certified By (1)'))

WebUI.delay(0)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/buttonANANDK1_336'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/buttonANANDK1_336'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 338'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 338'))

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_COMPANY (1) (2)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_USERNAME (1) (2)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_PASSWORD (1) (2)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/button_Login (1) (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey_7008'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey_7008'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.delay(30)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_All records verified (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/tr_SelectRow'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 102 (1)'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Terminate Access', true)

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/div_Please enter a mass or individual justi_5e2bf1 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementText(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 -U120'), 
    '')

WebUI.setText(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 -U120'), 
    'Test Justification')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/h2_User Access Certification has been Completed (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/buttonANANDK1_336'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/buttonANANDK1_336'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 338'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 338'))

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_COMPANY (1) (2)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_USERNAME (1) (2)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_PASSWORD (1) (2)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/button_Login (1) (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey_7008'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey_7008'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.delay(15)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.delay(30)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_All records verified (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - U1000'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/h2_User Access Certification has been Completed (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/buttonANANDK1_336'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/buttonANANDK1_336'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 338'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 338'))

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_COMPANY (1) (2)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_USERNAME (1) (2)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/input_P101_PASSWORD (1) (2)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Login/button_Login (1) (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Manage User Access (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Manage User Access (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_aebd9b'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_aebd9b'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/select_NameDescriptionEnd Date ActionStatus_dc9709'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/input_p_ignore_10'), 
    GlobalVariable.EACM_InitiateSurvey_Reassignment)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/a_KTLN_TestSurvey_Mar25_V2'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_Manage User Access/a_KTLN_TestSurvey_Mar25_V2'))

WebUI.scrollToElement(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Validation/h2_Completed'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Validation/h2_Completed'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Validation/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Validation/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Validation/a_User Access Certification Details'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Validation/a_User Access Certification Details'))

WebUI.delay(30)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Analytics/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Analytics/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Certification Details/select_Select any oneEACM_Feb19_V101EACM_Fe_f24e60'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Certification Details/select_Select any oneEACM_Feb19_V101EACM_Fe_f24e60'), 
    GlobalVariable.EACM_InitiateSurvey_Reassignment, false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Certification Details/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/EACM_ManageUser and Report/Page_User Access Certification Details/button_Go'))

WebUI.closeBrowser()

