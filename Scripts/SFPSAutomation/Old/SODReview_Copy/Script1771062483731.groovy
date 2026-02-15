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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (18)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (38)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (38)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (16)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (34)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Detect Violations_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage Corrective Action_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage SOD Review_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Actions/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Review Actions/button_Manage Review Actions_B85695331295565220'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/select_(Value Required)_P181_SOD_REQUEST_ID'), 
    1)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/input_(Value Required)_P181_NAME'), 
    'SODREVIEW_OCT11_V2')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/textarea_Description_P181_DESCRIPTION'), 
    'SODREVIEW_OCT11_V2')

String currentDate = CustomKeywords.'Helper.getCurrentDate'()
WebUI.comment(currentDate)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/input_(Value Required)_P181_START_DATE'), 
    currentDate)

String currentDatePlusTwo = CustomKeywords.'Helper.getDateAfterTwoDays'()
WebUI.comment(currentDatePlusTwo)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/input_(Value Required)_P181_END_DATE'), 
    currentDatePlusTwo)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/div_Expected format DD-Mon-YYYY_row'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Violation Survey/button_Initiate User Violation Survey_B8581_9ffd07'))

//Gmail

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S-1104280776%3A1760166329418645&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AfYwgwWXb6ZgNV4Sp9267uVZZf8xlMHteUTxslGwdB7EKVBrz1RIXc7DUhTrSnIl-shl0TMB-179Wg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Gmail/input_to continue to Gmail_identifierId'),
	'anandkumar.venkataraman@safepaas.com')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Gmail/span_Learn more about using Guest mode_VfPp_231d3e'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_JumpCloud User Portal - Login/input_Email_email'),
	'anandkumar.venkataraman@safepaas.com')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_JumpCloud User Portal - Login/button_Remember me_LoginActionButton__butto_299554'))

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_JumpCloud User Portal - Login/input_Password_password'),
	'8BtmiwDllwTQMxhF4Z+zEXZcrwFL7h0R')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_JumpCloud User Portal - Login/button_Password_LoginActionButton__button L_95e12d'))

TestObject continueButton = new TestObject('dynamicContinueButton')
continueButton.addProperty('xpath', ConditionType.EQUALS, "//span[contains(text(), 'Continue')]")
WebUI.delay(5)
WebUI.enhancedClick(continueButton)

WebUI.delay(7)
WebUI.dismissAlert()
//TestObject continueButton2 = new TestObject('dynamicContinueButton2')
//continueButton2.addProperty('xpath', ConditionType.EQUALS, "//span[contains(text(), 'Use Chrome')]")
//WebUI.delay(5)
//WebUI.enhancedClick(continueButton2)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Inbox (533) - anandkumar.venkataramans_6702c8/input_Search mail_q'),
	'SOD Review Notification')

//span[contains(text(), 'Continue')]

WebUI.mouseOver(findTestObject('Object Repository/Anand_SFPSAutomation/Page_UAT  Action Required SOD Review Remind_cb29e5/a'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_UAT  Action Required SOD Review Remind_cb29e5/a'))

WebUI.switchToWindowTitle('Login')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (19)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (39)'),
	'ANANDK1')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (39)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (17)'))

//WebUI.closeBrowser()

//Ignore below


WebUI.closeBrowser()

//Ignore above