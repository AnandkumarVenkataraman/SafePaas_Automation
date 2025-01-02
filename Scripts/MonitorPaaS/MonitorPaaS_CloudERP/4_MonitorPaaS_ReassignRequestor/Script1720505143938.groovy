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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Login/input_Spring 2024_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.comment('Enter KAT company')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1) (1)'), 
    'KATALON_ADMIN')

WebUI.comment('Enter the Username as "MARIAB"')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Login/input_New_P101_PASSWORD (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Login/button_Login (1) (1) (1)'))

WebUI.comment('click on Login button')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1110:93:::NO::P93_TYPE,P93_USER,P93_SNAPSHOT,P93_RUN_ID,P93_CONTROL_ID:REQUESTOR,MARIAB,318996,43773,326006')

WebUI.comment('launch the Incident report URL for Reassign requestor')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-2'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-3'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-3'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-4'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-4'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-5'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-5'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-6'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-6'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-7'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-7'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-9'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-9'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-12'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-12'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-13'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-13'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-14'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-14'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-15'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/a_STP_FCPM_MAY08_V1_20240508093844-15'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_ui-button-icon ui-icon ui-icon- Incident Details- Close'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_CloudERP/Reassign Requestor/Page_Manage Approvals/input_Actions_selectUnselectAll - ReassignRequestor'))

WebUI.click(findTestObject('MonitorPaaS_CloudERP/Reassign Requestor/Page_Manage Approvals/input_Actions_selectUnselectAll - ReassignRequestor'))

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/input_Ticket Number_P93_TKT_NUMBER'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/input_Ticket Number_P93_TKT_NUMBER'), 
    GlobalVariable.ReassignRequestor_Ticketno)

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/textarea_Justification_P93_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/textarea_Justification_P93_JUSTIFICATION'), 
    GlobalVariable.ReassignRequestor_Justification)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/button_Submit'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/button_Submit'))

WebUI.delay(15)

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_Close_success message'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Reassign requestor/Page_Open Incidents Change Level/span_Close_success message'))

WebUI.closeBrowser()

