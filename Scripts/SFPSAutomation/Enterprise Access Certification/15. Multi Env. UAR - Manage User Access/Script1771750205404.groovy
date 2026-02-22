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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))

//Verify the ability to send reminder emails
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (15)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification_a-TreeView-label'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1400:11:11290823382912:::11::')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/input_User Access_userAccessReport_search_field (1)'),
	'MULTIEnv_UAR_')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_User Access_userAccessReport_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Environment Name_reportLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/input_Send E-mail Reminder_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Open_B163976659956487332'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/h2_Breadcrumb_t-Alert-title'),
	'Email reminder has been sent')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Email reminder has been sent_t-Butto_8b503d (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/input_EBizApp_JDBC_Env_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Open_B163976659956487332'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/h2_Breadcrumb_t-Alert-title'),
	'Email reminder has been sent')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Email reminder has been sent_t-Butto_8b503d (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Access Certification_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , EBS_UAR_1afdf6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i'))

WebUI.closeBrowser()
WebUI.callTestCase(findTestCase, null)