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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Debabrata/Page_Login/input_New_P101_PASSWORD'), 'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/div_AccessPaaS'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Enterprise Access Monitor'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/div_Enterprise Access Monitor'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_iAccess_a-TreeView-toggle'), 0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/div_Setup'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Roles Manager_a-TreeView-toggle'), 
    0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Roles Manager_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Activity'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Activity'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Activity'))

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Page_Activity/input_Activity Report_R242004504603843036_s_342084'), 
    '')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Activity/input_Activity Report_R242004504603843036_s_342084'), 
    'Activity_4')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Activity/button_Go'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Activity/span_Roles Report_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Activity/span_Rules Summary By Exceptions_a-TreeView-toggle'), 
    0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Activity/span_Rules Summary By Exceptions_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Activity/a_Manage Rules'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Activity/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Activity/a_Manage Rules'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    '5409', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'), 
    0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Manage SOD Test'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Manage Violation'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Manage Violation'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Violation/a_Manage SOD Test'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/a_SOD_Nov17_V1'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/a_SOD_Nov17_V1'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/button_katalon_admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/a_Logout'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/a_Logout'))

WebUI.closeBrowser()

