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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (10)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (10)'),
	'ANANDBABU1')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (10)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (9)'))

//Company Settings - Users
WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_ARCPaaS_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Administration_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/a_Manage Company'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Company/span_Users'))

WebUI.setText(findTestObject('Object Repository/ARCPaaS/Page_Create Users/input_Create_R23213727076438815_search_field'),
	'ANANDBABU1')

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Create Users/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/ARCPaaS/Page_Create Users/td_Entity 1,Entity 2'), 'Entity 1,Entity 2')

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Create Users/button_Remove Filter'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Create Users/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/button_anandbabu1'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/a_Logout'))

WebUI.closeBrowser()