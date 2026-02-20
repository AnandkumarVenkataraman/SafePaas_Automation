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

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/button_Go'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_anandkumar.venkataramansafepaas.com'), 
    'anandkumar.venkataraman@safepaas.com', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_KAT Admin'), 
    'KAT Admin', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_Company Settings'), 
    'Company Settings', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/td_ALL_ACCESS'), 
    'ALL_ACCESS', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/a_SafePaaS User Application Listing'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/input_SafePaaS User Application Listing_R14_417567'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/button_Go'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/td_Company Settings'), 
    'Company Settings', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Application Listing/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.callTestCase(findTestCase('SFPSAutomation/Administration/6. SafePaaS User Application Listing Report'), [:])

