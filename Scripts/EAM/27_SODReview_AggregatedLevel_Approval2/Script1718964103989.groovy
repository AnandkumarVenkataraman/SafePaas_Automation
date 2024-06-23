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

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_USERNAME (1)'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/a_Manage Review Status'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/a_Manage Review Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/select_NameDescriptionStatusStart DateEnd D_54845d'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/input_p_ignore_10'), 'KTLN_SODReview_May28_V2')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_User Access'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_Open'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SOD9918DA842E59C6718EA77AEFF6B159FC')

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'), 
    'VERIFIED', true)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.scrollToElement(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/Span 1 to 22 - 50'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/Span 1 to 22 - 50'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_All (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_All (1)'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/input_f01 - 51'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/input_f01 - 51'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_Mitigations and ControlsRisk and Mitigation'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_Mitigations and ControlsRisk and Mitigation'), 
    'COMPRISK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_Mitigations and ControlsRisk and Mitigation'), 
    'COMPRISK', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/textarea_P10_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/textarea_P10_JUSTIFICATION'), 
    'over riding the remediation of role owner to rule owner')

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Verify Selection - 52'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Verify Selection - 52'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/h2_Selected records successfully verified'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_Risk and Mitigation - 60'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_Risk and Mitigation - 60'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_over riding the remediation of role owne_d9c38e - 61'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_over riding the remediation of role owne_d9c38e - 61'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_25-JAN-24 - 62'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_25-JAN-24 - 62'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_KATALON_ADMIN - 63'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/td_KATALON_ADMIN - 63'), FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Submit and Close - 70'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Submit and Close - 70'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Thank You/h2_Thanks for validating the Users'), 
    FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1'))

WebUI.rightClick(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/a_Manage Review Status'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/a_Manage Review Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/select_NameDescriptionStatusStart DateEnd D_54845d'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/input_p_ignore_10'), 'KTLN_SODReview_May28_V2')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_User Access'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_Open'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.closeBrowser()

