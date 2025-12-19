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

WebUI.navigateToUrl('https://prod.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Fall 2025_P101_COMPANY (12)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (62)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (62)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (73)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (55)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Roles Manager_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rule Attributes'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Attributes/a_Manage Activity'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (2)'), 
    'EBS_1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_EBS_1_apex-edit-page'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Asset Inquiry vs. General Ledger Rule2'), 
    0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Entry (1)'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_5'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Manage Activity (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_concat(Row text contains , , EBS_1, _c0584b'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (2)'), 
    'EBS_2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_EBS_1_apex-edit-page'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Asset Inquiry vs. General Ledger Rule2'), 
    'Asset Inquiry vs. General Ledger Rule2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_EBizApp_JDBC_Env'), 
    'EBizApp_JDBC_Env', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Entry (1)'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_5'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_7'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_9'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_10'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_11'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Manage Activity (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_concat(Row text contains , , EBS_1, _c0584b'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (2)'), 
    'Inventory Maintenance')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_EBS_1_apex-edit-page'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_EBizApp_JDBC_Env'), 
    'EBizApp_JDBC_Env', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Sales Invoicing and AR Receipts2'), 
    'Sales Invoicing and AR Receipts2', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Entry (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Manage Activity (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_concat(Row text contains , , EBS_1, _c0584b'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/input_Activity Report_R242004504603843036_s_342084 (2)'), 
    'Order Entry')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/img_EBS_1_apex-edit-page'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_EBizApp_JDBC_Env'), 
    'EBizApp_JDBC_Env', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Sales Invoicing and AR Receipts2'), 
    'Sales Invoicing and AR Receipts2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_EBizApp_JDBC_Env_1'), 
    'EBizApp_JDBC_Env', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Customer Master and Order Entry3'), 
    'Customer Master and Order Entry3', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_EBizApp_JDBC_Env_2'), 
    'EBizApp_JDBC_Env', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/td_Customer Master and Order Entry4'), 
    'Customer Master and Order Entry4', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Activity/span_Entry (1)'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/img_Responsibility_apex-edit-view_5'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity Entries/a_Manage Activity (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/button_concat(Row text contains , , EBS_1, _c0584b'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Activity/a_Manage Business Process (1)'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_AR'), 'AR', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Accounts Receivable'), 
    'Accounts Receivable', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_AM'), 'AM', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Asset Management'), 
    'Asset Management', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_GL'), 'GL', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_General Ledger'), 
    'General Ledger', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_BusinessProcess1'), 
    'BusinessProcess1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_BusinessProcess1_1'), 
    'BusinessProcess1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Order to Cash (1)'), 
    'Order to Cash', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Order to Cash_1'), 
    'Order to Cash', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Accounts Payable'), 
    'Accounts Payable', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Accounts Payable_1'), 
    'Accounts Payable', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Procure to Pay'), 
    'Procure to Pay', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Procure to Pay_1'), 
    'Procure to Pay', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_BusinessProcess2'), 
    'BusinessProcess2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_BusinessProcess2_1'), 
    'BusinessProcess2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_HCM'), 'HCM', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/td_Human Capital Management'), 
    'Human Capital Management', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Business Process/a_Manage Attribute Groups'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Attribute Grouping/a_Manage Rule Tags'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/td_EBiz'), 'EBiz', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/td_EBiz_1'), 'EBiz', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/td_EBiz_2'), 'EBiz', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Tag/a_Manage Exception Type (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    'EBizApp_JDBC_Env', false)
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Function (1)'), 'Function', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Exception by Function'), 
    'Exception by Function', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Responsibility (1)'), 
    'Responsibility', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Exception by Responsibility'), 
    'Exception by Responsibility', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Function_1'), 'Function', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Function_2'), 'Function', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_Responsibility_1'), 
    'Responsibility', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/td_No (1)'), 'No', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/img_Actions_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Exception Type/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/img_-_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Exception Type/button_Cancel'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/select_Select any oneCoupa_Env1EBizApp_JDBC_e66b03'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Exception Type/a_Manage Remediation Plan (2)'))
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_REMEDIATION_PLAN3'), 
    'REMEDIATION_PLAN3', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_MITIGATION_PLAN2_NO_POST'), 
    'MITIGATION_PLAN2_NO_POST', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_REMEDIATION_PLAN1'), 
    'REMEDIATION_PLAN1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_REMEDIATION_PLAN2'), 
    'REMEDIATION_PLAN2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/td_MITIGATION_PLAN1'), 
    'MITIGATION_PLAN1', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediation Plan/a_Manage EAM Roles'))
WebUI.takeScreenshot()
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/td_KTLN_ADMIN_EAM'), 
    'KTLN_ADMIN_EAM', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/td_EAM Admin Role'), 
    'EAM Admin Role', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/td_RoleTest1'), 'RoleTest1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/td_RoleTest1_1'), 'RoleTest1', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/img_Actions_apex-edit-page'))
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Define Security/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/img_EAM_apex-edit-page'))
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Define Security/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EAM Roles/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katalon_admin (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (7)'))

WebUI.closeBrowser()

