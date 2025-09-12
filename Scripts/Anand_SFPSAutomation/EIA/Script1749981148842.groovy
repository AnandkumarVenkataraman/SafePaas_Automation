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

String envName = 'EBizApp_JDBC_Env'
int a = 1

CustomKeywords.'Helper.login'()

//EIA Setups
//WebUI.takeFullPageScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company (4)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/div_Enterprise iAccess'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Create_R258165063082313757_search_field'), 
    envName)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_Go'))
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_A'), 'A')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/img_Link_apex-edit-pencil'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/select_Select any oneManual ProvisioningAut_6c8926'), 
    'Select any one\nManual Provisioning\nAuto Provisioning')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/label_Role'), 
    10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/label_API Enabled'), 
    10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/label_API Enabled_u-checkbox'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_Enterprise iAccess'), 
    'Enterprise iAccess')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_NA'), 'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_No'), 'No')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_NA'), 'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_No'), 'No')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_NA'), 'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_No'), 'No')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_Immediately'), 
    'Immediately')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/td_1'), '1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/img_Link_apex-edit-pencil'))
WebUI.takeScreenshot()
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Environment/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Environment/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(Row text contains , , EBizApp_4f016a'))

//Manage Network Users, Role Groups, Scope Roles
//Manage Approval Assignments, and Maintain Approval Hierarchy

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/span_Certification Configuration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/span_Manage My Access_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_Manage Network Users'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'),
	2)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/input_Schedule_usersIg_ig_toolbar_search_field'),
	'AALLEN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/button_Go'))
WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_AALLEN'), 'AALLEN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_Arlene'), 'Arlene')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_Allen'), 'Allen')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_123451'), '123451')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_anandkumar.venkataramansafepaas.com'),
	'anandkumar.venkataraman@safepaas.com')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_JCAREY'), 'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_Joseph'), 'Joseph')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_carey'), 'carey')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_anandkumar.venkataramansafepaas.com'),
	'anandkumar.venkataraman@safepaas.com')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_N'), 'N')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_XYZ'), 'XYZ')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/td_ABC'), 'ABC')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/button_concat(Search for , , AALLEN, , )_a-_3ca462'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/a_Manage Role Groups'))
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/a_Scope Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/input_Role Groups in Scope_R160504369387363_a4a4ab'),
	'HCM')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Go'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/a_HCM'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Scope All'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Submit'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Update successfully processed_t-Butt_229ed8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/span_Role Groups in Scope'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_concat(Row text contains , , HCM, , _58fd24'), FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/input_Role Groups in Scope_R160504369387363_a4a4ab'),
	'Purchasing')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Go'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/a_Purchasing'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Scope All'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Submit'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Update successfully processed_t-Butt_229ed8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/span_Role Groups in Scope'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_concat(Row text contains , , HCM, , _58fd24'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/input_Role Groups in Scope_R160504369387363_a4a4ab'),
	'Procurement')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Go'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/a_Procurement'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Scope All'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Submit'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Update successfully processed_t-Butt_229ed8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/span_Role Groups in Scope'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_concat(Row text contains , , HCM, , _58fd24'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/a_Manage Approval Assignments'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R321655022960176_80ff4e'),
	'HCM')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Go (1)'))
WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes'),
	'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes'),
	'Yes')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_HCM'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATADMIN Kat Admin (1)'),
	'KATADMIN Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATALON_ADMIN Katalon Admin'),
	'KATALON_ADMIN Katalon Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_HCM'),
	'HCM')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/span_HCM'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Assignments (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , HCM, , _58fd24'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R321655022960176_80ff4e'),
	'Purchasing')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Purchasing'),
	'Purchasing')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes'),
	'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes'),
	'Yes')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Purchasing'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATADMIN Kat Admin (1)'),
	'KATADMIN Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATALON_ADMIN Katalon Admin'),
	'KATALON_ADMIN Katalon Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Purchasing_1'),
	'Purchasing')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATADMIN Kat Admin (1)'),
	'KATADMIN Kat Admin')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/span_Purchasing'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Assignments (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , HCM, , _58fd24'), FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R321655022960176_80ff4e'),
	'Procurement')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Go (1)'))
WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Procurement'),
	'Procurement')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes'),
	'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Yes'),
	'Yes')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Procurement'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Procurement'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_Procurement_1'),
	'Procurement')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATADMIN Kat Admin (1)'),
	'KATADMIN Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/td_KATALON_ADMIN Katalon Admin'),
	'KATALON_ADMIN Katalon Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Manage Approval Assignments (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , HCM, , _58fd24'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Maintain Approval Hierarchy'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_1'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Primary'),
	'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Manager'),
	'Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_All'),
	'All')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Y'),
	'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_2'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Primary'),
	'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Role Group Primary Owner'),
	'Role Group Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_All'),
	'All')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Y'),
	'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_3'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Primary'),
	'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Role Group Secondary Owner'),
	'Role Group Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_All'),
	'All')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Y'),
	'Y')
WebUI.takeScreenshot()

//Create User

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/a_Manage My Access'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/input_Search_a-PopupLOV-search apex-item-text'),
	'MARIAB11')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Search_a-Button a-PopupLOV-doSearch'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_MARIAB11 - Maria11 Brum11'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_JCAREY'), 'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/span_anandkumar.venkataramansafepaas.com'),
	'anandkumar.venkataraman@safepaas.com')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Create'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/input_Role Group  Role_text_field apex-item-text'),
	'JP_HRMS_MANAGER')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/select_Purchasing  Self Service for ZA Employees'),)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_MARIAB11 - Maria11 Brum11'),
	30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_Maria11 Brum11'),
	30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_Self Service for ZA Employees'),
	30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_Responsibility'),
	30)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_-'),
	'-')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/button_Submit'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/h2_Request Submitted.  The approval process_582058'),
//	30)

////Ignore below
////WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/h2_Request Submitted.  The approval process_582058'),
////	'Request Submitted. The approval process has been initiated.')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Request Submitted.The approval proce_743d42'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))
//
//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/input_Search_a-PopupLOV-search apex-item-text'),
//	'MARIAB11')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Search_a-Button a-PopupLOV-doSearch'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_MARIAB11 - Maria11 Brum11'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Go'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Create'))
//WebUI.delay(2)
////Ignore below
////WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_A request to create this user has alread_bc245c'),
////	30)
//
////Ignore below
////WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_A request to create this user has alread_bc245c'),
////	'A request to create this user has already been submitted and is currently in progress. Please wait for the workflow to complete or contact your administrator for further assistance')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Request Submitted.The approval proce_743d42'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/button_Submit for Violation Testing (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/h2_Request Submitted. Please check after sometime (1)'),
	10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Request Submitted. Please check afte_fe3187 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/p_Violation check in progress, the Submit A_b77072 (1)'),
	'Violation check in progress, the Submit Access button will be enabled upon completion and click on Refresh button.')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Refresh (1)'), FailureHandling.OPTIONAL)

WebUI.delay(30)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Refresh (1)'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Submit Access Request (1)'), 300)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Submit Access Request (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/h2_Access Request Submitted. Please check a_f71769 (1)'),
	10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Create (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/li_A request to create this user has alread_bc245c (1)'),
	10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Cancel'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_katadmin'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (13)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (13)'),
	'JCAREY')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (13)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Begin Date'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Documentation_a-Button a-IRR-button _ce8d41'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field'),
	'MARIAB11')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (1)'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_The user creation and access requests for_e3aa10'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Approve'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_1-Manager'),
	'1-Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Primary'),
	'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Responsibility'),
	'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_KATADMIN'),
	'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Maria11 Brum11 - MARIAB11'),
	'Maria11 Brum11 - MARIAB11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Self Service for ZA Employees'),
	'JP HRMS Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_SSHR V4 for ZA Employees'),
	'JP HRMS Manager definition')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_NA'), 'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_In Approval Progress'),
	'In Approval Progress')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS'),
	'Test approve at Level-1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_Submit'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , MARIAB1_d70a52'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_User Access Request Review Success'),
	'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_jcarey'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (13)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (13)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (13)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Begin Date'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Documentation_a-Button a-IRR-button _ce8d41'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field'),
	'MARIAB11')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (1)'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_The user creation and access requests for_e3aa10_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_2-Primary Owner'),
	'2-Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Primary'),
	'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Responsibility'),
	'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_KATADMIN'),
	'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Maria11 Brum11 - MARIAB11'),
	'Maria11 Brum11 - MARIAB11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Self Service for ZA Employees'),
	'JP HRMS Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_SSHR V4 for ZA Employees'),
	'JP HRMS Manager definition')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_NA'), 'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_In Approval Progress'),
	'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Reject'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS'),
	'Test reject at Level-2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_User Access Request Review Success'),
	'User Access Request Review Success!')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , MARIAB1_d70a52'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle'))
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Workflow'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d (1)'),
	3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Coupa_Env1EBizA_03e9aa'),
	2)

