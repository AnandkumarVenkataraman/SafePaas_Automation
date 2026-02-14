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

WebUI.navigateToUrl('https://prod.safepaas.com/monitor/f?p=1000:101::::::')
//WebUI.navigateToUrl('https://us01n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (16)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (66)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (66)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (25)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (77)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (59)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (17)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (42)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Violations by User Report'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn (3)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Search_a-PopupLOV-search apex-item-text (3)'), 
    'SODTST_19122025033544')//SODTST_12012026021047

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_SODTST_12012026021047'))
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_SODTST_12012026021047'))

WebUI.delay(5)
WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Total Violations'), 
    'Total Violations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_14'), '14')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_High Risk Violations'), 
    'High Risk Violations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_14_1'), '14')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Users With Violations'), 
    'Users With Violations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Most Common Violation'), 
    'Most Common Violation')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Asset Inquiry vs. General Ledger Rule2 (50)'), 
    'Asset Inquiry vs. General Ledger Rule2 (50%)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_Users With Violations'), 
    'Users With Violations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/div_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_PSTOCKMAN'), 
    'PSTOCKMAN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Preferences SSWAPREFERENCES'), 
    'Preferences SSWA[PREFERENCES]', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Responsibility  Preferences SSWA-Menu  P_f9b241'), 
    'Responsibility : Preferences SSWA->Menu : Preferences', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN (2)'), 
    'OPEN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN_1'), 'OPEN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_Preferences SSWAPREFERENCES_1'), 
    'Preferences SSWA[PREFERENCES]', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_High (1)'), 
    'High', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_SET (2)'), 
    'SET', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_1 -                   14 of           _0f7191'), 
    '1 - 14 of 14')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Violation Matrix by User (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)
WebUI.delay(5)
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any OneSODTST_12012026021047S_ccca7b'), 
//    1)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/select_Select any OneSODTST_12012026021047T_d7a34d'),
	1)

WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/select_Select any OneSODTST_12012026021047T_d7a34d'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/a_Intra Role Violation Details Report (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/button_Test Name_P98_TEST_NAME_lov_btn (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/input_Search_a-PopupLOV-search apex-item-text (2)'), 
    'SODTST_12012026021047')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/span_SODTST_12012026021047'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/a_Aggregate Violations by User (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneSODTST_12012026021047S_266c69'), 
    1, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/span_1 -                    6 of           _c2e951'), 
    '1 - 6 of 6', FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_SPAIN'), 
    'SPAIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_SET'), 
    'SET', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_Asset Inquiry vs. General Ledger Rule31'), 
    'Asset Inquiry vs. General Ledger Rule31', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_EBS_1'), 
    'EBS_1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_Responsibility'), 
    'Responsibility', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_Preferences SSWAPREFERENCES'), 
    'Preferences SSWA[PREFERENCES]', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_2'), '2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_EBS_2'), 
    'EBS_2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_Responsibility_1'), 
    'Responsibility', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/td_Assets Vision SpainASSETS_SP'), 
    'Assets Vision Spain[ASSETS_SP]', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/span_Rules Report_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/a_Security Snapshot Details'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Security Snapshot Details/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)

WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Security Snapshot Details/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Security Snapshot Details/a_Test Environment Status Summary'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Test Environment Status Summary/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Test Environment Status Summary/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Test Environment Status Summary/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katalon_admin (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (9)'))

WebUI.closeBrowser()

