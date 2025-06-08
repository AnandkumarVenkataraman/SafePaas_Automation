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
import java.text.SimpleDateFormat
import java.util.Date

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (1)'), 'KAT')

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/div_Logo leftMessageLogo left              _a1a655'))

//WebUI.doubleClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Snapshot'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/select_Select any oneAccountsPayableCERP_Ob_d1baf4'), 
    7)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Extract Data'))

//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File --_84239e'), 
//    3)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/div_Security'), 0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_KTLNEBS_MonitorPaaS_Vision122_DSSFTP_41615f'), 
    3)

WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Attribute_JDBC'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Attribute_JDBC'), 
    'EBiz_Attribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_EntryAttribute_JDBC'), 
    'EBiz_EntryAttribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_EntryHierarchy_JDBC'), 
    'EBiz_EntryHierarchy_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Concurrent_Program_JDBC'), 
    'EBiz_Entry_Concurrent_Program_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Form_Functions_JDBC'), 
    'EBiz_Entry_Form_Functions_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Grant_JDBC'), 
    'EBiz_Entry_Grant_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_LocalRoles_JDBC'), 
    'EBiz_Entry_LocalRoles_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Menu_JDBC'), 
    'EBiz_Entry_Menu_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Request_Group_JDBC'), 
    'EBiz_Entry_Request_Group_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Responsibility_JDBC'), 
    'EBiz_Entry_Responsibility_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_UserEntry_JDBC'), 
    'EBiz_UserEntry_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_User_Entry_Attribute_JDBC'), 
    'EBiz_User_Entry_Attribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_User_JDBC'), 'EBiz_User_JDBC')

//Enter the Snapshot Extract's job name in the format -> KTLN_DDMMYYYY_HHSS
def formatter = new SimpleDateFormat("ddMMyyyy_HHmm")

def timestamp = formatter.format(new Date())
println("Dynamic timestamp: " + timestamp)
def fileName = "KTLN_" + timestamp
WebUI.comment(fileName)


WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    fileName)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Create'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Snapshot successfully submitted_t-Bu_ba886c'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field'), 
    fileName)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Go'))

WebUI.closeBrowser()

