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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/SODTest1/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/SODTest1/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/SODTest1/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Home/a_Manage Violation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/select_Select any oneEBizApp_JDBC_EnvJDE_TE_abbce2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/select_Select any oneEBizApp_JDBC_EnvJDE_TE_abbce2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_(Value Required)_P74_REQUEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_(Value Required)_P74_REQUEST_NAME_lov_btn'))

WebUI.setText(findTestObject('SOD_Procurement/Page_Manage Violation/input_SODTest'), GlobalVariable.SODTest_Procu_Adj, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('SOD_Procurement/Page_Manage Violation/input_SODTest'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SOD_Procurement/Page_Manage Violation/li_SODTest_Aug5_ARProcAgnt1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Filter'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'), 'AR_AdjustmentProfile_Rule1')

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Apply'))

WebUI.delay(20)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_1 -                   15 of           _b4d5fc'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Rule Name  AR_AdjustmentProfile_Rule1'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Rule Name  AR_AdjustmentProfile_Rule1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'), 'ManageRequisitions_Rule1')

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Apply'))

WebUI.delay(20)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_1 -                   15 of           _90cc5a'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Rule Name  ManageRequisitions_Rule1'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Rule Name  ManageRequisitions_Rule1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/input_Expression_p_ignore_10'), 'ProcurementAgent_Rule1')

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_Apply'))

WebUI.delay(20)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_1 -                    3 of           _0e833d'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_concat(Rule Name  , ,  AR_Adjustment_365d9a'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/button_concat(Rule Name  , ,  AR_Adjustment_365d9a'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Dashboard_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Dashboard_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/a_Violations by User Report'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_Manage Violation/a_Violations by User Report'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvJDE_TE_abbce2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvJDE_TE_abbce2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__4884e3'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__4884e3'))

WebUI.selectOptionByLabel(findTestObject('SOD_Procurement/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__4884e3'), 
    GlobalVariable.SODTest_Procu_Adj, false)

WebUI.delay(30)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_1 -                   50 of more than _bf098e'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_Select Columns_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_Select Columns_a-Menu-statusCol'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'), 
    'AR_AdjustmentProfile_Rule1')

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Apply'))

WebUI.delay(30)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_1 -                   50 of more than _bf098e'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/a_EditRule Name  AR_AdjustmentProfile_Rule1'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/a_EditRule Name  AR_AdjustmentProfile_Rule1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'))

WebUI.setText(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'), 
    'ManageRequisitions_Rule1')

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Apply'))

WebUI.delay(30)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_1 -                   50 of           _f3c080'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_Rule Name  ManageRequisitions_Rule1'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_Rule Name  ManageRequisitions_Rule1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'))

WebUI.setText(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/input_Expression_p_ignore_10'), 
    'ProcurementAgent_Rule1')

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_Apply'))

WebUI.delay(30)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/span_1 -                    3 of           _0e833d'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/ul_1 -                    3 of             _53acf2'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_concat(Rule Name  , , ProcurementAge_7b21be'))

WebUI.click(findTestObject('Object Repository/SOD_Procurement/Page_User Violation Report/button_concat(Rule Name  , , ProcurementAge_7b21be'))

WebUI.delay(30)

WebUI.closeBrowser()

