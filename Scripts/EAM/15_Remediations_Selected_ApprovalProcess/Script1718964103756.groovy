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

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

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

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'), 
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
    'Manage Payables Activities vs. Approve Payables Activities Rule')

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
    GlobalVariable.Justification_Selected)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/td_In Progress'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/td_In Progress'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Home/Inbox button - New'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Home/Inbox button - New'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/buttonR163105974055422926_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/buttonR163105974055422926_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/a_The Create Purchase Agreements vs. Manage_a09157'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/a_The Create Purchase Agreements vs. Manage_a09157'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/button_Apply'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Home/a_The Create Purchase Agreements vs. Manage_a09157_1 - Copy'))

WebUI.click(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Home/a_The Create Purchase Agreements vs. Manage_a09157_1 - Copy'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Notification/span_The Create Purchase Agreements vs. Man_94d3fd'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Home/a_Manage Corrective Action - New123'))

WebUI.click(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Home/a_Manage Corrective Action - New123'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'), 
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
    'Manage Payables Activities vs. Approve Payables Activities Rule')

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
    GlobalVariable.Justification_Selected)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/AllUsersViolation_ApprovalProcess/Page_Manage Corrective Action/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/span_1 -                    1'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Manage Corrective Action/span_1 -                    1'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

