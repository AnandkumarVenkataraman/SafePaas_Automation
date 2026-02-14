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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (8)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (28)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (28)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (6)'))

//Actions
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Detect Violations_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Remediate Violations_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_(Value Required)_P122_ENVIRONMENT'), 
    27)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_(Value Required)_P122_REQUEST_NAME'), 
    1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/button_Test Name_P122_LOAD'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_Remediation_P122_EXCEPTION_TYPE'), 
    11)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_Remediation_P122_EXCEPTION_TYPE'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_Remediation_P122_EXCEPTION_TYPE'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_Remediation_P122_EXCEPTION_TYPE'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_(Value Required)_P122_REQUEST_NAME_1'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/select_(Value Required)_P122_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Remediate Issues/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

//Manage Corrective Actions

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (22)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (13)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Detect Violations_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Actions_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/select_Environment_P0_ENVIRONMENT'),
	27)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/a_Actions_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/button_Documentation_a-Button a-IRR-button _ce8d41'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_Actions_u-tL'),
	'Test Rule 4', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_Test Rule 4_u-tL'),
	'User Role Name -> Akhil : MCD Project Business Analyst[MCD_PJF_PROJECTS_APPLICATION_ADMINISTRATOR_JOB_CUSTOM1]', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_Test Rule 4_u-tL_1'),
	'All User Roles Violations V1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_All User Roles Violations V1_u-tL'),
	'27-SEP-25', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_-_u-tL'),
	'Approved', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_-_u-tL_1'),
	'Approved', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_All User Violations V1_u-tL'),
	'27-SEP-25', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_User Name - svcerpintgusr_u-tL'),
	'All User Violations V1', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_Test Rule 3_u-tL'),
	'User Name -> svcerpintgusr', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/td_All User Roles Violations_u-tL'),
	'Test Rule 3', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/img_Actions_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Modify Corrective Action/button_Modify Actions_B173567247489232319'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/img_All User Roles Violations_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Modify Corrective Action/button_Modify Actions_B173567247489232319'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/select_Environment_P0_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Corrective Action/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

//Verify in Violations by User report, after SOD Test

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (23)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (14)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (12)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Review Actions Details_a-TreeView-label (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Environment_P86_ENVIRONMENT (1)'),
	27)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Test Name_P86_TEST_NAME (1)'),
	1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Exception Status_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Search_a-IRR-sortWidget-row (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_1'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_High_u-tL'),
	0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN_u-tL'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_concat(Remediation Status  , , All U_988a96'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Exception Status_a-IRR-headerLink'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Search_a-IRR-sortWidget-row_1'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_2'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_3'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_High_u-tL_1'),
	0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/td_OPEN_u-tL_1'),
	0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/button_concat(Remediation Status  , , All U_988a96'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Test Name_P86_TEST_NAME (1)'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/select_Environment_P86_ENVIRONMENT (1)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Violation Report/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (7)'))

WebUI.closeBrowser()