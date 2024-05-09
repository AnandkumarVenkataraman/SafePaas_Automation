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

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/a_Manage Data Source - U101'))

WebUI.click(findTestObject('MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/a_Manage Data Source - U101'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_060259'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_060259'), 
    'KTLNCloud_MonitorPaaS', true, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/a_KTLNCloud_MonitorPaaS_DS'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/a_KTLNCloud_MonitorPaaS_DS'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/a_Manage Object'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_060259'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_060259'), 
    'KTLNCloud_MonitorPaaS', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/select_Object NameObject SetsTab namesTrigg_9c0ec6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Expression_R122864292076293001_expre_83189b'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Expression_R122864292076293001_expre_83189b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/a_STP-Funds Capture Payment Method'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/a_STP-Funds Capture Payment Method'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Apply'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/a_STP-Funds Capture Payment Method_1'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/a_STP-Funds Capture Payment Method_1'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Object Details/h1_Cloud Details - SQL Generator'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Object Details/h1_Cloud Details - SQL Generator'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Table Name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Column Name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Object Item Name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Cloud Path'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Sub Query'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Key'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Data Type'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Rule Logic'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Add Object Items/span_Rule Logic'))

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Object Rules/a_Rule type'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Object Rules/a_Left object item name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Object Rules/a_Operator lookup meaning'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Object Rules/a_Right object item name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Object Rules/a_Rule value'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Object Rules/span_Generate SQL'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Object Rules/span_Generate SQL'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/img_Link_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/img_Link_apex-edit-pencil'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Report View'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Report View'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Generate SQL'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Generate SQL'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_SQL generated successfully_t-Button _07d677'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_SQL generated successfully_t-Button _07d677'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/h2_Create and Deploy OTBI'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/h2_Create and Deploy OTBI'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Generate OTBI'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Generate OTBI'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_SQL generated successfully_t-Button _07d677'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_SQL generated successfully_t-Button _07d677'))

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Go'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Go'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Go'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/a_Run status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/a_Run status'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Cancel'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Generate SQL/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Object Details/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/a_Manage Object Set'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Objects/a_Manage Object Set'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/button_Actions'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/button_Filter'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/select_Object SetDescriptionStart DateEnd D_6bdece'))

WebUI.verifyElementText(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/input_Expression_p_ignore_10'), 
    'STP_ObjSet')

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/button_Apply'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/a_STP_ObjSet'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_Manage Object Set/a_STP_ObjSet'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Objectset/button_Cancel'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/1_CloudERP_ManageDatasource_ManageObject/Page_AddEdit Objectset/button_Cancel'))

WebUI.closeBrowser()

