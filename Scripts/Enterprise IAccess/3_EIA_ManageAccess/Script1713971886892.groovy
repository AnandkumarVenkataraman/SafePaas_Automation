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

WebUI.setText(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'kat')

WebUI.setText(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'en413708')

WebUI.setEncryptedText(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Login/input_New_P101_PASSWORD'), 
    'bVf///RHAwMoarxGTgkRdw==')

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/a_Manage My Access'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/a_Manage My Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/li_en413708'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/li_en413708'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Request New Access'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Request New Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Selection/option_RoleGroup_Other  Time and Labor Mana_81e346'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Selection/option_RoleGroup_Other  Time and Labor Mana_81e346'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Selection/button_Next'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Selection/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_ManageAccess/Page_Role Provision and Deprovision/button_Submit for Violation Testing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_ManageAccessRequest_successMessage- UR505'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_ManageAccessRequest_successMessage- UR505'))

WebUI.delay(180)

WebUI.verifyElementClickable(findTestObject('Enterprise iAccess/NewAccessRequest/Page_Home/a_Inbox -JK'))

WebUI.click(findTestObject('Enterprise iAccess/NewAccessRequest/Page_Home/a_Inbox -JK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/a_Manage My Access_1'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Home/a_Manage My Access_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/li_en413708'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/li_en413708'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/span_User name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/span_Active user'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/span_Employee name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/span_Description'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/span_Manager name'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/h2_Current Roles'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/h2_Current Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go_1'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go_1'))

WebUI.delay(120)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go_1'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/button_Go_1'))

WebUI.delay(120)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/a_SOD Testing Done'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Manage My Access/a_SOD Testing Done'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Review Violations/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Review Violations/button_Refresh'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Review Violations/button_Submit Access Request'))

WebUI.click(findTestObject('Object Repository/Enterprise iAccess/NewAccessRequest/Page_Review Violations/button_Submit Access Request'))

WebUI.verifyElementClickable(findTestObject('MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_ViolationReview- UR506'))

WebUI.click(findTestObject('MonitorPaaS_CloudERP/ManageMonitor_Chnage level/Page_Manage Monitors/button_ViolationReview- UR506'))

WebUI.closeBrowser()

