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

WebUI.setText(findTestObject('Object Repository/CrossApp SOD/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/CrossApp SOD/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/CrossApp SOD/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Home/span_Company Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Home/a_Manage Companies'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Company/a_Code'))

WebUI.setText(findTestObject('Object Repository/CrossApp SOD/Page_Company/input_Search_R5581103320342092_sort_widget__d19570'), 
    'KAT')

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Company/a_KAT'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Company/img_Link_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Company/label_Enable'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Company/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Company/a_Manage Cross Datasources'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/a_Product Type'))

WebUI.setText(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/input_Search_R168493018547531636_sort_widge_d877d6'), 
    'EAM')

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/a_EAM'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/img_Product Type_apex-edit-page'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/button_Cancel'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/span_Request Status_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/span_Rules Summary By Exceptions_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Cross Datasources/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Rules/a_Rule Tags'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Rules/a_NoEntryHierarchyforCrossApp'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Rules/a_Name'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Rules/a_CrossApp SOD Rule1'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Rules/a_CrossApp SOD Rule1'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Rule Report/span_Activities'))

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/CrossApp SOD/Page_Rule Report/span_Role_1_CrossApp'))

WebUI.verifyElementClickable(findTestObject('Object Repository/CrossApp SOD/Page_Rule Report/span_Responsibility_1_CrossApp'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage Rules/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage SOD Test/button_Create'))

WebUI.setText(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/input_(Value Required)_P35_REQUEST_NAME'), 
    GlobalVariable.SOD_CrossApp)

WebUI.setText(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/textarea_Description_P35_REQUEST_DESCRIPTION'), 
    GlobalVariable.SOD_CrossApp)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'SOD Detective', true)

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/input_(Value Required)_P35_REQUEST_NAME'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/select_ALL CERP RULESAR_AdjustmentProfileAl_3d13cb'), 
    'NoEntryHierarchyforCrossApp', true)

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/button_(Value Required)_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/label_EBizApp_JDBC_Env'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/label_KTLN_CloudERP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/h2_SOD Test Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/span_1 -                   10'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_AddEdit Test/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/CrossApp SOD/Page_Manage SOD Test/h2_SOD Test successfully submitted'))

WebUI.verifyElementClickable(findTestObject('Object Repository/CrossApp SOD/Page_Manage SOD Test/td_Running'))

WebUI.verifyElementText(findTestObject('Object Repository/CrossApp SOD/Page_Manage SOD Test/td_Running'), 'Running')

WebUI.delay(450)

WebUI.verifyElementClickable(findTestObject('Object Repository/CrossApp SOD/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/CrossApp SOD/Page_Manage SOD Test/button_Go'))

WebUI.delay(450)

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest_Validation/Page_Manage SOD Test/td_Closed'))

WebUI.verifyElementText(findTestObject('Object Repository/SODTest_Validation/Page_Manage SOD Test/td_Closed'), 'Closed')

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage SOD Test/a_Manage Violation'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/button_(Value Required)_P74_REQUEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/li_SODTest_CrossApp_Jul3_v1'))

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_1 -                   15 of           _25e8d3'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_Request Status_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/span_Company Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Manage Violation/a_Manage Companies'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/img_Link_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/label_Disable'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/SODTest_Validation/Page_Company/a_Logout'))

