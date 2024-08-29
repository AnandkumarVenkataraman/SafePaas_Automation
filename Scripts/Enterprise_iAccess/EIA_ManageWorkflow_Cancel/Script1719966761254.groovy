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

WebUI.setText(findTestObject('Object Repository/EIA_Cancel_WF/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA_Cancel_WF/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA_Cancel_WF/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/a_Manage My Access'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/a_Manage My Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

WebUI.click(findTestObject('EIA_Cancel_WF/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.click(findTestObject('EIA_Cancel_WF/Page_Manage My Access/li_Mohit.Kumar'))

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

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/a_In Approval Progress'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/span_Enterprise iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/a_Request Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Request Status/td_Approval Request Sent'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Request Status/td_Pending'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Request Status/td_Pending'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/span_Global Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel_WF/Page_Home/a_Manage Workflow'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d'), 
    'Enterprise iAccess', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_16884e'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/i_NA_fa fa-wrench'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/i_NA_fa fa-wrench'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('EIA_Cancel/Page_Manage Workflow/select_- Please select any -CancelReassignEscalationReminder'))

WebUI.selectOptionByValue(findTestObject('EIA_Cancel/Page_Manage Workflow/select_- Please select any -CancelReassignEscalationReminder'), 
    'CANCEL', true)

WebUI.setText(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/textarea_(Value Required)_P35_ACTION_COMMENTS'), 
    'Test comments for Cancel')

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/button_Submit'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/button_Submit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/button_Go'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/td_Canceled'), 'Canceled')

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/h2_The cancellation process has been initia_605824'))

WebUI.click(findTestObject('Object Repository/EIA_Cancel/Page_Manage Workflow/button_Breadcrumbs_t-Button t-Button--noUI _fee11d'))

WebUI.closeBrowser()

