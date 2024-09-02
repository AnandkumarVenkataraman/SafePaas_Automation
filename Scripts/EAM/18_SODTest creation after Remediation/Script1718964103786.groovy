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

WebUI.setText(findTestObject('Object Repository/deba1/SODTest/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/SODTest/Page_Login/input_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/SODTest/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.verifyElementClickable(findTestObject('deba1/SODTest/Page_Home/ManageSODTest_new'))

WebUI.click(findTestObject('deba1/SODTest/Page_Home/ManageSODTest_new'))

WebUI.verifyElementClickable(findTestObject('deba1/SODTest/Page_Manage SOD Test/oneCERP_1CloudERP_Environment'))

WebUI.selectOptionByLabel(findTestObject('deba1/SODTest/Page_Manage SOD Test/oneCERP_1CloudERP_Environment'), 'KTLN_CloudERP', 
    false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.setText(findTestObject('Object Repository/deba1/Page_AddEdit Test/input_Name_P35_REQUEST_NAME'), GlobalVariable.SOD_Testnew)

WebUI.setText(findTestObject('deba1/Page_AddEdit Test/input_Description_P35_REQUEST_DESCRIPTION - Copy'), GlobalVariable.SOD_Testnew)

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'Select any One', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'DT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_ALL CERP RULES'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_ALL CERP RULESAR_AdjustmentProfileAl_3c352f'), 
    'ALL CERP RULES', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_AR_AdjustmentProfile'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_AR_AdjustmentProfileAllProcurementAgentRA'), 
    'AR_AdjustmentProfile', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_All'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_AllProcurementAgentRA'), 'All', 
    true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_ProcurementAgent'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_ProcurementAgentRA'), 'ProcurementAgent', 
    true)

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

WebUI.verifyElementVisible(findTestObject('deba/Page_Manage SOD Test/td_Closed'))

