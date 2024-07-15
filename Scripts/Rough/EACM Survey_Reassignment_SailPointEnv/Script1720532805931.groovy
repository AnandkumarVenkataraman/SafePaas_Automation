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

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Login/input_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Home/a_Manage Workflow'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Home/a_Manage Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd'), 
    'Enterprise Access Certification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a'), 
    'SailPoint_Env', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Search'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Search'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721'), 
    'INSTANCE_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/input_p_ignore_10'), 'KTLN_EACM_Survey_June04_V2')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/span_fa fa-search'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/span_fa fa-search'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/h2_Manage Workflow - Level 2 - KTLN_EACM_Su_35a129'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/h2_Manage Workflow - Level 2 - KTLN_EACM_Su_35a129'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/a_Actions'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'), 
    'REASSIGN', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select any -DPATELKTLN_EACM_USER1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/select_- Please select any -DPATELKTLN_EACM_USER1'), 
    'DPATEL', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/buttonP35_NEW_APPROVER_lov_btn'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/buttonP35_NEW_APPROVER_lov_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/input_a-PopupLOV-search apex-item-text'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/input_a-PopupLOV-search apex-item-text'), 
    'ANANDK')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/span_ANANDK'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/span_ANANDK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba4/EACM_Reassignment/Page_Manage Workflow/h2_Workflow reassigned'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.mouseOver(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_MCD Employee Crew CA ABSTRACTMCD_Employe_24a2f8 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'N', true)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'N', true)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1044'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1044'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'N', true)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'J', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/div_Please enter a mass or individual justi_5e2bf1 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    'Justification for KTLN_EACM_Survey_June04_V2')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/span_Certified By (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/span_Certified By (1)'))

WebUI.delay(0)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'ANANDK')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test Survey_89 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test Survey_89 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_All records verified (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'J', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/div_Please enter a mass or individual justi_5e2bf1 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    'Justification for KTLN_EACM_Survey_Mar3_V4')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/h2_User Access Certification has been Completed (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/button_logout_ANANDK'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/button_logout_ANANDK'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_Logout - a100'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_Logout - a100'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.mouseOver(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_MCD Employee Crew CA ABSTRACTMCD_Employe_24a2f8 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1) - 800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/h2_User Access Certification has been Completed (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey 125'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey 125'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/h2_User Access Certification has been Completed (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_My Dashboard'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_My Dashboard'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/label_Toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/label_Toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/select_Certification NameCertification Desc_14a9ed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/input_p_ignore_10'), 'KTLN_EACM_Survey_Mar3_V4')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Apply'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

