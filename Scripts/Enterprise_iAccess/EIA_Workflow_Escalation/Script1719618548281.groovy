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

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101')

WebUI.setText(findTestObject('Object Repository/EIA_Reassign/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA_Reassign/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA_Reassign/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Reassign/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Reassign/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Reassign/Page_Home/a_Manage My Access'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Home/a_Manage My Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/li_Mohit.Kumar'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/button_Request New Access'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/button_Request New Access'))

WebUI.selectOptionByIndex(findTestObject('EIA_Workflow_Approve/Page_Role Selection/select_RoleGroup_Other Time and Labor Mana_3d5e08'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Selection/button_Next'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Selection/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.delay(30)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Refresh'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Submit Access Request'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Submit Access Request'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Home/span_Global Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Home/a_Manage Workflow'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d'), 
    'Enterprise iAccess', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_16884e'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/i_NA_fa fa-wrench'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/i_NA_fa fa-wrench'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/select_- Please select any -CancelReassignEscalationReminder'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/select_- Please select any -CancelReassignEscalationReminder'), 
    'ESCALATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/select_- Please select any -MC28967KATALON__7019c2'))

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/select_- Please select any -MC28967KATALON__7019c2'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/select_- Please select any -MC28967KATALON__7019c2'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('EIA_Reassign/Page_Manage Workflow/select_- Please select any -MC28967KATALON__7019c2'), Keys.chord(
        Keys.TAB))

WebUI.setText(findTestObject('Escalation/Page_Manage Workflow/input_Manager Name_P35_MANAGER_NAME'), 'ANANDK')

WebUI.sendKeys(findTestObject('Escalation/Page_Manage Workflow/input_Manager Name_P35_MANAGER_NAME'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Escalation/Page_Manage Workflow/input_Manager Email_P35_MANAGER_EMAIL'), 'mariaisabel.brum@safepaas.com')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/EIA_Reassign/Page_Manage Workflow/button_Submit (1)'))

WebUI.verifyElementClickable(findTestObject('Escalation/Page_Manage Workflow/h2_Escalation sent successfully'))

WebUI.closeBrowser()

