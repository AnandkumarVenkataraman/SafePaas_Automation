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

WebUI.setText(findTestObject('Object Repository/deba1/RoleGroups/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/RoleGroups/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/RoleGroups/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Home/a_Manage Company (1)'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Home/a_Manage Company (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Company/label_Workflow Approval'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Company/span_Yes'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Company/label_Products'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Company/label_Products'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Company/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Company/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Company/a_Manage Role Groups'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Company/a_Manage Role Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Role Groups/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Role Groups/td_RoleGroup_AM'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Role Groups/td_RoleGroup_AP'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Role Groups/td_RoleGroup_AR'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Role Groups/td_RoleGroup_GL'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Role Groups/td_RoleGroup_HCM'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Role Group  RoleGroup_AM'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AM_1 - 132'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AM_1 - 132'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/td_KTLN_EAM_USER1 Katalon Eam-User1'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/td_DPATEL Debabrata Patel'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'), 
    '410481791002382624', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_a-Button a-Toolbar-item a-Button--wi_a92de3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role CodePrimary OwnerRole NameSecon_1dffbe'), 
    '410481866744382625', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'NN', true)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/button_Save - 103'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/button_Save - 103'))

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 
    0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.click(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Select any oneCERP_1CloudERPEBizApp__c5e50a'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AP'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AP_1 - 142'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AP_1 - 142'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/td_KTLN_EAM_USER1 Katalon Eam-User1'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/td_DPATEL Debabrata Patel'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner is not empty'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner is not empty'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 
    0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.click(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AR'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AR'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AR_1 - 152'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_AR_1 - 152'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/td_KTLN_EAM_USER1 Katalon Eam-User1'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/td_DPATEL Debabrata Patel'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 
    0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.click(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_GL'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_GL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   50'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   50'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_51 -                   60'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_51 -                   60'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_GL_1 - 162'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_GL_1 - 162'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary owner (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary owner (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner is not empty'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner is not empty'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 
    0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 60'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 60'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.click(findTestObject('deba1/Rough/Page_Home/a_Manage Approval Assignments - 7867'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/select_Role GroupDescriptionRolePrimary own_473961'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/buttonR570861162460345007_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_HCM'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_HCM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_1 -                   45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_HCM_1 - 172'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_RoleGroup_HCM_1 - 172'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary owner (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary owner (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Assign Role Owners_890'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner is not empty'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner is not empty'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Primary Owner'), 
    0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Secondary Owner'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_Manage Approval Assignments/span_Total 45'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_SOD Review Configuration - 901'))

WebUI.click(findTestObject('deba1/RoleGroups/Page_Manage Approval Assignments/a_SOD Review Configuration - 901'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_SOD Review Configuration/label_Mandatory required number of responses'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_SOD Review Configuration/label_Remediate Actions (Value Required)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba1/RoleGroups/Page_SOD Review Configuration/label_Remediate Actions (Value Required)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/RoleGroups/Page_SOD Review Configuration/label_EAM Survey Authentication'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.closeBrowser()

