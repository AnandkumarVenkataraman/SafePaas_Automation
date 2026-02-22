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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

//Initiate a Multi-Env UAR
WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (52)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (26)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Access Certification_a-TreeView-label (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_Manage Certification_B167126276549450183'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/body_Inbox_t_PageBody'))

def dateFormat = new SimpleDateFormat('ddMMyyyy_HHmmss')

def currentDateTime = dateFormat.format(new Date())

def multiEnvUAR1 = 'MULTIEnv_UAR_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/input_(Value Required)_P10_NAME (1)'),
	multiEnvUAR1)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION (1)'),
	'This is a test Multi Env. UAR, initiated by QA Automation')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_(Value Required)_ui-datepicker-trigg_27f7b7'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/a_Sa_ui-state-default ui-state-hover'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/a_Sa_ui-state-default ui-state-hover'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Sa_ui-datepicker-close ui-state-defa_3b90c3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_(Value Required)_u-radio (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_Ticket Creation_u-radio (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/a_Ticket Creation_infot (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Close_js-confirmBtn ui-button ui-cor_5ef4b5 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Initiate User Access Certification_B_c29e18'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/input_Role Group_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/input_Role Group_f01_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Cancel_B284164618569469737'))

WebUI.delay(300)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/h2_Breadcrumb_t-Alert-title'),
	'Certification job was initiated successfullyEmail will be sent to appropriate Owner(s) (and Manager(s)), upon successful completion of the job. You can check the status of the job FSOD_INITIATE_UAC_21910 at Administration -> Platform -> Scheduler', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (22)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Platform_a-TreeView-label (3)'))

WebUI.delay(300)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (52)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (26)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification_a-TreeView-label (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/input_User Access_userAccessReport_search_field (4)'),
	multiEnvUAR1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_User Access_userAccessReport_search_button (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Environment Name_reportLink (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Access Certification_t-Breadcrumb-label (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , MULTIEN_81d6a6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (25)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (26)'))

WebUI.closeBrowser()
