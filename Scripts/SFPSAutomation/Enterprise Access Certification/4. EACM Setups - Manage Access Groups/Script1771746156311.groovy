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

//Verify Map Roles for an EBS Env.
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Access Groups/button_Map Roles (CSV)_B149605989596714417'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Cancel_B149607375770714431'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Actions_a-IRR-noDataMsg-text'),
	'No data found for the current selection', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Previous_B149608377236714441'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Actions_a-IRR-noDataMsg-text_1'),
	'No data found for the current selection', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/a_Setup_t-Breadcrumb-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'),
	'8028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'),
	'7408', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Access Groups/a_Manage Access Groups_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'),
	'9028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'),
	'5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'),
	'8028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'),
	'7408', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'),
	0)

//End verifying of Map Roles

WebUI.callTestCase(findTestCase, null)