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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Login/input_Spring 2024_P101_COMPANY (1)'), 
    'kat')

WebUI.setText(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (1)'), 
    'katalon_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Login/input_New_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Help_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Access Certification_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/a_Manage Access Groups (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/a_Manage Access Groups (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/button_Map Roles (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/button_Map Roles (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Scoped Attributes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Scoped Attributes (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Descoped Attributes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Descoped Attributes (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Current Progress_t-Icon a-Icon icon-check (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_(Completed)_t-WizardSteps-marker (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/label_Roles Only (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/p_NOTE                        1. Scope will_e3a6e8 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_NameDisplay NameDescriptionKeyActive_c03f7b (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Expression_p_ignore_10 (1)'), 
    'ORA_AP_ACCOUNTS_PAYABLE_SUPERVISOR_JOB')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Name_checkAll'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Name_checkAll'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/textarea_Justification_P46_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/textarea_Justification_P46_JUSTIFICATION'), 
    'KTLN Test Justification')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Justification'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Justification'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Justification'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Justification'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/td_KTLN_Test justification'), 
    0, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next_1'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_(Completed)_t-Icon a-Icon icon-check'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/p_Warning You are working on a draft versio_71f535'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_NameDisplay NameDescriptionKeyActive_ec3317'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_NameDisplay NameDescriptionKeyActive_ec3317'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Expression_p_ignore_10_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Expression_p_ignore_10_1'), 
    'KTLN')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Justification'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Justification'), 
    0)

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_- Please select any one -RoleGroup_A_0709b4'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_- Please select any one -RoleGroup_A_0709b4'), 
    'RoleGroup_Other', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Name_checkAll'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Name_checkAll'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Draft Mapping'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Draft Mapping'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Role Group'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Role Group'), 
    0)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Submit'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Submit'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/a_ScopedDescoped Attributes Report'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/a_ScopedDescoped Attributes Report'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/select_- Select a Value - EBizApp_JDBC_EnvK_76acc0'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/select_- Select a Value - EBizApp_JDBC_EnvK_76acc0'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/select_Attribute TypeAttributeScope StatusD_514e45'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/select_Attribute TypeAttributeScope StatusD_514e45'), 
    'Scope Status', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/input_Expression_p_ignore_10'), 
    'Scoped')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Apply'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/select_Attribute TypeAttributeScope StatusD_514e45'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/select_Attribute TypeAttributeScope StatusD_514e45'), 
    'Scope Status', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/input_Expression_p_ignore_10'), 
    'Descoped')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_Apply'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_concat(Scope Status  , , Descoped, ,_297bca'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_concat(Scope Status  , , Descoped, ,_297bca'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_concat(Scope Status  , , Descoped, ,_297bca'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_concat(Scope Status  , , Descoped, ,_297bca'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/a_Assignment Report'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/a_Assignment Report'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Role GroupRole NameRole DescriptionP_7357ab'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    'RoleGroup_Other')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Role GroupRole NameRole DescriptionP_7357ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Role GroupRole NameRole DescriptionP_7357ab'), 
    'ROLE_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    'ORA_AP_ACCOUNTS_PAYABLE_SUPERVISOR_JOB')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/span_Access Certification_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/span_Access Certification_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/a_Manage Access Groups'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/a_Manage Access Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/button_Map Roles (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/button_Map Roles (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Scoped Attributes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Scoped Attributes (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Descoped Attributes (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Descoped Attributes (1)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/label_Roles  Attributes'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/label_Roles  Attributes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/span_Current Progress_t-WizardSteps-marker'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/p_NOTE                        1. Scope will_e3a6e8 (1)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_NameDisplay NameDescriptionKeyActive_d744ce'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Expression_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Expression_p_ignore_10 (1)'), 
    'MCD_PJF_PROJECT_ACCOUNTANT_JOB_CUSTOM2')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Name_checkAll'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Name_checkAll'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/textarea_Justification_P46_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/textarea_Justification_P46_JUSTIFICATION'), 
    'KTLN Test Justification for Roles + Attributes')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Justification'))

WebUI.delay(60)

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Justification'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Justification'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Justification'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next_1'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Next_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_NameDisplay NameDescriptionKeyActive_ebf946'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_NameDisplay NameDescriptionKeyActive_ebf946'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Expression_p_ignore_10_1'), 
    'KTLN Test Justification for Roles + Attributes')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Apply (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Attribute'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Attribute Value'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Justification'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Role Group_f01'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Role Group_f01'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_- Please select any one -RoleGroup_A_0709b4_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_- Please select any one -RoleGroup_A_0709b4_1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_- Please select any one -RoleGroup_A_0709b4_1'), 
    'RoleGroup_GL', true, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Draft Mapping'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Draft Mapping'))

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Role Group'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/a_Role Group'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/td_RoleGroup_GL'), 
    0)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_- Please select any one -RoleGroup_A_0709b4_1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/select_- Please select any one -RoleGroup_A_0709b4_1'), 
    'RoleGroup_HCM', true)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Role Group_f01'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Role Group_f01'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/input_Role Group_f01'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Draft Mapping'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Save Draft Mapping'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/td_RoleGroup_HCM'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Submit'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Roles and Attributes/Page_Manage Roles Mapping/button_Submit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/a_Assignment Report'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/a_Assignment Report'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Role GroupRole NameRole DescriptionP_7357ab'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    'RoleGroup_GL')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_concat(Scope Status  , , Descoped, ,_297bca'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_ScopedDescoped Attributes/button_concat(Scope Status  , , Descoped, ,_297bca'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/select_Role GroupRole NameRole DescriptionP_7357ab'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/input_Expression_p_ignore_10'), 
    'RoleGroup_HCM')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Security Context/Analytics/Page_Assignment Report/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Manage Access Groups/a_Unassigned Accesses'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/select_RoleAttributesAssigned To Role Group'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/input_Expression_p_ignore_10'), 
    'MCD_PJF_PROJECT_ACCOUNTANT_JOB_CUSTOM2')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_concat(Role contains , , MCD_PJF_PRO_2584eb'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_concat(Role contains , , MCD_PJF_PRO_2584eb'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/select_RoleAttributesAssigned To Role Group'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/input_Expression_p_ignore_10'), 
    'ORA_AP_ACCOUNTS_PAYABLE_SUPERVISOR_JOB')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Unassigned Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/span_Access Certification_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/a_Scope Access'))

WebUI.click(findTestObject('Object Repository/EACM/Unassigned Access Report/Page_Home/a_Scope Access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Access/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Access/a_RoleGroup_Other'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Access/a_RoleGroup_Other'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/select_SelectRole NameRole Display NameAttr_37961d'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/input_Expression_p_ignore_10'), 
    'KTLN')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Scope Access'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Scope Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Access/a_RoleGroup_HCM'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Access/a_RoleGroup_HCM'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Scope Access'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Scope Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Access/a_RoleGroup_GL'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Access/a_RoleGroup_GL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Manage Approval Assignments'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Scope Roles/a_Manage Approval Assignments'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Select Columns_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    'RoleGroup_Other')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'), 
    'ROLE_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    'ORA_AP_ACCOUNTS_PAYABLE_SUPERVISOR_JOB')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Select Columns_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    'RoleGroup_GL')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Select Columns_a-Menu-statusCol'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/select_Role GroupDescriptionRoleRole Descri_8e9134'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    'RoleGroup_HCM')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope with Entire History'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/a_Detail'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/span_Role Groups in Scope - Current Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageCrossDataSource/AssignmentReport/Page_Manage Approval Assignments/button_concat(Role Group  , , RoleGroup_Oth_201781'))

WebUI.closeBrowser()

