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

WebUI.setText(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/a_Manage Role Groups'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Home/a_Manage Role Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Reassign Roles_Different RoleGroups/Page_Manage Role Groups/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/Reassign Roles_Different RoleGroups/Page_Manage Role Groups/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Reassign Roles_Different RoleGroups/Page_Manage Role Groups/a_Scope Roles'))

WebUI.click(findTestObject('Object Repository/deba4/Reassign Roles_Different RoleGroups/Page_Manage Role Groups/a_Scope Roles'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Reassign Roles_Different RoleGroups/Page_Manage Role Groups/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/Reassign Roles_Different RoleGroups/Page_Manage Role Groups/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/select_Role Group nameDescriptionCreated by_906520'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/buttonR324291159469100091_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/buttonR324291159469100091_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_Test_RoleGroup1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_Test_RoleGroup1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_Test_RoleGroup1_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_Test_RoleGroup1_1'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    'ORA_')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_All (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_All (1)'))

WebUI.verifyElementClickable(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.click(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- Please select any -ERP ITHCM MarketOut of boxOut of ScopeSurvey ExceptionsTest_RoleGroup2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- Please select any -ERP ITHCM MarketOut of boxOut of ScopeSurvey ExceptionsTest_RoleGroup2'), 
    'ERP IT', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - ORA Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - ORA Cancel'))

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    'MCD_')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_All (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_All (1)'))

WebUI.verifyElementClickable(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.click(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.verifyElementClickable(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- MCD Role Group - U101'))

WebUI.selectOptionByLabel(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- MCD Role Group - U101'), 
    'HCM Market', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - ORA Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - ORA Cancel'))

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    'MCD')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.verifyElementClickable(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.click(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.verifyElementClickable(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- MCD Role Group - U102'))

WebUI.selectOptionByLabel(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- MCD Role Group - U102'), 
    'Out of box', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - ORA Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - ORA Cancel'))

WebUI.verifyElementClickable(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.click(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All - U100'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK - 625'))

WebUI.verifyElementClickable(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- MCD Role Group - U103'))

WebUI.selectOptionByLabel(findTestObject('deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- MCD Role Group - U103'), 
    'Out of Scope', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/span_Role Groups in Scope'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/span_Role Groups in Scope'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/select_Role Group nameDescriptionCreated by_906520'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/buttonR324291159469100091_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/buttonR324291159469100091_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_HCM Market'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_HCM Market'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Apply - 1010'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Apply - 1010'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_HCM Market_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/a_HCM Market_1'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/inputscopeRoles_search_field'), 
    'MCD_IT')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/select_- Select -NoYes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/select_- Select -NoYes'), 
    'N', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/textarea_P20_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/textarea_P20_JUSTIFICATION'), 
    'Test Justification for Scope as No')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD2'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD3'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD4'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD5'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_MCD5'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_HCM_Submit - U110'))

WebUI.click(findTestObject('deba4/EACM_RoleGroup_HCM Market/Page_Scope Roles/button_HCM_Submit - U110'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - 501'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Home/a_Manage Approval Assignments - 1020'), 
    0)

WebUI.verifyElementClickable(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Home/a_Manage Approval Assignments - 1020'))

WebUI.click(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Home/a_Manage Approval Assignments - 1020'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_6ea309'))

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/input_p_ignore_10'), 
    'HCM Market')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_6ea309'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_6ea309'), 
    'Role', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/input_p_ignore_10'), 
    'MCD_IT')

WebUI.verifyElementClickable(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply - 1021'))

WebUI.click(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply - 1021'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf - 1023'))

WebUI.click(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf - 1023'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf - 1024'))

WebUI.click(findTestObject('deba4/EACM_ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf - 1024'))

WebUI.closeBrowser()

