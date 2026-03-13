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

//From Schedule Trackers tab, the only available option is - Change Tracker,
//which happens to be for CloudERP.
//So, this script is built only to verify the ability to launch the
//'Schedule Trackers' page and the ability to select the Datasource and Objectset

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (10)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (10)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (10)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Transaction Governor_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Trackers (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Trackers/span_Schedule Trackers'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CT Scheduler Tab/button_Create New Job'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/select_-- Select any one ---- Local File --'),
//	'0', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/select_Select any OneWD_DPS_objset559_Objec_fbc01a'),
	2)
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/label_Change Tracker'))
WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/select_-- Select any one ---- Local File --_cf7579'),
	5)
WebUI.delay(2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/select_DPS_PR_PO_SameUser V2'),
	'407', true)
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/button_(Value Required)_P110_MULTI_OBJECT_ID_MOVE'))
WebUI.delay(2)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/button_(Value Required)_P110_MULTI_OBJECT_I_94a9dd'))
WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/select_-- Select any one ---- Local File --_cf7579'),
	0)
WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/select_Select any OneWD_DPS_objset559_Objec_fbc01a'),
	0)
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Select Trackers/button_Cancel'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Inbox (4)'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (33)'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (41)'))

WebUI.closeBrowser()