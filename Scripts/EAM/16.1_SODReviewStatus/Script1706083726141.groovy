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

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_COMPANY (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_USERNAME (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_PASSWORD (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/button_Login (2) (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3_4 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3_4 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Review Status (1)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Review Status (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/select_NameDescriptionStatusStart DateEnd D_54845d'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/input_p_ignore_10'), 
    'KTLN_SODReview_Feb2_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/span_1 -                    1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/a_KTLN_SODReview_Jan22_V2'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/a_KTLN_SODReview_Jan22_V2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/h2_User Access'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/h2_Open'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/a_KTLN_SODReview_Jan22_V2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/button_katalon_admin - 177'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/button_katalon_admin - 177'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Logout - 181'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Logout - 181'))

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_COMPANY (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_USERNAME (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_PASSWORD (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/button_Login (2) (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SOD622772C790FB884E9272DD076C77BC9D')

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/h2_Remediate Violation Survey -  KTLN_SODRe_bb7226 (1) (1) (1) (1) (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_Remediation Actions (1) (1) (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_Violation Dashboard (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_Violation Dashboard (1) (1) (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_BuyerORA_PO_BUYER_JOB'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_BuyerORA_PO_BUYER_JOB'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_MCD AP Invoice SupervisorMCD_AP_ACCOUNTS__92c6b9'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_MCD AP Invoice SupervisorMCD_AP_ACCOUNTS__92c6b9'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Remediation action_211 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Remediation action_211 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 (1)'), 
    'VERIFIED', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Apply (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Remediation Status of Role Owner - 990'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Remediation Status of Role Owner - 990'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified - 991'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified - 991'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified On (Role Owner) - 992'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified On (Role Owner) - 992'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified By (Role Owner) - 993'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified By (Role Owner) - 993'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Justification of Role Owner - 994'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Justification of Role Owner - 994'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_1 -                   35 of           _ce9c90'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_1 -                   35 of           _ce9c90'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/inputselectUnselectAll (1) (1) (1) - 160 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/inputselectUnselectAll (1) (1) (1) - 160 (1) (1)'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'), 
    'COMPMITIGATIONS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'), 
    'COMPMITIGATIONS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'), 
    'COMPMITIGATIONS', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/textarea_P10_JUSTIFICATION (1) (1) (1) (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/textarea_P10_JUSTIFICATION (1) (1) (1) (1) (1)'), 
    'KTLN Test Justification for SOD Review_Violation Level- KTLN_SODReview_Feb2_V1')

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_a-Icon icon-up-chevron - 0101'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_a-Icon icon-up-chevron - 0101'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Verify Selection - 121'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Verify Selection - 121'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/h2_Selected records successfully verified (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Actions (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Actions (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Filter (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Filter (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 (1) (1) (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 (1) (1) (1) (1) (1)'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127 (1) (1) (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127 (1) (1) (1) (1) (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/input_p_ignore_10 (1) (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/input_p_ignore_10 (1) (1) (1)'), 
    'KTLN_SODReview_Feb2_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Apply (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Apply (1) (1) (1) (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Remediation Status of Role Owner (1) (1) (1) - 150 (1) (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Remediation Status of Role Owner (1) (1) (1) - 150 (1) (1)'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified (1) (1) (1) - 153 (1) (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified (1) (1) (1) - 153 (1) (1)'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified On (Role Owner) (1) (1) (1) - 151 (1) (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified On (Role Owner) (1) (1) (1) - 151 (1) (1)'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified By (Role Owner) (1) (1) (1) - 152 (1) (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Verified By (Role Owner) (1) (1) (1) - 152 (1) (1)'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Justification of Role Owner (1) (1) (1) - 154 (1) (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_Justification of Role Owner (1) (1) (1) - 154 (1) (1)'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf (2)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Actions (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Actions (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Filter (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Filter (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 (1) (1) (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 (1) (1) (1) (1) (1)'), 
    'VERIFIED', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127 (1) (1) (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _365127 (1) (1) (1) (1) (1)'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Apply (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Apply (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Submit and Close'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Submit and Close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Thank You and Manage Review Action sen_69f61f/h2_Thank You and Manage Review Action sent _ae17e8'))

WebUI.closeBrowser()

