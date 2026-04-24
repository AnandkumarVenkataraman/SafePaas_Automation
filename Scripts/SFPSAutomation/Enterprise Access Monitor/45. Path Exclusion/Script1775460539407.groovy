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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL //IQA or Prod. Profile should be selected during execution
    )

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (6)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (6)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (6)'))

//Verify the Path Exclusion in Filter False-Positives
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (97)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (72)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (54)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rules (9)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_98ef84'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Filter False - Positives (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/span_Path Exclusion'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Path Selection/input_Create_R239939282041124847_search_field'), 
    exclusionSource)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Path Selection/button_Go'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Path Selection/button_Remove Filter'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Path Selection/a_Manage Rules'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_98ef84'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox (5)'))

//Verify the Path Exclusion in Application Test Env. Reports for Filter False-Positives Definition report
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (86)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (68)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Rules Report_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Filter False Positive Reports'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False Positive Definition Report/select_Select any oneCoupa_Env1EBizApp_JDBC_98ef84'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False Positive Definition Report/span_Path Exclusion'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False Positive Definition Report/input_Path Exclusion_path_exc_tab_search_field'), 
    exclusionSource)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False Positive Definition Report/button_Go'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False Positive Definition Report/button_Remove Filter'), 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False Positive Definition Report/select_Select any oneCoupa_Env1EBizApp_JDBC_98ef84'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox (5)'))

//Manage Violations
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (85)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (67)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Define Scope_a-TreeView-toggle (16)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Violation (3)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_Request Name_P74_REQUEST_NAME_lov_btn (8)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_Close_a-PopupLOV-search apex-item-text'), 
    'SODTST')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_SODTST06022026044044'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_Rule NameRule DescriptionRisk LevelB_da9022'), 
    'VIOLATION_PATH_DESCRIPTION', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/input_Expression_search_expression'), 
    violationPath)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/span_No data found'), 
    'No data found.', FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.comment('Path Exclusion verified successfully')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/button_Remove Filter'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Violation/select_Select any oneCoupa_Env1EBizApp_JDBC_98ef84'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox (5)'))

//Violation by User report
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (86)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (68)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (48)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Violations by User Report (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn (5)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Close_a-PopupLOV-search apex-item-text'), 
    'SODTST')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_SODTST06022026050800'))

//
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_User NameRule NameRule TypeRisk Leve_78c9f2'), 
    'VIOLATION_PATH_DESCRIPTION', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Expression_uvrReport_expression'), 
    violationPath)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_No data found'), 
    'No data found.', FailureHandling.OPTIONAL)

WebUI.comment('Path Exclusion verified successfully')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Remove Filter'))

//ENd
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox (5)'))

WebUI.closeBrowser()