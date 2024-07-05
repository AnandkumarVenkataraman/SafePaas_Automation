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

WebUI.setText(findTestObject('Object Repository/SODTest_Validation/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/SODTest_Validation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/SODTest_Validation/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Home/span_Define Scope_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Home/a_Manage SOD Test'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest_Validation/Page_Manage SOD Test/td_Closed'))

WebUI.verifyElementText(findTestObject('Object Repository/SODTest_Validation/Page_Manage SOD Test/td_Closed'), 'Closed')

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage SOD Test/a_Manage Violation'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/button_(Value Required)_P74_REQUEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/li_SODTest_CrossApp_Jul3_v1'))

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_1 -                   15 of           _25e8d3'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_Request Status_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_Company Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/a_Manage Companies'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/a_Code'))

WebUI.setText(findTestObject('Object Repository/SODTest_Validation/Page_Company/input_Search_R5581103320342092_sort_widget__d19570'), 
    'KAT')

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/a_KAT'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/img_Link_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/label_Disable'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/a_Logout'))