//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow_wfReport_search_field'),
//	'MARIAB11')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Go (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_concat(Row text contains , , MARIAB1_d70a52'))

WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow_wfReport_search_field'),
	'Maria11')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_NA (1)'), 'N/A')
WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_EIA - Create User and Access Request WF _b7e1fb'),
	'EIA - Create User and Access Request WF - Level 2')
WebUI.delay(2)
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Access to Self Service for ZA Employees f_0d95e8'),
//	'Access to Self Service for ZA Employees for Maria11\nBrum11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_Completed'), 'Completed')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/pre_Rejected by KATADMIN Kat Admin'),
	'Rejected by: KATADMIN Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_KATADMIN'), 'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_concat(Row text contains , , MARIAB1_d70a52'), FailureHandling.OPTIONAL)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/span_Help_a-TreeView-toggle'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/span_Certification Configuration_a-TreeView-toggle'))
//
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Coupa_Env1EBizA_d51d0f (1)'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d (3)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Breadcrumbs_t-Button t-Button--noUI _fee11d (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (13)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise iAccess_a-TreeView-toggle'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/span_Enterprise iAccess_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Request Status'))
WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'),
	2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Requested date'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Documentation_a-Button a-IRR-button _ce8d41'))
//WebUI.delay(2))
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/input_Request Status_R162628977986491037_se_82c5b2'),
	'MARIAB11')

WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_MARIAB11'), 'MARIAB11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Maria11 Brum11'),
	'Maria11 Brum11')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary'), 'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Manager'), 'Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y'), 'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_JCAREY'), 'JCAREY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Joseph Carey'), 'Joseph Carey')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Primary'), 'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Role Group Primay Owner'),
	'Role Group Primay Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Y'), 'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_KATADMIN'), 'KATADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_KATADMIN Kat Admin'),
	'KATADMIN Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Approved'), 'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Test approve at Level-1'),
	'Test approve at Level-1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_CREATE'), 'CREATE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Rejected'), 'Rejected')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Test reject at Level-2'),
	'Test reject at Level-2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_Pending'), 'Pending')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/td_CREATE'), 'CREATE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/button_concat(Row text contains , , MARIAB1_d70a52'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'),
	0)
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox'))

//Update User

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (4)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (15)'), 'KAT')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (15)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (15)'),
	'AGUERIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (15)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage My Access'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Request New Access'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/input_Role Group  Role_text_field apex-item-text (1)'),
	'JP_HRMS_Manager')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/select_Purchasing  JP HRMS Manager'),
	)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Selection/button_Next (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/span_Entry name'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/input_Search_grid_ig_column_header_search'),
	'JP_HRMS_Manager')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/input_Search_grid_ig_column_header_search'),
	Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_AGUERIN - Anne Gurin'),
	30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_JP HRMS Manager'),
	30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/td_Responsibility (1)'),
	30)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/button_Entry name contains JP HRMS Manager__5db4f7'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/h2_Request Submitted. Please check after sometime'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Request Submitted. Please check afte_fe3187'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/p_Violation check in progress, the Submit A_b77072'),
	20)


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Refresh'), FailureHandling.OPTIONAL)
//WebUI.delay(120)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Refresh'))
//WebUI.delay(120)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Submit Access Request'), 300)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Violations/button_Submit Access Request'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/h2_Access Request Submitted. Please check a_f71769'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/input_Current Roles_R250949771385399638_sea_5381de'),
	'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_Go (1)'))

//WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_JP HRMS Manager'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/div_GoActions'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/td_Responsibility'),
	'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_In Approval Progress'),
	'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/button_concat(Row text contains , , In Appr_d8e81d'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage My Access/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_aguerin'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout_1 (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (15)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (15)'),
	'JCAREY')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (15)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Begin Date (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Last Hour (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (2)'),
	'AGUERIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (3)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (2)'),
	'access request')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_A new access request for user AGUERIN has_87cd2a'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_1-Manager (1)'),
	'1-Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Primary (1)'),
	'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Responsibility provision'),
	'Responsibility provision')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_AGUERIN'),
	'AGUERIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Gurin, Mrs. Anne'),
	'Guérin, Mrs. Anne')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_NA (1)'),
	'N/A')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_JP HRMS Manager'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/label_Approve (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/textarea_Review Comments_P23_COMMENTS (1)'),
	'Test approve at Level-1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/button_Submit (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/h2_User Access Request Review Success (1)'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_User Access Request Review Success_t_e28262 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AGUERIN_d8c490'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AGUERIN_d8c490'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AGUERIN_d8c490'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_jcarey (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout_1_2'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (15)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (15)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (15)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Begin Date (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Last Hour (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (2)'),
	'AGUERIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (3)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Inbox_R163105974055422926_search_field (2)'),
	'access request')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_A new access request for user AGUERIN has_87cd2a_1'))

//WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_2-Primary Owner (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_2-Primary Owner (1)'),
	'2-Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Primary (1)'),
	'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Responsibility provision'),
	'Responsibility provision')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_AGUERIN'),
	'AGUERIN')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_Gurin, Mrs. Anne'),
	'Guérin, Mrs. Anne')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_JP HRMS Manager'),
	20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_JP HRMS Manager definition'),
	20)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_NA (1)'),
	'N/A')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/span_In Approval Progress (1)'),
	'In Approval Progress')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Review Access Request/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AGUERIN_d8c490'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AGUERIN_d8c490'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_concat(Row text contains , , AGUERIN_d8c490'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Company Settings_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Workflow (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d (2)'),
	3)
WebUI.delay(2)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Coupa_Env1EBizA_d51d0f'),
	2)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Created Date'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Created Date'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Documentation_a-Button a-IRR-button _1a154e'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/input_Manage Workflow_wfReport_search_field (1)'),
	'AGUERIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/i_NA_fa fa-wrench'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select any -CancelReassignEscalationReminder'),
	'Cancel', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/textarea_(Value Required)_P35_ACTION_COMMENTS'),
	'Test cancel at level-2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/h2_The cancellation process has been initia_605824'),
	20)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Breadcrumbs_t-Button t-Button--noUI _fee11d'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/td_Cancelled'), 'Cancelled')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/pre_Canceled at approval level 2'),
	'Canceled at approval level: 2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Access to JP HRMS Manager for Gurin Mrs. Anne'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/select_Select any oneCoupa_Env1EBizApp_JDBC_20e010'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Request Status/a_Inbox (1)'))

//Deactivate User


//Security

WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage My Access_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage EIA Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/input_Create_R465831610254120584_search_field'),
	'KTLN_Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/img_KTLN_Admin_apex-edit-page'))
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/button_Cancel (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_concat(Row text contains , , KTLN_Ad_9ae507'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/input_Create_R465831610254120584_search_field'),
	'readOnlyRole')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/img_KTLN_Admin_apex-edit-page'))
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/button_Cancel (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_concat(Row text contains , , KTLN_Ad_9ae507'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/a_Assign EIA Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/input_Create_R337071569893878378_search_field'),
	'ANANDK1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/img_ANANDK1_apex-edit-page'))
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Assign Roles/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/button_concat(Row text contains , , ANANDK1_5922d3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/button_katadmin'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (16)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (16)'),
	'ANANDK1')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (16)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (15)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage My Access (1)'))
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_/button_OK'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_anandk1 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (5)'))

WebUI.closeBrowser()
