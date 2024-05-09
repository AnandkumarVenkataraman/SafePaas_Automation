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

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba10/Re-concilliation_MassupdateException/Page_Home/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/select_Select any oneEBizApp_JDBC_EnvKTLN_C_7a3a43'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/button_Filter False - Positives'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/button_Filter False - Positives'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Users'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Users'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/input_Read Only User_userCheck'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/input_Read Only User_userCheck'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Submit'))

WebUI.takeFullPageScreenshot([])

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Entries'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Entries'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Toggle - Exclude Entries_ U233'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Toggle - Exclude Entries_ U233'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Toggle - Exclude Entries_ U233'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/label_Toggle - Exclude Entries_ U233'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Exclude Unexclude All - UR1'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Exclude Unexclude All - UR1'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Exclude Unexclude All - UR1'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Exclude Unexclude All - UR1'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Submit'))

WebUI.takeFullPageScreenshot([])

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Filter False-Positives/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/a_Manage Exception'))

WebUI.click(findTestObject('Object Repository/deba10/Reconcilliation_FilterFalsePositive/Page_Manage Rules/a_Manage Exception'))

WebUI.closeBrowser()

