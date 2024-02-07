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

WebUI.click(findTestObject('Object Repository/ANALYTICS1/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/span_iAccess_a-TreeView-toggle'))

WebUI.click(findTestObject('ANALYTICS1/span_Dashboard_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('ANALYTICS1/span_Violation Report_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_User Listing and access'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP'), 'KTLN_CloudERP', 
    true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_User Listing and Access'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_User Entry Access Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_User Entry Access Listing'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_User Entry Attribute Access Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (2)'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_Entry Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (3)'))

WebUI.selectOptionByLabel(findTestObject('ANALYTICS1/select_Select any oneRolePrivilegeitEntitlement'), 'Role', true, FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_Entry Listing'))

WebUI.click(findTestObject('ANALYTICS1/select_Select any oneRolePrivilegeitEntitlement'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ANALYTICS1/select_Select any oneRolePrivilegeitEntitlement'), 
    'Privilege', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_Entry Listing'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_Entry Attributes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_Entry Attributes'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_Access Hierarchy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (5)'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/button_Access Type_P13_RESPONSIBILITY_lov_btn'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/li_Recruiting Opportunity Marketplace Trans_ca63cd'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/button_Go (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_Access Hierarchy'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP'), 'SailPoint_ENV2', 
    true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_User Listing and Access'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_User Entry Access Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_User Entry Access Listing'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_User Entry Attribute Access Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (2)'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_Entry Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (3)'))

WebUI.selectOptionByLabel(findTestObject('ANALYTICS1/select_Select any oneRolePrivilegeitEntitlement'), 'IT Role', true, 
    FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_Entry Listing'))

WebUI.click(findTestObject('ANALYTICS1/select_Select any oneRolePrivilegeitEntitlement'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ANALYTICS1/select_Select any oneRolePrivilegeitEntitlement'), 
    'Entitlement', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_Entry Listing'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_Entry Attributes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/select_Select any oneCloudERPKTLN_CloudERP (4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ANALYTICS1/h2_Entry Attributes'))

WebUI.click(findTestObject('Object Repository/ANALYTICS1/a_Access Hierarchy'))

WebUI.click(findTestObject('ANALYTICS1/Access Type P13'))

WebUI.click(findTestObject('ANALYTICS1/Access Hierarchy List'))

WebUI.click(findTestObject('ANALYTICS1/Go Button'))

