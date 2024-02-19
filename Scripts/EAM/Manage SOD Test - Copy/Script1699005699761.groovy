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

WebUI.setText(findTestObject('Object Repository/Manage SOD Test2/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Manage SOD Test2/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage SOD Test2/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Login'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/a_Manage Rules'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test2/select_Select any oneCloudERPEBizApp_JDBC_E_570a3a'), 
    'KTLN_CloudERP', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Enter Customer Receipts vs. Enter Account_b9987e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Enter Customer Receipts vs. Enter Accoun_44aac3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Manage Payables Activities vs. Approve Pa_6ecf19'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Manage Payables Activities vs. Approve P_0f7557'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Manage Payables Activities vs. IT User  R_9b6c5e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Manage Payables Activities vs. IT User  _91da94'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Receipt Accounting vs. Enter Accounts Rec_b0800f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Receipt Accounting vs. Enter Accounts Re_bac9e1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Receipt Accounting vs. Enter Customer Rec_e7a630'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Receipt Accounting vs. Enter Customer Re_1988d9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Approve Payables Invoices and Bank Accoun_40a7bc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approve Payables Invoices and Bank Accou_5a239c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Create Purchase Agreements vs. Manage Pay_34abea'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Create Purchase Agreements vs. Manage Pa_cc7e36'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Maintain Supplier Bank Accounts and Creat_d96096'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Maintain Supplier Bank Accounts and Crea_0c1ead'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Setup General Ledger Activities vs. Manag_c2e912'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Setup General Ledger Activities vs. Mana_d614a4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/a_Setup General Ledger CoA vs. Approve Paya_cbccc5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Setup General Ledger CoA vs. Approve Pay_412939'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Approved'), 0)

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/tr_SODTest_Nov3_V3SODTest_Nov3_V3SOD Detect_c6cd4b'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Create'))

WebUI.setText(findTestObject('Object Repository/Manage SOD Test2/input_Name_P35_REQUEST_NAME'), 'SODTest_Nov3_V4')

WebUI.setText(findTestObject('Object Repository/Manage SOD Test2/input_Description_P35_REQUEST_DESCRIPTION'), 'SODTest_Nov3_V4')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test2/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'SOD Detective', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test2/select_ALL CERP RULESAll'), 'All', true)

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/div_Description_t-Form-itemWrapper'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Create (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Running'), 0)

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/td_Closed'), 0)

WebUI.click(findTestObject('Object Repository/Manage SOD Test2/a_Manage Violation'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test2/select_Select any oneCloudERPEBizApp_JDBC_E_570a3a (1)'), 
    'KTLN_CloudERP', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage SOD Test2/select_Select any OneSODTest_Nov3_V4SODTest_f44020'), 
    'SODTest_Nov3_V4', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/h2_Manage Violation'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Manage SOD Test2/span_1 -                   15 of           _19d72e'), 
    0)

