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

WebUI.setText(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Home/a_Manage Company'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Home/a_Manage Company'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Company/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Company/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Company/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Company/span_Settings'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Company/span_Settings'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Settings/span_Users'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Settings/span_Users'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Create Users/span_Users Access'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Create Users/span_Users Access'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Users Application Access/span_Email Configuration'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Users Application Access/span_Email Configuration'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -Enterprise Acce_e8a0fd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -Enterprise Acce_e8a0fd'), 
    'FSOD', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericRules Re_0c61e0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericRules Re_0c61e0'), 
    'Generic', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '526', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericRules Re_0c61e0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericRules Re_0c61e0'), 
    'Reminder Notification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '528', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -Enterprise Acce_e8a0fd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -Enterprise Acce_e8a0fd'), 
    'UAC', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'Generic', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '707', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'POST Process Error', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '708', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'Reassignment Notification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '709', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'Cancelling Notification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '710', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'Delegation Notification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '711', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'Escalation Notification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '712', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'Reminder Notification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '713', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Please select one -GenericPOST Pro_9e06cf'), 
    'After Review Notification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '714', true)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Email Configuration/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Company/a_Manage Environment'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_EmailTemplates/Page_Company/a_Manage Environment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/select_Environment NameDescriptionStart Dat_e75d04'))

WebUI.verifyElementText(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/input_p_ignore_10'), 'KTLN_CloudERP')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/img_apex-edit-pencil'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/Administration/Page_AddEdit Environment/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_AddEdit Environment/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_AddEdit Environment/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_AddEdit Environment/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_AddEdit Environment/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/a_Manage Cross Datasources'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Manage Environment/a_Manage Cross Datasources'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_Manage Cross Datasources/a_SafePaaS User Listing'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_Manage Cross Datasources/a_SafePaaS User Listing'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/Administration/Page_SafePaaS User Listing/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_SafePaaS User Listing/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_SafePaaS User Listing/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Administration/Page_SafePaaS User Listing/a_SafePaaS User Application Listing'))

WebUI.click(findTestObject('Object Repository/deba4/Administration/Page_SafePaaS User Listing/a_SafePaaS User Application Listing'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.closeBrowser()

