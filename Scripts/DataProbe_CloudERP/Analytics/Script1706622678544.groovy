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

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_AccessPaaS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Enterprise Access Monitor'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/span_iAccess_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Analytics'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Dashboard_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/span_Dashboard_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Application Access Report'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Violation Report_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/span_Violation Report_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/a_User Listing and access'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/a_User Listing and access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/label_Environment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/select_Select any oneCloudERPKTLN_CloudERP'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Analytics - DataProbe/select_Select any oneCloudERPKTLN_CloudERP'), 
    'KTLN_CloudERP', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/h2_User Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/a_User Entry Access Listing'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/a_User Entry Access Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/label_Environment (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/select_Select any oneCloudERPKTLN_CloudERP (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/h2_User entry access listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/a_User Entry Attribute Access Listing'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/a_User Entry Attribute Access Listing'))

WebUI.delay(3)

WebUI.click(findTestObject('Analytics - DataProbe/a_Entry Listing1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/select_Select any oneCloudERPKTLN_CloudERP (3)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/label_Entry Type'))

WebUI.click(findTestObject('Analytics - DataProbe/select_Select any oneRolePrivilegeitEntitlement'))

WebUI.selectOptionByLabel(findTestObject('Analytics - DataProbe/select_Select any oneRolePrivilegeitEntitlement'), 'Role', 
    true, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Analytics - DataProbe/select_Select any oneRolePrivilegeitEntitlement'), Keys.chord(Keys.ENTER), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/h2_Entry Listing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Analytics - DataProbe/select_Select any oneRolePrivilegeitEntitlement'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Analytics - DataProbe/select_Select any oneRolePrivilegeitEntitlement'), 'Privilege', 
    true, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Analytics - DataProbe/select_Select any oneRolePrivilegeitEntitlement'), Keys.chord(Keys.ENTER), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/h2_Entry Listing'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/a_Entry Attributes'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/a_Entry Attributes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/label_Environment (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/select_Select any oneCloudERPKTLN_CloudERP (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/h2_Entry Attributes'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/label_Toggle'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/label_Toggle'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Define Scope'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/span_Rules Report_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/span_Rules Report_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/a_Manage Rules'))

WebUI.rightClick(findTestObject('Object Repository/Analytics - DataProbe/label_Environment (5)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/label_Environment (5)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/select_Select any oneCloudERPKTLN_CloudERP (5)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/button_Filter False - Positives'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/button_Filter False - Positives'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/label_Toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Analytics - DataProbe/label_Attributes'))

WebUI.click(findTestObject('Object Repository/Analytics - DataProbe/button_Go (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Extract Data/a_Access Hierarchy'))

WebUI.click(findTestObject('Extract Data/select_Select any oneCloudERPKTLN_CloudERP'))

WebUI.selectOptionByLabel(findTestObject('Extract Data/select_Select any oneCloudERPKTLN_CloudERP'), 'KTLN_CloudERP', true)

WebUI.click(findTestObject('Extract Data/button_Access Type_P13_RESPONSIBILITY_lov_btn'))

WebUI.click(findTestObject('Extract Data/li_Recruiting Opportunity Marketplace Transaction Analysis Duty'))

WebUI.click(findTestObject('Extract Data/button_Go'))

