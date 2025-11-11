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

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'katadmin')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

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
