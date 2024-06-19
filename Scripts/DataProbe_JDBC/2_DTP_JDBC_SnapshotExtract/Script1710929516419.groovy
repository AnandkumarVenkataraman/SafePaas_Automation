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

WebUI.setText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/a_Manage Data Source'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Home/a_Manage Data Source'))

WebUI.verifyElementClickable(findTestObject('deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 -Z1'))

WebUI.selectOptionByLabel(findTestObject('deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 -Z1'), 
    'EBizApp_JDBC_Env', true, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Data Source/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Data Source/a_Manage Object'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Manage Object'))

WebUI.verifyElementClickable(findTestObject('deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 -Z1'))

WebUI.selectOptionByLabel(findTestObject('deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 -Z1'), 
    'EBizApp_JDBC_Env', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a (1) (1)'), 
    'Entreprise Access Monitor', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_Object Name (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Attribute_JDBC (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Attribute_JDBC (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Object Name (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Product Type (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Type of Object (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryAttribute_JDBC (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryAttribute_JDBC (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Object Name (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Product Type (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Usage (Value Required) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Type of Object (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 2 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 2 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('deba2/DataProbe_JDBC/Page_Manage Objects/a_Scroll element_Z2'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryHierarchy_JDBC - 21 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_EntryHierarchy_JDBC - 21 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Object Name (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Product Type (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Usage (Value Required) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Type of Object (Value Required) (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 2 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('deba2/DataProbe_JDBC/Page_Manage Objects/a_Scroll element_Z2'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Grant_JDBC - 23 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Grant_JDBC - 23 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('deba2/DataProbe_JDBC/Page_Manage Objects/a_Scroll element_Z2'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_LocalRoles_JDBC - 24 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_LocalRoles_JDBC - 24 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC - 25 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC - 25 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC - 25 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC - 26 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC - 26 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC - 26 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC - 27 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC - 27 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC - 27 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 6 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_UserEntry_JDBC - 28 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_UserEntry_JDBC - 28 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_UserEntry_JDBC - 28 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 4 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 4 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC - 29 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC - 29 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC - 29 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 3 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 3 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_JDBC - 30 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_JDBC - 30 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/a_EBiz_User_JDBC - 30 (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/input_P10_OBJECT_NAME (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/div_Enterprise Access Monitor (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_Security (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/label_JDBC (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_AddEdit Object Details/span_Object Items (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 7 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/span_Total 7 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Add Object Items/a_Manage Objects 289 (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Objects/span_1 -                   13 of           _a456d9 (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Objects/a_Manage Object Set'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Objects/a_Manage Object Set'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/select_Object SetDescriptionStart DateEnd D_6bdece'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/buttonR137674426230792379_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/buttonR137674426230792379_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet_1'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_AddEdit Objectset/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_AddEdit Objectset/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_Manage Snapshot'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Object Set/a_Manage Snapshot'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_d4dded'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_d4dded'), 
    'EBizApp_JDBC_ObjSet', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/button_Extract Data'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Manage Snapshot/button_Extract Data'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/select_EBiz_JDBC_DS'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/select_EBiz_JDBC_DS'), 
    'EBiz_JDBC_DS', true, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/h1_Job'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/input_P30_SCHEDULER_JOB_NAME'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/input_P30_SCHEDULER_JOB_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/input_P30_SCHEDULER_JOB_NAME'), 
    'JDBC_Extract_June19_V1')

WebUI.scrollToElement(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/DTP_SnapshotExtract/Page_Job Detail/button_Create'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

