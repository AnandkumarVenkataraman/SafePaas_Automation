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

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Home/div_Administration'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage Company - Users/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Home/div_Company Settings'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage Company - Users/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Manage Company - Users/Page_Home/Manage Company'))

WebUI.click(findTestObject('Manage Company - Users/Page_Home/Manage Company'))

WebUI.verifyElementClickable(findTestObject('Manage Company - Users/Page_Company/input_Name_P15_NAME'))

WebUI.verifyElementText(findTestObject('Manage Company - Users/Page_Company/div_KAT'), 'KAT')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Company - Users/Page_Company/span_50000'), '50000', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_Access Monitor'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_Company Settings'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_Enterprise Access Certification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_Enterprise Access Monitor'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_Enterprise iAccess'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_Global Settings'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_MonitorPaaS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_Policy Manager'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/div_iAccess'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/span_Users'))

WebUI.mouseOver(findTestObject('Object Repository/Manage Company - Users/Page_Company/a_Users'))

WebUI.click(findTestObject('Object Repository/Manage Company - Users/Page_Company/span_Users'))

WebUI.verifyElementText(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/td_KATALON_ADMIN'), 'KATALON_ADMIN')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/td_anandkumar.venkataramansafepaas.com'), 
    'anandkumar.venkataraman@safepaas.com', FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/input_Create_R23213727076438815_search_field'))

WebUI.setText(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/input_Create_R23213727076438815_search_field'), 
    'KATALON_ADMIN')

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/a_User Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Create Users/a_Email Address'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Company/span_Users Access'))

WebUI.mouseOver(findTestObject('Object Repository/Manage Company - Users/Page_Company/a_Users Access'))

WebUI.click(findTestObject('Object Repository/Manage Company - Users/Page_Company/span_Users Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900'))

WebUI.setText(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900'), 
    'KATALON_ADMIN')

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/button_Go'))

WebUI.click(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/span_User Name'), 
    'User Name')

WebUI.verifyElementText(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/span_Application Name'), 
    'Application Name')

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -Global SettingsCompany_61159e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/td_Policy Manager'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/td_- Select Any -Global SettingsCompany Set_cdf789'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Company - Users/Page_Users Application Access/select_- Select Any -KATALON_ADMIN'))

WebUI.delay(3)

WebUI.click(findTestObject('Manage Company - Users/a_Manage Company'))

WebUI.delay(1)

