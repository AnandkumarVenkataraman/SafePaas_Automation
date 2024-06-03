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

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_USERNAME (1)'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Home/span_a-TreeView-toggle_1'))

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

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/input_p_ignore_10'), 'KTLN_SODReview_May27_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_User Access'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_Open'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SOD2BF92080FDE403AD1805D10875F4FD76')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6'), 
    'VERIFIED', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127'), 
    'is not null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Apply'))

WebUI.scrollToElement(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/span_1 -                   35 of           _ce9c90'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/span_1 -                   35 of           _ce9c90'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_All (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_All (1)'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/input_f01 - 005'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/input_f01 - 005'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_Mitigations and ControlsRisk and Mitigation'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_Mitigations and ControlsRisk and Mitigation'), 
    'COMPRISK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/select_Mitigations and ControlsRisk and Mitigation'), 
    'COMPRISK', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/textarea_P10_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/textarea_P10_JUSTIFICATION'), 
    'over riding the remediation of role owner to rule owner')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Verify Selection'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Verify Selection'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/h2_Selected records successfully verified'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/td_Create Purchase Orders vs. Approve Payab_503e43'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/td_Risk and Mitigation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/td_KATALON_ADMIN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/td_25-JAN-24'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/td_over riding the remediation of role owne_d9c38e'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Submit and Close'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Manage Violation/button_Submit and Close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Thank You/h2_Thanks for validating the Users'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

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

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/input_p_ignore_10'), 'KTLN_SODReview_May27_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_Manage Review Status/a_Test123'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_User Access'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/h2_Open'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewApproval/Page_User Access Validation/button_Cancel'))

WebUI.closeBrowser()

