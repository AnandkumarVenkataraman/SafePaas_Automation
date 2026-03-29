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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))
//Verify in Scheduler
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Company Settings_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Platform_a-TreeView-label (1)'))

WebUI.delay(20)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Job Time_P29_JOB_TIME'),
	0)

WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/input_Job Time_SCHEDULER_search_field (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Scheduler/input_Job Time_SCHEDULER_search_field (1)'), 'FSOD_INITIATE_UAC',
	FailureHandling.OPTIONAL)

WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/button_Job Time_SCHEDULER_search_button (1)'),
	FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Scheduler/td_-_u-tL'), 'SUCCEEDED',
	FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/button_concat(Row text contains , , 21670, _9215fa'),
	FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'),
	FailureHandling.OPTIONAL)

WebUI.closeBrowser()