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

WebUI.navigateToUrl('https://us21n.safepaas.com/')

WebUI.setText(findTestObject('Object Repository/Manage SOD Test1/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Manage SOD Test1/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage SOD Test1/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Login'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/a_Manage Rules'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test1/select_Select any oneCloudERPEBizApp_JDBC_E_570a3a'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/a_Approve Payables Invoices and Bank Accoun_40a7bc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Approve Payables Invoices and Bank Accou_5a239c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/a_Create Purchase Agreements vs. Manage Pay_34abea'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Create Purchase Agreements vs. Manage Pa_cc7e36'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/a_Maintain Supplier Bank Accounts and Creat_d96096'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Maintain Supplier Bank Accounts and Crea_0c1ead'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Approved'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/a_Employee All vs. Benefits Administrator_V_d9b196'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_MCD Employee All USAMCD_EMPLOYEE_ALL_CUS_dd43e0'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Approved'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/a_Setup General Ledger CoA vs. Approve Paya_cbccc5'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Setup General Ledger CoA vs. Approve Pay_412939'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Approved'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Create'))

WebUI.setText(findTestObject('Object Repository/Manage SOD Test1/input_Name_P35_REQUEST_NAME'), 'SOD_Nov17_V1')

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/input_Description_P35_REQUEST_DESCRIPTION'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/input_Name_P35_REQUEST_NAME'))

WebUI.setText(findTestObject('Object Repository/Manage SOD Test1/input_Description_P35_REQUEST_DESCRIPTION'), 'SOD_Nov17_V1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Manage SOD Test1/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'DT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Manage SOD Test1/select_ALL CERP RULESAll'), 'All', true)

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Create (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Running'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/td_Closed'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Manage SOD Test1/a_Manage Violation'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test1/select_Select any oneCloudERPEBizApp_JDBC_E_570a3a (1)'), 
    'KTLN_CloudERP', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test1/select_Select any OneSOD_Nov2_V2SOD_Nov2SOD_6e3ffd'), 
    'KTLN_CloudERP', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/h2_Manage Violation'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test1/li_1 -                   15 of             _9cbbae'), 
    0)

