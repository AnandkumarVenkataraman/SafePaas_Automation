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

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_USERNAME (1)'), 'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_PASSWORD (1)'), 
    '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_Violation Dashboard (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_Violation Dashboard (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_BuyerORA_PO_BUYER_JOB (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_BuyerORA_PO_BUYER_JOB (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_MCD AP Invoice SupervisorMCD_AP_ACCOUNTS__92c6b9 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/a_MCD AP Invoice SupervisorMCD_AP_ACCOUNTS__92c6b9 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_ui-button-icon ui-icon ui-icon-closethick (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_Remediation Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_Remediation Actions (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/span_1 -                   35 of           _ce9c90 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/inputselectUnselectAll (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/inputselectUnselectAll (1)'))

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

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/inputselectUnselectAll (1)'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/inputselectUnselectAll (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_Mitigations and Controls (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_Mitigations and Controls (1)'), 
    'COMPMITIGATIONS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/select_Mitigations and Controls (1)'), 
    'COMPMITIGATIONS', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/textarea_P10_JUSTIFICATION (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/textarea_P10_JUSTIFICATION (1)'), 
    'KTLN_SODReview - Jan24_V1_PO_AP')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_Verify Selection (1)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_USERNAME (1)'), 'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/input_P101_PASSWORD (1)'), 
    '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_Login/button_Login (1)'))

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

WebUI.rightClick(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/label_Toggle'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/div_GoActions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/SODReviewStatus_PO_AP/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.closeBrowser()

