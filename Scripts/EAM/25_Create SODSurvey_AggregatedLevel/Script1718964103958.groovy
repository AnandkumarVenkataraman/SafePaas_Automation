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

WebUI.setText(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Login/input_P101_COMPANY (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Login/input_P101_USERNAME (1) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Login/input_P101_PASSWORD (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/a_Manage Review Status (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/a_Manage Review Status (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/select_NameDescriptionStatusStart DateEnd D_54845d (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/select_NameDescriptionStatusStart DateEnd D_54845d (1)'), 
    'STATUS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    '!=', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/buttonR249123015355222332_expression_icon_link (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/buttonR249123015355222332_expression_icon_link (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/a_Completed (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/a_Completed (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_Apply (1)'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/a_Inbox (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/a_Inbox (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4_5 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4_5 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4_5_6 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4_5_6 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4_5_6 (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/span_a-TreeView-toggle_1_2_3_4_5_6 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/a_SOD Review Configuration (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Home/a_SOD Review Configuration (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_SOD Review Configuration/label_Aggregated Level'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_SOD Review Configuration/label_Aggregated Level'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_Update'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_Update'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/deba3/ManageSOdreview/Page_SOD Review Configuration/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageSOdreview/Page_Home/a_Inbox - Copy'))

WebUI.click(findTestObject('deba3/ManageSOdreview/Page_Home/a_Inbox - Copy'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle - Copy'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1 - Copy'))

WebUI.click(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1 - Copy'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2 - Copy'))

WebUI.click(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2 - Copy'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2_3 - Copy'))

WebUI.click(findTestObject('deba3/ManageSOdreview/Page_Home/span_a-TreeView-toggle_1_2_3 - Copy'))

WebUI.verifyElementClickable(findTestObject('deba3/ManageSOdreview/Page_Home/a_Manage Review Actions - Copy'))

WebUI.click(findTestObject('deba3/ManageSOdreview/Page_Home/a_Manage Review Actions - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Actions/button_Create (1)'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Actions/button_Create (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/select_Select any oneKTLN_SODTest_Jan05_V2__533efa - 12'))

WebUI.selectOptionByLabel(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/select_Select any oneKTLN_SODTest_Jan05_V2__533efa - 12'), 
    'KTLN_SODTest_May28_PO_AP', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Initiate User Violation Survey/input_P181_NAME'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Initiate User Violation Survey/input_P181_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Initiate User Violation Survey/input_P181_NAME'), 
    GlobalVariable.SODSurveyName_AggregatedLevel)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Initiate User Violation Survey/textarea_P181_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Initiate User Violation Survey/textarea_P181_DESCRIPTION'), 
    GlobalVariable.SODSurveyName_AggregatedLevel)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar Start Date'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar Start Date'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_22 - Copy'))

WebUI.click(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_22 - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_23 - Copy'))

WebUI.click(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_23 - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Initiate User Violation Survey/button_Create'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Initiate User Violation Survey/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Actions/a_Manage Review Status'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Actions/a_Manage Review Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.click(findTestObject('Object Repository/deba3/AggregateLevel_SODReview/Page_Manage Review Status/button_a-Button a-IRR-button a-Button--noUI_9e60bf'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/select_NameDescriptionStatusStart DateEnd D_54845d'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/input_p_ignore_10'), 
    GlobalVariable.SODSurveyName_AggregatedLevel)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/span_1 -                    1'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/a_KTLN_SODReview_Jan22_V2'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Manage Review Status/a_KTLN_SODReview_Jan22_V2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/h2_User Access'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/h2_Open'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_User Access Validation/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('deba3/ManageReviewStatus/Page_Manage Review Status/a_KTLN_SODReview_Jan22_V2'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser()

