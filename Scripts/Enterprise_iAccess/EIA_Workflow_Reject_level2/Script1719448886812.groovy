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

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'MOHIT.KUMAR')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_New_P101_PASSWORD'), 'p0vweySa4WuhozMDvWqb8g==')

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_Manage My Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Manage My Access/button_Request New Access'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Manage My Access/button_Request New Access'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Selection/select_RoleGroup_Other  Time and Labor Mana_3d5e08'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Selection/button_Next'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Selection/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/h2_Request Submitted. Please check after sometime'))

WebUI.delay(30)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Refresh'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Submit Access Request'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Violations/button_Submit Access Request'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Manage My Access/button_mohit.kumar'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Manage My Access/a_Logout'))

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'MC28967')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_New_P101_PASSWORD'), 'Ju8vHiRYWYTapQtHptL/Yg==')

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/button_Login'))

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/input_My Inbox_R163105974055422926_search_field'), 
    'Access Request WF Notification')

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_Go'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_Begin Date'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_A new access request for user Mohit.Kumar_20b055'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_A new access request for user Mohit.Kumar_20b055'))

WebUI.verifyElementText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Access Request/span_1-Manager'), 
    '1-Manager')

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Access Request/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Access Request/button_Submit'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Access Request/button_Submit'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_User Access Request Review Success_t_e28262'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_mc28967'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_Logout'))

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/button_Login'))

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/input_My Inbox_R163105974055422926_search_field'), 
    'Access Request WF Notification')

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_Go'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_Begin Date'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_A new access request for user Mohit.Kumar_20b055'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_A new access request for user Mohit.Kumar_20b055'))

WebUI.verifyElementText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Access Request/span_2-Primary Owner'), 
    '2-Primary Owner')

WebUI.click(findTestObject('EIA_Workflow_Approve/Page_Review Access Request/label_Reject'))

WebUI.setText(findTestObject('EIA_Workflow_Approve/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS'), 'Rejected level 2')

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Access Request/button_Submit'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Review Access Request/button_Submit'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_User Access Request Review Success_t_e28262'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_Logout'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/div_Spring 2024_t-Form-inputContainer col col-null'))

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'MOHIT.KUMAR')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/input_New_P101_PASSWORD'), 'p0vweySa4WuhozMDvWqb8g==')

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/span_Enterprise iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('EIA_Workflow_Approve/Page_Home/a_Manage My Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Request Status/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

