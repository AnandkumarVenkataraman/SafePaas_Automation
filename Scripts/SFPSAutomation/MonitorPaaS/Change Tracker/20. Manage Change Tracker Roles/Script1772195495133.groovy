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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (10)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (10)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (10)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (9)'))

//Verify Manage Change Tracker roles
WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Home/span_a-TreeView-toggle_1 (1)'))
WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Home/span_a-TreeView-toggle (2)'))
WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Home/a_Manage Change Tracker Roles (1)'))

WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Manage Change Tracker Roles/img_apex-edit-page (1)'))

WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Change Tracker CreateEdit Role/button_B344885550140643881 (1)'))

WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Manage Change Tracker Roles/img_apex-edit-page_1 (1)'))

WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Change Tracker CreateEdit Role/button_B344885550140643881 (1)'))
WebUI.delay(5)
WebUI.enhancedClick(findTestObject('Anand_SFPSAutomation/Page_Manage Change Tracker Roles/a_Inbox (1)'))
//ENd
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (35)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (43)'))
WebUI.closeBrowser()