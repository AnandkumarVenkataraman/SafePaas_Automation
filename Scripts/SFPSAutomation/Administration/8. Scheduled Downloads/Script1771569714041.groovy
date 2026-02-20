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

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/select_Last 30 daysLast 60 daysLast 90 days_5f1203'), 
    0)

WebUI.delay(10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/img'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Cancel'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Scheduled Downloads'))

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduled Downloads/a_Log Report'))

WebUI.takeScreenshot()

WebUI.delay(2)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/select_TodayLast 7 daysLast MonthLast 3 Mon_d22ccc'),
//	'T1', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/select_TodayLast 7 daysLast MonthLast 3 Mon_d22ccc'),
//	'D7', true)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Log Report/a_Usage'))

WebUI.takeScreenshot()

WebUI.delay(2)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Usage/select_- Select -QAQA1QA2'),
//	'374', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Usage/select_- Select -QAQA1QA2'),
//	'- Select -', true)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Usage/a_Release Update'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.callTestCase(findTestCase('SFPSAutomation/Administration/9. Log Report'), [:])

