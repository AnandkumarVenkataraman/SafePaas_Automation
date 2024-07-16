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

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/button_Login'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_entrypoint?URLC=CD858B540AF59C2A37E6A49B3ADADA60&P_SURVEY=RR')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/a_Maintain Customer Master vs. Maintain Sup_8e16f4'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/a_Maintain Customer Master vs. Maintain Sup_8e16f4'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Rules'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Rules'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Rule Attributes'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Rule Attributes'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Activities'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Activities'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Exceptions'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Exceptions'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_People'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_People'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_History'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_History'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Corrective Actions'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Corrective Actions'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Show All'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/span_Show All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/button_Back'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Rule Report/button_Back'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/select_- Select a value -NoYes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/select_- Select a value -NoYes'), 
    'Y', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/select_- Select a value -NoYes_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/select_- Select a value -NoYes_1'), 
    'Y', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/select_- Select a value -NoYes_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/select_- Select a value -NoYes_1_2'), 
    'Y', true)

WebUI.verifyElementText(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/textarea_(Value Required)_P144_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/textarea_(Value Required)_P144_JUSTIFICATION'), 
    'Test Justification')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/input_Last Updated Date_f01'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/input_Last Updated Date_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Apply Changes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Changes successfully applied_t-Butto_91b949'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Changes successfully applied_t-Butto_91b949'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/a_Rule In Scope'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/a_Activities Verified'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/a_Exception Verified'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/a_Justification'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Submit Review'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Submit Review'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Changes successfully applied_t-Butto_91b949'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RuleReview_Submit/Page_Review Rules/button_Changes successfully applied_t-Butto_91b949'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Home/button_katalon_admin - 121'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Home/button_katalon_admin - 121'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Home/a_Logout - 122'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Home/a_Logout - 122'))

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Status/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/a_Manage Rules Review'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/a_Manage Rules Review'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/select_Select any oneEBizApp_JDBC_EnvKTLNCl_1d34dc'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/select_Select any oneEBizApp_JDBC_EnvKTLNCl_1d34dc'), 
    'KTLN_DEV22', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Actions'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Filter'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/select_NameDescriptionStatusStart DateEnd D_aa7b45'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/input_Expression_p_ignore_10'), 
    GlobalVariable.RulesReviewName)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Apply'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Apply'))

WebUI.delay(6)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/a_KTLN_RulesReview_DEV22_Jun21_v1'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/a_KTLN_RulesReview_DEV22_Jun21_v1'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

