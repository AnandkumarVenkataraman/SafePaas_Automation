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

WebUI.setText(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Home/a_Manage My Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/li_Mohit.Kumar'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/button_Go'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/button_Request New Access'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Selection/select_RoleGroup_Other  Project Administrat_5dbbc9'), 
    '1260894868', true)

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_REMOVE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Selection/select_RoleGroup_Other  Procurement Applica_268de0'), 
    '1274299267', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Selection/select_RoleGroup_Other  Procurement Applica_268de0'), 
    '1274299267', true)

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Selection/button_Next'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Provision and Deprovision/td_Mohit.Kumar - Jeffrey Sharpe'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Review Violations/button_Submit Access Request'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/a_Start date'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/td_AR Adjustment Profile'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/a_In Approval Progress'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/span_Enterprise iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Manage My Access/a_Request Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Request Status/td_Approval Request Sent'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Request Status/td_Pending'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_ManageWorkflow_Cancel/Page_Request Status/td_Pending'))

