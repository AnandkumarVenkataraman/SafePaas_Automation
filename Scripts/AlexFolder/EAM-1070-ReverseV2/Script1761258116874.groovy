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

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY (15)'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (15)'), 'katadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD (16)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn (15)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle (11)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Access Monitor_a-TreeView-toggle (7)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Roles Manager_a-TreeView-toggle (7)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Manage Remediation Plan_a-TreeView-label (7)'))


WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/input_Create_R280401820724216822_search_field (3)'), 
    'TESTQA')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/button_Create_R280401820724216822_search_button (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/img_Last Updated By_apex-edit-page (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/span_Mitigation Details_t-Tabs-label (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/input_Actions_select-all (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Assigned Monitors_B303317800274999335 (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/span_Breadcrumb_t-Tabs-label (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/button_Cancel_B303287507566288580 (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/button_Cancel_js-confirmBtn ui-button ui-co_d9a936 (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/a_Manage Mitigations_a-TreeView-label (4)'))


WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field (4)'), 
    'ktl')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button (4)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_ktl_apex-edit-page (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758 (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758 (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758 (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490 (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490 (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490 (5)'))

WebUI.doubleClick(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Read only access_fa7825 (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Read only access_fa7825 (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474 (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_EAM_apex-edit-page (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474 (5)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Custom role created successfully_t-B_fa22bb (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (4)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/button_Inbox_L14205299837764170 (20)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_My Profile_menu_L14205299837764170_1i (22)'))

WebUI.closeBrowser()
