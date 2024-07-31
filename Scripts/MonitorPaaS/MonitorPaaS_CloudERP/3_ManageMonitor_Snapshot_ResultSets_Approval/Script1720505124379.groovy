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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Login/input_Spring 2024_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Login/input_New_P101_PASSWORD (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Login/button_Login (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/span_Assign Roles_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/span_Assign Roles_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/a_Manage Monitors'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/ManageMonitor_Snapshot/Page_Manage Snapshot/a_Manage Monitors'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_ff6b0a (1)'), 
    'STP_ObjSet', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Manage Monitors/a_STP-Funds Capture Payment Method'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Manage Monitors/a_STP-Funds Capture Payment Method'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Monitor Details/span_Snapshots (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Monitor Details/span_Snapshots (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Snapshot Report/select_Select any One(CT)STP_FCPM_APR22_R1__b628ab'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Snapshot Report/select_Select any One(CT)STP_FCPM_APR22_R1__b628ab'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Snapshot Report/span_ResultSets (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/2_ManageMonitor_Snapshot/Page_Snapshot Report/span_ResultSets (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_ResultSets/select_Select any OneKTLN_ARAPRLMT_APR19_V1_ab8773'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MonitorPaaS/Rough/Page_ResultSets/select_Select any OneKTLN_ARAPRLMT_APR19_V1_ab8773'), 
    '1')

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1110:94:::NO::P94_TYPE,P94_USER,P94_SNAPSHOT,P94_RUN_ID,P94_CONTROL_ID:APPROVER,100912,315006,41015,323713')

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.comment('Verify Incident details for Incident 1')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV02'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV02'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV03'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV03'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV04'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV04'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV05'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV05'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV06'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV06'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV07'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV07'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV08'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV08'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV09'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV09'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV10'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV10'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV11'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/img_Detail_apex-edit-view - UV11'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_ui-button-icon ui-icon ui-icon- UR800'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/select_ObjectActionUpdated ByTicket NumberJ_ed8988'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/select_ObjectActionUpdated ByTicket NumberJ_ed8988'), 
    'TKT_NUMBER', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Expression_mngMonitos_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Expression_mngMonitos_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/a_Not Defined'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/a_Not Defined'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Apply'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/input_Actions_selectUnselectAll'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/input_Actions_selectUnselectAll'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Reassign Requestor'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_Reassign Requestor'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/button_Requestor_P92_REQUESTOR_lov_btn - UV22'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/button_Requestor_P92_REQUESTOR_lov_btn - UV22'))

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/textarea_Comments_RequestorSearch_UV23'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/textarea_Comments_RequestorSearch_UV23'), 
    'MARIAB')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/button_Search_UV25'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/button_Search_UV25'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/td_ANANDK - UV20'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/td_ANANDK - UV20'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/td_ANANDK - UV20'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/textarea_Comments_P92_COMMENTS'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/textarea_Comments_P92_COMMENTS'), 
    GlobalVariable.ReassignRequestor_Comment)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/button_Submit'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Reassign tkts/button_Submit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_Reassignment_UV900'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/span_Close_Reassignment_UV900'))

WebUI.closeBrowser()

