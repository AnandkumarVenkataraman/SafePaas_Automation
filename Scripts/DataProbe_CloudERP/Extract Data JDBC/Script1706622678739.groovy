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

WebUI.setText(findTestObject('Object Repository/Extract Data JDBC/input_IQA - Fall 2023_P101_COMPANY'), 'kat')

WebUI.setText(findTestObject('Object Repository/Extract Data JDBC/input_OR CONTINUE WITH_P101_USERNAME'), 'katalon_admin')

WebUI.click(findTestObject('Object Repository/Extract Data JDBC/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setEncryptedText(findTestObject('Object Repository/Extract Data JDBC/input_New_P101_PASSWORD'), 'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.click(findTestObject('Object Repository/Extract Data JDBC/button_Login'))

WebUI.click(findTestObject('Object Repository/Extract Data JDBC/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Extract-Data/a_Manage Snapshot2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Extract-Data/select_Select any oneKTLN_OBJECT_SET'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Extract-Data/select_Select any oneKTLN_OBJECT_SET'), 'EBizApp_JDBC_ObjSet', true, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Extract Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_-- Select any one ---- Local File --_b47e4a'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Component (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/span_Extract Snapshot'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Object Sets (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/span_EBizApp_JDBC_ObjSet'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Type (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Occurrences'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Change Tracker'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Security'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/div_Security'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Datasource (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Extract-Data/select_KTLN_LocalFilesKTLN_LocalFilesKTLN_Dev22'), 'EBiz_JDBC_DS', 
    true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_User_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Entry_Responsibility_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Entry_Menu_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Entry_Form_Functions_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Entry_Grant_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Entry_Concurrent_Program_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Entry_LocalRoles_JDBC'))

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Entry_Request_Group_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_Attribute_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_UserEntry_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_EntryHierarchy_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_EntryAttribute_JDBC'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract Data JDBC/td_EBiz_User_Entry_Attribute_JDBC'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 'KAT_JDBC_NOV17_V1', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Name (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Comments'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Extract Data/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'), 'KAT JDBC', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Repeat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_NeverMinutesDailyWeeklyMonthlyYearly'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Popup Calendar Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Create'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Create'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

