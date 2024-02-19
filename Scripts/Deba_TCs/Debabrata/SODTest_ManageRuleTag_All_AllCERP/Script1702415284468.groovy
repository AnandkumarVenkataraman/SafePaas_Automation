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

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/Debabrata/Page_Login/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_AccessPaaS'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Help_a-TreeView-toggle'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Enterprise Access Monitor'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Access Monitor_a-TreeView-toggle'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/div_Define Scope'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Analytics_a-TreeView-toggle'), 0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Rules'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Actions'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Actions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Filter'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Filter'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'APPROVAL_STATUS', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Approved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'RULE_TAGS', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_ALL CERP RULES'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_ALL CERP RULES'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_All'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/input_Expression_p_ignore_10'))

WebUI.waitForElementClickable(findTestObject('Debabrata/Page_Manage Rules/button_Apply'), 0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/button_Apply'))

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Approval Status  Approved'))

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Rule Tags in ALL CERP RULES, All'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Approval Status  Approved'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Rule Tags in ALL CERP RULES, All'))

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_1 -                   15 of           _6956f5'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_1 -                   15 of           _6956f5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_1 -                   15 of           _6956f5'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_1 -                   15 of           _6956f5'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_SOD Review Survey_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_SOD Review Survey_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Manage SOD Test'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/button_Create'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/button_Create'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/input_Name_P35_REQUEST_NAME'), '')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/input_Name_P35_REQUEST_NAME'), 'KTLN_SODTest_Dec13_V1')

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/input_Description_P35_REQUEST_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/input_Description_P35_REQUEST_DESCRIPTION'), 
    'KTLN_SODTest_Dec13_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'DT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/option_ALL CERP RULES'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/select_ALL CERP RULESAR_AdjustmentProfileAl_3c352f'), 
    'ALL CERP RULES', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/option_All'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/select_AR_AdjustmentProfileAllProcurementAgentRA'), 
    'All', true)

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/option_ALL CERP RULES'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/button_Create'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_AddEdit Test/button_Create'))

WebUI.rightClick(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/h2_Action Processed'))

WebUI.rightClick(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/h2_Action Processed'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/h2_Action Processed'))

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/h2_Action Processed'))

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/a_KTLN_SODTest_Dec13_V1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_Running'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_Running'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_47'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_47'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_47'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_Closed'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_Closed'))

WebUI.mouseOver(findTestObject('Object Repository/Debabrata/Page_Manage SOD Test/td_Closed'))

WebUI.closeBrowser()

