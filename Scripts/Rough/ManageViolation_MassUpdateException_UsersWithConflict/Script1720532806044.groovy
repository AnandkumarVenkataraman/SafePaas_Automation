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

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.click(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.verifyElementText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    '')

WebUI.setText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    'KTLN_SODTest_Dec22_V4_All')

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/buttonsearch_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/buttonsearch_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_Bank Account Reconciliation and Create Payments'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_Bank Account Reconciliation and Create Payments'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_Bank Account Reconciliation and Enter Cus_237e75'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_Bank Account Reconciliation and Enter Cus_237e75'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/div_Expression'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_Rule NameStart Entry NameViolation E_2541a1'), 
    'USER_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/buttonsearch_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/buttonsearch_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_ee301106'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_ee301106'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_svcerpintgusr'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/a_svcerpintgusr'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/input_p_ignore_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/span_1 -                   15 of           _135823'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/span_1 -                   15 of           _135823'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_a-Button a-IRR-button a-IRR-button--_f18194'))

WebUI.scrollToElement(findTestObject('deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/span_16 -                   30 of          _4f411c'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/span_16 -                   30 of          _4f411c'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/label_Toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/label_Toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Mass Update Exceptions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/button_Mass Update Exceptions'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/inputsearch1_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/inputsearch1_search_field'), 
    'Bank account reconciliation and')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/inputselectunselectall1'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/inputselectunselectall1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/button_Next'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exceptions for Rules/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/select_Select any oneRoles with ConflictsUs_50cbb0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/select_Select any oneRoles with ConflictsUs_50cbb0'), 
    'USER', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/select_User Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/buttonsearch3_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/buttonsearch3_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/a_ee301106'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/a_ee301106'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/a_svcerpintgusr'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/a_svcerpintgusr'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/input_p_ignore_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/inputselectunselectall3'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/inputselectunselectall3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Next'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Mass Update Exception/button_Next'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Conflict Summary Report/select_Justification 1 - RolesNon-Cymerac U_b5db16'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Conflict Summary Report/select_Justification 1 - RolesNon-Cymerac U_b5db16'), 
    'Admin Users', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Conflict Summary Report/button_Submit for processing Exceptions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Conflict Summary Report/button_Submit for processing Exceptions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageViolagtion_MassUpdateException/Page_Manage Violation/h2_Mass Update Exceptions created'))

WebUI.delay(2)

WebUI.closeBrowser()

