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

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101')

WebUI.setText(findTestObject('Object Repository/PostCancel/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/PostCancel/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/PostCancel/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Home/span_Global Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Home/a_Manage Workflow'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/PostCancel/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d'), 
    'Enterprise iAccess', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/PostCancel/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_16884e'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage Workflow/div_Manage Workflow'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage Workflow/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage Workflow/span_Certification Configuration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage Workflow/a_Manage My Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA_Cancel_WF/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage My Access/li_Mohit.Kumar'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage My Access/button_Go'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage My Access/a_Start date'))

WebUI.sendKeys(findTestObject('Object Repository/PostCancel/Page_Manage My Access/button_Documentation_a-Button a-IRR-button _ce8d41'), 
    Keys.chord(Keys.TAB))

WebUI.verifyElementClickable(findTestObject('Object Repository/PostCancel/Page_Manage My Access/a_Canceled'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage My Access/span_Enterprise iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/PostCancel/Page_Manage My Access/a_Request Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/PostCancel/Page_Request Status/td_Canceled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/PostCancel/Page_Request Status/td_Canceled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/PostCancel/Page_Request Status/td_Canceled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/PostCancel/Page_Request Status/td_Request Canceled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/PostCancel/Page_Request Status/td_Request Canceled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/PostCancel/Page_Request Status/td_Request Canceled'))

