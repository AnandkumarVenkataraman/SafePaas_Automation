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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S-837548997%3A1762540711611454&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ARESoU3H_B1i4GqllzN7d767DtBcnlDnF2jm5ouFnO9jl9NZynAE9fuvzstiLG1qK22r5JDRvk4M5w&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin#inbox')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Gmail/input_to continue to Gmail_identifierId'), 'alexis.majul@safepaas.com')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Gmail/span_Learn more about using Guest mode_VfPp_231d3e'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/input_Email_email'), 'alexis.majul@safepaas.com')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/button_Remember me_LoginActionButton__butto_299554'))

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/input_Password_password'), 
    'aGTE27ylaTbs56x6Pb3Inw==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/button_Password_LoginActionButton__button L_95e12d'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/input_Search mail_q'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/input_Search mail_q'), 
    'action')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/b'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/h2_Nov 3_hP'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_UAT  Action Required SOD Review Remind_c04b24/a'))

WebUI.switchToWindowTitle('Login')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'amajul')

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/input_Violation Level_f01'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/input_INTRA_f01'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/input_INTRA_f01_1'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/label_(Value Required)_u-radio'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE'), 
    'COMPMITIGATIONS', true)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION'), 
    'Test1')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/button_Review Actions_verifyAll'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/button_Review Actions_verifyAll'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/input_Violation Level_f01'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/input_INTRA_f01'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/label_Remediation_u-radio'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE_1'), 
    'TEST1451', true)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION_1'), 
    'Test2')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/button_Review Actions_verifyAll'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/input_Actions_selectUnselectAll'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE'), 
    'COMPMITIGATIONS', true)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION_2'), 
    'Test3')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/button_Review Actions_verifyAll'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/input_Actions_selectUnselectAll'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/label_Remediation_u-radio'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/select_(Value Required)_P10_EXCEPTION_TYPE_1'), 
    'SAP_MITIGATION1', true)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/textarea_(Value Required)_P10_JUSTIFICATION_3'), 
    'Test4')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/button_Review Actions_verifyAll'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Manage Violation/button_Verify Selection_submitClose'))

WebUI.delay(5)

WebUI.closeBrowser()

