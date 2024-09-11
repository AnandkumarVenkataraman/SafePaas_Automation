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

WebUI.setText(findTestObject('Object Repository/EIA/EIA_Setup/Page_Login/input_Spring 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EIA/EIA_Setup/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EIA/EIA_Setup/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Home/a_Manage Company'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Home/a_Manage Company'))

WebUI.scrollToElement(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/label_Workflow Approval'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/label_Workflow Approval'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/label_Manual Registration'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/label_Manual Registration'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/label_EIA Workflow Approval'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/label_EIA Workflow Approval'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/span_Certification Configuration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/span_Certification Configuration_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/span_Manage My Access_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/span_Manage My Access_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/a_Manage Network Users'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/a_Manage Network Users'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', false, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Actions'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Filter'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_SafePaaS UserIdentity idFirst nameLa_f0deb1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Value_usersIg_ig_FD_VALUE-showAll'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Value_usersIg_ig_FD_VALUE-showAll'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Yes'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Yes'))

WebUI.verifyElementClickable(findTestObject('EIA/EIA_Setup/Page_Manage Network Users/button_Save - URV0100'))

WebUI.click(findTestObject('EIA/EIA_Setup/Page_Manage Network Users/button_Save - URV0100'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_SafePaaS User'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_Identity Id'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_First Name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_Last Name'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_ADID'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/a_Manage Role Groups'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/a_Manage Role Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Role Groups/a_Scope Roles'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Role Groups/a_Scope Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/button_Actions'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/button_Filter'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/select_Role Group nameDescriptionCreated by_906520'))

WebUI.verifyElementText(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/input_Expression_p_ignore_10'), 'RoleGroup_AM')

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/button_Apply'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_RoleGroup_AM'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_RoleGroup_AM'))

WebUI.scrollToElement(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/select_row(s) 1 - 15 of 5016 - 30 of 5031 -_91cc86'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/select_row(s) 1 - 15 of 5016 - 30 of 5031 -_91cc86'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_Next'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/select_1 - 15 of 50row(s) 16 - 30 of 5031 -_27fe0a'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/select_1 - 15 of 50row(s) 16 - 30 of 5031 -_27fe0a'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_Next_1'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_Next_1'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('EIA/EIA_Setup/Page_Scope Roles/Role Groups in Scope'))

WebUI.click(findTestObject('EIA/EIA_Setup/Page_Scope Roles/Role Groups in Scope'))

WebUI.click(findTestObject('EIA/EIA_Setup/Page_Scope Roles/a_Scope Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_Manage Approval Assignments'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Scope Roles/a_Manage Approval Assignments'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Actions'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Filter'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_Role Group nameDescriptionRolePrimar_39582e'))

WebUI.verifyElementText(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/input_Expression_p_ignore_10'), 
    'RoleGroup_AM')

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Apply'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/a_RoleGroup_AM'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/span_Primary Owner'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/span_Secondary Owner'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/span_Assign Role Owner'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/span_Assign Role Owner'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Actions_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Filter_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_Role NamePrimary OwnerSecondary Owner'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_Role NamePrimary OwnerSecondary Owner'), 
    '161275651502214036', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'N', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Primary Owner equals_a-Button a-Tool_4c4686'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Primary Owner equals_a-Button a-Tool_4c4686'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_Role NamePrimary OwnerSecondary Owner'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_Role NamePrimary OwnerSecondary Owner'), 
    '161275727244214037', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/select_equalsnot equalsis emptyis not empty_c59f5b'), 
    'N', true)

WebUI.delay(30)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Save'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/a_Maintain Approval Hierarchy'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Approval Assignments/a_Maintain Approval Hierarchy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Approval level'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Type'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Approval role'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Approval type'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Active'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Created by'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Created date'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/a_Last updated by'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/img_Create_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/img_Create_apex-edit-pencil'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/button_Cancel'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('EIA/EIA_Setup/Page_Maintain Approval Hierarchy/img_Create_apex-edit-pencil (2)'))

WebUI.click(findTestObject('EIA/EIA_Setup/Page_Maintain Approval Hierarchy/img_Create_apex-edit-pencil (2)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/button_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/button_Cancel (1)'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('EIA/EIA_Setup/Page_Maintain Approval Hierarchy/img_Create_apex-edit-pencil (3)'))

WebUI.click(findTestObject('EIA/EIA_Setup/Page_Maintain Approval Hierarchy/img_Create_apex-edit-pencil (3)'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/button_Cancel (2)'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Maintain Approval Hierarchy/button_Cancel (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/a_Manage Network Users'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Company/a_Manage Network Users'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_Select any oneEBizApp_JDBC_EnvKTLNCl_836918'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Actions'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Filter'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_SafePaaS UserIdentity idFirst nameLa_f0deb1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/select_equalsnot equalsis emptyis not empty_c59f5b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Value_usersIg_ig_FD_VALUE-showAll'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Value_usersIg_ig_FD_VALUE-showAll'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Yes'))

WebUI.click(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/button_Yes'))

WebUI.verifyElementClickable(findTestObject('EIA/EIA_Setup/Page_Manage Network Users/button_Save - URV0100'))

WebUI.click(findTestObject('EIA/EIA_Setup/Page_Manage Network Users/button_Save - URV0100'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_SafePaaS User'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_Identity Id'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_First Name'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_Last Name'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/EIA/EIA_Setup/Page_Manage Network Users/span_ADID'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

