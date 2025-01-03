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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Login/input_Spring 2024_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.comment('Enter KAT company')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1) (1)'), 
    'KATALON_ADMIN')

WebUI.comment('Enter the Username as "MCD.SAFEPAAS2"')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Login/input_New_P101_PASSWORD (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Login/button_Login (1) (1) (1)'))

WebUI.comment('click on Login button')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1110:94:::NO::P94_TYPE,P94_USER,P94_SNAPSHOT,P94_RUN_ID,P94_CONTROL_ID:APPROVER,100912,318996,43773,326006')

WebUI.comment('launch the Incident report URL for Owner')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/input_Detail_f01 - mcd Incident'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/input_Detail_f01 - mcd Incident'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/input_Detail_f02-MARIAB Incident'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/input_Detail_f02-MARIAB Incident'))

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/textarea_Comments_P94_COMMENTS'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/textarea_Comments_P94_COMMENTS'), 
    'Rejected by Approver')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/label_Reject'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/label_Reject'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/button_Submit'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/button_Submit'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/IncidentprocessedSuccessfully_Close'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/IncidentprocessedSuccessfully_Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/input_Actions_selectUnselectAll'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/input_Actions_selectUnselectAll'))

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/textarea_Comments_P94_COMMENTS'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/textarea_Comments_P94_COMMENTS'), 
    'Approved by Approver')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/label_Approve'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/button_Submit'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/button_Submit'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/IncidentprocessedSuccessfully_Close'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Approver_ApprovalProcess/IncidentsApproved/Page_Manage Approvals/IncidentprocessedSuccessfully_Close'))

WebUI.closeBrowser()

