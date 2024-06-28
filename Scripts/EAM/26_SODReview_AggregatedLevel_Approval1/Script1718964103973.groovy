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

WebUI.setText(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_Login/input_P101_COMPANY (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_Login/input_P101_USERNAME (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_Login/input_P101_PASSWORD (2) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'Ju8vHiRYWYTapQtHptL/Yg==')

WebUI.click(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_Login/button_Login (2) (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/ferm.survey_remediate_entrypoint?URLC=SODD5B2348A042415065280478A0646A7C1')

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'), 
    'VERIFIED', true)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified - 991 - 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified - 991 - 1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Remediation Status of Role Owner - 990 - 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Remediation Status of Role Owner - 990 - 1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Justification of Role Owner - 994 - 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Justification of Role Owner - 994 - 1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified On (Role Owner) - 992 - 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified On (Role Owner) - 992 - 1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified By (Role Owner) - 993 - 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified By (Role Owner) - 993 - 1'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/Span 1 to 11'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/Span 1 to 11'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_All (1)'))

WebUI.click(findTestObject('Object Repository/MonitorPaaS/Rough/Page_Snapshot Report/button_All (1)'))

WebUI.verifyElementClickable(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/inputselectUnselectAll 202'))

WebUI.click(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/inputselectUnselectAll 202'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'), 
    'COMPMITIGATIONS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'), 
    'COMPMITIGATIONS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/select_Mitigations and Controls (1) (1) (1) (1) (1)'), 
    'COMPMITIGATIONS', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/textarea_P10_JUSTIFICATION (1) (1) (1) (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/textarea_P10_JUSTIFICATION (1) (1) (1) (1) (1)'), 
    GlobalVariable.Justification_AggregatedLevel)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/span_a-Icon icon-up-chevron - 0101'))

WebUI.click(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/span_a-Icon icon-up-chevron - 0101'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Verify Selection - 52'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Verify Selection - 52'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/h2_Selected records successfully verified (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/input_p_ignore_10 -2'), 
    '')

WebUI.setText(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/input_p_ignore_10 -2'), 
    GlobalVariable.Justification_AggregatedLevel)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified (1) (1) (1) - 153 (1) (1) - Copy'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified (1) (1) (1) - 153 (1) (1) - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Remediation Status of Role Owner (1) (1) (1) - 150 (1) (1) - Copy'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Remediation Status of Role Owner (1) (1) (1) - 150 (1) (1) - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Justification of Role Owner (1) (1) (1) - 154 (1) (1) - Copy'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Justification of Role Owner (1) (1) (1) - 154 (1) (1) - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified On (Role Owner) (1) (1) (1) - 151 (1) (1) - Copy'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified On (Role Owner) (1) (1) (1) - 151 (1) (1) - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified By (Role Owner) (1) (1) (1) - 152 (1) (1) - Copy'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/a_Verified By (Role Owner) (1) (1) (1) - 152 (1) (1) - Copy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf (2)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/button_a-Button a-IRR-button a-Button--noUI_9e60bf (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/span_fa fa-search'))

WebUI.click(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/span_fa fa-search'))

WebUI.scrollToElement(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/h2_Detail Report'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/h2_Detail Report'))

WebUI.scrollToElement(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/span_1 -                    5 of           _069291 - Copy'), 
    0)

WebUI.verifyElementVisible(findTestObject('deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/span_1 -                    5 of           _069291 - Copy'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Actions - 40'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Filter - 41'))

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_User NameStart EntryStart Entry Name_0786d6 - 42'), 
    'VERIFIED', true)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'))

WebUI.selectOptionByValue(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/select_is nullis not nulllikenot likeinnot _ 43'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.click(findTestObject('deba3/SODReviewApproval/Page_User Manage Violation/button_Apply - 44'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/button_Submit and Close'))

WebUI.click(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_User Manage Violation/button_Submit and Close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/AggregatedLevel_SODReviewApproval/Page_Thank You and Manage Review Action sen_69f61f/h2_Thank You and Manage Review Action sent _ae17e8'))

WebUI.closeBrowser()

