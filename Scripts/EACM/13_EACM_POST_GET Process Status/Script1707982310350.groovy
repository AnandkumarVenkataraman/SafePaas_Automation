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

WebUI.setText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1) - 700'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1) - 700'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)- 701'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)- 701'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1) - 702'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1) - 702'))

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_Home/a_Manage Certification - 821'))

WebUI.click(findTestObject('EACM/POST EACM SURVEY/Page_Home/a_Manage Certification - 821'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_NameDescriptionEnd Date ActionStatus_a82897'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/input_p_ignore_10'), 'KTLN_EACM_Survey_Feb15_V3')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/a_POSTGET Process Status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/a_POSTGET Process Status'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertificationConfiguration/Page_Certification Configuration/a_Inbox - 602'))

WebUI.click(findTestObject('EACM/EACM_CertificationConfiguration/Page_Certification Configuration/a_Inbox - 602'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1) - 700'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1) - 700'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)- 701'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)- 701'))

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1_2 - 441'))

WebUI.click(findTestObject('EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1_2 - 441'))

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_Log Report/a_User Access Certification Details - 677'))

WebUI.click(findTestObject('EACM/POST EACM SURVEY/Page_Log Report/a_User Access Certification Details - 677'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_User Access Certification Details/select_Select any oneKTLN_EACM_Survey_Feb12_597753 - 0003'))

WebUI.selectOptionByLabel(findTestObject('EACM/POST EACM SURVEY/Page_User Access Certification Details/select_Select any oneKTLN_EACM_Survey_Feb12_597753 - 0003'), 
    'KTLN_EACM_Survey_Feb15_V3', true, FailureHandling.OPTIONAL)

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

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/span_1 -                    2 of           _cfbe65'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/span_1 -                    2 of           _cfbe65'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket No'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket No'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket Status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_User Access Certification Details/a_Ticket Status'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertificationConfiguration/Page_Certification Configuration/a_Inbox - 602'))

WebUI.click(findTestObject('EACM/EACM_CertificationConfiguration/Page_Certification Configuration/a_Inbox - 602'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.scrollToElement(findTestObject('EACM/EACM_CertificationConfiguration/Page_Home/a_Certification Configuration -601'), 
    0)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertificationConfiguration/Page_Home/a_Certification Configuration -601'))

WebUI.click(findTestObject('EACM/EACM_CertificationConfiguration/Page_Home/a_Certification Configuration -601'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertificationConfiguration/Page_Certification Configuration/label_No - EnforceJustification_Yes'))

WebUI.click(findTestObject('EACM/EACM_CertificationConfiguration/Page_Certification Configuration/label_No - EnforceJustification_Yes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_Update'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_Update'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertificationConfiguration/Page_Certification Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

