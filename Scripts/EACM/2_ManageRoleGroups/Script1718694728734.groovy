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

WebUI.setText(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Login/input_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/a_Manage Role Groups'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/a_Manage Role Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/a_Scope Roles'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/a_Scope Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Test_RoleGroup1'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Test_RoleGroup1'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Scope History'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Scope History'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Detail'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Detail'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'), 
    'SCOPE_FLAG', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127'), 
    '!=', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/buttonscopeRoles_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/buttonscopeRoles_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Y'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/a_Y'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/span_a-Icon icon-irr-no-results'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/span_a-Icon icon-irr-no-results'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/input_p_ignore_10'), 'Mass Role Update')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/span_a-Icon icon-irr-no-results'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/Scope Roles/Page_Scope Roles/span_a-Icon icon-irr-no-results'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/a_Manage Approval Assignments'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Home/a_Manage Approval Assignments'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Scope Roles/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Scope History'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Scope History'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Detail - 436'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Detail - 436'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_ui-button-icon ui-icon ui-icon-closethick'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_ui-button-icon ui-icon ui-icon-closethick'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'), 
    'SCOPE_FLAG', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'), 
    '!=', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR485447514490922889_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/buttonR485447514490922889_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Y'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Y'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_a-Icon icon-irr-no-results'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_a-Icon icon-irr-no-results'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Test_RoleGroup1 - 437'))

WebUI.click(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Test_RoleGroup1 - 437'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupPrimary ownerSecondary owner'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupPrimary ownerSecondary owner'), 
    '325277596476686912', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupPrimary ownerSecondary owner'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role GroupPrimary ownerSecondary owner'), 
    '325277832785686914', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Save - 438'))

WebUI.click(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Save - 438'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Assign Role Owners'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Actions_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Filter_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role NameRole DescriptionPrimary Own_3796d0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role NameRole DescriptionPrimary Own_3796d0'), 
    '325068143032960506', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b_1'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3 - 440'))

WebUI.click(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3 - 440'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role NameRole DescriptionPrimary Own_3796d0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_Role NameRole DescriptionPrimary Own_3796d0'), 
    '325068218774960507', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b_1'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Save - 441'))

WebUI.click(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/button_Save - 441'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Primary Owner'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/span_Secondary Owner'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Certification Configuration - 442'), 
    0)

WebUI.verifyElementClickable(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Certification Configuration - 442'))

WebUI.click(findTestObject('EACM/ManageApprovalAssignments/Page_Manage Approval Assignments/a_Certification Configuration - 442'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.closeBrowser()

