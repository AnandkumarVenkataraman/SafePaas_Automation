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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (9)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Company Settings_a-TreeView-label (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Company/div_DataProbe_apex-item-option'), 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Company/span_Company_t-Tabs-label'))

WebUI.setText(findTestObject('Object Repository/Page_Settings/input_Settings_R307838823214507554_ig_toolb_058319'), 'Enterprise Access Certification')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Settings/button_Settings_a-Button a-Toolbar-item'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Settings/button_concat(Search for , , Enterprise Acc_57ba07'), 
    FailureHandling.OPTIONAL)

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

//Verify pop-up
WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(2)

//Manage Env.
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Company_a-TreeView-label'))

//WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
//	'EBizApp_JDBC')
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'))
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

//EACM Setups
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Certification_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Setup_a-TreeView-label (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Network Users/select_Environment_P0_ENVIRONMENT'), 
    '9148', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Network Users/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Network Users/a_Manage Network Users_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'), 
    2)
//Verify Map Roles for an EBS Env.
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Access Groups/button_Map Roles (CSV)_B149605989596714417'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Cancel_B149607375770714431'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Actions_a-IRR-noDataMsg-text'),
	'No data found for the current selection', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Previous_B149608377236714441'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Actions_a-IRR-noDataMsg-text_1'),
	'No data found for the current selection', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/a_Setup_t-Breadcrumb-label'))
//End verifying of Map Roles

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'), 
    '8028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'), 
    '7408', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Access Groups/a_Manage Access Groups_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'), 
    '9028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'), 
    '5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'), 
    '8028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'), 
    '7408', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Access Group Category Mapping/a_Manage Access Groups Category Mapping_a-T_716809'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT'), '9028', 
    true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Roles/span_AP_t-Tabs-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT'), '5888', 
    true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Roles/span_AP_t-Tabs-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT'), '8028', 
    true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Identity/span_BU1_t-Tabs-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT'), '7408', 
    true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Roles/span_AP_t-Tabs-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT (1)'), '5888', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Scope Access/input_Role Groups in Scope_R324291159469100_620fa9'), 
    'Application Object Library')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/button_Role Groups in Scope_R32429115946910_511a2b'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Roles/span_Application Object Library_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/button_concat(Row text contains , , Applica_3bf12f'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Scope Access/select_Environment_P0_ENVIRONMENT (1)'), 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scope Access/a_Scope Access_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT'), 
    '9028', true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_Scope Access_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT'), 
    '5888', true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_Scope Access_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT'), 
    '8028', true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_5'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_6'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_Scope Access_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT'), 
    '7408', true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_7'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_8'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_Scope Access_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/span_1'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Approval Assignments/a_Manage Approval Assignments_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'), 
    '5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'), 
    '7408', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'), 
    '9028', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Risk Levels/a_Assign EACM Roles_a-TreeView-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'), 
    '9028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'), 
    '5888', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'), 
    '8028', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Certification Configuration/select_Environment_P41_ENVIRONMENT_AG'), 
    '7408', true)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/span'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/span_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/span_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Certification Configuration/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

//Single Env. UAR, and Analytics
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Analytics_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Access Certification_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/button_Manage Certification_B167126276549450183'))

def dateFormat = new SimpleDateFormat('ddMMyyyy_HHmmss')

def currentDateTime = dateFormat.format(new Date())

def singleEnvUAR1 = 'EBS_UAR_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Page_Initiate User Access/input_(Value Required)_P10_NAME'), singleEnvUAR1)

WebUI.setText(findTestObject('Object Repository/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 'This is a Role-group based UAR; for a single Env., initiated by QA Automation')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_(Value Required)_ui-datepicker-trigg_27f7b7'))

//LocalDate futureDate = LocalDate.now().plusDays(2)
//
//String dayString = futureDate.format(DateTimeFormatter.ofPattern('d'))
//WebUI.comment(dayString)
//
//String dynamicXPath = "//a[@href = '#' and (text() = '$dayString' or . = '$dayString')]"
//WebUI.comment(dynamicXPath)
//TestObject dynamicDateObject = new TestObject()
//
//dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
//
//WebUI.enhancedClick(dynamicDateObject)

