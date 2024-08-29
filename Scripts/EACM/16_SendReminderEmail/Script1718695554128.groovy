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

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Login/input_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Login/button_Login'))

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
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/button_Create'))

WebUI.verifyElementText(findTestObject('NewEACM/Page_Initiate User Access/label_Risk level'), 'Risk level', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('NewEACM/Page_Initiate User Access/select_Select any oneHIGHMEDIUMLOW'))

WebUI.selectOptionByLabel(findTestObject('NewEACM/Page_Initiate User Access/select_Select any oneHIGHMEDIUMLOW'), 'HIGH', 
    false)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/input_P10_NAME'), '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/input_P10_NAME'), GlobalVariable.EACM_SendReminder_Survey)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/textarea_P10_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/textarea_P10_DESCRIPTION'), GlobalVariable.EACM_SendReminder_Survey)

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

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Create'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/h2_Certification job was initiated successf_889d6e'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/a_Manage User Access (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Home/a_Manage User Access (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/select_NameDescriptionEnd Date ActionStatus_dc9709'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/input_p_ignore_10'), 
    GlobalVariable.EACM_SendReminder_Survey)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/a_EACM_Feb19_v102'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage User Access/a_EACM_Feb19_v102'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/h2_Open'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/h2_Open'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_SendReminderEmail/Page_User Access Validation/input_f01 - katalon ADMIN'))

WebUI.click(findTestObject('EACM/EACM_SendReminderEmail/Page_User Access Validation/input_f01 - katalon ADMIN'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_SendReminderEmail/Page_User Access Validation/input_f01 - KTLN EACM User'))

WebUI.click(findTestObject('EACM/EACM_SendReminderEmail/Page_User Access Validation/input_f01 - KTLN EACM User'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/button_Send E-mail Reminder'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/button_Send E-mail Reminder'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/a_Manage Workflow'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_User Access Validation/a_Manage Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd (1)'), 
    'Enterprise Access Certification', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a (1)'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/span_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721 (1)'), 
    'INSTANCE_NAME', false)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/input_p_ignore_10 (1)'), 
    GlobalVariable.EACM_SendReminder_Survey)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/span_fa fa-search (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/span_fa fa-search (1)'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/h2_Manage Workflow - Level 2 - TestSurvey'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/h2_Manage Workflow - Level 2 - TestSurvey'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/a_Actions'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'), 
    'REMINDER', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select any -KATALON_ADMINKT_eeb9ba'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/select_- Please select any -KATALON_ADMINKT_eeb9ba'), 
    'KATALON_ADMIN', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_Submit'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/span_fa fa-search_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/span_fa fa-search_1'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/h2_Manage Workflow - Level 3 - TestSurvey'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_SendReminderEmail/Page_Manage Workflow/h2_Manage Workflow - Level 3 - TestSurvey'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

