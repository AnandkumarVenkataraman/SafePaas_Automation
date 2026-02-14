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

String eacmSurveyID = WebUI.getText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/td_EBS_EACMSurvey_10052025_062935'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , EBS_EAC_303be6'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_User Access Certification Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/select_Select any oneEBS_EACMSurvey_0510202_c268f5'), 
    '21079', true)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/select_Select any oneEBS_EACMSurvey_0510202_c268f5'), 
    eacmSurveyID, true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/a_Status'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/a_Completed'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_Completed'), 
    'Completed')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/button_concat(Status  , , Completed, , )_a-_98eb41'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/a_User Access Certification Summary'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Summary/select_Select any oneEBS_EACMSurvey_0510202_c268f5'), 
    1)

WebUI.delay(2)

WebUI.comment(eacmSurveyID)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/select_Select any oneEBS_EACMSurvey_0510202_c268f5 - 2'), 
    eacmSurveyID, true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Summary/td_Procurement'), 
    15)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Summary/a_Cumulative Access Certification'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_View Results_caCert_search_field'), 
    eacmSurveyID)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/td_EBS_EACMSurvey_10052025_062935'), 
    15)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_Last Updated By_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_View Results'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_UAV_Summary/td_EBS_EACMSurvey_10052025_062935'), 
    15)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_UAV_Summary/button_Back'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/input_Last Updated By_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/button_concat(Row text contains , , 0629, ,_aecdbf'))

//Assignment report and other reports
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Cumulative Access Certification/a_Assignment Report'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assignment Report/a_ScopedDescoped Attributes Report'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_ScopedDescoped Attributes/a_Unassigned Accesses'))

WebUI.takeScreenshot()

//Logout
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Preferences/a_Logout'))
