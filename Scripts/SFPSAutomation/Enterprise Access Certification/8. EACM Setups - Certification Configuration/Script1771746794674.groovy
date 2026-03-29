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
//
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Certification_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Certification Configuration'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Certification Configuration/span_Company Level'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Certification Configuration/span_Additional Fields'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Certification Configuration/span_Environment Level'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Certification Configuration/select_Coupa_Env1EBiz_SFTPEBizApp_JDBC_EnvE_8ebdcc'), 
    '7881', true)
WebUI.acceptAlert(FailureHandling.OPTIONAL)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Certification Configuration/a_Inbox'))
WebUI.acceptAlert(FailureHandling.OPTIONAL)
WebUI.closeBrowser()

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'),
//	'7408', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'),
//	'9028', true)

//WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'),
//	0)

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Risk Levels/a_Assign EACM Roles_a-TreeView-label'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'),
//	'9028', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'),
//	'5888', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'),
//	'8028', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'),
////	'7408', true)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/span'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/span_1'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/span_2'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))