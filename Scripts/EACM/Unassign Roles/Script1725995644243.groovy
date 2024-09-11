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

WebUI.setText(findTestObject('Object Repository/Unassign Roles/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Unassign Roles/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Unassign Roles/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Home/span_Access Certification_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Home/a_Scope Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Unassign Roles/Page_Scope Access/select_Select any oneEBizApp_JDBC_EnvGRM_CE_9f6977'), 
    'KTLN_CloudERP', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Access/a_RoleGroup_GL'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Access/a_RoleGroup_GL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/span_Filter'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'), 
    'ROLE_NAME', false)

WebUI.setText(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/input_Expression_p_ignore_10'), 'MCD_PJF_PROJECT_ACCOUNTANT_JOB_CUSTOM2')

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Apply'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/input_Last Updated By_f01'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/input_Last Updated By_f01'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Unassign Role'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Unassign Role'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_OK'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_concat(Row text contains , ,  MCD_PJ_1e9d5a'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_concat(Row text contains , ,  MCD_PJ_1e9d5a'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Roles(s) unassigned successfully_t-B_d49df6'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/a_Scope Access'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/a_Scope Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Access/a_RoleGroup_Other'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Access/a_RoleGroup_Other'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/span_Filter'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'), 
    'ROLE_NAME', false)

WebUI.setText(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/input_Expression_p_ignore_10'), 'CE_CASH_MANAGER_JOB_CUSTOM')

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Apply'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/input_Last Updated By_f01'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/input_Last Updated By_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Unassign Role'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Unassign Role'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_OK'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_concat(Row text contains , ,  MCD_PJ_1e9d5a'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_concat(Row text contains , ,  MCD_PJ_1e9d5a'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Roles(s) unassigned successfully_t-B_d49df6'))

WebUI.click(findTestObject('Object Repository/Unassign Roles/Page_Scope Roles/button_Roles(s) unassigned successfully_t-B_d49df6'))

