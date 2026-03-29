import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))
//
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Certification_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/a_Manage Access Groups Category Mapping_a-T_716809'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT'), 'EBizApp_JDBC_Env',
	false, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Scope Access/input_Role Groups in Scope_R324291159469100_620fa9'),
	'Application Object Library')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/button_Role Groups in Scope_R32429115946910_511a2b'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Roles/span_Application Object Library_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/button_concat(Row text contains , , Applica_3bf12f'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT (1)'), 0)

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a_Scope Access_a-TreeView-label'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT'),
//	'9028', true)

//WebUI.callTestCase(findTestCase, null)
WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Access Groups/a_Inbox'))

WebUI.closeBrowser()