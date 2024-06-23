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

WebUI.comment('launch the url in IQA : https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/input_P101_COMPANY (4) (1)'), 'KAT')

WebUI.comment('Enter the company as kAT')

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/input_P101_USERNAME (4) (1)'), 'KTLN_EAM_USER1')

WebUI.comment('Enter username as KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/input_P101_PASSWORD (4) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Login/button_Login (4) (1)'))

WebUI.comment('Click on Login button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle (4) (1)'))

WebUI.comment('Click on AccessPaaS navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1 (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1 (4) (1)'))

WebUI.comment('Click on Enterprise Access Monitor navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1_2 (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/span_a-TreeView-toggle_1_2 (4) (1)'))

WebUI.comment('Click on AccessPaaS navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/a_Manage Rule Tags (4) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Home/a_Manage Rule Tags (4) (1)'))

WebUI.comment('Click on Setup navigation dropwdown menu')

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

WebUI.comment('Filter with the Tag_Name as PO_AP')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba3/Sample1/Page_Manage Tag/span_1 -                    1 of           _e353a0'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.refresh()

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Manage Tag/a_click _Manage Activity'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Manage Tag/a_click _Manage Activity'))

WebUI.comment('Go to Manage Activity')

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

WebUI.comment('Filter with the name as "Create Purchase orders"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.comment('click on the edit icon')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Name (4)'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the element present : Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Description (4)'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify th element present: Description')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/td_Create Purchase Orders vs. Bank Account _2ea59f'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    5 (3)'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    5 (3)'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.comment('go to Entry tab')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('Click on Select details of the 1st record')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Environment Name (10)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Environment Name (10)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_KTLN_CloudERP (10)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_KTLN_CloudERP (10)'))

WebUI.comment('Filter with environment name as"KTLN_CloudERP"')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006106009'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.comment('close the select details')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('click on select details of the 2nd record')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006103946'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('click on select details of the 3rd record')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006104842'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('Click on Select details of the 4th record')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006101941'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('click on select details of the 5th record')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006100181'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    5'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.refresh()

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Manage Tag/a_click _Manage Activity'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Manage Tag/a_click _Manage Activity'))

WebUI.comment('Click on Manage Activity')

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

WebUI.comment('Filter with name as "Approve Payables Invoices"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.comment('Click on the edit icon')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Name (4)'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the element present : Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Description (4)'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the element present : Description')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/a_Rule Name (3)'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/td_Create Purchase Orders vs. Approve Payab_057454'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    9 (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    9 (3)'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.comment('Go to Entry tab')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('click on select details of the 1st record')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006103379'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('click on select details of the 2nd record')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105816'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105816'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.comment('click on select details of the 3rd record')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105345'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.refresh()

WebUI.verifyElementClickable(findTestObject('deba1/ManageActivity/Page_Manage Tag/a_click _Manage Activity'))

WebUI.click(findTestObject('deba1/ManageActivity/Page_Manage Tag/a_click _Manage Activity'))

WebUI.comment('Go to Manage Activity tab')

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

WebUI.comment('Select th filter "Bank Account reconcilliation"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity/img_apex-edit-page (4)'))

WebUI.comment('click on edit icon')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/label_Name (4)'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the element present : Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/td_Create Purchase Orders vs. Bank Account _2ea59f'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    7 (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_1 -                    7 (3)'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_AddEdit Activity/span_Entry (3)'))

WebUI.comment('go to Entry tab')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006102449'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006101929'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/img_apex-edit-view (3)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/td_300000006105548'), 
    0)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_ui-button-icon ui-icon ui-icon-closethick (3)'))

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_1 -                    3'), 
    0, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/span_a-TreeView-toggle'))

WebUI.comment('Click on "Define scope"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Activity Entries/a_Manage Rules'))

WebUI.comment('Click on Manage Rules')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.comment('Click on environment : KTLN_CloudERP')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Import Rules (1)'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/button_Import Rules (1)'))

WebUI.comment('Click on Import Rules')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_People'), 0, 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneApproverOwnerReviewer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneApproverOwnerReviewer'), 
    '6719', true)

WebUI.comment('Select the Role as Owner')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), 
    '100912', true)

WebUI.comment('Select the User as \'Katalon_Admin"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.comment('Click on button create')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Created Successfully'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), 
    '100944', true)

WebUI.comment('Sellect the user as "KTLN_EAM_USER1"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.comment('Click on Create')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Created Successfully'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/select_Select any oneDPATELKATALON_ADMINKTL_74093f'), 
    '66812854', true)

WebUI.comment('Select the user as "DPATEL\'')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Create'))

WebUI.comment('click on create button')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Created Successfully'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('deba2/RuleCreation_Import/Page_Upload File/span_1 - 3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/span_1 - 3'), 0, 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.comment('click on Upload file section')

WebUI.verifyElementText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/input_P68_LOAD_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/input_P68_LOAD_NAME'), 'KTLNAutomation_ImportFile_June22_V1')

WebUI.comment('Provide the load name')

WebUI.verifyElementPresent(findTestObject('deba2/RuleCreation_Import/Page_Upload File/input_P68_FILE_CONTENT - 144'), 0, 
    FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('deba2/RuleCreation_Import/Page_Upload File/input_P68_FILE_CONTENT - 144'), X)

WebUI.comment('Choose the .csv file')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/label_u-checkbox'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/label_u-checkbox'))

WebUI.comment('check the auto-approval')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Upload Data'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Upload Data'))

WebUI.comment('click on upload data')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_Action Processed. Control file created l_f8bb6e'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Upload is successfull')

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/td_KTLNAutomation_ImportFile_Jan17_V1'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/td_Complete'), 0, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.comment('Go to Upload section')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Import Rules'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/button_Import Rules'))

WebUI.comment('Click on Import Rules')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Upload File/h2_success'), 0, 
    FailureHandling.OPTIONAL)

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

WebUI.comment('Go to Manage Rules')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.comment('select the environment as "KTLN_CloudERP"')

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

WebUI.comment('Select the Rules tag as PO_AP')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Bank Account R_9fbc50'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Bank Account R_9fbc50'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Bank Account R_9fbc50'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_Approved'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Rules'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Rule Attributes'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Activities'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_People'), 0, 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_1 - 1'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/a_Manage Rules'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/a_Manage Rules'))

WebUI.comment('Go to Manage Rules')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Approve Payabl_59bd6f'))

WebUI.click(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Manage Rules/a_Create Purchase Orders vs. Approve Payabl_59bd6f'))

WebUI.comment('Select the Rule name')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_Approved'), 
    0, FailureHandling.OPTIONAL)

WebUI.comment('Verify the status as Approved')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Rule Attributes'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_Activities'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/h2_People'), 0, 
    FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba2/RuleCreation_Import/Page_Rule Report/span_1 - 1'), 0, 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.closeBrowser()

