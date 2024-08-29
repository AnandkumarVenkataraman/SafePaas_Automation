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

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Manage User Access (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Manage User Access (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/select_NameDescriptionEnd Date ActionStatus_dc9709'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/input_p_ignore_10'), 
    GlobalVariable.EACM_SurveyName_Verified)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Test123'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Test123'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/h2_Open'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/h2_Open'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/a_Manage User Access'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/a_Manage User Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.delay(30)

WebUI.waitForElementPresent(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'), 
    10)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.delay(10)

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

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(15)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 101 (1)'))

WebUI.doubleClick(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 101 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Terminate Access', false)

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/div_Please enter a mass or individual justi_5e2bf1 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    GlobalVariable.EACM_SurveyName_Verified)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

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

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), 'Ju8vHiRYWYTapQtHptL/Yg==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test Survey_89 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test Survey_89 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_All records verified (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/tr_SelectRow'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 102 (1)'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 103 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'Terminate Access', true)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/div_Please enter a mass or individual justi_5e2bf1 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    GlobalVariable.EACM_SurveyName_Verified)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

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

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/button_katalon_admin - 121'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/button_katalon_admin - 121'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_Logout - 122'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_Logout - 122'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey 125'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey 125'))

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

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/input_p_ignore_10'), GlobalVariable.EACM_SurveyName_Verified)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Apply'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

