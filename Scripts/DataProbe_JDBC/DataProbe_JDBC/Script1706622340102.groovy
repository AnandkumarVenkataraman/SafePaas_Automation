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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/input_P101_COMPANY (1) (1) (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/input_P101_USERNAME (1) (1) (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/input_P101_PASSWORD (1) (1) (1)'), 
    'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/button_Login (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/a_Manage Data Source (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/a_Manage Data Source (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 (1)'), 
    '5888', true)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_EBiz_JDBC_DS (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_EBiz_JDBC_DS (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/label_Active (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/label_Name (Value Required) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_P4_DS_ENCRYPTED_PWD (1)'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_P4_DS_ENCRYPTED_PWD (1)'), 
    'MdqPWYggwm0=')

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Apply Changes (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Apply Changes (1)'))

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/h2_The Datasource was successfully saved (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_f01 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_f01 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Synchronization (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Synchronization (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/h2_Syncronization processing in the background (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/span_Running (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Last Synchronization Status'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Last Synchronize Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Manage Object'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/select_- Select an Environment -CERP_1Cloud_f2f181 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a (1) (1)'), 
    'EAM', true)

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_Object Name (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Attribute_JDBC (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Attribute_JDBC (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Object Name (Value Required) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Product Type (Value Required) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Type of Object (Value Required) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'))

WebUI.delay(4)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryAttribute_JDBC (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryAttribute_JDBC (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Object Name (Value Required) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Product Type (Value Required) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Usage (Value Required) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Type of Object (Value Required) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 2 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 2 (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryHierarchy_JDBC - 21 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryHierarchy_JDBC - 21 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryHierarchy_JDBC - 21 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Object Name (Value Required) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Product Type (Value Required) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Usage (Value Required) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Type of Object (Value Required) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Grant_JDBC - 23 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Grant_JDBC - 23 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Grant_JDBC - 23 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_LocalRoles_JDBC - 24 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_LocalRoles_JDBC - 24 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_LocalRoles_JDBC - 24 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC - 25 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC - 25 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC - 25 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC - 26 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC - 26 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC - 26 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC - 27 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC - 27 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC - 27 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_UserEntry_JDBC - 28 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_UserEntry_JDBC - 28 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_UserEntry_JDBC - 28 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 4 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 4 (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC - 29 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC - 29 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC - 29 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 3 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 3 (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_JDBC - 30 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_JDBC - 30 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_JDBC - 30 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 7 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 7 (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

