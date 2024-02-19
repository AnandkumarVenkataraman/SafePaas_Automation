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

WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Home/div_DataProbe'))

WebUI.click(findTestObject('Manage Data Source/span_Manage Object Lookups_a-TreeView-toggle'))

WebUI.click(findTestObject('Manage Data Source/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Manage Data Source/a_Manage Data Source'))

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/select_- Only Master Objects -CloudERPKTLN__069ca0'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/select_- Only Master Objects -CloudERPKTLN__069ca0'), 
    'KTLN_CloudERP', true)

WebUI.delay(2)

WebUI.click(findTestObject('Manage Data Source/input_Create_R119140564844328612_search_field'))

WebUI.setText(findTestObject('Manage Data Source/input_Create_R119140564844328612_search_field'), 'KTLN_LocalFiles')

WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/button_Go'))

//WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/label_Toggle'))
String_result1 = WebUI.getText(findTestObject('Object Repository/Manage Data Source/a_KTLN_LocalFiles'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(String_result1)

WebUI.delay(3)

if (String_result1 == 'KTLN_LocalFiles') {
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Manage Data Source/a_KTLN_LocalFiles'))

    String_result2 = WebUI.getText(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/div_YesNo'))

    String_result3 = WebUI.getText(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'))

    String_result4 = WebUI.getText(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/select_- Select Any -DB2Local FilesOracleOr_f644ef'))

    WebUI.click(findTestObject('Object Repository/Manage Data Source/button_Cancel'))
} else {
    WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/label_Active'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/div_YesNo'))

    WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/span_'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/label_Name (Value Required)'))

    WebUI.setText(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'), 
        'KTLN_LocalFiles')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/label_Type Name (Value Required)'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/select_- Select Any -DB2Local FilesOracleOr_f644ef'), 
        '7', true)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/button_Create_1'))

    WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/button_Create_1'))

    WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/button_OK'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/div_Action Processed'), 
        0)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/div_Action Processed'))

    WebUI.click(findTestObject('Object Repository/Manage Data Source/Page_Manage Data Source/button_Action Processed_t-Button t-Button--_8cc6df'))

    WebUI.click(findTestObject('Manage Data Source/a_Manage Data Source'))
}

WebUI.sendKeys(findTestObject('Manage Data Source/a_Manage Data Source'), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

