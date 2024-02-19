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

WebUI.click(findTestObject('SafePaaS User Listing/Page_Home/Page_Home/a_SafePaaS User Listing'))

WebUI.click(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/input_SafePaaS User Listing_R17563888885482_0bb8ed'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/input_SafePaaS User Listing_R17563888885482_0bb8ed'), 
    'katalon_admin')

WebUI.verifyElementClickable(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/button_Go'))

WebUI.click(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_Access Monitor'), 
    'Access Monitor')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_Company Settings'), 
    'Company Settings')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_DataProbe'), 
    'DataProbe')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_Enterprise Access Certification'), 
    'Enterprise Access Certification')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_Enterprise Access Monitor'), 
    'Enterprise Access Monitor')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_Enterprise iAccess'), 
    'Enterprise iAccess')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_Global Settings'), 
    'Global Settings', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_MonitorPaaS'), 
    'MonitorPaaS', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_Policy Manager'), 
    'Policy Manager', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_iAccess'), 
    'iAccess', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/a_App Start Date'))

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS User Listing/Page_SafePaaS User Listing/td_11-JAN-23'), 
    '11-JAN-23', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SafePaaS User Listing/Page_Home/Page_Home/a_SafePaaS User Listing'))

WebUI.delay(1)

