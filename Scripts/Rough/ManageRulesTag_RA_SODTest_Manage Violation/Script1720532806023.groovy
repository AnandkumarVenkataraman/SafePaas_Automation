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

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'APPROVAL_STATUS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Approved'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Approved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'RULE_TAGS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/a_RA'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/a_RA'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/button_Apply - Copy (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'OBJECTIVE_CODE_MEANING', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Restricted Access'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Restricted Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/button_Apply - Copy (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'ACTIVITY_SET1_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/button_Apply - Copy (4)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter'), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'ACTIVITY_SET2_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/button_Apply - Copy (5)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Rules/a_EditActivity1 is not null'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Rule Objective  Restricted Access'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Rules/a_EditRule Tags  RA'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Rules/span_1 -                    3 of           _0e833d'), 
    0)

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_1 -                    3 of           _0e833d - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_1 -                    3 of           _0e833d - Copy'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/a_Manage SOD Test'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.setText(findTestObject('Object Repository/deba1/Page_AddEdit Test/input_Name_P35_REQUEST_NAME'), findTestData('login SOD TEST data').getValue(
        'SOD test name', 1))

WebUI.setText(findTestObject('Object Repository/deba1/Page_AddEdit Test/input_Description_P35_REQUEST_DESCRIPTION'), findTestData(
        'login SOD TEST data').getValue('SOD test description', 1))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'RA', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_RA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_ALL CERP RULESAR_AdjustmentProfileAl_3c352f'), 
    'RA', true)

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

WebUI.delay(100)

WebUI.verifyElementVisible(findTestObject('deba/Page_Manage SOD Test/td_Closed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Test Log'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/a_Test Log'))

WebUI.click(findTestObject('Object Repository/deba/Page_/button_OK'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/Page_Home/a_Manage Violation - Copy'))

WebUI.click(findTestObject('deba1/Page_Home/a_Manage Violation - Copy'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/Request name'))

WebUI.selectOptionByLabel(findTestObject('deba1/Page_Manage Violation/Request name'), findTestData('login SOD TEST data').getValue(
        'SOD test name', 1), true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/button_Apply - Copy'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/button_Apply - Copy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/span_1 -                   15 of more than _3b79aa'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/span_16 -                   30 of more than_c47f05'), 
    0)

WebUI.closeBrowser()

