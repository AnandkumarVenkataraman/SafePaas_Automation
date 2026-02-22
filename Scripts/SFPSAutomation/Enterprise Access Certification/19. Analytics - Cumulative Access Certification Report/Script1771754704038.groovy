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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (89)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (24)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Cumulative Access Certification'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/body_Inbox                katadmin         _00d9b7'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_View Results_caCert_search_field (1)'), 
    'EBS_UAR_11102025_004741')
WebUI.delay(20)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_Last Updated By_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_View Results (1)'))
WebUI.back()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_Last Updated By_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_Remove Filter'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_View Results_caCert_search_field (1)'), 
    'MULTIENV_UAR_06112025_231029')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_Go (1)'))
WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_Last Updated By_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_View Results (1)'))
WebUI.back()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_Last Updated By_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_Remove Filter'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (15)'))

WebUI.closeBrowser()
