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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Home/a_Manage Monitors'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Home/a_Manage Monitors'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'), 
    'STP_ObjSet', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_Deploy'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_Deploy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor/Page_Move Process/input_Actions_f01'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor/Page_Move Process/input_Actions_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor/Page_Move Process/button_Deploy Objects'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor/Page_Move Process/button_Deploy Objects'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor/Page_Move Process/button_OK'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor/Page_Move Process/button_OK'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_Monitor Created Successfully_t-Butto_4161d3'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_Monitor Created Successfully_t-Butto_4161d3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/a_AR Approval Limits'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/a_AR Approval Limits'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Monitor Details/label_Change Level'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Monitor Details/label_Change Level'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Monitor Details/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Monitor Details/button_Apply Changes'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Monitor Details/span_People'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Monitor Details/span_People'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneANANDKANANDK1DPATELKAT_13590c'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneANANDKANANDK1DPATELKAT_13590c'), 
    'KATALON_ADMIN', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneApproverReviewer'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneApproverReviewer'), 
    'Approver', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Popup Calendar Start Date'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Popup Calendar Start Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/a_19'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/a_19'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Add Another'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Add Another'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneANANDKANANDK1DPATELKAT_13590c'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneANANDKANANDK1DPATELKAT_13590c'), 
    'DPATEL', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneApproverReviewer'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/select_Select any OneApproverReviewer'), 
    'Reviewer', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Popup Calendar Start Date'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Popup Calendar Start Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/a_19'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/a_19'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Add Another'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/button_Add Another'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/h2_Object Approvers'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/h2_Object Approvers'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/a_Manage Result Set'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Rule Approver/a_Manage Result Set'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'), 
    'STP_ObjSet', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/button_Schedule'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/button_Schedule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/a_Label_ChangeTracker_UR005'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/a_Label_ChangeTracker_UR005'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/select_-- Select any one ---- Local File --_fe0110'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/select_-- Select any one ---- Local File --_fe0110'), 
    'KTLNCloud_MonitorPaaS_DS', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/a_FundsCapturepaymentMethod_UR006'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/a_FundsCapturepaymentMethod_UR006'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/button_(Value Required)_P30_MULTI_OBJECT_ID_MOVE'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/button_(Value Required)_P30_MULTI_OBJECT_ID_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/label_Run Monitor_u-checkbox'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/label_Run Monitor_u-checkbox'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    GlobalVariable.MTP_CloudERP_SSName)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/span_Set Screen Reader Mode On_a-Icon icon-_34fbcb'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/span_Set Screen Reader Mode On_a-Icon icon-_34fbcb'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/span_Set Screen Reader Mode On_a-Icon icon-_34fbcb'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/button_Create'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Job Detail/button_Create'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/button_Snapshot successfully submitted_t-Bu_ba886c'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/button_Snapshot successfully submitted_t-Bu_ba886c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/span_Setup_a-TreeView-toggle - UR31'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/span_Setup_a-TreeView-toggle - UR31'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/a_Manage Snapshot - UR33'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_Deploy/Page_Manage Result Set/a_Manage Snapshot - UR33'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_302095'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_302095'), 
    'STP_ObjSet', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/label_Auto Refresh_u-checkbox'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/label_Auto Refresh_u-checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'), 
    'Name', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/input_Expression_p_ignore_10'), 
    GlobalVariable.MTP_CloudERP_SSName)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/button_Apply'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/button_Apply'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/a_Completed'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/a_Completed'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/a_Log id'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/a_Log id'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/a_Level'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/a_Level'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/span_Assign Roles_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/span_Assign Roles_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/a_Manage Snapshot'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Log Report/a_Manage Snapshot'))

WebUI.closeBrowser()

