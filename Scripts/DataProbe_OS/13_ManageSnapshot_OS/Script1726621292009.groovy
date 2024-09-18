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

WebUI.setText(findTestObject('Object Repository/ManageSnapshot_OS/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/ManageSnapshot_OS/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/ManageSnapshot_OS/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Home/a_Manage Snapshot'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/select_Select any oneAccountsPayableCERP_Ob_57939c'), 
    'Tririga_OS_ObjSet', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_Extract Data'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_Extract Data'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/select_-- Select any one ---- Local File --_8a7291'), 
    'Remote_File_DS_Tri', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/label_Component (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/span_Extract Snapshot'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/label_Object Sets (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/span_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/label_Type (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/div_Security'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/label_Datasource (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/select_Remote_File_DS_Tri'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_AD_Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_AD_NetUs'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_AD_User_Entry'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_AD_Users'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_OS_Entry'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_OS_User'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_OS_User_entry_g'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/td_OS_User_entry_p'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/span_Total 8'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/label_Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'))

WebUI.setText(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    GlobalVariable.DTP_OS_SSName)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/button_Create'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Job Detail/button_Create'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/h2_Snapshot successfully submitted'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_Snapshot successfully submitted_t-Bu_ba886c'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_Snapshot successfully submitted_t-Bu_ba886c'))

WebUI.setText(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field'), 
    GlobalVariable.DTP_OS_SSName)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_Go'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_Go'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/a_Status code'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/a_Completed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_concat(Row text contains , , TRI_OSE_4804ca'))

WebUI.click(findTestObject('Object Repository/ManageSnapshot_OS/Page_Manage Snapshot/button_concat(Row text contains , , TRI_OSE_4804ca'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

