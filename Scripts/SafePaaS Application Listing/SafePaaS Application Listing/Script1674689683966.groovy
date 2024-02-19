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

WebUI.click(findTestObject('Object Repository/SafePaaS Application Listing/Page_Home/a_SafePaaS User Application Listing'))

WebUI.click(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/input_SafePaaS User Application Listing_R14_417567'))

WebUI.setText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/input_SafePaaS User Application Listing_R14_417567'), 
    'KATALON_ADMIN')

WebUI.verifyElementClickable(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/button_Go'))

WebUI.click(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Access Monitor'))

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Access Monitor'), 
    'Access Monitor')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Company Settings'), 
    'Company Settings')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_DataProbe'), 
    'DataProbe')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Enterprise Access Certification'), 
    'Enterprise Access Certification')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Enterprise Access Monitor'), 
    'Enterprise Access Monitor')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Enterprise iAccess'), 
    'Enterprise iAccess')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Global Settings'), 
    'Global Settings')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_MonitorPaaS'), 
    'MonitorPaaS')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_Policy Manager'), 
    'Policy Manager')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_iAccess'), 
    'iAccess')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.verifyElementText(findTestObject('Object Repository/SafePaaS Application Listing/Page_SafePaaS User Application Listing/td_11-JAN-23'), 
    '11-JAN-23')

WebUI.click(findTestObject('SafePaaS Application Listing/Page_Home/a_SafePaaS User Application Listing'))

WebUI.delay(1)

