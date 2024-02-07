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

WebUI.setText(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Login/input_P101_COMPANY (1) (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Login/input_P101_USERNAME (1) (1)'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Login/input_P101_PASSWORD (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/a_Manage Role Groups (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Home/a_Manage Role Groups (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Manage Role Groups/a_Scope Roles'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Manage Role Groups/a_Scope Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_RoleGroup_AM (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_RoleGroup_AM (1) (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Scope History'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Scope History'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Detail (1) - 301 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Detail (1) - 301 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Detail (1) - 301 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_ui-button-icon ui-icon ui-icon-closethick (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_ui-button-icon ui-icon ui-icon-closethick (1) (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'), 
    'SCOPE_FLAG', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'), 
    '!=', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/buttonscopeRoles_expression_icon_link (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/buttonscopeRoles_expression_icon_link (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Y (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Y (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/input_p_ignore_10 (1) (1)'), 'Mass Role Update')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_No data found for the current role group (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1) (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_Scope Roles (1) (1) - 450'))

WebUI.click(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_Scope Roles (1) (1) - 450'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_Select any oneCERP_1CloudERPEBizApp__c5e50a (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_Select any oneCERP_1CloudERPEBizApp__c5e50a (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_RoleGroup_Other (1) - 451'))

WebUI.click(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_RoleGroup_Other (1) - 451'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Scope History'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Scope History'), 0)

WebUI.scrollToElement(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_Detail (1) - 301 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_Detail (1) - 301 (1)'), 0)

WebUI.verifyElementClickable(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_Detail (1) - 301 (1)'))

WebUI.click(findTestObject('EACM/ManageRoleGroup/Page_Scope Roles/a_Detail (1) - 301 (1)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_ui-button-icon ui-icon ui-icon-closethick (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_ui-button-icon ui-icon ui-icon-closethick (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Filter (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'), 
    'SCOPE_FLAG', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'), 
    '!=', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/buttonscopeRoles_expression_icon_link (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/buttonscopeRoles_expression_icon_link (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Y (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/a_Y (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_a-Icon icon-irr-no-results (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_a-Icon icon-irr-no-results (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Filter (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d (1) (1)'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127 (1) (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/input_p_ignore_10 (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/input_p_ignore_10 (1) (1)'), 'Mass Role Update')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.click(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/button_Apply (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_a-Icon icon-irr-no-results (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/ManageRoleGroup/Page_Scope Roles/span_a-Icon icon-irr-no-results (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

