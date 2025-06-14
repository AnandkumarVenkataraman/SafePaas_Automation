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

//SOD Test -> waiting for EAM-1448

//Manage Violations, and Analytics

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (4)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (4)'), 
    'katadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (4)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (4)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (3)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Violation'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    '5888', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_(Value Required)_P74_REQUEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/li_EBiz_SODTest_Dec9_v2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_Actions_f01'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Depreciation vs. Inventory Rule'), 
    'Depreciation vs. Inventory Rule')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Depreciation vs. Inventory Rule'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_HIGH'), 'HIGH')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_-'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_SET'), 'SET')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Responsibility'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Assets Sao Paulo (BR)FA_VISION_BRAZIL_SP'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Assets Sao Paulo (BR)'), 
    'Assets Sao Paulo (BR)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Function'), 'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Extended DepreciationFAEXDEPR'), 
    'Extended Depreciation[FAEXDEPR]')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Extended Depreciation'), 
    'Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Responsibility  Assets Sao Paulo (BR)-Me_2d19ba'), 
    'Responsibility : Assets Sao Paulo (BR)->Menu : FA_MAIN->Menu : FA_DEPRN->Function : Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_OPEN'), 'OPEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_EBiz_3'), 'EBiz_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_MOLIVEIRA'), 'MOLIVEIRA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_Marcelo Oliveira,'), 
    'Marcelo Oliveira,')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/td_-'), '-')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_Dashboard_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/a_Violations by User Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    '5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any OneSODTEST_MAY30_V1SODTes_4e93fc'), 
    '11177', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Depreciation vs. Inventory Rule'), 
    'Depreciation vs. Inventory Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Depreciation vs. Inventory Rule'), 
    'Depreciation vs. Inventory Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_High'), 'High')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_-'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_SET'), 'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_MOLIVEIRA'), 
    'MOLIVEIRA')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Marcelo Oliveira,'), 
    'Marcelo Oliveira,')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Responsibility'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Assets Sao Paulo (BR)FA_VISION_BRAZIL_SP'), 
    'Assets Sao Paulo (BR)[FA_VISION_BRAZIL_SP]')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Assets Sao Paulo (BR)'), 
    'Assets Sao Paulo (BR)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Extended DepreciationFAEXDEPR'), 
    'Extended Depreciation[FAEXDEPR]')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Responsibility  Assets Sao Paulo (BR)-Me_2d19ba'), 
    'Responsibility : Assets Sao Paulo (BR)->Menu : FA_MAIN->Menu : FA_DEPRN->Function : Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN'), 'OPEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_-'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_-'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_-'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN'), 'OPEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN'), 'OPEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_-'), '-')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Violation Matrix by User'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    '5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any OneSODTEST_MAY30_V1SODTes_4e93fc'), 
    '11177', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_AALLEN  Allen, Miss Arlene Nancy'), 
    'AALLEN : Allen, Miss Arlene Nancy')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_Depreciation vs. Inventory Rule'), 
    'Depreciation vs. Inventory Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_Responsibility'), 
    'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_Asset Tracking Super User'), 
    'Asset Tracking Super User')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_Function'), 
    'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_FAEXDEPR'), 
    'FAEXDEPR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_Extended Depreciation'), 
    'Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/td_1'), '1')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/a_Intra Role Violation Details Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    '5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneSODTEST_MAY30_V1SODTes_3acbf9'), 
    '11177', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_Depreciation vs. Inventory Rule'), 
    'Depreciation vs. Inventory Rule')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_High'), 
    'High')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_SET'), 
    'SET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_Application Developer'), 
    'Application Developer')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_FAEXDEPR'), 
    'FAEXDEPR')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_Extended Depreciation'), 
    'Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_EBiz_3'), 
    'EBiz_3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_Responsibility  Application Developer-Me_385f3b'), 
    'Responsibility : Application Developer->Menu : Navigator Menu - Application Developer GUI->Menu : AZN_MAIN->Menu : AZN_PR_ASSET->Menu : FA_MAIN->Menu : FA_DEPRN->Function : Extended Depreciation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_-'), 
    '-')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_OPEN'), 
    'OPEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_Open (1)'), 
    'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/td_63'), 
    '63')

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneSODTEST_MAY30_V1SODTes_3acbf9'), 
    'Select any one', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    'Select any one', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/a_Inbox'))

