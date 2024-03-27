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

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Login/input_P101_USERNAME (1)'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Login/input_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Manage Corrective Action - 925'))

WebUI.click(findTestObject('deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Manage Corrective Action - 925'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'), 
    'RULE_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    'Create Payments vs. Enter Customer Receipts Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    'Mar22_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_ktln_eam_user1'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_ktln_eam_user1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/a_Logout'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/a_Logout'))

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_COMPANY (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_USERNAME (1) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_PASSWORD (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Inbox_1'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Inbox_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/input_p_ignore_10'), 'Create Payments vs. Enter Customer Receipts Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_The Create Payments vs. Enter Customer Re_711b41'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_The Create Payments vs. Enter Customer Re_711b41'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_katalon_admin - 561'))

WebUI.click(findTestObject('deba3/AllUsersViolation_ApprovalProcess/Page_Home/button_katalon_admin - 561'))

WebUI.verifyElementClickable(findTestObject('deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Logout - 562'))

WebUI.click(findTestObject('deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Logout - 562'))

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_COMPANY (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_USERNAME (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/input_P101_PASSWORD (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Manage Corrective Action_1'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Home/a_Manage Corrective Action_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'), 
    'RULE_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    'Create Payments vs. Enter Customer Receipts Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_EditRule nameAction DetailsJustifica_bf03d8'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/input_p_ignore_10'), 
    'Mar22_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/span_1 -                    1'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/span_1 -                    1'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.closeBrowser()

