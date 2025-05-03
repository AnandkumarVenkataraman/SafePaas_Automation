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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Test Cases/SFPSAutomation/commonFlow_Login'), [:], FailureHandling.STOP_ON_FAILURE)


//Company settings -> Verify EACM Product is selected
TestObject Administration = findTestObject('Object Repository/SFPSAutomation/EACM/span_DataPaaS_a-TreeView-toggle')
WebUI.enhancedClick(Administration) //click on Administration

TestObject companySettings = findTestObject('Object Repository/SFPSAutomation/EACM/span_Administration_a-TreeView-toggle')
WebUI.enhancedClick(companySettings) //click on Company Settings

TestObject manageCompany = findTestObject('Object Repository/SFPSAutomation/EACM/a_Manage Company')
WebUI.enhancedClick(manageCompany)

TestObject eacmIsSelected = findTestObject('Object Repository/SFPSAutomation/EACM/div_Enterprise Access Certification')
//boolean isChecked = eacmIsSelected.isSelected()
//boolean isDisabled = !eacmIsSelected.isEnabled()

String disabledAttr = WebUI.getAttribute(eacmIsSelected, 'disabled')
WebUI.comment(disabledAttr)
String checkedAttr = WebUI.getAttribute(eacmIsSelected, 'checked')
WebUI.comment(checkedAttr)
if (checkedAttr == 'true' && disabledAttr == 'true') {
	println("EACM is selected and is disabled")
} else {
WebUI.verifyMatch("EACM is either not selected; or, is selected and enabled for this user. So terminating the execution.", "", false)
}

//Manage Environment -> Verify the Env. is Active
WebUI.enhancedClick(findTestObject('Object Repository/SFPSAutomation/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/SFPSAutomation/input_Create_R258165063082313757_search_field'), 'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/SFPSAutomation/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/SFPSAutomation/td_A'), 'A')

WebUI.click(findTestObject('Object Repository/SFPSAutomation/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SFPSAutomation/span_Manage Load Query_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SFPSAutomation/span_Manage User Access_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/SFPSAutomation/a_Manage Access Groups'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/SFPSAutomation/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'),
1)

WebUI.verifyElementChecked(findTestObject('Object Repository/SFPSAutomation/input_HCM_f01'),10)

WebUI.verifyElementChecked(findTestObject('Object Repository/SFPSAutomation/input_Procurement_f01'),10)

WebUI.verifyElementChecked(findTestObject('Object Repository/SFPSAutomation/input_Purchasing_f01'),10)

KeywordUtil.logInfo("HCM, Procurement, and Purchasing Role-groups are selected")

////Click on AccessPaaS
//TestObject accessPaasHyperLink = findTestObject('Object Repository/SFPSAutomation/EACM/span_AccessPaaS')
//WebUI.verifyElementPresent(accessPaasHyperLink, 0)
////write an if stmt for -> if element not present, later
//
//
//TestObject accessPaas = findTestObject('Object Repository/SFPSAutomation/EACM/span_Help_a-TreeView-toggle')
//WebUI.enhancedClick(accessPaas)
//WebUI.comment("AccessPaaS menu is rendered, and able to click")
//
////Click on EACM > Setup > Manage Access Groups
//TestObject eacmHyperLink = findTestObject('Object Repository/SFPSAutomation/EACM/span_Enterprise Access Certification')
//WebUI.verifyElementPresent(eacmHyperLink, 0)
////write an if stmt for -> if element not present, later
//
//TestObject eacm = findTestObject('Object Repository/SFPSAutomation/EACM/span_Enterprise Access Monitor_a-TreeView-toggle')
//WebUI.enhancedClick(eacm)
//WebUI.comment("Enterprise Access Certification menu is rendered, and able to click")
//
//TestObject eacmSetupHyperLink = findTestObject('Object Repository/SFPSAutomation/EACM/span_Setup')
//WebUI.verifyElementPresent(eacmSetupHyperLink, 0)
////write an if stmt for -> if element not present, later
//
//TestObject eacmSetup = findTestObject('Object Repository/SFPSAutomation/EACM/span_Access Certification_a-TreeView-toggle')
//WebUI.enhancedClick(eacmSetup)
//WebUI.comment("Setup menu is rendered under EACM, and able to click")
//
//TestObject manageAccessGroups = findTestObject('Object Repository/SFPSAutomation/EACM/a_Manage Access Groups')
//WebUI.verifyElementPresent(manageAccessGroups, 0)
////write an if stmt for -> if element not present, later
//WebUI.enhancedClick(manageAccessGroups)
//WebUI.comment("Manage Access Groups menu is rendered under EACM > Setup, and able to click")
//WebUI.takeScreenshot()



