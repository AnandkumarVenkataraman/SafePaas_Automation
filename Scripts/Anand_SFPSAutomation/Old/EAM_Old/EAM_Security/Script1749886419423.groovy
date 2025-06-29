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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Manage Company (1)'))

WebUI.click(findTestObject('Object Repository/Page_Company/span_Users Access'))

WebUI.setText(findTestObject('Object Repository/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900'), 
    'ANANDK1')

WebUI.click(findTestObject('Object Repository/Page_Users Application Access/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Users Application Access/td_ANANDK1'), 'ANANDK1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Users Application Access/td_Enterprise Access Monitor'), 
    'Enterprise Access Monitor')

WebUI.click(findTestObject('Object Repository/Page_Users Application Access/button_concat(Search for , , ANANDK1, , )_a_9456c8'))

WebUI.click(findTestObject('Object Repository/Page_Users Application Access/a_Inbox'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Access Monitor_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Roles Manager_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Manage EAM Roles'))

WebUI.setText(findTestObject('Object Repository/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field'), 'KTLN_EAM_ReadOnly_Role')

WebUI.click(findTestObject('Object Repository/Page_Manage EAM Roles/button_Go'))

WebUI.click(findTestObject('Object Repository/Page_Manage EAM Roles/img_KTLN_EAM_ReadOnly_Ro_apex-edit-page'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Define Security/label_Manage Rule Tags - View only access f_9c313e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Define Security/label_Manage Rule Tags - Read and update th_850178'), 
    'Manage Rule Tags - Read and update the rule tag.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Define Security/label_Manage Rules - View only Access.Edit _bd5df0'), 
    'Manage Rules - View only Access.Edit button is disabled.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Define Security/label_Manage SOD Test - View only Access fo_f151f9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Define Security/label_Manage SOD Test - Create and update a_658c28'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Define Security/label_Manage Violation - Read and update th_8d8075'), 
    'Manage Violation - Read and update the Violations and submit for Approval.')

WebUI.click(findTestObject('Object Repository/Page_Define Security/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Manage EAM Roles/button_concat(Row text contains , , KTLN_EA_66901d'))

WebUI.click(findTestObject('Object Repository/Page_Manage EAM Roles/a_Assign EAM Roles'))

WebUI.setText(findTestObject('Object Repository/Page_Assign EAM Roles/input_Assign EAM Roles_R167272238747558503__63586e'), 
    'ANANDK1')

WebUI.click(findTestObject('Object Repository/Page_Assign EAM Roles/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assign EAM Roles/img_ANANDK1_apex-edit-page'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Assign EAM Roles/td_ANANDK1'), 'ANANDK1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assign EAM Roles/td_KTLN_EAM_ReadOnly_Role'), 0)

WebUI.click(findTestObject('Object Repository/Page_Assign EAM Roles/button_concat(Row text contains , , ANANDK1_5922d3'))

WebUI.click(findTestObject('Object Repository/Page_Assign EAM Roles/button_katadmin'))

WebUI.click(findTestObject('Object Repository/Page_Assign EAM Roles/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 'ANANDK1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Manage Rules'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    '5888', true)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Manage Rules/div_Export RulesFilter False - Positives'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Manage Rules/span_Manage ERP Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Manage Rules/a_Manage SOD Test'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Manage SOD Test/div_Manage SOD Test'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage SOD Test/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    'Select any one', true)

WebUI.click(findTestObject('Object Repository/Page_Manage SOD Test/a_Inbox'))

WebUI.click(findTestObject('Object Repository/Page_Home/button_anandk1'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Logout'))

