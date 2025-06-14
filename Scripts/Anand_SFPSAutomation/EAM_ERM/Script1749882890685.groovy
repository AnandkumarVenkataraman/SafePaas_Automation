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

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (5)'), 'kat')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (5)'), 
    'katadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (5)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (4)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (5)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (4)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Remediate Issues_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Role'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    '5888', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/button_Create'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/button_(Value Required)_P99_ENTRY_ID_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/input_Search_a-PopupLOV-search apex-item-text'), 
    'Application Developer')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/button_Search_a-Button a-PopupLOV-doSearch'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/span_Application Developer'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/input_(Value Required)_P99_TARGET_ENTRY'), 
    'Test_ApplicationDeveloper_Jun14_v3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/select_Katalon_Admin - Katalon AdminKtln_Ea_92f38f'), 
    '66812979', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/select_Katalon_Admin - Katalon AdminKtln_Ea_92f38f_1'), 
    '66812979', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/select_Katalon_Admin - Katalon AdminKtln_Ea_92f38f_1_2'), 
    '66812979', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/select_Katalon_Admin - Katalon AdminKtln_Ea_92f38f_1_2_3'), 
    '66812979', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/button_Create'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/button_Next'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Summary/button_Previous'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/span_Open'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/span_Open'), 'Open')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/span_Application Developer_1'), 
    'Application Developer')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/button_Next'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Summary/span_Intra Role Violation Details'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details/button_Next'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Add Entry'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/select_- Please select one -Menu'), 
    'MENU-480', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Menu_P107_NEW_ENTRY_ID_lov_btn'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/li_ITIL Incident manager'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Add'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Add Entry'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/select_- Please select one -Menu'), 
    'MENU-480', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Menu_P107_NEW_ENTRY_ID_lov_btn'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/li_IES_ROOT_PROFESSIONAL'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Add'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/input_ITIL Incident manager (MENU)_entryCheck'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Save'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Role Simulation process has been com_c675a5'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Generate Violations'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Results/button_Violations for Target Role were succ_6daa8b'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Results/button_Previous'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Next'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Results/button_Submit'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/button_Role Simulation details has been sub_b96980'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/a_Role Simulation Log'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/input_Create_R293203826599346273_search_field'), 
    'Test_ApplicationDeveloper_Jun14_v3')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Application Developer'), 
    'Application Developer')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Test_ApplicationDeveloper_Jun14_v3'), 
    'Test_ApplicationDeveloper_Jun14_v3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Katadmin - Kat Admin'), 
    'Katadmin - Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Katadmin - Kat Admin'), 
    'Katadmin - Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Katadmin - Kat Admin'), 
    'Katadmin - Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Katadmin - Kat Admin'), 
    'Katadmin - Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_KATADMIN'), 'KATADMIN')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_14-JUN-25'), 
    0)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/a_Roles Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/select_- Please select any -ERM56_ASSETS_PR_1ee5e1'), 
    '2713', true)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_Application Developer (RESPONSIBILITY)  _3e8c20'), 
    '> Application Developer (RESPONSIBILITY) > \tITIL Incident manager (MENU)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_Y'), 'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_Application Developer (RESPONSIBILITY)  _cea49c'), 
    '> Application Developer (RESPONSIBILITY) > IES_ROOT_PROFESSIONAL (MENU)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_N'), 'N')

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/select_- Please select any -ERM56_ASSETS_PR_1ee5e1'), 
    '- Please select any -', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/select_Select any oneCoupa_Env1EBizApp_JDBC_255a00'), 
    'Select any one', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/a_Inbox'))

