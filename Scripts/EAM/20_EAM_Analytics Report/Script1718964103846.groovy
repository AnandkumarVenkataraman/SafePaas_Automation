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

WebUI.setText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/a_Violations by User Report (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Home/a_Violations by User Report (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_2c6179'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_2c6179'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__792070'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__792070'), 
    GlobalVariable.SOD_Test, true, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/button_Schedule'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/button_Schedule'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/span_a-TreeView-toggle'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/a_Scheduled Downloads'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/a_Scheduled Downloads'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Go (1)'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/buttonR160866911876310713_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/buttonR160866911876310713_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_EAM_VUR (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_EAM_VUR (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'), 
    'FILTERS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/input_p_ignore_10 (1)'), GlobalVariable.SOD_Test)

WebUI.verifyElementClickable(findTestObject('deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply_1101'))

WebUI.click(findTestObject('deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply_1101'))

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Download (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Download (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Violation Matrix by User (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Violation Matrix by User (1)'))

WebUI.verifyElementClickable(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_2c6179 - 1102'))

WebUI.selectOptionByLabel(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_2c6179 - 1102'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__792070 - 1103'))

WebUI.selectOptionByLabel(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__792070 - 1103'), 
    GlobalVariable.SOD_Test, true, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/button_Schedule'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/button_Schedule'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/a_Scheduled Downloads'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/a_Scheduled Downloads'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/buttonR160866911876310713_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/buttonR160866911876310713_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_EAM_VMU (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_EAM_VMU (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'), 
    'FILTERS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/input_p_ignore_10 (1)'), GlobalVariable.SOD_Test)

WebUI.verifyElementClickable(findTestObject('deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply_1101'))

WebUI.click(findTestObject('deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply_1101'))

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Download (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Download (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Intra Role Violation Details Report (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Intra Role Violation Details Report (1)'))

WebUI.verifyElementClickable(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_2c6179 - 1105'))

WebUI.selectOptionByLabel(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any oneEBizApp_JDBC_EnvKTLN_C_2c6179 - 1105'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__792070 - 1106'))

WebUI.selectOptionByLabel(findTestObject('deba4/EAM_Analytics/Page_User Violation Report/select_Select any OneKTLN_SODTest_Jan05_V2__792070 - 1106'), 
    GlobalVariable.SOD_Test, true, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/button_Schedule'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_User Violation Report/button_Schedule'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/a_Scheduled Downloads'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Violation Matrix by User/a_Scheduled Downloads'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/buttonR160866911876310713_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/buttonR160866911876310713_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_EAM_IRVD'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_EAM_IRVD'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32 (1)'), 
    'FILTERS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/input_p_ignore_10 (1)'), GlobalVariable.SOD_Test)

WebUI.verifyElementClickable(findTestObject('deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply_1101'))

WebUI.click(findTestObject('deba4/EAM_Analytics/Page_Scheduled Downloads/button_Apply_1101'))

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Download (1)'), 0, 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/a_Download (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba4/EAM_Analytics/Page_Scheduled Downloads/button_a-Button a-IRR-button a-Button--noUI_9e60bf (1)'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

