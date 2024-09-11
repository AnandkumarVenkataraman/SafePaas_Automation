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

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_ScopedDescoped Attributes Report'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/select_- Select a Value - EBizApp_JDBC_EnvG_5ea19d'), 
    'KTLN_CloudERP', false)

WebUI.verifyElementText(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/h2_ScopedDescoped Attributes'), 
    'Scoped/Descoped Attributes')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/a_Attribute Type'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/a_Attribute'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/a_Scope Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/a_Descope Justification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/a_Created By'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/a_Created Date'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/span_1 -                   31'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/span_Access Certification_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_ScopedDescoped Attributes/a_Scope Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM_SecurityContext/Page_Scope Access/select_Select any oneEBizApp_JDBC_EnvGRM_CE_0c6409'), 
    'KTLN_CloudERP', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Scope Access/a_RoleGroup_GL'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Scope Access/a_RoleGroup_GL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Scope Roles/span_1 -                    4'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Scope Roles/span_Role Groups in Scope'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Scope Access/a_Manage Approval Assignments'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Scope Access/a_Manage Approval Assignments'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/h2_Role Groups in Scope - Current Status'), 
    'Role Groups in Scope - Current Status')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/a_Primary Owner'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/td_KATALON_ADMIN'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/a_Secondary Owner'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/td_MARIAB1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/span_Reviewers for Exceptions'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/span_Reviewers for Exceptions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/label_Primary Reviewer (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/input_(Value Required)_P14_PRIMARY_REVIEWER'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/label_Secondary Reviewer (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/input_(Value Required)_P14_PRIMARY_REVIEWER'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/span_Unassigned Accesses_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/span_Unassigned Accesses_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Approval Assignments/a_Manage Certification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Certification/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage Certification/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/input_(Value Required)_P10_NAME'))

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/input_(Value Required)_P10_NAME'), 
    GlobalVariable.EACM_SecurityContext)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Description'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'))

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 
    GlobalVariable.EACM_SecurityContext)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Status Code'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/span_Open'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Trigger (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Immediate'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Schedule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_End Date (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/a_12'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/button_Close'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/button_Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_End Date Action'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Verified'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Terminate Access'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/label_Terminate Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Initiate User Access/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/h2_Certification job was initiated successf_2f1ca2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/a_Inbox'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/h2_My Certifications'), 'My Certifications')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_KTLN_EACM_Survey_Sep11_V1'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_KTLN_EACM_Survey_Sep11_V1'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/span_Total 35'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Verify All'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Verify All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_OK'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/h2_All records verified'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))

WebUI.doubleClick(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/td_Verified'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'), 
    'Terminate Access', false)

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/td_Not VerifiedVerifiedTerminate Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'), 
    'Terminate Access', false)

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/td_Not VerifiedVerifiedTerminate Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'), 
    'Terminate Access', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/input_Justification for Mass Update_P4_JUST_30273f'))

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/input_Justification for Mass Update_P4_JUST_30273f'), 
    'TEST')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Save Changes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/h2_Changes saved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Confirm Changes'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Confirm Changes'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/h2_User Access Certification has been Completed'), 
    'User Access Certification has been Completed', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/a_My Certifications'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/a_My Certifications'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/button_OK'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/button_OK'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_Manage User Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/a_KTLN_EACM_Survey_Sep11_V1'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/a_KTLN_EACM_Survey_Sep11_V1'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Validation/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Validation/button_katalon_admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Validation/a_Logout'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Validation/a_Logout'))

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'MARIAB1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_KTLN_EACM_Survey_Sep11_V1_1'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_KTLN_EACM_Survey_Sep11_V1_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Confirm Changes'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification Survey/button_Confirm Changes'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/h2_User Access Certification has been Completed'), 
    'User Access Certification has been Completed', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/a_My Certifications'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/a_My Certifications'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/button_OK'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Certification has been closed/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/button_mariab1'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/button_mariab1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_Logout'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_Logout'))

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Home/a_Manage User Access_1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvGRM_CE_0c6409'), 
    'KTLN_CloudERP', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/a_KTLN_EACM_Survey_Sep11_V1_1'))

WebUI.click(findTestObject('Object Repository/EACM_SecurityContext/Page_Manage User Access/a_KTLN_EACM_Survey_Sep11_V1_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Validation/td_Completed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Validation/td_Completed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM_SecurityContext/Page_User Access Validation/td_Completed'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

