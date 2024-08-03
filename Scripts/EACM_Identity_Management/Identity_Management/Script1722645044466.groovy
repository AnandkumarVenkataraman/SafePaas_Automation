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

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Identity_Management/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/a_Manage Certification'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/select_Select any oneEBizApp_JDBC_EnvJDE_TE_680338'), 
    'Tririga_OS', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_Create'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/input_(Value Required)_P10_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/input_(Value Required)_P10_NAME'), 
    GlobalVariable.EACM_Identity_Management)

WebUI.verifyElementText(findTestObject('Identity_Management/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 
    GlobalVariable.EACM_Identity_Management)

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/a_3'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/a_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/button_Close'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/button_Close'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/label_Terminate Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/label_Manual POST'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/label_Manual POST'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/button_Create'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Initiate User Access/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage User Access/h2_Certification job was initiated successf_5628ed'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Identity_Management/Page_Manage User Access/td_Open'), 'Open')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Validation/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Validation/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/Identity_Management/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/a_TRIRIGA_OS_CERT_V4'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/a_TRIRIGA_OS_CERT_V4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Verify All'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Verify All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_OK'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_OK'))

WebUI.delay(30)

WebUI.waitForElementPresent(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'), 
    10)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/span_Access Group'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/span_Access Group'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/a_Identity_Group1'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/a_Identity_Group1'))

WebUI.delay(10)

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/tr_SelectRow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/td_Verified_1'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/td_Verified_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'), 
    'Terminate Access', true)

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    '')

WebUI.setText(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    'TEST')

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Save Changes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(15)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('Identity_Management/Page_User Access Certification Survey/button_Access Group equals Identity_Group1__d77059'))

WebUI.click(findTestObject('Identity_Management/Page_User Access Certification Survey/button_Access Group equals Identity_Group1__d77059'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/span_Access Group'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/span_Access Group'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/a_Identity_Group2'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/a_Identity_Group2'))

WebUI.delay(10)

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/tr_SelectRow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/td_Verified_1'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/td_Verified_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'), 
    'Terminate Access', true)

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Save Changes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(15)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Confirm Changes'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification Survey/button_Confirm Changes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification has been closed/h2_User Access Certification has been Completed'), 
    FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification has been closed/a_My Certifications'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification has been closed/a_My Certifications'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_User Access Certification has been closed/button_OK'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_User Access Certification has been closed/button_OK'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/button_ktln_eacm_user1'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/button_ktln_eacm_user1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/span_Logout'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Identity_Management/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Identity_Management/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Home/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Home/a_Manage Certification'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/select_Select any oneEBizApp_JDBC_EnvJDE_TE_680338'), 
    'Tririga_OS', true, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/td_Completed'), 
    'Completed', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/input_POSTGET Process Status_f01'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/input_POSTGET Process Status_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_POST'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_POST'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_OK'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/a_Post In-Process'))

WebUI.verifyElementText(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/a_Post In-Process'), 
    'Post In-Process', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/h2_Post action initiated'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_Post action initiated_t-Button t-But_2030e8'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_Post action initiated_t-Button t-But_2030e8'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_Go'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/button_Go'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/a_Get In-Process'))

WebUI.verifyElementText(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/a_Get In-Process'), 
    'Get In-Process', FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/a_User Access Certification Details'))

WebUI.click(findTestObject('Object Repository/Identity_Management/Page_Manage Certification/a_User Access Certification Details'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'Tririga_OS', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_User Access Certification Details/select_Select any oneKTLN_EACM_Survey_Feb12_597753 - 0003'))

WebUI.selectOptionByLabel(findTestObject('EACM/POST EACM SURVEY/Page_User Access Certification Details/select_Select any oneKTLN_EACM_Survey_Feb12_597753 - 0003'), 
    GlobalVariable.EACM_Identity_Management, true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/select_StatusRole GroupUser NameUser Displa_8fbe19'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/select_StatusRole GroupUser NameUser Displa_8fbe19'), 
    'VALIDATE_STATUS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/buttonuacDetails_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/buttonuacDetails_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Terminate Access request raised'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Terminate Access request raised'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/button_Apply'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket No'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket No'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket Status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket Status'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.closeBrowser()

