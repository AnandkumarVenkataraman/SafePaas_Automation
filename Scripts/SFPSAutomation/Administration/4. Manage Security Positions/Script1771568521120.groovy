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

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create Users/span_Users Access'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900 (1)'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Company Settings'), 
    'Company Settings', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Access Monitor'), 
    'Access Monitor', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_DataPaaS'), 
    'DataPaaS', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_DataProbe'), 
    'DataProbe', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise Access Certification (1)'), 
    'Enterprise Access Certification', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise Access Monitor'), 
    'Enterprise Access Monitor', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise iAccess'), 
    'Enterprise iAccess', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Enterprise iCatalog'), 
    'Enterprise iCatalog', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_MonitorPaaS'), 
    'MonitorPaaS', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_Policy Manager'), 
    'Policy Manager', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_KATADMIN'), 
    'KATADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/td_SafeInsight'), 
    'SafeInsight', FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/button_concat(Search for , , KATADMIN, , )__5d4760'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Users Application Access/a_SafePaaS User Listing'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_SafePaaS User Listing/input_SafePaaS User Listing_R17563888885482_0bb8ed'), 
    'KATADMIN')

WebUI.callTestCase(findTestCase('SFPSAutomation/Administration/5. SafePaaS User Listing Report'), [:])

