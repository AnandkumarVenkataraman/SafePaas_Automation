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

WebUI.navigateToUrl('https://uat.safepaas.com/monitor/f?p=1000:101:::::')

WebUI.setText(findTestObject('Object Repository/Upload Data/Page_Login/input_Winter 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Upload Data/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Upload Data/Page_Login/input_New_P101_PASSWORD'), 'E9jDT7RxyN0+jhzlxRmzLQ==')

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Home/a_Manage Object Set'))

WebUI.setText(findTestObject('Object Repository/Upload Data/Page_Manage Object Set/input_Report Search_P17_REPORT_SEARCH'), 
    'KTLN_OBJECT_SET')

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Manage Object Set/button_Go'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Manage Object Set/a_KTLN_OBJECT_SET'))

WebUI.verifyElementClickable(findTestObject('Manage Object Set/Page_AddEdit Objectset/td_ENTRY'))

WebUI.verifyElementText(findTestObject('Manage Object Set/Page_AddEdit Objectset/td_ENTRY'), 'ENTRY')

WebUI.verifyElementClickable(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryRole'))

WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryRole'), '349591', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_AddEdit Objectset/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_AddEdit Objectset/button_Apply Changes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Object Set/a_Manage Snapshot'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Manage Object Set/a_Manage Snapshot'))

WebUI.verifyElementClickable(findTestObject('Upload Data/Page_Manage Snapshot/label_Object Set'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/select_Select any oneKTLN_OBJECT_SET'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/select_Select any oneKTLN_OBJECT_SET'), 
    '5309', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/button_Upload Data'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/button_Upload Data'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/input_(Value Required)_P37_NAME'))

WebUI.verifyElementClickable(findTestObject('Upload Data/Page_Manage Snapshot/label_Object Set'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/span_KTLN_OBJECT_SET'))

WebUI.verifyElementText(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/span_KTLN_OBJECT_SET'), 'KTLN_OBJECT_SET')

WebUI.verifyElementText(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_App Type Version'), 'App Type Version')

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_App Type Version'))

WebUI.verifyElementText(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/span_Oracle Cloud ERP 20x'), 
    'Oracle Cloud ERP 20x')

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/span_Oracle Cloud ERP 20x'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_Type'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_File Type (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/div_XMLJSON'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/input_(Value Required)_P37_NAME'))

WebUI.setText(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/input_(Value Required)_P37_NAME'), 'EntryRoles_KTLN_FEB17_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_Object (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/input_(Value Required)_P37_OBJECT'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/button_(Value Required)_P37_OBJECT_lov_btn'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/button_(Value Required)_P37_OBJECT_lov_btn'))

WebUI.click(findTestObject('Upload Data/Page_Snapshot Details/li_EntryRoles_KTLN'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/label_File (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Upload Data/Page_Manage Snapshot/input_(Value Required)_P37_FILE'))

WebUI.uploadFile(findTestObject('Upload Data/Page_Manage Snapshot/input_(Value Required)_P37_FILE'), 'C:\\Users\\MARIAISABEL.BRUM\\Desktop\\XML\'s\\EntryRoles_KTLN.xml')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Upload Data/Page_Manage Snapshot/button_Upload Data (1)'))

WebUI.click(findTestObject('Upload Data/Page_Manage Snapshot/button_Upload Data (1)'))

WebUI.click(findTestObject('Object Repository/Upload Data/Page_Snapshot Details/button_Cancel'))

