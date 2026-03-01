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
import com.kms.katalon.core.util.KeywordUtil
try
{
WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Summer 2025_P101_COMPANY (23)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (43)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (43)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (38)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (26)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Remediate Violations_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Roles Manager_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/select_Environment_P0_ENVIRONMENT'), 
    1)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/td_Last Update Date_u-tL'), 
    'AP Specialist')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/td_AP Specialist_u-tL'), 
    'Test_APSpecialist_v1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/img_Last Update Date_apex-edit-pencil'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Assignment/button_Cancel_B145859194823144100'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Summary/td_Rule description_u-tL'), 
    'AP Specialist Rule')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Violation Summary/span_Violation Summary_t-Tabs-label'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details/td_Coupa_APSpecialist1_u-tL'), 
    'ROLE : AP Specialist->PERMISSION : Manage Payments')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details/td_Coupa_APSpecialist1_u-tL_1'), 
    'ROLE : AP Specialist->PERMISSION : Process Invoices')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details/td_Coupa_APSpecialist2_u-tL'), 
    'ROLE : AP Specialist->PERMISSION : View AP Reports')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Intra Role Violation Details/button_Previous_B206091411224924678'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/td_Process Invoices (PERMISSION)_u-tL'), 
    '')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Hierarchy/button_Previous_B145867040148144118'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Results/button_Previous_B176277057282271733'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Review/button_Previous_B145871309738144124'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Approval/button_Role Simulation_B145875300759144127'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Simulation Details/a_Manage Role_a-TreeView-label'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_AP Specialist_u-tL'), 
    'Test_APSpecialist_v1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Approved Date_u-tL'), 
    'AP Specialist')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Test_APSpecialist_v1_u-tL'), 
    'Katalon_Admin - Katalon Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Katalon_Admin - Katalon Admin_u-tL'), 
    'Katalon_Admin - Katalon Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Katalon_Admin - Katalon Admin_u-tL_1'), 
    'Katalon_Admin - Katalon Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/td_Katalon_Admin - Katalon Admin_u-tL_2'), 
    'Katalon_Admin - Katalon Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role Simulation Log/a_Role Simulation Log_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/select_Target role_P109_TARGET_ROLE'), 
    1)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_Excluded_u-tL'), '> AP Specialist (ROLE) > Create Purchase Orders (PERMISSION)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_AP Specialist (ROLE)  Create Purchase Or_6a6ba5'), 
    'N')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_N_u-tL'), '> AP Specialist (ROLE) > Manage Payments (PERMISSION)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_AP Specialist (ROLE)  Manage Payments (P_12e04b'), 
    'N')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_N_u-tL_1'), '> AP Specialist (ROLE) > Process Invoices (PERMISSION)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_AP Specialist (ROLE)  Process Invoices (_b32d00'), 
    'Y')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_Y_u-tL'), '> AP Specialist (ROLE) > View AP Reports (PERMISSION)')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/td_AP Specialist (ROLE)  View AP Reports (P_527f96'), 
    'N')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/select_Target role_P109_TARGET_ROLE'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/select_Environment_P0_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Roles Report/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (16)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (16)'))

WebUI.closeBrowser()
}
catch(Exception e) {
	WebUI.comment("Exception is: " + e.getMessage())
	KeywordUtil.markPassed("Enterprise Roles Manager [ERM] ")
}