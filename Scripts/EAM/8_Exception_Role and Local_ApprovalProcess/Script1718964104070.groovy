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

WebUI.comment('launch the url in IQA : https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.comment('Enter the company as kAT')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.comment('Enter username as KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter Password')

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/button_Login'))

WebUI.comment('Click on Login button')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Inbox'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Inbox'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Inbox'))

WebUI.comment('Click on Inbox button')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Actions'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/input_p_ignore_10'), 'Approve Payables Invoice vs. Asset Configuration Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_Apply'))

WebUI.comment('Filter with Subject contains "Approve Payables Invoice vs. Asset Configuration Rule"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_The Approve Payables Invoice vs. Asset Co_39abe9'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_The Approve Payables Invoice vs. Asset Co_39abe9'))

WebUI.comment('Click on the hyperlink of the Rule name')

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/div_The Approve Payables Invoice vs. Asset _34ff4f'))

WebUI.comment('Verify the text displayed on the page')

WebUI.mouseOver(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/div_The Approve Payables Invoice vs. Asset _34ff4f'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/textarea_P3_NORES_TEXTAREA_1'), 
    'Test approve')

WebUI.comment('provide the comment')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/label_Approve'))

WebUI.comment('Check the "Approve" checkbox')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Notification/button_Go'))

WebUI.comment('Click on GO button')

WebUI.verifyElementVisible(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/div_a-IRR-noDataMsg-icon'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/button_katalon_admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Logout'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Logout'))

WebUI.comment('LogOut as KATALON_ADMIN')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.comment('Enter the company as kAT')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.comment('Enter username as KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Login/button_Login'))

WebUI.comment('Click on Login button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle'))

WebUI.comment('Click on AccessPaaS navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle_1'))

WebUI.comment('Click on Enterprise Access Monitor navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.comment('Click on Detect Violation navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Manage Exception_1'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Home/a_Manage Exception_1'))

WebUI.comment('Click on Manage Exceptions from the Navigation menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.comment('Select the Environment as "KTLN_CloudERP"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'JUSTIFICATION', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/input_Expression_p_ignore_10'), 
    GlobalVariable.Justification_Role_Local)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/button_Apply'))

WebUI.comment('Filter with the Justification name provided earlier')

WebUI.scrollToElement(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/a_Approval Status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba10/ExceptionRole/Page_Manage Exception/a_Approval Status'))

WebUI.comment('Verify the status as "Approved"')

WebUI.delay(3)

WebUI.closeBrowser()

