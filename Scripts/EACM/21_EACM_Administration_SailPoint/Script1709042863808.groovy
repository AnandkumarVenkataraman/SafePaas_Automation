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

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Login/input_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Login/input_P101_USERNAME (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Login/input_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Home/a_Manage Environment (1)'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Home/a_Manage Environment (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/select_Environment NameDescriptionStart Dat_e75d04'))

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/input_p_ignore_10'), 
    'SailPoint_Env')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/img_apex-edit-pencil'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Environment/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Environment/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Environment/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Environment/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Environment/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/a_Manage Data Source'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Environment/a_Manage Data Source'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_NameHost NameDatabaseUsernameLast Sy_c71232'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_NameHost NameDatabaseUsernameLast Sy_c71232'), 
    'DS_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/buttonR119140564844328612_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/buttonR119140564844328612_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/a_SailPoint_Env_DS'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/a_SailPoint_Env_DS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/a_SailPoint_Env_DS_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/a_SailPoint_Env_DS_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/a_Manage Object'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/select_- All -MonitorPaaSEntreprise Access _26767a'), 
    'Enterprise Access Certification', true)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/a_KTLN_GET_SailPoint_Env'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/a_KTLN_GET_SailPoint_Env'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/span_Object Items'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Add Object Items/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Add Object Items/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/a_KTLN_POST_SailPoint_Env'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/a_KTLN_POST_SailPoint_Env'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/span_Object Items'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Add Object Items/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Add Object Items/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Object Details/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/a_Manage Object Set'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Objects/a_Manage Object Set'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/select_Object SetDescriptionStart DateEnd D_6bdece'))

WebUI.verifyElementText(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/input_p_ignore_10'), 
    'SailPoint_ObjSet_API')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/a_SailPoint_ObjSet_API'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/a_SailPoint_ObjSet_API'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Objectset/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_AddEdit Objectset/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Object Set/span_a-TreeView-toggle_1 - a9'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Object Set/span_a-TreeView-toggle_1 - a9'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Object Set/span_a-TreeView-toggle_1_2 - a10'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Object Set/span_a-TreeView-toggle_1_2 - a10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/a_Manage Role Groups'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Object Set/a_Manage Role Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('deba4/EACM_Administration_SailPoint/Page_Home/a_Scope Roles - 2001'), 0)

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Home/a_Scope Roles - 2001'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Home/a_Scope Roles - 2001'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_GRM_RoleGroup1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_GRM_RoleGroup1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_Scope Roles'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_Scope Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_GRM_RoleGroup2'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_GRM_RoleGroup2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_Scope Roles'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_Scope Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_Manage Approval Assignments'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Scope Roles/a_Manage Approval Assignments'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d - 2005'))

WebUI.selectOptionByLabel(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_daec9d - 2005'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR485447514490922889_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR485447514490922889_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR485447514490922889_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR485447514490922889_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup2'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup2'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply - 2006'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply - 2006'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_6ea309'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR134136923578779043_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR134136923578779043_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup1 - 2007'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup1 - 2007'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply - 2006'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply - 2006'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_6ea309'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR134136923578779043_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/buttonR134136923578779043_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup2 - 2008'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/a_GRM_RoleGroup2 - 2008'))

WebUI.verifyElementClickable(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply - 2006'))

WebUI.click(findTestObject('deba4/EACM_Administration_SailPoint/Page_Manage Approval Assignments/button_Apply - 2006'))

WebUI.delay(7)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle - 400'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle - 400'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_1 - 401'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_1 - 401'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_ 402'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_ 402'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Home/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Home/a_Manage Certification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage Certification/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/input_P10_NAME'), '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/input_P10_NAME'), 'GRM_Feb29_V3')

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/textarea_P10_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/textarea_P10_DESCRIPTION'), 'GRM_Feb29_V3')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Popup Calendar End Date'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Initiate User Access/a_10 - End date_a1'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Initiate User Access/a_10 - End date_a1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Initiate User Access/button_Close'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Scheduling Survey/Page_Initiate User Access/button_Close'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Initiate User Access/label_Terminated_a2'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Initiate User Access/label_Terminated_a2'))

WebUI.scrollToElement(findTestObject('EACM/EACM_Survey/Page_Initiate User Access/label_Ticket Creation - 600'), 0)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Initiate User Access/label_Ticket Creation - 600'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Initiate User Access/label_Ticket Creation - 600'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Create'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Initiate User Access/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/h2_Certification job was initiated successf_889d6e'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle - 400'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle - 400'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_1 - 401'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_1 - 401'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_ 402'))

WebUI.click(findTestObject('EACM/EACM_Survey/Page_Home/span_a-TreeView-toggle_ 402'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Manage User Access (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Manage User Access (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/select_NameDescriptionEnd Date ActionStatus_dc9709'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/input_p_ignore_10'), 
    'GRM_Feb29_V3')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Test123'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Test123'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/h2_Open'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/h2_Open'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/span_a-Icon icon-up-chevron'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/span_a-Icon icon-up-chevron'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/span_a-Icon icon-up-chevron'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/a_Manage User Access'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_User Access Validation/a_Manage User Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Certifying Survey/Page_Manage User Access/a_Inbox'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/button_katalon_admin - 121'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/button_katalon_admin - 121'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_Logout - 122'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_Logout - 122'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test123 (1)'))

WebUI.mouseOver(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_MCD Employee Crew CA ABSTRACTMCD_Employe_24a2f8 (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'N', true)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'N', true)

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1044'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1044'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'N', true)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1022'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'J', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/div_Please enter a mass or individual justi_5e2bf1 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    'Justification GRM_Feb29_V3')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/span_Certified By (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/span_Certified By (1)'))

WebUI.delay(0)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test Survey_89 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Test Survey_89 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Verify All (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_OK (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_All records verified (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.doubleClick(findTestObject('EACM/EACM_CertifySurvey/Page_User Access Certification Survey/td_Verified - 1033'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access (1)'), 
    'J', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/div_Please enter a mass or individual justi_5e2bf1 (1)'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/input_484081374610932121 (1)'), 
    'Justification for GRM_Feb29_V3')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Save Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/h2_Changes saved (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_t-Button t-Button--noUI t-Button--ic_cbe08f - Copy (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/h2_User Access Certification has been Completed (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'DPATEL')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey 125'))

WebUI.click(findTestObject('EACM/EACM_CertifySurvey/Page_Home/a_TestSurvey 125'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification Survey/button_Confirm Changes (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/h2_User Access Certification has been Completed (1)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/a_My Certifications (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_User Access Certification has been closed/button_OK (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_My Dashboard'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/span_My Dashboard'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/label_Toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/label_Toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/select_Certification NameCertification Desc_14a9ed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/input_p_ignore_10'), 'GRM_Feb29_V3')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_Apply'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/button_ktln_eacm_user1 - 87 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Home/a_Logout - 88 (1)'))

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_USERNAME (1)'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/input_P101_PASSWORD (1)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CertifySurvey/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/a_Manage Certification'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Home/a_Manage Certification'))

WebUI.verifyElementClickable(findTestObject('EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6 - Copy'))

WebUI.selectOptionByLabel(findTestObject('EACM/POST EACM SURVEY/Page_Manage Certification/select_Select any oneCERP_1CloudERPEBizApp__a9def6 - Copy'), 
    'SailPoint_Env', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/span_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/select_NameDescriptionEnd Date ActionStatus_a82897'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/input_p_ignore_10'), 'GRM_Feb29_V3')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/a_POSTGET Process Status'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/POST EACM SURVEY/Page_Manage Certification/a_POSTGET Process Status'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

