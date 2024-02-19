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

WebUI.setText(findTestObject('Object Repository/EAM-Manage Rules/input_IQA - Summer 2023_P101_COMPANY'), 'kat')

WebUI.setText(findTestObject('Object Repository/EAM-Manage Rules/input_OR CONTINUE WITH_P101_USERNAME'), 'ktln_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EAM-Manage Rules/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/button_Login'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/a_Manage Rules'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EAM-Manage Rules/select_Select any oneCloudERPEBizApp_JDBC_E_282d45'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/EAM-Manage Rules/input_Export Rules_R247793226539899118_sear_985672'), 'Approve Payables Invoices and Bank Account Reconciliation')

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/button_Go'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/a_Approve Payables Invoices and Bank Accoun_40a7bc'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Approve Payables Invoices and Bank Acc_005a17'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Approve Payables Invoices and Bank Acc_005a17_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_MEDIUM'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_SOD Detective'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Approve Payables Invoices'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Bank Account Reconciliation'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/h2_Exceptions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/h2_People'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_KTLN_EAM_USER1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/h2_History'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/a_Approve Payables Invoices and Bank Accoun_40a7bc (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Approve Payables Invoices and Bank Accou_5a239c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_MEDIUM'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_03-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/a_Approve Payables Invoices and Bank Accoun_40a7bc_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Approve Payables Invoices and Bank Accou_5a239c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_MEDIUM'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_SOD Detective'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/div_NameDescriptionRisk LevelTypeObjectiveV_412cc8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_-'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/h2_Corrective Actions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/button_Cancel'), 0)

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/button_Toggle_a-Button a-IRR-button a-Butto_498392'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/td_Maintain Supplier Bank Accounts and Crea_0c1ead'))

WebUI.setText(findTestObject('Object Repository/EAM-Manage Rules/input_Export Rules_R247793226539899118_sear_985672'), 'Maintain Supplier Bank Accounts and Create Payables Invoices', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/button_Go'))

WebUI.click(findTestObject('Object Repository/EAM-Manage Rules/a_Maintain Supplier Bank Accounts and Creat_d96096'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Maintain Supplier Bank Accounts and Cr_7e325e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Maintain Supplier Bank Accounts and Cr_7e325e_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_HIGH'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_SOD Detective'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_04-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/label_Set1 Activity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_AP_CREATE_PAYABLES_INVOICE_PRIV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/label_Set2 Activity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/span_POZ_EDIT_SUPPLIER_REGISTRATION_BANK_AC_c6a809'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_AP_CREATE_PAYABLES_INVOICE_PRIV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Create Payables Invoice'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Privilege'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Set1 Activity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_KATALON_ADMIN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_POZ_EDIT_SUPPLIER_REGISTRATION_BANK_ACCO_d1845b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Edit Supplier Registration Bank Account'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Privilege'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Set2 Activity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_KATALON_ADMIN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/h2_Exceptions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/h2_People'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_KTLN_EAM_USER1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_04-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_-'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_04-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/h2_History'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/a_Maintain Supplier Bank Accounts and Creat_d96096 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Maintain Supplier Bank Accounts and Crea_0c1ead (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_HIGH'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_SOD Detective'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_04-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_KATALON_ADMIN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Old Revisions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/a_Maintain Supplier Bank Accounts and Creat_d96096_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Maintain Supplier Bank Accounts and Crea_0c1ead (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_HIGH'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_SOD Detective'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_04-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_KATALON_ADMIN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Old Revisions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/a_Maintain Supplier Bank Accounts and Creat_d96096_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Maintain Supplier Bank Accounts and Crea_0c1ead (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_HIGH'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_SOD Detective'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_4'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_04-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_-'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_02-OCT-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_KATALON_ADMIN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Approved'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/a_Rule3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Payroll Administrator vs. Payroll Manager Rule'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_HIGH'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_Incompatible Sets'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_SOD Detective'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM-Manage Rules/td_1'), 0)

