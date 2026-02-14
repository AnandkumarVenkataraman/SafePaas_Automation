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

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (20)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (20)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (19)'))

//Analytics
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (86)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (68)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (48)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Violations by User Report (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn (5)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/input_Close_a-PopupLOV-search apex-item-text'), 
    'SODTST06022026055543')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/span_SODTST06022026050800'))

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Violation Matrix by User (3)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    'EBizApp_JDBC_Env', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any OneSODTST06022026050800SO_4ccc69'), 
    1)

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Matrix by User/a_Intra Role Violation Details Report (4)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    'EBizApp_JDBC_Env', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/button_Test Name_P98_TEST_NAME_lov_btn (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/input_Search_a-PopupLOV-search apex-item-text (4)'), 
    'SODTST06022026055543')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/span_SODTST06022026050800'))

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details Report/a_Aggregate Violations by User (3)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    'EBizApp_JDBC_Env', false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneSODTST06022026050800SO_54c848'), 
    1)

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Aggregate Violation Report/a_Inbox (2)'))
WebUI.comment("Analytics - Application Test Env. Reports completed")

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/7. Analytics - Application Test Env. Reports'), 
    [:], FailureHandling.OPTIONAL)

