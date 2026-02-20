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

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/button_concat(Search for , , Company Settin_672aab'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Settings/span_Users'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/input_Create_R23213727076438815_search_field'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_KATADMIN'), 'KATADMIN', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_KATADMIN'), 'KATADMIN', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_anandkumar.venkataramansafepaas.com'), 
    'anandkumar.venkataraman@safepaas.com', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_KAT Admin'), 'KAT Admin', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_09-APR-25'), '09-APR-25', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_-'), '-', FailureHandling.OPTIONAL)

//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_15-JUN-25'), '15-JUN-25')
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_OPEN'), 'OPEN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_Y'), 'Y', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_09-APR-25'), '09-APR-25', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/td_66812979'), '66812979', 
    FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('SFPSAutomation/Administration/4. Manage Security Positions'), [:])

