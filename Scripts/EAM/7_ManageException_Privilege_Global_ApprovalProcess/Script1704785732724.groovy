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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.click(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.verifyElementText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    '')

WebUI.setText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    'KTLN_SODTest_Jan21_V1')

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_PrivilegeRole'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_PrivilegeRole'), 
    '8442', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Select any OneGlobalLocal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Select any OneGlobalLocal'), 
    'G', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Actions'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_p_ignore_10'), 
    'Asset Txns vs. IT User & Role Maintenance Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'), 
    'USER_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_p_ignore_10'), 
    'eb002894')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'), 
    'VIOLATION_ENTRY_NAME', true)

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_p_ignore_10'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_p_ignore_10'), 
    'ASE_CREATE_USER_ACCOUNT_PRIV')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Apply'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Apply'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/td_Asset Txns vs. IT User  Role Maintenance Rule'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/td_eb002894'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/td_Open'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_f01'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/input_f01'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Submit'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba1/Manage Exception_Privilege/Page_Manage Violation/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), 'Test123_Priivilege')

WebUI.scrollToElement(findTestObject('deba1/Page_Add Exception/span_1 -                   14 of           _0f7191'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Add Exception/span_1 -                   14 of           _0f7191'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Add Exception/td_Role  Fixed Asset Transaction Management_73f36a'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/h2_Action Processed (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/a_Manage Exception (1)'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_Privilege_Approval_Process/Page_Home/a_Manage Exception (1) - Copy'))

WebUI.click(findTestObject('deba1/ManageException_Privilege_Approval_Process/Page_Home/a_Manage Exception (1) - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any OnePrivilegeRole'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/div_t-Form-inputContainer col col-10'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any OnePrivilegeRole'), 
    '8442', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Go (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/span_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'RULE_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/a_Asset Txns vs. IT User  Role Maintenance Rule'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/a_Asset Txns vs. IT User  Role Maintenance Rule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'USER_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/input_p_ignore_10'), 
    'eb002894')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/span_1 - 1 _new'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/span_1 - 1 _new'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/a_Logout'))

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_COMPANY (2) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_USERNAME (2) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_PASSWORD (2) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/button_Login (2) (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/a_Inbox'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/a_Inbox'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/a_Inbox'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_Actions'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/input_p_ignore_10'), 'Asset Txns vs. IT User & Role Maintenance Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_Apply'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_Privilege_Approval_Process/Page_Home/a_The Asset Txns vs. IT User  Role Maintena_c0510a - Copy'))

WebUI.click(findTestObject('deba1/ManageException_Privilege_Approval_Process/Page_Home/a_The Asset Txns vs. IT User  Role Maintena_c0510a - Copy'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/div_The Asset Txns vs. IT User  Role Mainte_1c3da9'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    'Testapprove')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/button_katalon_admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/a_Logout'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Home/a_Logout'))

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_COMPANY (2) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_USERNAME (2) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/input_P101_PASSWORD (2) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Login/button_Login (2) (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/div_AccessPaaS (2)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/span_a-TreeView-toggle (2) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/span_a-TreeView-toggle (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/span_a-TreeView-toggle_1 (2) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/span_a-TreeView-toggle_1 (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/span_a-TreeView-toggle_1_2 (2) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Home/span_a-TreeView-toggle_1_2 (2) (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageException_Privilege_Approval_Process/Page_Home/a_Manage Exception (1) - Copy - Copy'))

WebUI.click(findTestObject('deba1/ManageException_Privilege_Approval_Process/Page_Home/a_Manage Exception (1) - Copy - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any OnePrivilegeRole'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_Select any OnePrivilegeRole'), 
    '8442', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'RULE_NAME', true)

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/a_Asset Txns vs. IT User  Role Maintenance Rule'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/a_User Name'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/a_eb002894'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_Privilege_Approval_Process/Page_Manage Exception/td_Approved'))

WebUI.closeBrowser()

