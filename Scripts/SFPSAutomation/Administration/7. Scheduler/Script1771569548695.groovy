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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Manage Security Position/a_Inbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (5)'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Company Settings_a-TreeView-toggle'))

//WebUI.click(findTestObject('Object Repository/Page_Manage Security Position/div_Security Positions    Submit           _2b4ddf'))
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/a_Scheduler'))

WebUI.delay(10)

//Pls. note -> The indexing used here is not related to Env.
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    1)

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    2)

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    3)

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    4)

WebUI.callTestCase(findTestCase('SFPSAutomation/Administration/8. Scheduled Downloads'), [:])

