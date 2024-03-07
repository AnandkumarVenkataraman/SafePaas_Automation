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

WebUI.setText(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Home/a_Manage Data Source'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Home/a_Manage Data Source'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Actions'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Filter'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/select_NameHost NameDatabaseUsernameLast Sy_c71232'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/select_NameHost NameDatabaseUsernameLast Sy_c71232'), 
    'DS_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/buttonR119140564844328612_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/buttonR119140564844328612_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/a_Azure_DS_CloudERPHCM'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/a_Azure_DS_CloudERPHCM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Apply'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/a_Azure_DS_CloudERPHCM_1'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/a_Azure_DS_CloudERPHCM_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/a_Manage Object'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a'), 
    'Entreprise iAccess', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Objects/a_Network-Users_AD_Cloud'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Objects/a_Network-Users_AD_Cloud'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_AddEdit Object Details/span_Object Items'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Add Object Items/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Add Object Items/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_AddEdit Object Details/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Objects/a_Manage Object Set'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Objects/a_Manage Object Set'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/button_Actions'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/button_Filter'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/select_Object SetDescriptionStart DateEnd D_6bdece'))

WebUI.verifyElementText(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/input_p_ignore_10'), 
    'CloudERP_AD_NW')

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/button_Apply'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/button_Apply'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/a_Manage Snapshot'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Object Set/a_Manage Snapshot'))

WebUI.verifyElementClickable(findTestObject('Enterprise iAccess/SnapshotExtract/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_d4dded'))

WebUI.selectOptionByLabel(findTestObject('Enterprise iAccess/SnapshotExtract/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_d4dded'), 
    'CloudERP_AD_NW', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Snapshot/button_Extract Data'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Manage Snapshot/button_Extract Data'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/select_Dev22_DataSourceKTLN_CloudERP_EACM_D_a0f8b6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/select_Dev22_DataSourceKTLN_CloudERP_EACM_D_a0f8b6'), 
    'Azure_DS_CloudERPHCM', true)

WebUI.scrollToElement(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/label_Name (Value Required)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/label_Name (Value Required)'))

WebUI.setText(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/input_P30_SCHEDULER_JOB_NAME'), 
    'SnapshotExtract_EIA_Mar1_V1')

WebUI.scrollToElement(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/button_Create'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/SnapshotExtract/Page_Job Detail/button_Create'))

WebUI.closeBrowser()

