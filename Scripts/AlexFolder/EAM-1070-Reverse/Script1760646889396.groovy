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

WebUI.doubleClick(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY (10)'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY (10)'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (10)'), 'katadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD (11)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn (10)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle (6)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Access Monitor_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Roles Manager_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Manage Remediation Plan_a-TreeView-label (2)'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/input_Create_R280401820724216822_search_field (1)'), 
    'test1070kat')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/button_Create_R280401820724216822_search_button (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/img_Last Updated By_apex-edit-page (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/span_Mitigation Details_t-Tabs-label (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/input_Actions_select-all (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Assigned Monitors_B303317800274999335 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/span_Breadcrumb_t-Tabs-label (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/button_Cancel_B303287507566288580 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/button_Cancel_js-confirmBtn ui-button ui-co_d9a936 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/a_Manage Mitigations_a-TreeView-label (1)'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field (1)'), 
    'ktln')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_ktln_apex-edit-page (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758 (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490 (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Read only access_fa7825 (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474 (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_EAM_apex-edit-page (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474 (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Custom role created successfully_t-B_fa22bb (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/button_Inbox_L14205299837764170 (18)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_My Profile_menu_L14205299837764170_1i (19)'))

WebUI.closeBrowser()

