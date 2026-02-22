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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

//Snapshot Extract
def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')

def currentDateTime = dateFormat.format(new Date())

def dtpEBSJob1 = 'DTPEBS_' + currentDateTime

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_DataProbe_a-TreeView-label'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Manage Snapshot/select_Object Set_P100_OBJECT_SET'), 'EBizApp_JDBC_ObjSet', 
    false)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_Auto Refresh_B135207553892711001'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Job Detail/select_(Value Required)_P30_DS_ID'), 'EBiz_JDBC_DS', 
    false)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job Detail/select_(Value Required)_P30_DS_ID_1'), '4170',
//	true)
WebUI.setText(findTestObject('Object Repository/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), dtpEBSJob1)

WebUI.setText(findTestObject('Object Repository/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'), 'This DataProbe snapshot extract is triggered by QA Automation')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Job Detail/button_Cancel_B123623581915827245'))

WebUI.delay(8)

WebUI.setText(findTestObject('Object Repository/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field'), dtpEBSJob1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_Upload Data_mngSnap_search_button'))

WebUI.delay(900)

WebUI.setText(findTestObject('Object Repository/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field'), 'PARENT')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_Upload Data_mngSnap_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/a'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Log Report/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_DataProbe_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_concat(Row text contains , , PARENT,_dbb688'), 
    FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_concat(Row text contains , , DTPEBS__269b5d'), 
    FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.callTestCase(findTestCase('SFPSAutomation/DataProbe/5. Analytics'), [:])

