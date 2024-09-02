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

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.comment('Enter the company as kAT')

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.comment('Enter username as KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter the Password')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.comment('Click on Login button')

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.click(findTestObject('deba/Page_Home/span_Help_a-TreeView-toggle - 272'))

WebUI.comment('Click on AccessPaaS navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.click(findTestObject('deba/Page_Home/span_Access Monitor_a-TreeView-toggle - 372'))

WebUI.comment('Click on Enterprise Access Monitor navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle - 472'))

WebUI.comment('Click on Detect Violation navigation dropwdown menu')

WebUI.verifyElementClickable(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.click(findTestObject('deba1/Page_Manage Rules/a_Manage Violation - 572'))

WebUI.comment('Click on Manage Violation from the Navigation menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (2)'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Select the environment as "KTLN_CloudERP"')

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn - 123'))

WebUI.verifyElementText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    '')

WebUI.setText(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/input_a-PopupLOV-search apex-item-text - 799'), 
    GlobalVariable.SOD_Test)

WebUI.verifyElementClickable(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.click(findTestObject('deba1/FilterFalsePositives_EntriesRole/Page_Manage Violation/span_KTLN_SODTest_Dec22_V4_All - Copy'))

WebUI.delay(10)

WebUI.comment('Select the latest SOD test name created')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name (2)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name (2)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Rule Name (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Approve Payables Invoice vs. Asset Config_964ad3 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Approve Payables Invoice vs. Asset Config_964ad3 (1)'))

WebUI.comment('Select the Rule name: "Approve Payables Invoice vs. Asset Configuration Rule"')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Start Entry Name (2)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Start Entry Name (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/body_Inbox                ktln_eam_user1   _471806'))

WebUI.setText(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field (1)'), 
    'Asset Accountant[ORA_FA_ASSET_ACCOUNTANT_JOB]', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Object Repository/deba1/Page_Manage Violation/inputsearch_sort_widget_search_field (1)'), 
    Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

WebUI.comment('Select the Start Entry Name: "Asset Accountant[ORA_FA_ASSET_ACCOUNTANT_JOB]"')

WebUI.scrollToElement(findTestObject('deba1/Page_Manage Violation/span_1 -                   14 of           _0f7191 (1)'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/Page_Manage Violation/span_1 -                   14 of           _0f7191 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Verify the total recoords displayed')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/td_Open (2)'), 0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'), '8441', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_PrivilegeRole (1)'), '8441', 
    true)

WebUI.comment('Select the exception type as "Role" from the LOV ')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'), 
    'L', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_Manage Violation/select_Select any OneGlobalLocal (1)'), 
    'L', true)

WebUI.comment('Select the Exception scope as "Local" from the LOV')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/input_f01'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/input_f01'))

WebUI.comment('Select the 1st record')

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Submit (2)'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Submit (2)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/button_Submit (2)'))

WebUI.comment('click on submit button')

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), '')

WebUI.setText(findTestObject('Object Repository/deba1/Page_Add Exception/input_P64_JUSTIFICATION (2)'), GlobalVariable.Justification_Role_Local)

WebUI.comment('provide a unique Justification name')

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Add Exception/button_Submit (1)'))

WebUI.comment('Click on Submit button')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/h2_Action Processed (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Manage Exception (1)'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Manage Exception (1)'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage Violation/a_Manage Exception (1)'))

WebUI.comment('Go to Manage Exception from the Navigation menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Select the environment as "KTLN_CloudERP"')

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Exception/td_Approve Payables Invoice vs. Asset Confi_1e684b'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Exception/td_Role'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage Exception/td_In Approval Progress'), 0, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/button_ktln_eam_user1'))

WebUI.comment('Click on the KTLN_EAM_USER1 from the top of page')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_ApprovalProcess/Page_Manage Exception/a_Logout'))

WebUI.comment('Click on LogOut')

WebUI.closeBrowser()

