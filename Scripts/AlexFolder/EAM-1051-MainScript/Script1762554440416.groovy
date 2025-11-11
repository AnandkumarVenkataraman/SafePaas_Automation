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

import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.Locale as Locale

// ===================== USER CONFIGURATION =====================

// SOD creator (part 1)
String creatorCompany   = 'kat'
String creatorUser      = 'katadmin'
String creatorPassEnc   = 'Ioqy8emDrxi5mkiNQATzxQ=='   // encrypted password of katadmin

// Rule owner / first approver (part 2)
String ownerGmailUser        = 'alexis.majul@safepaas.com'
String ownerJumpcloudUser    = ownerGmailUser
String ownerJumpcloudPassEnc = 'aGTE27ylaTbs56x6Pb3Inw=='  // encrypted JumpCloud password
String ownerSafepaasCompany  = 'kat'
String ownerSafepaasUser     = 'amajul'
String ownerSafepaasPassEnc  = 'Ioqy8emDrxi5mkiNQATzxQ=='  // encrypted password of owner

// CAC Admin / rule owner (part 3)
String cacGmailUser        = 'alexis.majul@safepaas.com'
String cacJumpcloudUser    = cacGmailUser
String cacJumpcloudPassEnc = 'aGTE27ylaTbs56x6Pb3Inw=='   // encrypted JumpCloud password
String cacSafepaasCompany  = 'kat'
String cacSafepaasUser     = 'KATADMIN'
String cacSafepaasPassEnc  = 'Ioqy8emDrxi5mkiNQATzxQ=='   // encrypted password of KATADMIN

// User for the final check (katadmin in this script)
String checkCompany   = 'kat'
String checkUser      = 'katadmin'
String checkPassEnc   = 'Ioqy8emDrxi5mkiNQATzxQ=='      // encrypted password of katadmin

// =============================================================

String uniqueName = 'TestQaKatAuto1_' + System.currentTimeMillis()

LocalDate today = LocalDate.now()
LocalDate nextYear = today.plusYears(1)
DateTimeFormatter formatter = DateTimeFormatter.ofPattern('d-MMM-yyyy', Locale.ENGLISH)
String startDate = today.format(formatter)
String endDate = nextYear.format(formatter)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/div_Message_t-Form-inputContainer col col-null'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY'), creatorCompany)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), creatorUser)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), creatorPassEnc)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Detect Violations_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Manage Corrective Action_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Manage SOD Review_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Actions/select_Environment_P0_ENVIRONMENT'),
	'8848', true)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Actions/button_Manage Review Actions_B85695331295565220'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/select_(Value Required)_P181_SOD_REQUEST_ID'),
	'15026', true)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/input_(Value Required)_P181_NAME'),
	uniqueName)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/div_(Value Required)_t-Form-labelContainer _65b657'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/textarea_Description_P181_DESCRIPTION'),
	uniqueName)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/input_(Value Required)_P181_START_DATE'),
	startDate)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/div_Breadcrumb_t-Body-contentInner'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/input_(Value Required)_P181_END_DATE'),
	endDate)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/a_Sa_ui-state-default ui-state-active ui-st_dbd7bb'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Initiate User Violation Survey/button_Initiate User Violation Survey_B8581_9ffd07'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Actions/a_Manage Review Actions_a-TreeView-label'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Status/a'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Status/button_Inbox_L29085486908535153'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Status/a_My Profile_menu_L29085486908535153_1i'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S-837548997%3A1762540711611454&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ARESoU3H_B1i4GqllzN7d767DtBcnlDnF2jm5ouFnO9jl9NZynAE9fuvzstiLG1qK22r5JDRvk4M5w&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin#inbox')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Gmail/input_to continue to Gmail_identifierId'), ownerGmailUser)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Gmail/span_Learn more about using Guest mode_VfPp_231d3e'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/input_Email_email'), ownerJumpcloudUser)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/button_Remember me_LoginActionButton__butto_299554'))

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/input_Password_password'),
	ownerJumpcloudPassEnc)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/button_Password_LoginActionButton__button L_95e12d'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/input_Search mail_q'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/input_Search mail_q'),
	'action')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/b'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/h2_Nov 3_hP'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_UAT  Action Required SOD Review Remind_c04b24/a'))

WebUI.switchToWindowTitle('Login')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY'), ownerSafepaasCompany)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), ownerSafepaasUser)

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), ownerSafepaasPassEnc)

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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S-837548997%3A1762540711611454&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ARESoU3H_B1i4GqllzN7d767DtBcnlDnF2jm5ouFnO9jl9NZynAE9fuvzstiLG1qK22r5JDRvk4M5w&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin#inbox')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Gmail/input_to continue to Gmail_identifierId'), cacGmailUser)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Gmail/span_Learn more about using Guest mode_VfPp_231d3e'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/input_Email_email'), cacJumpcloudUser)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/button_Remember me_LoginActionButton__butto_299554'))

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/input_Password_password'),
	cacJumpcloudPassEnc)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_JumpCloud User Portal - Login/button_Password_LoginActionButton__button L_95e12d'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/input_Search mail_q'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/input_Search mail_q'),
	'action')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/b'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Inbox (927) - alexis.majulsafepaas.com_3be2b1/h2_Nov 3_hP'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_UAT  Action Required SOD Review Remind_c04b24/a'))

WebUI.switchToWindowTitle('Login')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY'), cacSafepaasCompany)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), cacSafepaasUser)

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), cacSafepaasPassEnc)

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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY'), checkCompany)

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), checkUser)

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), checkPassEnc)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Detect Violations_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Manage Corrective Action_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Manage Review Actions_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Status/select_Environment_P0_ENVIRONMENT'),
	'8848', true)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Review Status/a'))

WebUI.delay(15)

WebUI.closeBrowser()
