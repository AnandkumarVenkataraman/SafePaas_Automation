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

WebUI.click(findTestObject('Debabrata/Page_Company/a_Manage Environment - 177'))

WebUI.click(findTestObject('Manage Environment/Page_Manage Environment/input_Create_R258165063082313757_search_field'))

WebUI.setText(findTestObject('Object Repository/Manage Environment/Page_Manage Environment/input_Create_R258165063082313757_search_field'), 
    'KTLN_CloudERP')

WebUI.click(findTestObject('Object Repository/Manage Environment/Page_Manage Environment/button_Go'))

WebUI.delay(3)

String result = WebUI.getText(findTestObject('Object Repository/Manage Environment/Page_Manage Environment/Environment Button'))

if (result.equals('KTLN_CloudERP')) {
    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_Manage Environment/Pencil Button'))

    String result1 = WebUI.getText(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/span_Oracle Cloud ERP'))

    String result2 = WebUI.getText(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/span_Oracle Cloud ERP 20x'))

    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/button_Cancel'))
} else {
    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Environment/Page_Manage Environment/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_Manage Environment/button_Create'))

    WebUI.setText(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/input_(Value Required)_P13_ENVIRONMENT_NAME'), 
        'KTLN_CloudERP')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/select_- Select -BeelineDatabaseHyperionJD _494de8'), 
        '8', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/select_Select any oneOracle Cloud ERP 20x'), 
        '5150', true)

    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/button_Popup Calendar Start Date'))

    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/a_30'))

    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/label_Is Security Extract_u-checkbox'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Environment/Page_AddEdit Environment/button_Create'))
}

WebUI.delay(5)

