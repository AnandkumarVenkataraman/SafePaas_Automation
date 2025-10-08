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

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (10)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (10)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (10)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (9)'))

//Company Settings
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/input_Name_P15_NAME'), '', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_KAT'), 'KAT', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/label_Code'), 'Code', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/label_SFTP User'), 'SFTP User', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_katdataadm'), 'katdataadm', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_Settings'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/input_Settings_R307838823214507554_ig_toolb_058319 (1)'), 
    'Company Settings')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Email for SFTP notifications'), 
    'Email for SFTP notifications', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_anandkumar.venkataramansafepaas.com'), 
    'anandkumar.venkataraman@safepaas.com', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_VARCHAR2'), 'VARCHAR2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Email to send notification for SFTP Moni_c8a8b9'), 
    'Email to send notification for SFTP Monitoring process', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Log Retain Days'), 'Log Retain Days', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_30'), '30', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_NUMBER (1)'), 'NUMBER', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_This parameter specifies the number of d_4bcf29'), 
    'This parameter specifies the number of days before a log record is archived in the FND_LOG_HISTORY table', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_Scheduled Download Retain Days'), 
    'Scheduled Download Retain Days', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_90'), '90', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_NUMBER (1)'), 'NUMBER', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/td_This parameter specifies the number of d_5a8f29'), 
    'This parameter specifies the number of days before a scheduled download is purged', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/button_concat(Search for , , Company Settin_672aab'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/span_Users'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/input_Create_R23213727076438815_search_field'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_KATADMIN'), 'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_KATADMIN'), 'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_anandkumar.venkataramansafepaas.com'), 
    'anandkumar.venkataraman@safepaas.com', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_KAT Admin'), 'KAT Admin', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_09-APR-25'), '09-APR-25', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_-'), '-', FailureHandling.OPTIONAL)

//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_15-JUN-25'), '15-JUN-25')
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_OPEN'), 'OPEN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_09-APR-25'), '09-APR-25', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_66812979'), '66812979', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/span_Users Access'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900 (1)'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Company Settings'), 
    'Company Settings', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Access Monitor'), 
    'Access Monitor', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_DataPaaS'), 
    'DataPaaS', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_DataProbe'), 
    'DataProbe', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise Access Certification (1)'), 
    'Enterprise Access Certification', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise Access Monitor'), 
    'Enterprise Access Monitor', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise iAccess'), 
    'Enterprise iAccess', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise iCatalog'), 
    'Enterprise iCatalog', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_MonitorPaaS'), 
    'MonitorPaaS', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Policy Manager'), 
    'Policy Manager', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_SafeInsight'), 
    'SafeInsight', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_concat(Search for , , KATADMIN, , )__5d4760'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/a_SafePaaS User Listing'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/input_SafePaaS User Listing_R17563888885482_0bb8ed'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/button_Go'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_anandkumar.venkataramansafepaas.com'), 
    'anandkumar.venkataraman@safepaas.com', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_KAT Admin'), 
    'KAT Admin', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_Company Settings'), 
    'Company Settings', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_ALL_ACCESS'), 
    'ALL_ACCESS', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/a_SafePaaS User Application Listing'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/input_SafePaaS User Application Listing_R14_417567'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/button_Go'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/td_Company Settings'), 
    'Company Settings', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/button_concat(Row text contains , , KATADMI_68d78e'))

//Security Positions
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/a_Manage Security Positions'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Security Position/td_POS1'), 
    'POS1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Security Position/td_POS1'), 
    'POS1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Security Position/td_Company'), 
    'Company', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Security Position/td_POS2'), 
    'POS2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Security Position/td_POS2'), 
    'POS2', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Security Position/td_Environment'), 
    'Environment', FailureHandling.OPTIONAL)

//Platform
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Manage Security Position/a_Inbox'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (5)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Company Settings_a-TreeView-toggle'))

//WebUI.click(findTestObject('Object Repository/Page_Manage Security Position/div_Security Positions    Submit           _2b4ddf'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/a_Scheduler'))

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    1)

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    2)

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    3)

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    4)

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    0)

WebUI.delay(10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/img'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Cancel'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Scheduled Downloads'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduled Downloads/a_Log Report'))

WebUI.takeScreenshot()

WebUI.delay(2)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/select_TodayLast 7 daysLast MonthLast 3 Mon_d22ccc'),
//	'T1', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/select_TodayLast 7 daysLast MonthLast 3 Mon_d22ccc'),
//	'D7', true)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Usage'))

WebUI.takeScreenshot()

WebUI.delay(2)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Usage/select_- Select -QAQA1QA2'),
//	'374', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Usage/select_- Select -QAQA1QA2'),
//	'- Select -', true)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Usage/a_Release Update'))

WebUI.takeScreenshot()

WebUI.delay(2)

//Security
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Release Update/span_Release Update_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Release Update/a_Inbox'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (6)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Platform_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Release Update/a_Manage Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/input_Create_R126254423628149701_search_field'), 
    'ALL_ACCESS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/img_End Date_apex-edit-page'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/button_concat(Row text contains , , all, , _45e6fd'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/input_Create_R126254423628149701_search_field'), 
    'Admin_ReadOnlyAccess')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/img_End Date_apex-edit-page'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/button_concat(Row text contains , , all, , _45e6fd'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/a_Assign Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/input_Create_R127441311092542518_search_field'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/td_KATADMIN'), 'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/td_ALL_ACCESS'), 'ALL_ACCESS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/input_Create_R127441311092542518_search_field'), 
    'ANANDK1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/td_ANANDK1'), 'ANANDK1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/td_Admin_ReadOnlyAccess'), 
    'Admin_ReadOnlyAccess', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (1)'))

//Logging in as the user# who is assigned Function read access
//and verify the Create button is not rendered in
//Manage Company > Users tab
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (11)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (11)'), 
    'ANANDK1')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (11)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (10)'))

WebUI.delay(2)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (3)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (3)'))
//iGNORE BELOW CODE
//WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle (2)'))
//
//WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (5)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company (3)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_Users'))
//iGNORE UPTO ABOVE CODE

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company (2)'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_anandk1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Logout'))

WebUI.closeBrowser()

