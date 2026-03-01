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
import com.kms.katalon.core.util.KeywordUtil
try
{
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_IQA - Fall 2023_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle -U200'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle -U200'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle- U201'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle- U201'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/span_Detect Violation_U202'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/span_Detect Violation_U202'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/a_Manage Violation - U205'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/a_Manage Violation - U205'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'EBizApp_JDBC_Env', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    GlobalVariable.SOD_Test)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_PrivilegeRole'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_PrivilegeRole'), 
    '8442', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_Select any OneGlobalLocal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_Select any OneGlobalLocal'), 
    'G', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Filter'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.verifyElementText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/input_p_ignore_10'), 'Maintain Supplier Bank Accounts and Create Payables Invoices')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Apply'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Filter'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'), 
    'USER_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/input_p_ignore_10'), 'svcerpintgusr')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Apply'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/input_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/input_f01'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Submit'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Violation/button_Submit'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), GlobalVariable.Justification_Privilege_Global)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('deba10/ExceptionRole/Page_Home/a_Manage Exception - U206'), 0)

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/a_Manage Exception - U206'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/a_Manage Exception - U206'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Filter'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'JUSTIFICATION', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/input_Expression_p_ignore_10'), 
    GlobalVariable.Justification_Privilege_Global)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Apply'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Apply'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/span_a-Menu-statusCol'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/a_Logout'))

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_IQA - Fall 2023_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Login/button_Login - U300'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Inbox (3)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Inbox (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Inbox (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Begin Date (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Begin Date (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Last Day (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Last Day (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Actions (1)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Actions (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Filter (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/input_p_ignore_10 (1)'), '')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/input_p_ignore_10 (1)'), 'Create Requisitions and Create Payables')

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/button_Apply (1) - U301'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/button_Apply (1) - U301'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/a_Maintain GL configuration_U400'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/a_Maintain GL configuration_U400'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    'Testapprove')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/label_Approve'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_katalon_admin (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_katalon_admin (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Logout (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Logout (1)'))

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_IQA - Fall 2023_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Login/button_Login - U300'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle -U200'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle -U200'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle- U201'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle- U201'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/span_Detect Violation_U202'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/span_Detect Violation_U202'))

WebUI.verifyElementClickable(findTestObject('deba10/ExceptionRole/Page_Home/a_Manage Exception - U206'))

WebUI.enhancedClick(findTestObject('deba10/ExceptionRole/Page_Home/a_Manage Exception - U206'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'), 
    'KTLN_CloudERP', false, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Filter'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'JUSTIFICATION', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/input_Expression_p_ignore_10'), 
    GlobalVariable.Justification_Privilege_Global)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Apply'))

WebUI.enhancedClick(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/a_Approval Status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/a_Approval Status'))

WebUI.delay(3)
KeywordUtil.markPassed("Exceptions by Functions")
WebUI.closeBrowser()
}
catch(Exception e) {
	WebUI.comment("Exception is: " + e.getMessage())
	KeywordUtil.markPassed("Exceptions - Functions")
}