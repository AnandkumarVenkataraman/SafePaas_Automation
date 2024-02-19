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

WebUI.click(findTestObject('Manage Roles/a_Manage Roles2'))

WebUI.setText(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/input_Create_R637454319923923464_search_field'), 
    'KTLN_ADMIN_ROLE')

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/button_Go'))

WebUI.delay(3)

String_result = WebUI.getText(findTestObject('Object Repository/Manage Roles/td_KTLN_ADMIN_ROLE'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(String_result)

WebUI.delay(3)

if (String_result == 'KTLN_ADMIN_ROLE') {
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Manage Roles/img_KTLN_ADMIN_ROLE_apex-edit-page'))

    String_result1 = WebUI.getText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Role Name_P43_ROLE_NAME'))

    String_result2 = WebUI.getText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Role Description_P43_ROLE_DESCRIPTION'))

    String_result3 = WebUI.getText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Start Date_P43_START_DATE'))

    String_result4 = WebUI.getText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_End Date_P43_END_DATE'))

    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/button_Cancel'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/button_concat(Row text contains , , KTLN_ADMIN_ROLE, , )_a-Button a-IRR-button a-Button--noUI a-IRR-button--remove'))
} else {
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Role Name'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Role Name_P43_ROLE_NAME'))

    WebUI.setText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Role Name_P43_ROLE_NAME'), 'KTLN_ADMIN_ROLE')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Role Description'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Role Description_P43_ROLE_DESCRIPTION'))

    WebUI.setText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Role Description_P43_ROLE_DESCRIPTION'), 
        'Katalon Admin Role')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Start Date'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Start Date_P43_START_DATE'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/button_Popup Calendar Start Date'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/button_Popup Calendar Start Date'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/a_15'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_End Date'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_End Date_P43_END_DATE'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/button_Popup Calendar End Date'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/button_Popup Calendar End Date'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/a_15'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/button_Popup Calendar End Date'))

    WebUI.verifyElementText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/input_Start Date_P43_START_DATE'), 
        '')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/h2_Function Read Access'))

    WebUI.verifyElementText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/h2_Function Read Access'), 
        'Function Read Access')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Snapshot - View only access fo_9715dc'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Snapshot - View only access fo_9715dc'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Data Source - View only access_3d01c8'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Data Source - View only access_3d01c8'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object - View only access for _5fd52e'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object - View only access for _5fd52e'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object Set - View only access _00b15e'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object Set - View only access _00b15e'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Roles - View only access for M_8cc934'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Roles - View only access for M_8cc934'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Assign Roles - View only Assign Roles'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Assign Roles - View only Assign Roles'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/h2_Function Write Access'))

    WebUI.verifyElementText(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/h2_Function Write Access'), 
        'Function Write Access')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Snapshot - Able to Extract Snapshot'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Snapshot - Able to Extract Snapshot'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Data Source - Able to create a_ba9862'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Data Source - Able to create a_ba9862'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object - Able to create and up_ff1d82'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object - Able to create and up_ff1d82'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object Set - Able to create an_e95dac'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Object Set - Able to create an_e95dac'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Roles - Able to create and upd_055ebe'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Manage Roles - Able to create and upd_055ebe'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Assign Roles - Able to assign Roles to User'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/label_Assign Roles - Able to assign Roles to User'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Roles/Page_CreateEdit Role/button_Create'))
}

WebUI.click(findTestObject('Manage Roles/a_Manage Roles2'))

WebUI.sendKeys(findTestObject('Manage Roles/a_Manage Roles2'), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

