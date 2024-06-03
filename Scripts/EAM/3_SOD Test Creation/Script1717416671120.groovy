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

WebUI.comment('launch the url in IQA : https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/SODTest1/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.comment('Enter the company as kAT')

WebUI.setText(findTestObject('Object Repository/SODTest1/Page_Login/input_P101_USERNAME (1)'), 'KTLN_EAM_USER1')

WebUI.comment('Enter username as KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/SODTest1/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Login/button_Login (1)'))

WebUI.comment('Click on Login button')

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.comment('Click on AccessPaaS navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.comment('Click on Enterprise Access Monitor navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.comment('Click on Define Scope Navigation dropdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Home/a_Manage Rules (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Home/a_Manage Rules (1)'))

WebUI.comment('Click on Manage Rules')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.comment('Select the environment as "KTLN_CloudERP"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'), 
    'APPROVAL_STATUS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/buttonR247793226539899118_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/buttonR247793226539899118_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_Approved'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_Approved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.comment('Filter with the Approval status as "Approved"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'), 
    'ACTIVITY_SET1_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.comment('Filter with Activity Set1 is not NULL')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'), 
    'ACTIVITY_SET2_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.comment('Filter with Activity Set2 is not NULL')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'), 
    'RULE_TAGS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/buttonR247793226539899118_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/buttonR247793226539899118_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_ALL'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_ALL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_ALL CERP RULES'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_ALL CERP RULES'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_AR_AdjustmentProfile'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_AR_AdjustmentProfile'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_PO_AP'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_PO_AP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_ProcurementAgent'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_ProcurementAgent'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/input_p_ignore_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_Apply'))

WebUI.comment('Filter with all the Rule Tags')

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_1 -                   15 of           _075b1d'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_1 -                   15 of           _075b1d'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the records displayed')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_16 -                   29 of          _43d64e'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_16 -                   29 of          _43d64e'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/span_a-TreeView-toggle'))

WebUI.comment('Click on "Detect Violations" dropdown from the Navigation menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/deba3/SODTest/Page_Manage Rules/a_Manage SOD Test'))

WebUI.comment('Click on Manage SOD test')

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Manage SOD Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.comment('select the enviornment as "KTLN_CloudERP"')

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_Manage SOD Test/button_Create'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_Manage SOD Test/button_Create'))

WebUI.comment('Click on Create button')

WebUI.verifyElementText(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/input_P35_REQUEST_NAME (1)'), '')

WebUI.setText(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/input_P35_REQUEST_NAME (1)'), 'KTLN_SODTest_June03_V1')

WebUI.comment('Provide a SOD Request name')

WebUI.verifyElementText(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/textarea_P35_REQUEST_DESCRIPTION (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/textarea_P35_REQUEST_DESCRIPTION (1)'), 'KTLN_SODTest_June03_V1')

WebUI.comment('Provide the SOD Description')

WebUI.selectOptionByLabel(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111 (1)'), 
    'Select any One', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111 (1)'), 
    'DT', true)

WebUI.comment('Select the Test type as SOD detective')

WebUI.verifyElementPresent(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/label_Rule Tags (Value Required) (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/option_ALL CERP RULES (1)'))

WebUI.click(findTestObject('SODTest1/Page_AddEdit Test/option_ALL CERP RULES (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/option_AR_AdjustmentProfile (1)'))

WebUI.click(findTestObject('SODTest1/Page_AddEdit Test/option_AR_AdjustmentProfile (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/option_All (1)'))

WebUI.click(findTestObject('SODTest1/Page_AddEdit Test/option_All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/option_PO_AP (1)'))

WebUI.click(findTestObject('SODTest1/Page_AddEdit Test/option_PO_AP (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/option_ProcurementAgent (1)'))

WebUI.click(findTestObject('SODTest1/Page_AddEdit Test/option_ProcurementAgent (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.click(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE (1)'))

WebUI.comment('Select all the Rule tags')

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SODTest1/Page_AddEdit Test/button_Create 456'))

WebUI.click(findTestObject('SODTest1/Page_AddEdit Test/button_Create 456'))

WebUI.comment('Click on Create button')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage SOD Test/h2_Action Processed'), 0)

WebUI.comment('Verify the success message')

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.closeBrowser()

