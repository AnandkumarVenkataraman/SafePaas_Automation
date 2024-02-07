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

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_COMPANY (1) (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_USERNAME (1) (1) (1) (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_PASSWORD (1) (1) (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/button_Login (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1_2 (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1_2 (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/a_Manage Rule Tags (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/a_Manage Rule Tags (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/select_EditTag NameTag DescriptionTag Code'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/select_EditTag NameTag DescriptionTag Code'), 
    'TAG_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/buttonR189436115360253186_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/buttonR189436115360253186_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/a_New'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/a_New'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/td_New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/span_1 -                    1 of           _e353a0'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/a_Manage Activity'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (1)'), 
    'NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/input_p_ignore_10 (1)'), '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/input_p_ignore_10 (1)'), 'Maintain Customer Master')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Apply (1)'))

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Activity/span_1 -                    1 of           _e353a0 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/span_1 -                    1 of           _e353a0 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/img_apex-edit-page (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/img_apex-edit-page (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/label_Name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/label_Description'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/td_Maintain Customer Master and CreateUpdat_c53648'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/td_Approved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/span_Entry'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/span_Entry'))

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Activity Entries/span_1 -                    3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_1 -                    3'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/a_Environment Name'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/a_Environment Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/a_KTLN_CloudERP'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/a_KTLN_CloudERP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/td_Create new customers to record and accou_3fc0c8'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/td_Allows customer account site addresses to be corrected. If assigning, also assign the ability to view the customer account site'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/td_Manage customer account and site information, and the relationship with the customer'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/a_Manage Activity'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (1)'), 
    'NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/input_p_ignore_10 (1)'), '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/input_p_ignore_10 (1)'), 'Maintain Supplier Master')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/button_Apply (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/td_Maintain Supplier Master'))

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Activity/span_1 -                    1 of           _e353a0 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/span_1 -                    1 of           _e353a0 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/img_apex-edit-page (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity/img_apex-edit-page (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/label_Name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/label_Description'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/td_Maintain Supplier Master and Create Purc_346a59'))

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_AddEdit Activity/td_Approved'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/td_Approved'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/span_Entry'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_AddEdit Activity/span_Entry'))

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Activity Entries/span_1 -                    3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_1 -                    3'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/td_Allows importing of suppliers'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/td_Allows import of external payee information and bank accounts belonging to suppliers, supplier sites, and supplier addresses'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/td_Allows update of external bank accounts'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Review Rules/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Review Rules/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Add Rule (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Add Rule (1) (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/input_P10_NAME (1) (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/input_P10_NAME (1) (1) (1)'), 'Maintain Customer Master vs. Maintain Supplier Master_Jan312024_V1')

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/textarea_P10_DESCRIPTION (1) (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/textarea_P10_DESCRIPTION (1) (1) (1)'), 
    'Maintain Customer Master vs. Maintain Supplier Master_Jan312024_V1')

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/select_Select any OneAllMutually ExclusiveI_b1f6bb (1) (1) (1)'), 
    'Null', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/select_Select any OneAllMutually ExclusiveI_b1f6bb (1) (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/select_Select any OneAllMutually ExclusiveI_b1f6bb (1) (1) (1)'), 
    'SET', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/button_Create (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/button_Create (1) (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/h2_Action Processed (1) (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/span_Rule Attributes (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Add Rule/span_Rule Attributes (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Attributes/select_Select any OneAllMutually ExclusiveI_b1f6bb (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Attributes/select_Select any OneHIGHMEDIUMLOW (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Attributes/select_Select any OneHIGHMEDIUMLOW (1) (1)'), 
    'H', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Attributes/select_Select any OneSOD PreventiveSOD Dete_369111 (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Attributes/select_Select any OneSOD PreventiveSOD Dete_369111 (1) (1)'), 
    'DT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Attributes/button_Next (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Attributes/button_Next (1) (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/span_New (1) (1)'))

WebUI.comment('Note is mentioned in the Activities tab below Rule Entries, requesting to add the Condition and Group')

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/li_If Condition is not selected, it will be_5fb211 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/li_If Condition is not selected, it will be_5fb211 (1)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Note is mentioned in the Activities tab below Rule Entries, requesting to add the Condition and Group')

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/li_If Group is not selected, it will be mar_923015 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/li_If Group is not selected, it will be mar_923015 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/select_Select any OneAP_CREATE_PAYABLES_INV_677259 (1) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/select_Select any OneAP_CREATE_PAYABLES_INV_677259 (1) (1)'), 
    '27300', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/label_Activity One (1)'))

WebUI.comment('Note is mentioned in the Activities tab below Rule Entries, requesting to add the Condition and Group')

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/li_If Condition is not selected, it will be_5fb211 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/li_If Condition is not selected, it will be_5fb211 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/li_If Group is not selected, it will be mar_923015 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/li_If Group is not selected, it will be mar_923015 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/span_Total 3 (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/span_Total 3 (1)'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/select_Select any OneAP_CREATE_PAYABLES_INV_677259_1 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/select_Select any OneAP_CREATE_PAYABLES_INV_677259_1 (1)'), 
    '27301', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/label_Activity Two (1)'))

WebUI.comment('Note is mentioned in the Activities tab below Rule Entries, requesting to add the Condition and Group')

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/li_If Condition is not selected, it will be_5fb211 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/li_If Condition is not selected, it will be_5fb211 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/li_If Group is not selected, it will be mar_923015 (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/li_If Group is not selected, it will be mar_923015 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/span_Entry Name (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/span_Entry Name (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/span_Activity Group Code (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/span_Activity Group Code (1)'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Functions/span_Total 6 (1)'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/span_Total 6 (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/button_Next (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Functions/button_Next (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Exceptions/h2_Rule entries successfully saved (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Exceptions/span_People (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Exceptions/span_People (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Approvers/select_Select any OneDPATELKATALON_ADMINKTL_c5e368 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Approvers/select_Select any OneDPATELKATALON_ADMINKTL_c5e368 (1)'), 
    '100912', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Approvers/select_Select any OneApproverOwnerReviewer (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Approvers/select_Select any OneApproverOwnerReviewer (1)'), 
    '6719', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Approvers/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Approvers/button_Create'))

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Rule Approvers/td_KATALON_ADMIN'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Approvers/td_KATALON_ADMIN'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Tag/span_Maintain Customer Master vs. Maintain _61ab7f (1)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Functions/button_Next (1) - 884'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Functions/button_Next (1) - 884'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Rough/Page_Tag/option_ALL'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Rough/Page_Tag/buttonP58_RULE_TAGS_REMOVE'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba1/Rough/Page_Tag/buttonP58_RULE_TAGS_REMOVE'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Rough/Page_Tag/option_New'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Rough/Page_Tag/buttonP58_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Rough/Page_Tag/buttonP58_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Tag/button_Submit for Approval (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Tag/button_Submit for Approval (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Report/h2_Successfully submitted for approval (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Report/span_In Approval Progress (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Rule Report/button_t-Button t-Button--noUI t-Button--ic_cbe08f (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Rule Report/button_ktln_eam_user1 (1) - 158'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Rule Report/button_ktln_eam_user1 (1) - 158'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Rule Report/a_Logout (1) - 173'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Rule Report/a_Logout (1) - 173'))

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_COMPANY (1) (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_USERNAME (1) (1) (1) (1) (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_PASSWORD (1) (1) (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/button_Login (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/select_PriorityMessage TypeRecipient RoleSu_d404c1 (1)'), 
    'SUBJECT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/input_p_ignore_10 (1)'), '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/input_p_ignore_10 (1)'), 'Jan31')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Home/a_The Maintain Customer Master vs. Maintain_be9380 - 442'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Home/a_The Maintain Customer Master vs. Maintain_be9380 - 442'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Notification/label_Approve'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Notification/label_Approve'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Notification/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Notification/button_Go'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Home/button_katalon_admin - 922'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Home/button_katalon_admin - 922'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Home/a_Logout - 1022'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Home/a_Logout - 1022'))

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_COMPANY (1) (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_USERNAME (1) (1) (1) (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_PASSWORD (1) (1) (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/button_Login (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (3) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (3) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Home/a_Manage Rules_1 - 567'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Home/a_Manage Rules_1 - 567'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1) (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1) (1) (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/input_p_ignore_10'), 'Jan31')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/button_Apply'))

WebUI.scrollToElement(findTestObject('deba1/ManageActivity/Page_Manage Rules/td_Approved'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Rules/td_Approved'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

