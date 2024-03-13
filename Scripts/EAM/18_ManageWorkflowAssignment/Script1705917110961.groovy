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

WebUI.setText(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/a_Manage Approval Assignments'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Home/a_Manage Approval Assignments'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AP'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AR'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AR'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_GL'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_GL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_HCM'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_HCM'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/input_p_ignore_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'), 
    'PRIMARY_OWNER', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'), 
    'SECONDARY_OWNER', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AM_1 - 112'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AM_1 - 112'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary owner'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary owner'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'), 
    '410481791002382624', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'), 
    '410481866744382625', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'), 
    '410481866744382625', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'NN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Save - 33'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Save - 33'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/td_MCD_HRPY_HR_SPECIALISTS_PROCESS_SUPPORT__303a9d'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AP - 000'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AP - 000'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AP_1 - 113'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AP_1 - 113'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary owner'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary owner'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/td_HR_SPECIALIST_VIEWALL_DATA'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AR'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AR'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AR_1 - 116'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_AR_1 - 116'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary owner'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary owner'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/td_MCD_POR_PROCUREMENT_CATALOG_ADMINISTRATO_3d8cf3'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_GL'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_GL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_GL_1 - 117'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_GL_1 - 117'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary owner'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary owner'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/td_MCD_ZX_TAX_ANALYST_JOB_CUSTOM'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 60'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 60'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Manage Approval Assignments - 115'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_HCM'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_HCM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_HCM_1 - 118'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/a_RoleGroup_HCM_1 - 118'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary owner'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary owner'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners - 22'))

WebUI.click(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/td_MCD_FUN_FINANCIAL_APPLICATION_ADMINISTRA_c305ce'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner (1)'))

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

