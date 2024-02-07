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

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/a_Manage Rules'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Home/a_Manage Rules'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Manage SOD Test'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.setText(findTestObject('Object Repository/deba1/Page_AddEdit Test/input_Name_P35_REQUEST_NAME'), findTestData('login SOD TEST data').getValue(
        'SOD test name', 1))

WebUI.setText(findTestObject('Object Repository/deba1/Page_AddEdit Test/input_Description_P35_REQUEST_DESCRIPTION'), findTestData(
        'login SOD TEST data').getValue('SOD test name', 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'Select any One', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'DT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_ALL CERP RULES'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_AR_AdjustmentProfile'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_ProcurementAgent'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Create'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage SOD Test/h2_Action Processed'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_47'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_47'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_Running'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Action Processed_t-Button t-Button--_8cc6df'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Action Processed_t-Button t-Button--_8cc6df'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementVisible(findTestObject('deba/Page_Manage SOD Test/td_Closed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Test Log'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Test Log'))

WebUI.click(findTestObject('Object Repository/deba/Page_/button_OK'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba1/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Home/a_Manage Violation'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Home/a_Manage Violation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    '5409', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneKTLN_SODTest_Dec27_V1__ef5655'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneKTLN_SODTest_Dec27_V1__ef5655'), 
    findTestData('login SOD TEST data').getValue('SOD test data', 1), true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_AR vs. GL Rule'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_AR vs. GL Rule'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/td_MCD IT Application Implementation Consul_6b6343'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_User Name'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_User Name'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), 'Akhil')

WebUI.sendKeys(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/span_Access Monitor_a-TreeView-toggle'), 
    0)

WebUI.closeBrowser()

