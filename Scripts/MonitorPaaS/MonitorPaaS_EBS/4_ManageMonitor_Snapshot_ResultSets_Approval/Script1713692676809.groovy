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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_Spring 2024_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/span_Assign Roles_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/span_Assign Roles_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/a_Manage Monitors'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/a_Manage Monitors'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a (1)'), 
    'KTLNEBS_MonitorPaaS_ObjSet', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Manage Monitors/a_AR Approval Limits_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Manage Monitors/a_AR Approval Limits_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Monitor Details/span_Snapshots (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Monitor Details/span_Snapshots (1)'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/select_Select any One(SS)KTLN_ARLIMIT_APR19_526a61 (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/select_Select any One(SS)KTLN_ARLIMIT_APR19_526a61 (1)'), 
    '1')

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/span_ResultSets (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/span_ResultSets (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_ResultSets/select_Select any OneKTLN_ARAPRLMT_APR19_V1_ab8773'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_ResultSets/select_Select any OneKTLN_ARAPRLMT_APR19_V1_ab8773'), 
    '1')

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_ResultSets/a_Inbox'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_ResultSets/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_My Inbox (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_My Inbox (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Begin Date (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Begin Date (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Last Hour (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Last Hour (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'), 
    'MESSAGE_TYPE', true)

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/input_Expression_p_ignore_10 (1)'))

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/input_Expression_p_ignore_10 (1)'), 
    'Monitor Incident Approval')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'), 
    'NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Expression_R163105974055422926_expre_0be11a (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Expression_R163105974055422926_expre_0be11a (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_AR Approval Limits (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_AR Approval Limits (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_SafePaaS Incident - Approver (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_SafePaaS Incident - Approver (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/h2_Worklist'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/h2_Worklist'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/h2_Body'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/h2_Body'))

WebUI.delay(0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/a_Click here to see the results - URV02'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/a_Click here to see the results - URV02'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'), 
    'KTLNEBS_MonitorPaaS_ObjSet', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_AR Approval Limits'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_AR Approval Limits'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_- Select -KTLN_ARAPRLMT_APR19_V1_202_c0dd84'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_- Select -KTLN_ARAPRLMT_APR19_V1_202_c0dd84'), 
    '1')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104_1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_Inbox'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_My Inbox (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_My Inbox (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_SafePaaS Incident - Approver_1 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_SafePaaS Incident - Approver_1 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/textarea_Comments_P3_NORES_TEXTAREA_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/textarea_Comments_P3_NORES_TEXTAREA_1'), 
    'Test approve')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_katalon_admin (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_katalon_admin (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Logout (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Logout (1)'))

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_Spring 2024_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ju8vHiRYWYTapQtHptL/Yg==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Begin Date (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Begin Date (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Last Hour (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Last Hour (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'), 
    'MESSAGE_TYPE', true)

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/input_Expression_p_ignore_10 (1)'))

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/input_Expression_p_ignore_10 (1)'), 
    'Monitor Incident Approval')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'), 
    'NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Expression_R163105974055422926_expre_0be11a (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Expression_R163105974055422926_expre_0be11a (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_AR Approval Limits (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_AR Approval Limits (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_Apply (1) - URV1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_FYI- SafePaaS Incident - Reviewer (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_FYI- SafePaaS Incident - Reviewer (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/a_Click here to see the results'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/a_Click here to see the results'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/a_Click here to see the results'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a'), 
    'KTLNEBS_MonitorPaaS_ObjSet', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_AR Approval Limits'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_AR Approval Limits'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_- Select -KTLN_ARAPRLMT_APR19_V1_202_c0dd84'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/select_- Select -KTLN_ARAPRLMT_APR19_V1_202_c0dd84'), 
    '1')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_All (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Snapshot Report/button_15 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104_1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/button_Snapshot Report for Object AR Approv_d11104_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_Inbox_1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Resultset/a_Inbox_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_FYI- SafePaaS Incident - Reviewer (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_FYI- SafePaaS Incident - Reviewer (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/button_Close'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Reviewer/Page_Notification/button_Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Inbox'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_dpatel'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/button_dpatel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Logout'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Logout'))

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_Spring 2024_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_Manage Result Set_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/span_Manage Result Set_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Incident Status'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/snapshot/Page_Home/a_Incident Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/span_Consolidated Level'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/span_Consolidated Level'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/select_ObjectDescriptionIncidentIncident da_4f016e'))

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/input_Expression_p_ignore_10'), 
    'AR Approval Limits')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Object'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Description'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Incident'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Incident date'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Action date'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Action Comments'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Object Set'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS/MonitorPaaS_IncidentStatus/Page_Incident Report/a_Role'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

