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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))

//Verify the EACM Setups in Company Settings
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Company Settings_a-TreeView-label (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Company/div_DataProbe_apex-item-option'), 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Company/span_Company_t-Tabs-label'))

WebUI.setText(findTestObject('Object Repository/Page_Settings/input_Settings_R307838823214507554_ig_toolb_058319'), 'Enterprise Access Certification')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Settings/button_Settings_a-Button a-Toolbar-item'))
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Settings/button_concat(Search for , , Enterprise Acc_57ba07'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Settings/span_Subscription_t-Tabs-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Product_P34_PRODUCT'), 'UAC', 
    true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '714', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Cancelling Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '710', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Delegation Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '711', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Escalation Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '712', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Generic', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '707', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Identity Group User Mapping Generic Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Identity Group User Mapping Reminder Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'POST Process Error', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '708', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Reassignment Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '709', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Reminder Notification', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Template Name_P34_TEMPLATE_NAME'), 
    '713', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Survey Advance Intimation', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Configuration/select_Email Category_P34_EMAIL_CATEGORY'), 
    'Survey job failure', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Email Configuration/select_Product_P34_PRODUCT'), 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Email Configuration/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Add code to verify pop-up later

//Manage Env.
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Company_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
	'EBizApp_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
	'Test_Environment')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_-_u-tC (1)'), 'A')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A_u-tC (1)'), 'Oracle Cloud ERP 20x')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_Oracle Cloud ERP 20x_u-tL'), 'Operations')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
	'JDE_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_-_u-tC (1)'), 'A')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_Oracle Cloud ERP 20x_u-tL'), 'Operations')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
	'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_-_u-tC (1)'), 'A')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A_u-tC_1'), 'EBS R12.2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_Oracle Cloud ERP 20x_u-tL'), 'Operations')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

