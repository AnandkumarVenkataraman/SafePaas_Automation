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

WebUI.comment('Login to IQA with the URL - https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'kat')

WebUI.comment('Enter Company as KAT')

WebUI.setText(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'katalon_admin')

WebUI.comment('Enter Username as KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter password')

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Login/button_Login'))

WebUI.comment('click on Login button')

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.comment('Click on DataProbe Navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Home/a_Manage Snapshot'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Home/a_Manage Snapshot'))

WebUI.comment('Click on Manage Snapshot from the navigation menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_8d32e0'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/select_Select any oneCERP_ObjSetCloudERP_AD_8d32e0'), 
    'KTLN_OBJECT_SET', true, FailureHandling.OPTIONAL)

WebUI.comment('Select the Object Set from the LOV: KTLN_OBJECT_SET')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/label_Auto Refresh_u-checkbox'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/label_Auto Refresh_u-checkbox'))

WebUI.comment('Uncheck the auto-refresh option')

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Actions'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Filter'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/input_Expression_p_ignore_10'), 
    'CloudERP_SS_June19_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Apply'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Apply'))

WebUI.comment('Filter the latest Snapshot name')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Actions'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/span_Columns_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'), 
    'STATUS_CODE', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Expression_mngSnap_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Expression_mngSnap_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Completed'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Completed'))

WebUI.comment('Filter with the status code as Completed')

WebUI.verifyElementClickable(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Apply'))

WebUI.click(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/button_Apply'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the Object present : Name')

WebUI.scrollToElement(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Objects Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Objects Name'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the Object present : Object Name')

WebUI.scrollToElement(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Description'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the Object present :Description')

WebUI.scrollToElement(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Last Update Date'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Last Update Date'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the Object present : Last Update date')

WebUI.scrollToElement(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Status code'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/DataProbe_CloudERP/ManageSnapshot/Page_Manage Snapshot/a_Status code'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the Object present : StatusCode')

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.comment('Capture all the details')

WebUI.closeBrowser()

