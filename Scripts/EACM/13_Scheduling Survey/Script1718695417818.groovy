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

WebUI.setText(findTestObject('Object Repository/EACMSurveydate/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACMSurveydate/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACMSurveydate/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Home/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Home/a_Manage Certification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__1f716d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACMSurveydate/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__1f716d'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Manage Certification/button_Create'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Manage Certification/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/input_P10_NAME'), '')

WebUI.setText(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/input_P10_NAME'), 'KTLN_EACM_Survey_June05_V6')

WebUI.verifyElementText(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/textarea_P10_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/textarea_P10_DESCRIPTION'), 'KTLN_EACM_Survey_June05_V6')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/label_Schedule'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/label_Schedule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Popup Calendar Start Date'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Popup Calendar Start Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/a_4'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/a_4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/select_010203040506070809101112'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/select_010203040506070809101112'), 
    '01', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Close'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/a_18'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/a_18'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Close'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/label_Verified'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/label_Verified'))

WebUI.scrollToElement(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/label_Ticket Creation'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/label_Ticket Creation'))

WebUI.scrollToElement(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Create'))

WebUI.delay(500)

WebUI.click(findTestObject('Object Repository/EACMSurveydate/Page_Initiate User Access/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/select_NameDescriptionEnd Date ActionStatus_dc9709'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/input_p_ignore_10'), 
    'KTLN_EACM_Survey_June03_V2')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_Apply'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/a_Test99'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/a_Test99'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_User Access Validation/button_Cancel Schedule'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_User Access Validation/button_Cancel Schedule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_User Access Validation/button_OK'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_User Access Validation/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

