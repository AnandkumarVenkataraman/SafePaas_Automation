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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Company'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Company/div_Enterprise Access Monitor'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Company/a_Inbox'))

//Env.

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field'),
	'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A'), 'A')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_4f016a'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/a_Inbox'))

//Manage Activity

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Roles Manager_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Activity'))

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084'), 'EBiz_3')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_EBiz_3_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXSSCGL'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXPRRUN'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAEXDEPR'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXORIDE'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXSSDRB'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXDPRUN'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXWHTIF'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_EBizApp_JDBC_Env'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Manage Activity'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , EBiz_3,_e7827b'))

WebUI.setText(findTestObject('Object Repository/Page_Activity/input_Activity Report_R242004504603843036_s_342084'), 'EBiz_4')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity/td_EBiz_4'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/img_EBiz_3_apex-edit-page'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Activity/span_Entry'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FAXPIDEF'), 20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_FA_WEBADI_PHYSICAL_INVENTORY'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/img_Function_apex-edit-view_1'))

//WebUI.rightClick(findTestObject('Object Repository/Page_Activity Entries/td_EBizApp_JDBC_Env (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activity Entries/td_EBizApp_JDBC_Env (1)'), 20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/span_Close_ui-button-icon ui-icon ui-icon-c_9c474c'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity Entries/a_Manage Activity'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Activity/button_concat(Row text contains , , EBiz_3,_e7827b'))

