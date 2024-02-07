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

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/a_Manage SOD Test'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('deba/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 - Copy'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba/Page_Manage SOD Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Create'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba/Page_AddEdit Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    0)

WebUI.setText(findTestObject('Object Repository/deba/Page_AddEdit Test/input_Name_P35_REQUEST_NAME'), findTestData('login SOD TEST data').getValue(
        'SOD test name', 1))

WebUI.setText(findTestObject('Object Repository/deba/Page_AddEdit Test/input_Description_P35_REQUEST_DESCRIPTION'), findTestData(
        'login SOD TEST data').getValue('SOD test description', 1))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'DT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_AddEdit Test/option_ALL CERP RULES'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba/Page_AddEdit Test/select_ALL CERP RULESAR_AdjustmentProfileAl_3c352f'), 
    'ALL CERP RULES', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_AddEdit Test/option_All'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba/Page_AddEdit Test/select_AR_AdjustmentProfileAllProcurementAgentRA'), 
    'All', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_AddEdit Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba/Page_AddEdit Test/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba/Page_Manage SOD Test/h2_Action Processed'))

WebUI.mouseOver(findTestObject('Object Repository/deba/Page_Manage SOD Test/h2_Action Processed'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_47'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_47'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_Running'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Action Processed_t-Button t-Button--_8cc6df'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Action Processed_t-Button t-Button--_8cc6df'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_Closed'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Test Log'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Test Log'))

WebUI.click(findTestObject('Object Repository/deba/Page_/button_OK'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Action Processed_t-Button t-Button--_8cc6df'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_ktln_eam_user1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Logout'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Logout'))

WebUI.closeBrowser()

