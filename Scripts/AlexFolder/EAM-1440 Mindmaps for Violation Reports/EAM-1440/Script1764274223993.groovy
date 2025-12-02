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

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Fall 2025_P101_COMPANY (1)'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (16)'), 'KATAlon_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD (17)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle (12)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Dashboard_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Violations by User Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_39110f'), 
    '5888', true)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/li_SODTST_FFP_ALL_22102025'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_1'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Medium (62)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_1 -                    1 of           _704a7a'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_High (1718)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_1 -                    1 of           _b8d5b2'))

WebUI.doubleClick(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_1 -                    1 of           _b8d5b2'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Low (60)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Procurement Cards Rule (62)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Inventory Rule2 (1718)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Ebiz_Enter_Employees_Total_Compensation (60)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/input_Depreciation vs. Inventory Rule2 (171_50e43d'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Inventory Rule2 (1718)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Inventory Rule2 (1718)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Ebiz_Enter_Employees_Total_Compensation (60)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotAALLENquot (53)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotJPALMERquot (48)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotRWOHLquot (42)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotNAVEEN4quot (36)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotLASMITHquot (36)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Ebiz_Enter_Employees_Total_Compensation (60)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Inventory Rule2 (1718)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_Depreciation vs. Procurement Cards Rule (62)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotNAVEEN4quot (36)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotLASMITHquot (36)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotRWOHLquot (42)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotJPALMERquot (48)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_quotAALLENquot (53)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_OPEN (1840)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_OPEN (1840)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_39110f'), 
    '9028', true)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/li_SODTEST_COUPA_SEPT14_V1'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_1 -                    1 of           _d1c19b'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2)_1'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2)_1'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/input_PERMISSION (2)_P86_F_EXCEPTION_STATUS_1'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_PERMISSION (2)_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/select_Select any oneCoupa_Env1EBizApp_JDBC_39110f'), 
    '7408', true)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Test Name_P86_TEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/li_SODTEST_06102025'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_All User Roles Violations (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_1 -                    1 of           _e353a0'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_All User Violations (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_1 -                    1 of           _e1cc31'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/label_OPEN (82)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_1 -                    1 of           _3d8d96'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_ShowHide Filters'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/button_Schedule'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_SafeInsight_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/span_Company Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_User Violation Report/a_Scheduled Downloads'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/div_Scheduled DownloadsGoActionsSP Componen_2bdc43'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/td_EAM_VIOLATION_BY_USERS_REPORT_Test_Envir_ddbd2d'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/i_KATALON_ADMIN_fa fa-download'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/button_OK'))

WebUI.closeBrowser()

