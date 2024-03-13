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

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 111'))

WebUI.click(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 111'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 000'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 000'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Analytics_a-TreeView-toggle - 333'))

WebUI.click(findTestObject('deba/Page_Home/span_Analytics_a-TreeView-toggle - 333'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/a_Manage Rules - 678'))

WebUI.click(findTestObject('deba/Page_Home/a_Manage Rules - 678'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 989'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 989'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 189'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 189'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.verifyElementText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    '')

WebUI.setText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    'KTLN_SODTest_Mar13_V1')

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_AR vs. GL Rule'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_AR vs. GL Rule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Start Entry Name'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Start Entry Name'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), 'Project Accountant[ORA_PJF_PROJECT_ACCOUNTANT_JOB]')

WebUI.sendKeys(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'), 
    'USER_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Manage Violation/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Manage Violation/input_p_ignore_10'), 'Akhil')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/label_Toggle'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/li_ToggleEditRule Name  AR vs. GL Rule'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/li_ToggleEditRule Name  AR vs. GL Rule'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194 - Copy'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194 - Copy'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/a_Rule Name - 900'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/a_Rule Name - 900'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/a_Asset Txns vs. IT User Role Maintenance Rule - Copy180'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/a_Asset Txns vs. IT User Role Maintenance Rule - Copy180'))

WebUI.verifyElementPresent(findTestObject('deba1/Page_Manage Violation/td_Asset Txns vs. IT User  Role Maintenance Rule'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba1/Page_Manage Violation/span_1 -                    1 of           _e353a0'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/span_1 -                    1 of           _e353a0'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/span_a-TreeView-toggle - Copy - Copy 361'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/span_a-TreeView-toggle - Copy - Copy 361'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Violation/a_Manage Rules - Copy - 119'))

WebUI.click(findTestObject('deba1/Page_Manage Violation/a_Manage Rules - Copy - 119'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('deba1/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter False - Positives'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Rules/button_Filter False - Positives'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Entries'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Entries'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/label_Toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/a_Entry Name'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/a_Entry Name'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Filter False-Positives/inputeRep_sort_widget_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Filter False-Positives/inputeRep_sort_widget_search_field'), 
    'ORA_PJF_PROJECT_ACCOUNTANT_JOB')

WebUI.sendKeys(findTestObject('Object Repository/deba1/Page_Filter False-Positives/inputeRep_sort_widget_search_field'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/a_Entry Hierarchy'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/a_Entry Hierarchy'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Filter False-Positives/inputeRep_sort_widget_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Filter False-Positives/inputeRep_sort_widget_search_field'), 
    'Role : Project Asset Maintenance[ORA_PJC_PROJECT_ASSET_MAINTENANCE_DUTY]->Role : Project Accountant[ORA_PJF_PROJECT_ACCOUNTANT_JOB]')

WebUI.sendKeys(findTestObject('Object Repository/deba1/Page_Filter False-Positives/inputeRep_sort_widget_search_field'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Filter False-Positives/td_Role  Project Asset MaintenanceORA_PJC_P_2dfad4'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Rough/Page_Filter False-Positives/inputentryCheck'))

WebUI.click(findTestObject('Object Repository/deba1/Rough/Page_Filter False-Positives/inputentryCheck'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Filter False-Positives/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Filter False-Positives/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Filter False-Positives/h2_Action Processed'), 0, 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser()

