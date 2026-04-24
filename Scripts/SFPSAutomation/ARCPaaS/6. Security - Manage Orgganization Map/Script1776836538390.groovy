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
	'NICOPONCE')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (10)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (9)'))

//Org Hierarchy & Entity
WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_ARCPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Manage Backup_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/a_Manage Hierarchy'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Hierarchy/span_Manage Organization Entity'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Hierarchy/a_Inbox'))

//Financial Hierarchy & Entity
WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_ARCPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Manage Backup_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/a_Manage Financial Structure'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Hierarchy/span_Manage Organization Entity'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Hierarchy/a_Inbox'))

//Operational Hierarchy & Entity
WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_ARCPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Manage Backup_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/a_Manage Operational Structure'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Operational Structure/span_Manage Operational Entity'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Hierarchy/a_Inbox'))

//Locations
WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_ARCPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Manage Backup_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/a_Manage Locations'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Hierarchy/a_Inbox'))

//Roles
WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_ARCPaaS_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/span_Platform_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Home/a_Manage Roles'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Roles/a_Assign Roles'))

WebUI.enhancedClick(findTestObject('Object Repository/ARCPaaS/Page_Manage Hierarchy/a_Inbox'))
WebUI.closeBrowser()