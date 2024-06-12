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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'kat')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'katalon_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Home/span_Manage Result Set_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Home/span_Manage Result Set_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Home/a_Incident Status'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Home/a_Incident Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/span_Change Level'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/span_Change Level'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -CERP_1CloudERPEBiz_ba888d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -CERP_1CloudERPEBiz_ba888d'), 
    'KTLNCloud_MonitorPaaS', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -STP_ObjSet - STP-F_95ab96'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -STP_ObjSet - STP-F_95ab96'), 
    'STP_ObjSet - STP_Funds Capture Payment Method', true)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -STP_FCPM_MAY08_V1__abd34a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -STP_FCPM_MAY08_V1__abd34a'), 
    'STP_FCPM_JUNE11_V1_361711_20240611041056', true)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP-Funds Capture Payment Method'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP-Funds Capture Payment Method'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'), 
    'INCIDENT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.comment(' Owner, Approver rejected')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'), 
    'INCIDENT', true)

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/div_Apply_ui-widget-overlay ui-front'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-2'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.comment('Unregistered Requestor, Approver rejected')

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'), 
    'INCIDENT', true)

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/div_Apply_ui-widget-overlay ui-front'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-8'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-8'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.comment('Owner, Appover approved, reviewer reviewed')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_ObjectDescriptionIncidentAction Comm_02d532'), 
    'INCIDENT', true)

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/div_Apply_ui-widget-overlay ui-front'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_Expression_R176258973591708826_expre_c08440'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-5'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_STP_FCPM_MAY08_V1_20240508093844-5'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/button_ApplyFilter0'))

WebUI.comment('Unregistered requestor, approver approved, and reviewer ')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Object'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action Comments'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident date'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Action date'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Role'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Status'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Incident level'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Requestor'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Tkt number'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Justification'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Change Tracker Report'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/a_Change Tracker Report'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -CERP_1CloudERPEBiz_ba888d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Incident Report/select_- Select any one -CERP_1CloudERPEBiz_ba888d'), 
    'KTLNCloud_MonitorPaaS', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/select_- Select any one -STP_ObjSet - STP-F_95ab96'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/select_- Select any one -STP_ObjSet - STP-F_95ab96'), 
    'STP_ObjSet - STP_Funds Capture Payment Method', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/select_- Select any one -STP_FCPM_MAY08_V1__abd34a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/select_- Select any one -STP_FCPM_MAY08_V1__abd34a'), 
    'STP_FCPM_JUNE11_V1_361711_20240611041056', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/button_Run'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/button_Run'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Monitor Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Monitor Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Snapshot Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Snapshot Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Item Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Item Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Record Key'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Record Key'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Before Value'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Before Value'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_After Value'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_After Value'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Last Updated By'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Last Updated By'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Last Update Date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/MonitorPaaS_CloudERP/AnalyticsReport/Page_Change Tracker Report/a_Last Update Date'), 
    0, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

