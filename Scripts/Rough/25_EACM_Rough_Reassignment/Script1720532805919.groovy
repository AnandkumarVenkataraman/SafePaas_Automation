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

WebUI.setText(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/input_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/a_Scope Roles (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97 (1)'), 
    '6988', true)

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/a_Test_RoleGroup1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Cancel (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Rows Per Page (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Rows Per Page (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_All (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_All (1)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/input_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/input_P101_USERNAME (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/input_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Home/a_Scope Roles_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97 (1)'), 
    '6988', true)

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/a_Test_RoleGroup1_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Select All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Reassign Role'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK'))

WebUI.click(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_OK'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- Please select any -ERP ITHCM MarketOut of boxOut of ScopeSurvey ExceptionsTest_RoleGroup2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/select_- Please select any -ERP ITHCM MarketOut of boxOut of ScopeSurvey ExceptionsTest_RoleGroup2'), 
    '3227', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba4/Re-assignment Scope Roles/Page_Scope Roles/button_Submit'))

WebUI.closeBrowser()

