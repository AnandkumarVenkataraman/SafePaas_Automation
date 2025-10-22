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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (28)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (48)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (48)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (26)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (46)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage My Access_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Setup_a-TreeView-label (2)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Network Users/a_Manage Network Users_a-TreeView-label'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/input_Application Object Library_f01'), 
    0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/a_Manage Role Groups_a-TreeView-label (2)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/input_Role Groups in Scope_R160504369387363_a4a4ab (1)'), 
    'Application Object Library')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_Role Groups in Scope_R16050436938736_69f9c9'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/input_Procurement Administration_f01'), 
    0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/span_Scope Roles_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Access Group/span_Assign Access Group_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Risk Level/span_Application Object Library_t-Tabs-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/button_concat(Row text contains , , Applica_3bf12f'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scope Roles/a_Scope Roles_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/input_Role Groups in Scope_R321655022960176_80ff4e (1)'), 
    'Application Object Library')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_Role Groups in Scope_R32165502296017_fe7366'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/span (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Scope Roles_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/button_concat(Row text contains , , Applica_3bf12f'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/select_Environment_P0_ENVIRONMENT (1)'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Approval Assignments/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (46)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage My Access_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Approval Assignments_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Primary_t-Report-cell'), 
    'Manager')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Manager_t-Report-cell'), 
    'All')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_All_t-Report-cell'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Primary_t-Report-cell_1'), 
    'Role Group Primary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Role Group Primary Owner_t-Report-cell'), 
    'All')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_All_t-Report-cell_1'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Primary_t-Report-cell_2'), 
    'Role Group Secondary Owner')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Role Group Secondary Owner_t-Report-cell'), 
    'Violations Only')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/td_Violations Only_t-Report-cell'), 
    'Y')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Maintain Approval Hierarchy/a_Maintain Approval Hierarchy_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Access Groups/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Access Groups/a_Manage Access Groups_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Risk Levels/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Risk Levels/a_Manage Risk Levels_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/input_Create_R465831610254120584_search_field (1)'), 
    'KTLN_ADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_Create_R465831610254120584_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/img_KTLN_ADMIN_apex-edit-page (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/button_Security_B169711200053710253'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_concat(Row text contains , , KTLN_AD_0067e2'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/input_Create_R465831610254120584_search_field (1)'), 
    'EIA_readOnlyRole')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_Create_R465831610254120584_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/img_KTLN_ADMIN_apex-edit-page (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/button_Security_B169711200053710253'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/button_concat(Row text contains , , KTLN_AD_0067e2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EIA Roles/a_Manage EIA Roles_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/input_Create_R337071569893878378_search_field (1)'), 
    'ANANDK1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/button_Create_R337071569893878378_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/td_ANANDK1_u-tC'), 
    'EIA_readOnlyRole')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/img_ANANDK1_apex-edit-page (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Assign Roles/button_User_B169812026252345796'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/button_concat(Row text contains , , ANANDK1_5922d3 (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/input_Create_R337071569893878378_search_field (1)'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/button_Create_R337071569893878378_search_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/td_KATADMIN_u-tC'), 
    'KTLN_ADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/img_ANANDK1_apex-edit-page (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Assign Roles/button_User_B169812026252345796'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/button_concat(Row text contains , , ANANDK1_5922d3 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EIA Roles/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

