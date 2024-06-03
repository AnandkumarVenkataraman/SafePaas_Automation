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

WebUI.setText(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Login/input_P101_COMPANY (2)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Login/input_P101_USERNAME (2)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Login/input_P101_PASSWORD (2)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Login/button_Login (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2 (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2 (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Remediation Plan (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Remediation Plan (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c'), 
    'GCA_WORKFLOW', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/buttonR327963090047660484_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/buttonR327963090047660484_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/a_SOD Review'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/a_SOD Review'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/select_CodeMeaningDescriptionEnabledStart D_a4cb0c'), 
    'GCA_END_DATE', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/select_is nullis not nullis in the lastis n_82401e'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/select_is nullis not nullis in the lastis n_82401e'), 
    'is null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/td_MITIGATIONS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/td_Mitigations and Controls'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/td_11-JAN-24'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/EAM_Setup_ManageRemediationPlan/Page_Remediation Plan/td_SOD Review'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Inbox'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_Manage SOD Review'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3_4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Review Actions'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Review Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/button_Create'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/select_Select any oneKTLN_SODTest_Jan05_V2__533efa - 12'))

WebUI.selectOptionByLabel(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/select_Select any oneKTLN_SODTest_Jan05_V2__533efa - 12'), 
    'KTLN_SODTest_May27_V2', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/input_P181_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/input_P181_NAME'), 
    'KTLN_SODReview_May27_V1')

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/textarea_P181_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/textarea_P181_DESCRIPTION'), 
    'KTLN_SODReview_May27_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar Start Date'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar Start Date'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_22'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_22'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_23'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/a_23'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Create'))

WebUI.takeFullPageScreenshot()

WebUI.comment('This error is as expected because there are Roles which are not yet mapped/assigned to any Role-Group')

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/h2_1 error has occurred'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/select_Select any oneKTLN_SODTest_Jan05_V2__533efa - 12'))

WebUI.selectOptionByLabel(findTestObject('deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/select_Select any oneKTLN_SODTest_Jan05_V2__533efa - 12'), 
    'KTLN_SODTest_May28_PO_AP', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Create'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Create'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Initiate User Violation Survey/button_Create'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.comment('SOD Review survey <KTLN_SODReview_May27_V1> at Violation-level, has been initiated successfully, and the status is Open')

WebUI.click(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/button_t-Button t-Button--noUI t-Button--ic_cbe08f'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageRemediationPlan/Page_Manage Review Actions/a_Status'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('deba3/ManageReviewStatus/Page_Home/a_Inbox_1'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Inbox_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2)'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1 (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/span_a-TreeView-toggle_1_2_3_4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Review Status'))

WebUI.click(findTestObject('Object Repository/deba3/ManageReviewStatus/Page_Home/a_Manage Review Status'))

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
    'KTLN_SODReview_May27_V1')

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

