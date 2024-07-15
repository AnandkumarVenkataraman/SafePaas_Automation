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

WebUI.setText(findTestObject('Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Page_Login/input_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Page_Login/input_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Page_Home/a_Manage Rule Tags'))

WebUI.click(findTestObject('Page_Home/a_Manage Rule Tags'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/button_Create'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/input_P46_TAG_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/input_P46_TAG_NAME'), 'PO_AP')

WebUI.verifyElementText(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/textarea_P46_TAG_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/textarea_P46_TAG_DESCRIPTION'), 
    'PO_AP')

WebUI.verifyElementText(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/input_P46_TAG_CODE'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/input_P46_TAG_CODE'), 'PO_AP')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/RuleCreation_PO_AP_Import/Page_AddEdit Tag/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/a_Manage Activity'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/button_Actions'))

WebUI.click(findTestObject('Page_Activity/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/button_Filter'))

WebUI.click(findTestObject('Page_Activity/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673'))

WebUI.selectOptionByValue(findTestObject('Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673'), 'NAME', true)

WebUI.verifyElementText(findTestObject('Page_Activity/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Page_Activity/input_p_ignore_10'), 'Create Purchase Orders')

WebUI.verifyElementClickable(findTestObject('Page_Activity/button_Apply'))

WebUI.click(findTestObject('Page_Activity/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/img_apex-edit-page'))

WebUI.click(findTestObject('Page_Activity/img_apex-edit-page'))

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/label_Name'))

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/label_Description'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.click(findTestObject('Page_Login/div_t-Form-inputContainer col col-null'))

WebUI.setText(findTestObject('Page_Login/input_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Page_Login/input_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Page_Home/a_Manage Activity'))

WebUI.click(findTestObject('Page_Activity/a_Name'))

WebUI.setText(findTestObject('Page_Activity/inputR242004504603843036_sort_widget_search_field'), 'Create Purchase Orders')

WebUI.sendKeys(findTestObject('Page_Activity/inputR242004504603843036_sort_widget_search_field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Activity/img_apex-edit-page'))

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/a_Rule Name'))

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/span_1 -                    5'))

WebUI.verifyElementClickable(findTestObject('Page_AddEdit Activity/span_Entry'))

