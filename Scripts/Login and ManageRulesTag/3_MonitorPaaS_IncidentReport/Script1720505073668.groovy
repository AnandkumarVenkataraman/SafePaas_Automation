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

WebUI.comment('launch the IQA Url')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_Spring 2024_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.comment('Enter KAT company')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1) (1)'), 
    'MCD.SAFEPAAS2')

WebUI.comment('Enter the Username as "MCD.SAFEPAAS2"')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_New_P101_PASSWORD (1) (1) (1)'), 
    'bVf///RHAwMoarxGTgkRdw==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/button_Login (1) (1) (1)'))

WebUI.comment('click on Login button')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1110:93:::NO::P93_TYPE,P93_USER,P93_SNAPSHOT,P93_RUN_ID,P93_CONTROL_ID:REQUESTOR,mcd.safepaas2,313696,40217,321272')

WebUI.comment('launch the Incident report URL for Owner')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-1 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-1 (1)'))

WebUI.comment('Verify the Incident details for Incident1')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-8 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-8 (1)'))

WebUI.comment('Verify the Incident details for Incident2')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-10 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-10 (1)'))

WebUI.comment('Verify the Incident details for Incident3')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-11 (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-11 (1)'))

WebUI.comment('Verify the Incident details for Incident4')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_mcd.safepaas2'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_mcd.safepaas2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/a_Logout'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/a_Logout'))

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_Spring 2024_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.comment('Enter KAT company')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1) (1)'), 
    'ANANDK')

WebUI.comment('Enter the Username as ANANDK')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_New_P101_PASSWORD (1) (1) (1)'), 
    'ValhQjMPEplf6UMceguWnQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/button_Login (1) (1) (1)'))

WebUI.comment('click on Login button')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1110:94:::NO::P94_TYPE,P94_USER,P94_SNAPSHOT,P94_RUN_ID,P94_CONTROL_ID:APPROVER,66812882,313696,40217,321272')

WebUI.comment('launch the Incident report URL for Approver')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.comment('Verify the Incidents listed for McD.safepaas2 user are not listed in the Incident report of Approver')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_anandk'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/button_anandk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/a_Logout_1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Approver/Page_Manage Approvals/a_Logout_1'))

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_Spring 2024_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.comment('Enter KAT company')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1) (1)'), 
    'MCD.SAFEPAAS2')

WebUI.comment('Enter the Username as "MCD.SAFEPAAS2"')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/input_New_P101_PASSWORD (1) (1) (1)'), 
    'bVf///RHAwMoarxGTgkRdw==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Login/button_Login (1) (1) (1)'))

WebUI.comment('click on Login button')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1110:93:::NO::P93_TYPE,P93_USER,P93_SNAPSHOT,P93_RUN_ID,P93_CONTROL_ID:REQUESTOR,mcd.safepaas2,313696,40217,321272')

WebUI.comment('launch the Incident report URL for Owner')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/input_Actions_selectUnselectAll'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/input_Actions_selectUnselectAll'))

WebUI.comment('click on the header checkbox to select all the Incidents')

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/input_Ticket Number_P93_TKT_NUMBER'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/input_Ticket Number_P93_TKT_NUMBER'), 
    'Test Ticket # May9_V1')

WebUI.comment('provide the ticket number')

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/textarea_Justification_P93_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/textarea_Justification_P93_JUSTIFICATION'), 
    'Test Justification # May9_V1')

WebUI.comment('provide justification')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/button_Submit'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/IncidentReport_Owner/Page_Open Incidents Change Level/button_Submit'))

WebUI.comment('click on submit button')

WebUI.closeBrowser()

