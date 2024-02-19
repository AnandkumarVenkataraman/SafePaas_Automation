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

WebUI.setText(findTestObject('Object Repository/Manage Rules/input_Winter 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Manage Rules/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Rules/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/Manage Rules/button_Login'))

WebUI.click(findTestObject('Object Repository/Manage Rules/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage Rules/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage Rules/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage Rules/a_Manage Rules'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage Rules/select_Select any oneCloudERPKTLN_CloudERP'), 'KTLN_CloudERP', 
    true)

WebUI.setText(findTestObject('Object Repository/Manage Rules/input_Export Rules_R247793226539899118_sear_985672'), 'AIC vs. AIM Rule')

WebUI.click(findTestObject('Object Repository/Manage Rules/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage Rules/a_AIC vs. AIM Rule'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Approval Status'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_Approved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Description'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_Application Implementation Consultant _dee98c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Risk Level'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_HIGH'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Rule Type'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_Incompatible Sets'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Rule Objective'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_SOD Detective'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Start Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_13-MAR-23'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_End Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/div_End Date_t-Form-itemWrapper'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Set1 Activity'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_Activity_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/label_Set2 Activity'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/span_Activity_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/td_KTLN_EAM_USER1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/button_Revise'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Rules/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Manage Rules/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Manage Rules/button_concat(Row text contains , , AIC vs._7959d7'))

WebUI.click(findTestObject('Object Repository/Manage Rules/a_Manage Rules (1)'))

