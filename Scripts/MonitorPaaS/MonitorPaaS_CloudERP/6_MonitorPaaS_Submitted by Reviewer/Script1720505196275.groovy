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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Login/input_Spring 2024_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.comment('Enter KAT company')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1) (1) (1)'), 
    'DPATEL')

WebUI.comment('Enter the Username as ANANDK1')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Login/input_New_P101_PASSWORD (1) (1) (1)'), 
    'Ju8vHiRYWYTapQtHptL/Yg==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Login/button_Login (1) (1) (1)'))

WebUI.comment('click on Login button')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1110:94:::NO::P94_TYPE,P94_USER,P94_SNAPSHOT,P94_RUN_ID,P94_CONTROL_ID:REVIEWER,66812854,314325,40639,322570')

WebUI.comment('launch the Incident report URL for reviewer')

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Manage Approvals/textarea_Comments_P94_COMMENTS'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Manage Approvals/textarea_Comments_P94_COMMENTS'), 
    'Submitted by Reviewer')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Manage Approvals/input_Actions_selectUnselectAll'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Manage Approvals/input_Actions_selectUnselectAll'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Manage Approvals/button_Submit'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/MonitorPaaS_IncidentReport/Submitted by Reviewer/Page_Manage Approvals/button_Submit'))

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_IncidentReport/Approver_ApprovalProcess/Page_Manage Approvals/IncidentprocessedSuccessfully_Close'))

WebUI.click(findTestObject('MonitorPaaS_IncidentReport/Approver_ApprovalProcess/Page_Manage Approvals/IncidentprocessedSuccessfully_Close'))

WebUI.closeBrowser()

