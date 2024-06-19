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

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/a_Manage Environment'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/a_Manage Environment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/select_Environment NameDescriptionStart Dat_e75d04'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/select_Environment NameDescriptionStart Dat_e75d04'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/input_p_ignore_10'), 'KTLN_CloudERP_EACM')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Environment/img_apex-edit-pencil'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/label_API Enabled'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/label_API Enabled'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/h2_API Configuration'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/h2_API Configuration'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Environment/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_DataProbe_Setup/Page_Manage Environment/span_a-TreeView-toggle - 335'))

WebUI.click(findTestObject('EACM/EACM_DataProbe_Setup/Page_Manage Environment/span_a-TreeView-toggle - 335'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_DataProbe_Setup/Page_Manage Environment/span_a-TreeView-toggle_1 - 336'))

WebUI.click(findTestObject('EACM/EACM_DataProbe_Setup/Page_Manage Environment/span_a-TreeView-toggle_1 - 336'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_DataProbe_Setup/Page_Manage Environment/a_Manage Data Source - 337'))

WebUI.click(findTestObject('EACM/EACM_DataProbe_Setup/Page_Manage Environment/a_Manage Data Source - 337'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_6a439d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_6a439d'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/select_NameHost NameDatabaseUsernameLast Sy_c71232'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/select_NameHost NameDatabaseUsernameLast Sy_c71232'), 
    'DS_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/buttonR119140564844328612_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/buttonR119140564844328612_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_KTLN_CloudERP_EACM_DS'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_KTLN_CloudERP_EACM_DS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_Active'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_Active'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_KTLN_CloudERP_EACM_DS_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_KTLN_CloudERP_EACM_DS_1'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/a_Manage Object'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_6a439d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_6a439d'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a'), 
    'EAC', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Objects/a_SC_GET_API_KTLN'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Objects/a_SC_GET_API_KTLN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/label_Product Type (Value Required)'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/h1_Cloud Details'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/h1_Cloud Details'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_Object Items'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/span_Total 3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/span_Total 3'))

WebUI.takeFullPageScreenshot()

WebUI.delay(0)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Objects/a_SC_POST_API_KTLN'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Manage Objects/a_SC_POST_API_KTLN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/label_Product Type (Value Required)'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/h1_Cloud Details'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/h1_Cloud Details'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/span_Object Items'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/span_Total 10'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/span_Total 10'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_Add Object Items/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_DataProbe_Setup/Page_AddEdit Object Details/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/a_Manage Cross Datasources'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Home/a_Manage Cross Datasources'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/select_EditPrimary DatasourceSecondary Data_34a9b4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/select_EditPrimary DatasourceSecondary Data_34a9b4'), 
    'MASTER_ENV', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/buttonR168493018547531636_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/buttonR168493018547531636_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/a_KTLN_CloudERP_EACM'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/a_KTLN_CloudERP_EACM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/img_apex-edit-page'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/img_apex-edit-page'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/Page_Manage Cross Datasources/button_Cancel'))

WebUI.closeBrowser()

