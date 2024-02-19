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

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_Fall 2022_P101_COMPANY'))

WebUI.setText(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_Fall 2022_P101_COMPANY'), 'KAT')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setText(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_New_P101_PASSWORD'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/input_New_P101_PASSWORD'), 
    'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Login and Home Page - KAT/Page_Login/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Extract-Data/div_DataProbe'))

WebUI.click(findTestObject('Manage Data Source/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Manage Data Source/span_Manage Snapshot_a-TreeView-toggle1'))

WebUI.click(findTestObject('Assign Roles/a_Assign Roles2'))

WebUI.setText(findTestObject('Object Repository/Assign Roles/Page_Assign Roles/input_Create_R508723023438867771_search_field'), 
    'KATALON_ADMIN')

WebUI.click(findTestObject('Object Repository/Assign Roles/Page_Assign Roles/button_Go'))

String_result = WebUI.getText(findTestObject('Assign Roles/Page_User Assign Roles/td_KTLN_ADMIN_ROLE1'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(String_result)

WebUI.delay(3)

if (String_result == 'KTLN_ADMIN_ROLE') {
    WebUI.delay(3)

    WebUI.getText(findTestObject('Object Repository/Assign Roles/td_KTLN_ADMIN_ROLE'))

    WebUI.click(findTestObject('Assign Roles/Page_User Assign Roles/img_KATALON_ADMIN_apex-edit-page1'))

    String_result1 = WebUI.getText(findTestObject('Object Repository/Assign Roles/label_KTLN_ADMIN_ROLE'))

    WebUI.click(findTestObject('Object Repository/Assign Roles/button_Cancel'))
} else {
    WebUI.verifyElementClickable(findTestObject('Object Repository/Assign Roles/Page_Assign Roles/button_Create'))

    WebUI.click(findTestObject('Object Repository/Assign Roles/Page_Assign Roles/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/label_User Name'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/select_Select any oneKATALON_ADMIN'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/select_Select any oneKATALON_ADMIN'), 
        '100912', true)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/h2_Role Access'))

    WebUI.verifyElementText(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/h2_Role Access'), 'Role Access')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/label_KAT_ADMIN'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/label_KTLN_ADMIN_ROLE'))

    WebUI.click(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/label_KTLN_ADMIN_ROLE'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/button_Create'))

    WebUI.click(findTestObject('Object Repository/Assign Roles/Page_User Assign Roles/button_Create'))
}

WebUI.click(findTestObject('Assign Roles/a_Assign Roles2'))

WebUI.delay(3)

