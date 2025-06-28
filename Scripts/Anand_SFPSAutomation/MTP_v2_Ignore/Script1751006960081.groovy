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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY (4)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (4)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (4)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login (4)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_AccessPaaS_a-TreeView-toggle (2)'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Manage Monitors (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Monitors/select_Select any OneWorkDay_Env_ObjSetTrir_f73a9a (1)'), 
    '5496', true)

WebUI.click(findTestObject('Object Repository/Page_Manage Monitors/a_AR Approval Limits'))

WebUI.click(findTestObject('Object Repository/Page_Monitor Details/span_People'))

WebUI.click(findTestObject('Object Repository/Page_Rule Approver/a_Manage Monitors'))

WebUI.click(findTestObject('Object Repository/Page_Manage Monitors/button_Deploy'))

WebUI.click(findTestObject('Object Repository/Page_Move Process/input_EBS R12.2_f01'))

WebUI.click(findTestObject('Object Repository/Page_Move Process/button_Deploy Objects'))

WebUI.click(findTestObject('Object Repository/Page_Move Process/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Manage Monitors/a_AR Approval Limits_1'))

WebUI.click(findTestObject('Object Repository/Page_Monitor Details/span_People'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Rule Approver/select_Select any One1164301711814158119098_a4add3'), 
    '66812854', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Rule Approver/select_Select any OneApproverReviewer'), 
    '101', true)

WebUI.setText(findTestObject('Object Repository/Page_Rule Approver/input_Start Date_P35_START_DATE'), '22-Jun-2025')

WebUI.setText(findTestObject('Object Repository/Page_Rule Approver/input_End Date_P35_END_DATE'), '')

WebUI.click(findTestObject('Object Repository/Page_Rule Approver/input_End Date_P35_END_DATE'))

WebUI.click(findTestObject('Object Repository/Page_Rule Approver/button_Add Another'))

WebUI.closeBrowser()

