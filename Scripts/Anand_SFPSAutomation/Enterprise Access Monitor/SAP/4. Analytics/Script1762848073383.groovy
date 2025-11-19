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
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (9)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (60)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (60)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (37)'))

//Violations by User report
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (65)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (47)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (34)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Review Actions Details_a-TreeView-label (4)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Environment_P86_ENVIRONMENT (4)'), 
    'SAP_S4HANA', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn'))

//Setting the variable from the previous test-case
//String sapSODTST2 = GlobalVariable.sapSODTEST
// Reading from JSON
//def jsonContent = new JsonSlurper().parse(jsonFile)
//def sapSODTST1FromJson = jsonContent.sapSODTST

String valueSAPSODTEST

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Search_a-PopupLOV-search apex-item-text'), 
    'SAPSOD_18112025025412')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_Select List 1 rows. Use arrow keys_pop_e9b563'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Total Violations_value (2)'), 
    '78')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_High Risk Violations_value'), 
    '34')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Users With Violations_value'), 
    '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Most Common Violation_value'), 
    'Z_AccessChecks_Rule#1 (38%)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_-_a-IRR-pagination-label'), 
    '1 - 50 of 78')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_-_a-Button a-IRR-button a-IRR-button_2a520c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_-_a-Button a-IRR-button a-IRR-button_2a520c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Schedule_uvrReport_column_search_root'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Schedule_uvrReport_search_field (1)'), 
    'Z_AccessChecks_Rule#1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Schedule_uvrReport_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_-_a-IRR-pagination-label_1'), 
    '1 - 30 of 30')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_concat(Row text contains , , Rule1, _779f58'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Schedule_uvrReport_search_field (1)'), 
    'Z_AccessChecks_OR_Rule#2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Schedule_uvrReport_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_-_a-IRR-pagination-label_2'), 
    '1 - 23 of 23')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_concat(Row text contains , , Rule1, _779f58'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Schedule_uvrReport_search_field (1)'), 
    'Z_AccessChecks_OR_Rule#3')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Schedule_uvrReport_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_-_a-IRR-pagination-label_3'), 
    '1 - 11 of 11')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_concat(Row text contains , , Rule1, _779f58'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Schedule_uvrReport_search_field (1)'), 
    'Z_AccessChecks_OR_Rule#4')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Schedule_uvrReport_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_-_a-IRR-pagination-label_4'), 
    '1 - 14 of 14')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_concat(Row text contains , , Rule1, _779f58'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Environment_P86_ENVIRONMENT (4)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (4)'))

//Violations Matrix by User report

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (66)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (48)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (13)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (35)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Violations by User Report_a-TreeView-label'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Environment_P73_ENVIRONMENT'),
	'SAP_S4HANA', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Test Name_P73_TEST_NAME'),
	1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/button_V_KONG_VWE_a-Button a-IRR-button a-I_e82d2c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/button_ACTVT.02_a-Button a-IRR-button a-IRR_58eac0'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/button_V_KONG_VWE_a-Button a-IRR-button a-I_e82d2c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/button_V_KONG_VWE_a-Button a-IRR-button a-I_e82d2c'))

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Test Name_P73_TEST_NAME'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Environment_P73_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Intra Role Violations Details report

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (67)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (49)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (36)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Violation Matrix by User_a-TreeView-label'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Environment_P98_ENVIRONMENT'),
	'SAP_S4HANA', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/button_Test Name_P98_TEST_NAME_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/input_Search_a-PopupLOV-search apex-item-text'),
	'SAPSOD_18112025025412')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/span_Select List 1 rows. Use arrow keys_pop_e9b563'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/span_Open_a-IRR-pagination-label'),
	'1 - 12 of 12')

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Environment_P98_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Aggregate Violations Details report

WebUI.closeBrowser()

