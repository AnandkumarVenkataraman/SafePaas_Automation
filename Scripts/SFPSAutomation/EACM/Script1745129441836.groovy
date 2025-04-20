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

//Click on AccessPaaS
TestObject accessPaasHyperLink = findTestObject('Object Repository/SFPSAutomation/EACM/span_AccessPaaS')
WebUI.verifyElementPresent(accessPaasHyperLink, 0)
//write an if stmt for -> if element not present, later

TestObject accessPaas = findTestObject('Object Repository/SFPSAutomation/EACM/span_Help_a-TreeView-toggle')
WebUI.click(accessPaas)
WebUI.comment("AccessPaaS menu is rendered, and able to click")

//Click on EACM > Setup > Manage Access Groups
TestObject eacmHyperLink = findTestObject('Object Repository/SFPSAutomation/EACM/span_Enterprise Access Certification')
WebUI.verifyElementPresent(eacmHyperLink, 0)
//write an if stmt for -> if element not present, later

TestObject eacm = findTestObject('Object Repository/SFPSAutomation/EACM/span_Enterprise Access Monitor_a-TreeView-toggle')
WebUI.click(eacm)
WebUI.comment("Enterprise Access Certification menu is rendered, and able to click")

TestObject eacmSetupHyperLink = findTestObject('Object Repository/SFPSAutomation/EACM/span_Setup')
WebUI.verifyElementPresent(eacmSetupHyperLink, 0)
//write an if stmt for -> if element not present, later

TestObject eacmSetup = findTestObject('Object Repository/SFPSAutomation/EACM/span_Access Certification_a-TreeView-toggle')
WebUI.click(eacmSetup)
WebUI.comment("Setup menu is rendered under EACM, and able to click")

TestObject manageAccessGroups = findTestObject('Object Repository/SFPSAutomation/EACM/a_Manage Access Groups')
WebUI.verifyElementPresent(manageAccessGroups, 0)
//write an if stmt for -> if element not present, later
WebUI.click(manageAccessGroups)
WebUI.comment("Manage Access Groups menu is rendered under EACM > Setup, and able to click")
WebUI.takeScreenshot()