//Replacing below code with method
//String dayString = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern('d'))
//
//WebUI.comment('Target Day: ' + dayString)
//
//String dynamicXPath = ('//a[@href=\'#\' and normalize-space(text())=\'' + dayString) + '\']'
//
//WebUI.comment('Dynamic XPath: ' + dynamicXPath)
//
//TestObject dynamicDateObject = new TestObject('dynamicDate')
//
//dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

//End of Replacing below code with method

TestObject dynamicDateObject = CustomKeywords.'Helper.enterDatePlusTwo'()

WebUI.enhancedClick(dynamicDateObject)

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/a_Sa_ui-state-default ui-state-hover'))
WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_Sa_ui-datepicker-close ui-state-defa_3b90c3'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/label_Terminate Access_u-radio'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_Initiate User Access Certification_B_c29e18'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/input_Role Group_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Initiate User Access/button_Cancel_B284164618569469737'))

WebUI.delay(100)

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Certification/h2_Breadcrumb_t-Alert-title'), 'Certification job was initiated successfullyEmail will be sent to appropriate Owner(s) (and Manager(s)), upon successful completion of the job. You can check the status of the job FSOD_INITIATE_UAC_21636 at Administration -> Platform -> Scheduler')
//String uacID = WebUI.getText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
//
//WebUI.comment('UAC ID is : ' + uacID)
def successMsgObj = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f')

WebUI.waitForElementVisible(successMsgObj, 20, FailureHandling.STOP_ON_FAILURE)

String uacID = WebUI.getText(successMsgObj)

WebUI.comment('Certification job message: ' + uacID)

WebUI.delay(1)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
def matcher = uacID =~ '(FSOD_[A-Z0-9_]+)'

String actualUACId = matcher ? (matcher[0])[1] : null

WebUI.comment('Extracted UAC ID: ' + actualUACId)

WebUI.delay(300)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Certification/a_Manage Certification_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Page_Manage User Access/input_User Access_userAccessReport_search_field'), 
    singleEnvUAR1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/button_User Access_userAccessReport_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/a_Environment Name_reportLink'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_EBS_UAR_SEPT172025_V1_t-Report-cell'), 
    'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Open_t-Report-cell'), '0')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Open_t-Report-cell_1'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Open_t-Report-cell_2'), '0')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Maria B_t-Report-cell'), 'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Page_User Access Validation/td_Anandkumar Venkataraman_t-Report-cell'), 
    'Open')

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Access Validation/a_Access Certification_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/button_concat(Row text contains , , EBS_UAR_923da7'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage User Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Verify in Scheduler
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Company Settings_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Platform_a-TreeView-label (1)'))

WebUI.delay(20)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Job Time_P29_JOB_TIME'), 
    1)

WebUI.delay(20)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Job Time_P29_JOB_TIME'), 
    0)

WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/input_Job Time_SCHEDULER_search_field (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Scheduler/input_Job Time_SCHEDULER_search_field (1)'), actualUACId, 
    FailureHandling.OPTIONAL)

WebUI.delay(20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/button_Job Time_SCHEDULER_search_button (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Scheduler/td_-_u-tL'), 'SUCCEEDED', 
    FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/button_concat(Row text contains , , 21670, _9215fa'), 
    FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Scheduler/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'), 
    FailureHandling.OPTIONAL)

//Send reminder emails from Manage User Access
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (15)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification_a-TreeView-label'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1400:11:11290823382912:::11::')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/input_User Access_userAccessReport_search_field (1)'), 
    singleEnvUAR1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_User Access_userAccessReport_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Environment Name_reportLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/input_Send E-mail Reminder_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Open_B163976659956487332'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/h2_Breadcrumb_t-Alert-title'), 
    'Email reminder has been sent')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Email reminder has been sent_t-Butto_8b503d (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/input_EBizApp_JDBC_Env_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Open_B163976659956487332'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/h2_Breadcrumb_t-Alert-title'), 
    'Email reminder has been sent')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Email reminder has been sent_t-Butto_8b503d (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Access Certification_t-Breadcrumb-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , EBS_UAR_1afdf6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i'))

WebUI.closeBrowser()

