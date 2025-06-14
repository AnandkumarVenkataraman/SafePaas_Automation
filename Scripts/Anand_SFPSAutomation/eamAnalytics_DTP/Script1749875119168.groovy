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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (3)'), 
    'katadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (3)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (3)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rules (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00 (2)'), 
    '5888', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Filter False - Positives (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_Oracle eBusiness Suite'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_Application'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_ADS_DEV (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/td_ADS Development (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/label_Toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/button_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/span_Dashboard_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/span_Intra Role Violation Details Report_a-_1a3aa8'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_User Listing and access'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/a_AALLEN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/td_Arlene'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/td_Allen'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/td_Allen, Miss Arlene Nancy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/td_nobodylocalhost'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/td_Yes'), 0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/a_User Entry Access Listing'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_EBizApp_JDBC_Env'), 
    0)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/input_Schedule_R25164124913742933_search_field'), 
    'AALLEN')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_EBizApp_JDBC_Env'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_AALLEN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_Arlene'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_Allen'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_Allen, Miss Arlene Nancy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_nobodylocalhost'), 
    'nobody@localhost')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_Yes'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_Responsibility'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_AP_CREDIT_CARDS_PROGRESS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_Procurement Cards, Progress SampL'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_01-JUL-2000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_-'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_1002426'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/td_Active'), 
    0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/button_concat(Row text contains , , AALLEN,_21c57e'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/a_User Entry Attribute Access Listing'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Attribute Access Listing/span_No data found'), 
    0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Attribute Access Listing/a_Entry Listing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81'), 
    '21', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_OPM_REGULATORY_ADMI-5571001676'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_OPM Regulatory Administrator'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_OPM Regulatory Administrator_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1001676'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_No'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_-'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81'), 
    '480', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_JTF_CALENDAR_MAIN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_JTF_CALENDAR_MAIN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Main Menu for Calendar JTF Component'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1002244'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_-'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81'), 
    '481', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_XLA_TAB_ACCT_DEF_ASSIGN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_SLA Assign ADR to Transaction Account De_e7de78'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Assign Sources to Transaction Account De_53e1b8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1001031365'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_-'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81'), 
    '482', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_PER_ENDECA_PEOPLE_SEARCH_GRANT'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_PER_ENDECA_PEOPLE_SEARCH_GRANT'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_PER Endeca People Search Grant'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_UMXPER_ENDECA_PEOPLE_SEARCH_ROLE'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_-'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81'), 
    '483', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_JGZZRCAK_XML'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Receipt Acknowledgment Letter (XML) - No_f05182'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Receipt Acknowledgment Letter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_129541'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_No'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_-'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81'), 
    '582', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_MILLER'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_MILLER'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_MILLER'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_-'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81'), 
    '584', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_EID ETL Request Group'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_EBS Information Discovery ETL Request Group'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1001893'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/td_-'), 0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/a_Entry Attributes'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/td_GRANTFLAG_YES'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/td_Active'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/td_Function Grant Flag'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/td_CE Account Subtab'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/td_Active'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/td_Menu'), 0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/a_Access Hierarchy'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Access Type_P13_RESPONSIBILITY_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/input_Search_a-PopupLOV-search apex-item-text'), 
    'General Ledger Super User')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Search_a-Button a-PopupLOV-doSearch'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/li_AU General Ledger Super UserAU_GENERAL_L_3f6d89'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Go'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    'Select any one', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/a_Inbox'))

