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

WebUI.setText(findTestObject('Object Repository/EACM_Delegation/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM_Delegation/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM_Delegation/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM_Delegation/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_Delegation/Page_Home/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/EACM_Delegation/Page_Home/button_katalon_admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_Delegation/Page_Home/a_My Profile'))

WebUI.click(findTestObject('Object Repository/EACM_Delegation/Page_Home/a_My Profile'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/h2_Delegation Setting'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/h2_Delegation Setting'), 
    0)

WebUI.verifyElementClickable(findTestObject('EACM_Delegation/Page_User Preferences/buttonP4_DELEGATE_TO_lov_btn - 320'))

WebUI.click(findTestObject('EACM_Delegation/Page_User Preferences/buttonP4_DELEGATE_TO_lov_btn - 320'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/input_a-PopupLOV-search apex-item-text'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/input_a-PopupLOV-search apex-item-text'), 
    'DPATEL')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/span_DPATEL'))

WebUI.click(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/span_DPATEL'))

WebUI.verifyElementClickable(findTestObject('EACM_Delegation/Page_User Preferences/span_start Date_321'))

WebUI.click(findTestObject('EACM_Delegation/Page_User Preferences/span_start Date_321'))

WebUI.verifyElementClickable(findTestObject('EACM_Delegation/Page_User Preferences/a_Delegation Start Date'))

WebUI.click(findTestObject('EACM_Delegation/Page_User Preferences/a_Delegation Start Date'))

WebUI.verifyElementClickable(findTestObject('EACM_Delegation/Page_User Preferences/span_End Date_322'))

WebUI.click(findTestObject('EACM_Delegation/Page_User Preferences/span_End Date_322'))

WebUI.verifyElementClickable(findTestObject('EACM_Delegation/Page_User Preferences/a_Delegation end Date'))

WebUI.click(findTestObject('EACM_Delegation/Page_User Preferences/a_Delegation end Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/h2_Delegation successfully saved'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM_Delegation/Page_User Preferences/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Home/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Home/a_Manage Certification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/input_P10_NAME'), '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/input_P10_NAME'), GlobalVariable.EACM_Delegation)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/textarea_P10_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/textarea_P10_DESCRIPTION'), GlobalVariable.EACM_Delegation)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/a_10'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/a_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Initiate User Access/button_Close'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Initiate User Access/button_Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/label_Verified'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/label_Verified'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/label_Ticket Creation'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/label_Ticket Creation'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/h2_Certification job was initiated successf_889d6e'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.closeBrowser()

