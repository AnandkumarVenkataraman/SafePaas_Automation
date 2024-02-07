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

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/input_P101_COMPANY (4) (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/input_P101_USERNAME (4) (1)'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/input_P101_PASSWORD (4) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/button_Login (4) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle (4) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1 (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1 (4) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1_2 (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1_2 (4) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/a_Manage Rule Tags (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/a_Manage Rule Tags (4) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/select_EditTag NameTag DescriptionTag Code'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/select_EditTag NameTag DescriptionTag Code'), 
    'TAG_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/input_p_ignore_10'), 'PO_AP')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/span_1 -                    1 of           _e353a0'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_Manage Tag/a_Manage Activity'))

WebUI.click(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_Manage Tag/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Actions (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Actions (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Filter (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Filter (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (4)'), 
    'NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/input_p_ignore_10 (4)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/input_p_ignore_10 (4)'), 'Create Purchase Orders')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Apply (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Apply (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Name (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Description (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/td_Create Purchase Orders vs. Bank Account _2ea59f'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    5 (3)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    5 (3)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Environment Name (10)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Environment Name (10)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_KTLN_CloudERP (10)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_KTLN_CloudERP (10)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006106009'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006103946'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006104842'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006101941'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006100181'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    5'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    5'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Activity'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Actions (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Actions (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Filter (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Filter (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (4)'), 
    'NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/input_p_ignore_10 (4)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/input_p_ignore_10 (4)'), 'Approve Payables Invoices')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Apply (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Apply (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Name (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Description (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/a_Rule Name (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/td_Create Purchase Orders vs. Approve Payab_057454'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    9 (3)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    9 (3)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006103379'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105816'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105816'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105345'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Activity'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Actions (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Actions (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/span_a-Menu-statusCol (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Filter (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673 (4)'), 
    'NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/input_p_ignore_10 (4)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/input_p_ignore_10 (4)'), 'Bank Account Reconciliation')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Apply (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/button_Apply (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Name (4)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/td_Create Purchase Orders vs. Bank Account _2ea59f'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    7 (3)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    7 (3)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006102449'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006101929'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105548'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Import Rules (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Import Rules (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_People'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneApproverOwnerReviewer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneApproverOwnerReviewer'), 
    '6719', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), 
    '100912', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Created Successfully'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), 
    '100944', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Created Successfully'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), 
    '66812854', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Created Successfully'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Upload File/span_1 - 3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_1 - 3'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/input_P68_LOAD_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/input_P68_LOAD_NAME'), 'KTLNAutomation_ImportFile_Jan31_V1')

WebUI.verifyElementPresent(findTestObject('deba2/RuleCreation_Import/Page_Upload File/input_P68_FILE_CONTENT - 144'), 0)

WebUI.uploadFile(findTestObject('deba2/RuleCreation_Import/Page_Upload File/input_P68_FILE_CONTENT - 144'), X)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/label_u-checkbox'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/label_u-checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Upload Data'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Upload Data'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Action Processed. Control file created l_f8bb6e'))

WebUI.comment('Upload is successfull')

WebUI.takeFullPageScreenshot()

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/td_KTLNAutomation_ImportFile_Jan17_V1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/td_Complete'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Import Rules'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Import Rules'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_success'))

WebUI.comment('Import Rule is success')

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/td_Approved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_c6bc05'), 
    'RULE_TAGS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/buttonR247793226539899118_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/buttonR247793226539899118_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_PO_AP'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_PO_AP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Bank Account R_9fbc50'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Bank Account R_9fbc50'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Bank Account R_9fbc50'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_Approved'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Rules'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Rule Attributes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_People'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_1 - 1'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Approve Payabl_59bd6f'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Approve Payabl_59bd6f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_Approved'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Rule Attributes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_People'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_1 - 1'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