WebUI.click(findTestObject('Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/a_Entry Name'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/a_Environment Name'))

WebUI.click(findTestObject('Page_Activity Entries/a_Environment Name'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/a_KTLN_CloudERP'))

WebUI.click(findTestObject('Page_Activity Entries/a_KTLN_CloudERP'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows management of purchase orders usi_5ee36a'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows a procurement agent to add a requisition line to a purchase order or update a purchase order line with a backing requisition line. The purchase order could be in an open or draft status'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows a procurement agent to run the Import Purchase Order concurrent program'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows a procurement agent to initiate changes to an approved purchase order'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows a procurement agent to create purchase orders without backing requisition lines and update purchase orders with or without backing requisition lines'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/span_1 -                    5'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/a_Manage Activity'))

WebUI.click(findTestObject('Page_Activity Entries/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/button_Actions'))

WebUI.click(findTestObject('Page_Activity/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Page_Activity/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673'))

WebUI.selectOptionByValue(findTestObject('Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673'), 'NAME', true)

WebUI.verifyElementText(findTestObject('Page_Activity/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Page_Activity/input_p_ignore_10'), 'Approve Payables Invoices')

WebUI.verifyElementClickable(findTestObject('Page_Activity/button_Apply'))

WebUI.click(findTestObject('Page_Activity/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/img_apex-edit-page'))

WebUI.click(findTestObject('Page_Activity/img_apex-edit-page'))

WebUI.verifyElementPresent(findTestObject('Page_AddEdit Activity/label_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_AddEdit Activity/label_Description'), 0)

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/a_Rule Name'))

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/span_1 -                    9'))

WebUI.verifyElementClickable(findTestObject('Page_AddEdit Activity/span_Entry'))

WebUI.click(findTestObject('Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/a_Entry Name'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows initiating the Oracle Fusion Payables invoice approval task flow'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows holding invoices from the approval task flow'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows approving of Oracle Fusion Payables invoices'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/span_1 -                    3'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/a_Manage Activity'))

WebUI.click(findTestObject('Page_Activity Entries/a_Manage Activity'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/button_Actions'))

WebUI.click(findTestObject('Page_Activity/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/span_Filter'))

WebUI.click(findTestObject('Page_Activity/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673'))

WebUI.selectOptionByValue(findTestObject('Page_Activity/select_EditNameDescriptionActivity CodeCrea_ba4673'), 'NAME', true)

WebUI.verifyElementText(findTestObject('Page_Activity/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Page_Activity/input_p_ignore_10'), 'Bank Account Reconciliation')

WebUI.verifyElementClickable(findTestObject('Page_Activity/button_Apply'))

WebUI.click(findTestObject('Page_Activity/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Page_Activity/img_apex-edit-page'))

WebUI.click(findTestObject('Page_Activity/img_apex-edit-page'))

WebUI.verifyElementPresent(findTestObject('Page_AddEdit Activity/label_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_AddEdit Activity/label_Description'), 0)

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/a_Rule Name'))

WebUI.verifyElementVisible(findTestObject('Page_AddEdit Activity/span_1 -                    7'))

WebUI.verifyElementClickable(findTestObject('Page_AddEdit Activity/span_Entry'))

WebUI.click(findTestObject('Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/a_Entry Name'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows create, review, update, and delete of bank statements'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows reconciliation of bank statements'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.click(findTestObject('Page_Activity Entries/img_apex-edit-view'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/td_Allows create, review, update, and delete of bank statement autoreconciliation exceptions'))

WebUI.click(findTestObject('Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick'))

WebUI.verifyElementVisible(findTestObject('Page_Activity Entries/span_1 -                    3'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Page_Activity Entries/a_Manage Rules'))

WebUI.click(findTestObject('Page_Activity Entries/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByValue(findTestObject('Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), '5409', 
    true)

WebUI.verifyElementClickable(findTestObject('Page_Manage Rules/button_Import Rules'))

WebUI.click(findTestObject('Page_Manage Rules/button_Import Rules'))

WebUI.verifyElementPresent(findTestObject('Page_Upload File/select_Select any oneApproverOwnerReviewer'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Upload File/select_Select any oneApproverOwnerReviewer'))

WebUI.selectOptionByValue(findTestObject('Page_Upload File/select_Select any oneApproverOwnerReviewer'), '6719', true)

WebUI.verifyElementPresent(findTestObject('Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), '100912', 
    true)

WebUI.verifyElementClickable(findTestObject('Page_Upload File/button_Create'))

WebUI.click(findTestObject('Page_Upload File/button_Create'))

WebUI.verifyElementClickable(findTestObject('Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), '100944', 
    true)

WebUI.verifyElementClickable(findTestObject('Page_Upload File/button_Create'))

WebUI.click(findTestObject('Page_Upload File/button_Create'))

WebUI.verifyElementClickable(findTestObject('Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), '66812854', 
    true)

WebUI.verifyElementClickable(findTestObject('Page_Upload File/button_Create'))

WebUI.click(findTestObject('Page_Upload File/button_Create'))

WebUI.verifyElementVisible(findTestObject('Page_Upload File/h2_Created Successfully'))

WebUI.verifyElementVisible(findTestObject('Page_Upload File/span_1 - 3'))

WebUI.click(findTestObject('Page_Upload File/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementPresent(findTestObject('Page_Upload File/h2_Upload File'), 0)

WebUI.verifyElementText(findTestObject('Page_Upload File/input_P68_LOAD_NAME'), '')

WebUI.setText(findTestObject('Page_Upload File/input_P68_LOAD_NAME'), 'KTLNAutomation_ImportRules_Jan17_V1')

WebUI.verifyElementClickable(findTestObject('Page_Upload File/input_P68_FILE_CONTENT'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Login/div_t-Form-inputContainer col col-null'))

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/ul_My InboxMy Dashboard'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Home/a_Manage Corrective Action'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/a_Manage Corrective Action'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/Page_Manage Corrective Action/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    '5409', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Page_Manage Corrective Action/a_Inbox'))

WebUI.click(findTestObject('Object Repository/deba3/Page_Manage Corrective Action/a_Inbox'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/a_Manage Rule Tags'))

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

WebUI.verifyElementVisible(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/span_1 -                    1 of           _e353a0'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/a_Manage SOD Test'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage SOD Test/button_Create'))

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_AddEdit Test/input_P35_REQUEST_NAME'), 'abcd')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_AddEdit Test/textarea_P35_REQUEST_DESCRIPTION'), 'abcd')

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/Sample1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'Select any One', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/Sample1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'DT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_AddEdit Test/option_PO_AP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_AddEdit Test/buttonP35_RULE_TAGS_MOVE'))

WebUI.closeBrowser()

