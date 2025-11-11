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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (4)'), 'KAT')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (55)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (55)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (32)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (53)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (35)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Violation Report_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_User Entry Attribute Access Listing_a-Tre_258751'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Environment_P0_ENVIRONMENT'), 
    'SAP_S4HANA', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 
    4)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/input_Schedule_R253154824105414010_search_field'), 
    'V_KONG_VWE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/button_Schedule_R253154824105414010_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4'), 
    'SAP_CO_PA_BASICDATA_DISPLAY.KE43.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4_1'), 
    'SAP_CO_PA_BASICDATA_VALUATION.KE41.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4_2'), 
    'SAP_CO_PA_BASICDATA_VALUATION.KE42.V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Generate Condition UsageApplication Auth_0c8ca4_3'), 
    'AuthObj_V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/span_Yes_a-IRR-pagination-label'), 
    '1 - 4 of 4')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/button_concat(Row text contains , , V_KONG__ae3099'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))


//WebUI.closeBrowser()

