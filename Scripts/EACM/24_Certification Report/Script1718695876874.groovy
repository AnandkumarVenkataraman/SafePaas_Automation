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

WebUI.setText(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/a_Manage Security Positions'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/a_Manage Security Positions'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Manage Security Position/a_Manage Company'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Manage Security Position/a_Manage Company'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Company/span_Users Access'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Company/span_Users Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Position Mappings'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Position Mappings'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Manage Load Query_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Manage Load Query_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Manage User Access_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/span_Manage User Access_a-TreeView-toggle'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/a_Manage Roles'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/a_Manage Roles'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Users Application Access/a_Manage Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Manage Roles/img_Actions_apex-edit-page'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Manage Roles/img_Actions_apex-edit-page'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Certification report/Page_CreateEdit Role/label_All Certifications - View only Access_e3ff9d'), 
    0)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_CreateEdit Role/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_CreateEdit Role/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Manage Roles/a_Assign Roles'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Manage Roles/a_Assign Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Assign Roles/img_Actions_apex-edit-page'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Assign Roles/img_Actions_apex-edit-page'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_User Assign Roles/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_User Assign Roles/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Certification report/Page_Assign Roles/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/Certification report/Page_Assign Roles/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_My Dashboard'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_My Dashboard'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_My Dashboard'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_My Dashboard'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/label_Toggle'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/select_Certification NameCertification Desc_14a9ed'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/select_Certification NameCertification Desc_14a9ed'), 
    'ENVIRONMENT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Expression_R97799695751099620_expres_6849ee'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Expression_R97799695751099620_expres_6849ee'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/a_KTLN_CloudERP'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/a_KTLN_CloudERP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Apply'))

WebUI.scrollToElement(findTestObject('deba3/Dashboards/eacm dashboard/Page_Home/label_Toggle1'), 0)

WebUI.verifyElementClickable(findTestObject('deba3/Dashboards/eacm dashboard/Page_Home/label_Toggle1'))

WebUI.click(findTestObject('deba3/Dashboards/eacm dashboard/Page_Home/label_Toggle1'))

WebUI.delay(20)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/span_Select Columns_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/select_Certification NameCertification Desc_14a9ed_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/select_Certification NameCertification Desc_14a9ed_1'), 
    'ENVIRONMENT_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Expression_R118245851706460410_expre_63aca7'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Expression_R118245851706460410_expre_63aca7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/a_KTLN_CloudERP'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/a_KTLN_CloudERP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/Dashboards/eacm dashboard/Page_Home/button_Apply'))

WebUI.closeBrowser()

