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

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Verify All (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK (1)'))
//
//WebUI.delay(10)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13 (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/a_My Certifications'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK (1)'))
//WebUI.closeBrowser()
//EACM Old Code for launching the survey and certifying the records
//can be ignored
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'ANANDK')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Certifications_R97799695751099620__683988 (1)'),
//	'EBS_UAR')//singleEnvUAR1
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Certifications_R97799695751099620_3d9625'))
////
////WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , EBS_UAR_574070'))
////
////WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Certifications_R97799695751099620__683988 (1)'),
////	'EBS_UAR_26092025')
//
//
////NEW CODE
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Verify All (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13 (1)'))
//
//
//// END NEW CODE
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Certifications_R97799695751099620_3d9625'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_User Access Certification EBS_UAR_25_ed622c'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_Internet Expenses Vision Netherlands  Ne_ef9de8'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_Internet Expenses Vision Netherlands  Ne_ea2b76'))
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/select_Internet Expenses Vision Netherlands_99e0c8'),
//	0)
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/select_Internet Expenses Vision Netherlands_99e0c8'),
//	2)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/input_Justification for Mass Update_P4_JUST_30273f'),
//	'EBS_UAR_26092025')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Terminate All_B328275567060222744'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/h2_My Certifications_t-Alert-title'),
//	'Changes saved')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/a_MARIAB_t-Button t-Button--icon t-Button--header'))
//WebUI.delay(2)
//
//WebUI.acceptAlert(FailureHandling.OPTIONAL)
//
//WebUI.switchToFrame(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3_1'), 0)
//
////WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3_1'), Keys.SPACE)
//
////WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3_1'), FailureHandling.OPTIONAL)
//
//WebUI.delay(2)
//WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , EBS_UAR_574070'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (1)'))
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'KATADMIN')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (16)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (3)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Enterprise Access Certification_a-TreeView-label'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/button_Request_P1_REQUEST_lov_btn'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/input_Search_a-PopupLOV-search apex-item-text'),
//	singleEnvUAR1)
//
//WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/input_Search_a-PopupLOV-search apex-item-text'),
//	Keys.chord(Keys.ENTER))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Environment_P1_ENVIRONMENT'),
//	'5888', true)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_1'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_1'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'MARIAB')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Certifications_R97799695751099620__683988 (1)'),
//	singleEnvUAR1)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Certifications_R97799695751099620_3d9625'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_1'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/input_Justification for Mass Update_P4_JUST_30273f'),
//	singleEnvUAR1)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Verify All_B167565025735587903'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_test_uacReport_ig_grid_vc_cur'),
//	'MARIAB - Maria B')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_test_uacReport_ig_grid_vc_cur_1'),
//	'ANANDK - Anandkumar Venkataraman')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_ANANDK - Anandkumar Venkataraman_uacRepo_562828'),
//	'EBizApp_JDBC_Env')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_ANANDK - Anandkumar Venkataraman_uacRepo_562828'),
//	'EBizApp_JDBC_Env')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Save Changes_B328275908856222745'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/h2_My Certifications_R183515302298730869_heading'),
//	'User Access Certification has been Completed')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/a_ANANDK_t-Button t-Button--icon t-Button--header'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , EBS_UAR_574070'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_2'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_2'))
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'KATADMIN')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (16)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (3)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (8)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification_a-TreeView-label (1)'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/input_User Access_userAccessReport_search_field (2)'),
//	'EBS_UAR_25092025')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_User Access_userAccessReport_search_button (1)'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/td_Verified_u-tC'),
//	'Completed')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Environment Name_reportLink (1)'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_EBS_UAR_25092025_232457_t-Report-cell'),
//	'Completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Anandkumar Venkataraman_t-Report-cell'),
//	'Completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Maria B_t-Report-cell'),
//	'Completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Completed_t-Report-cell'),
//	'EBizApp_JDBC_Env')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Completed_t-Report-cell_1'),
//	'EBizApp_JDBC_Env')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Access Certification_t-Breadcrumb-label (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , EBS_UAR_1afdf6 (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Access Certification_a-TreeView-label'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/input_GET Status Report_mngSnap_search_field'),
//	'EBS_UAR_25092025')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_GET Status Report_mngSnap_search_button'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/td_Completed_u-tL'),
//	'Pending')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_concat(Row text contains , , EBS_UAR_1afdf6'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
//End of EACM Old
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Job Time_P29_JOB_TIME'),
//	1)
//WebUI.delay(20)
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Job Time_P29_JOB_TIME'),
//	0)
//WebUI.delay(20)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/div_Refresh_P29_JOB_TIME_CONTAINER'))
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Verify All (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK (1)'))
//
//WebUI.delay(10)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13 (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/a_My Certifications'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK (1)'))
//WebUI.closeBrowser()
//EACM Old Code for launching the survey and certifying the records
//can be ignored
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'ANANDK')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Certifications_R97799695751099620__683988 (1)'),
//	'EBS_UAR')//singleEnvUAR1
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Certifications_R97799695751099620_3d9625'))
////
////WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , EBS_UAR_574070'))
////
////WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Certifications_R97799695751099620__683988 (1)'),
////	'EBS_UAR_26092025')
//
//
////NEW CODE
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Verify All (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13 (1)'))
//
//
//// END NEW CODE
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Certifications_R97799695751099620_3d9625'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_User Access Certification EBS_UAR_25_ed622c'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_Internet Expenses Vision Netherlands  Ne_ef9de8'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_Internet Expenses Vision Netherlands  Ne_ea2b76'))
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/select_Internet Expenses Vision Netherlands_99e0c8'),
//	0)
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/select_Internet Expenses Vision Netherlands_99e0c8'),
//	2)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/input_Justification for Mass Update_P4_JUST_30273f'),
//	'EBS_UAR_26092025')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Terminate All_B328275567060222744'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/h2_My Certifications_t-Alert-title'),
//	'Changes saved')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/a_MARIAB_t-Button t-Button--icon t-Button--header'))
//WebUI.delay(2)
//
//WebUI.acceptAlert(FailureHandling.OPTIONAL)
//
//WebUI.switchToFrame(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3_1'), 0)
//
////WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3_1'), Keys.SPACE)
//
////WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3_1'), FailureHandling.OPTIONAL)
//
//WebUI.delay(2)
//WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , EBS_UAR_574070'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (1)'))
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'KATADMIN')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (16)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (3)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Enterprise Access Certification_a-TreeView-label'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/button_Request_P1_REQUEST_lov_btn'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/input_Search_a-PopupLOV-search apex-item-text'),
//	singleEnvUAR1)
//
//WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/input_Search_a-PopupLOV-search apex-item-text'),
//	Keys.chord(Keys.ENTER))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/select_Environment_P1_ENVIRONMENT'),
//	'5888', true)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Dashboard/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_1'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_1'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'MARIAB')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Certifications_R97799695751099620__683988 (1)'),
//	singleEnvUAR1)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_My Certifications_R97799695751099620_3d9625'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_1'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/input_Justification for Mass Update_P4_JUST_30273f'),
//	singleEnvUAR1)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Verify All_B167565025735587903'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_test_uacReport_ig_grid_vc_cur'),
//	'MARIAB - Maria B')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_test_uacReport_ig_grid_vc_cur_1'),
//	'ANANDK - Anandkumar Venkataraman')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_ANANDK - Anandkumar Venkataraman_uacRepo_562828'),
//	'EBizApp_JDBC_Env')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_ANANDK - Anandkumar Venkataraman_uacRepo_562828'),
//	'EBizApp_JDBC_Env')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All records verified_t-Button t-Butt_37ec13'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Save Changes_B328275908856222745'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/h2_My Certifications_R183515302298730869_heading'),
//	'User Access Certification has been Completed')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/a_ANANDK_t-Button t-Button--icon t-Button--header'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/button_Cancel_js-confirmBtn ui-button ui-co_a46fe3'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , EBS_UAR_574070'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170_2'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i_2'))
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (22)'),
//	'KATADMIN')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (22)'),
//	'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (16)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (3)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (8)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification_a-TreeView-label (1)'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/input_User Access_userAccessReport_search_field (2)'),
//	'EBS_UAR_25092025')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_User Access_userAccessReport_search_button (1)'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/td_Verified_u-tC'),
//	'Completed')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Environment Name_reportLink (1)'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_EBS_UAR_25092025_232457_t-Report-cell'),
//	'Completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Anandkumar Venkataraman_t-Report-cell'),
//	'Completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Maria B_t-Report-cell'),
//	'Completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Completed_t-Report-cell'),
//	'EBizApp_JDBC_Env')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Completed_t-Report-cell_1'),
//	'EBizApp_JDBC_Env')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Access Certification_t-Breadcrumb-label (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , EBS_UAR_1afdf6 (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Access Certification_a-TreeView-label'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/input_GET Status Report_mngSnap_search_field'),
//	'EBS_UAR_25092025')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_GET Status Report_mngSnap_search_button'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/td_Completed_u-tL'),
//	'Pending')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_concat(Row text contains , , EBS_UAR_1afdf6'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
//End of EACM Old
//select terminate access
WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Access Groups/button_Map Roles (CSV)_B149605989596714417'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Cancel_B149607375770714431'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Actions_a-IRR-noDataMsg-text'), 
    'No data found for the current selection', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/button_Previous_B149608377236714441'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/span_Actions_a-IRR-noDataMsg-text_1'), 
    'No data found for the current selection', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles Mapping/a_Setup_t-Breadcrumb-label'))

WebUI.closeBrowser()

