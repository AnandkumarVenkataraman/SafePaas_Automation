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

WebUI.setText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Login/input_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/a_Manage Certification'))

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

WebUI.setText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/input_p_ignore_10'), GlobalVariable.EACM_SurveyName_TerminateAccess)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/a_POSTGET Process Status'), 
    0)

WebUI.comment('Verify the POST Survey status as POST/GET In Process. If Error displayed - Result in warning')

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/input_f01'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/input_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_POST'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_POST'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_OK'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_OK'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Go'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Go'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/a_POSTGET Process Status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/a_POSTGET Process Status'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_Manage Certification/a_Post In-Process - 0001'))

WebUI.click(findTestObject('EACM/POST EACM SURVEY/Page_Manage Certification/a_Post In-Process - 0001'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/a_Log id'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/a_Log id'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/a_Log id'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_a-Button a-IRR-button a-IRR-sortWidg_b32bbf'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_a-Button a-IRR-button a-IRR-sortWidg_b32bbf'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/select_ApplicationProgramRequestStepRecord _ff00c5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/select_ApplicationProgramRequestStepRecord _ff00c5'), 
    'LOG_LEVEL', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/input_p_ignore_10'), 'ERROR')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/span_a-Icon icon-irr-no-results'), 
    0, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Log Report/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_Log Report/a_User Access Certification Details - 0002'))

WebUI.click(findTestObject('EACM/POST EACM SURVEY/Page_Log Report/a_User Access Certification Details - 0002'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_User Access Certification Details/select_Select any oneKTLN_EACM_Survey_Feb12_597753 - 0003'))

WebUI.selectOptionByLabel(findTestObject('EACM/POST EACM SURVEY/Page_User Access Certification Details/select_Select any oneKTLN_EACM_Survey_Feb12_597753 - 0003'), 
    GlobalVariable.EACM_SurveyName_TerminateAccess, true, FailureHandling.OPTIONAL)

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

