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

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY (2)'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (17)'), 'katalon_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD (18)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle (13)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_iAccess_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Dashboard_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Analytics_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Violations by User Report (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_39110f (1)'), 
    '5888', true)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/li_SODTST_FFP_ALL_22102025 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Rows Per Page'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/div_1'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Medium (62) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_High (1718) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Low (60) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/input_High (1718)_P86_F_RISK_LEVEL_2'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_High (1718) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Medium (62) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Procurement Cards Rule (62) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Inventory Rule2 (1718) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Ebiz_Enter_Employees_Total_Compensation (60) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/input_Depreciation vs. Inventory Rule2 (171_50e43d (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Inventory Rule2 (1718) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Procurement Cards Rule (62) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotAALLENquot (53) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotJPALMERquot (48) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotRWOHLquot (42) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/input_quotJPALMERquot (48)_P86_F_USER_NAME_2'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotJPALMERquot (48) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotAALLENquot (53) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_39110f (1)'), 
    '9028', true)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/li_SODTEST_COUPA_SEPT14_V1 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2) (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2)_1 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/input_PERMISSION (2)_P86_F_EXCEPTION_STATUS_1 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Coupa_SODReview_1 (4)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_OPEN (31)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_OPEN (31)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Coupa_SODReview_1 (4)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Schedule (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_SafeInsight_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_Company Settings_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/a_Scheduled Downloads (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/td_EAM_VIOLATION_BY_USERS_REPORT_Coupa_Env1_80199a'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/i_KATALON_ADMIN_fa fa-download (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/img_Inbox_AppLogoIco'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Page 1/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Page 1/a_Logout'))

WebUI.closeBrowser()

