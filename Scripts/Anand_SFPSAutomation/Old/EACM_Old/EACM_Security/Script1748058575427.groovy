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

//Verify the foll. ->
//Company Settings -> User# is assigned EACM
//EACM > Setup > Manage Roles [Function-read access and Function-write access]
//EACM > Setup > Assign Roles
//Login as user# and verify

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (9)'), 'kat')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (9)'), 
    'katadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (9)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/span_Users Access'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900'), 
    'ANANDK1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_ANANDK1'), 
    'ANANDK1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise Access Certification'), 
    'Enterprise Access Certification')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_-'), '-')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_concat(Search for , , ANANDK1, , )_a_9456c8'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/span_Manage Load Query_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/span_Manage User Access_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/a_Manage EACM Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EACM Roles/input_Create_R635717313875105759_search_field'), 
    'EACM_ReadOnly')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EACM Roles/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EACM Roles/img_EACM_ReadOnly_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/label_Manage Certification - View only Acce_ab60a0'), 
    'Manage Certification - View only Access for Manage Certification')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/label_Manage Certification - Able to Create_e99237'), 
    'Manage Certification - Able to Create , Get or Post Certification')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/label_Manage Certification - Able to Create_e99237'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_CreateEdit Role/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EACM Roles/button_concat(Row text contains , , EACM_Re_2f0ff7'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage EACM Roles/a_Assign EACM Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EACM Roles/input_Create_R506984600294913364_search_field'), 
    'ANANDK1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EACM Roles/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EACM Roles/td_ANANDK1'), 'ANANDK1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EACM Roles/td_EACM_ReadOnly'), 
    'EACM_ReadOnly')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EACM Roles/button_concat(Row text contains , , ANANDK1_5922d3'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign EACM Roles/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (9)'), 'kat')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (9)'), 
    'anandk1')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (9)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification (1)'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/div_Manage Certification'), 
    0)

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/div_Manage Certification'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_anandk1'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout_1'))

