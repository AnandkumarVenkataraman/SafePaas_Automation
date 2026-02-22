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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Winter 2026_P101_COMPANY (2)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (77)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (77)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (36)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (87)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (22)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_User Access Certification Details'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/button_User Access Certification_P7_UAC_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/input_Search_a-PopupLOV-search apex-item-text'), 
    'EBS_UAR_04022026_075616')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/span_EBS_UAR_04022026_075616'))
WebUI.delay(60)
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_EBizApp_JDBC_Env'), 
    'EBizApp_JDBC_Env', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_Completed (1)'), 
    'Completed', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_Application Object Library'), 
    'Application Object Library', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_SYSADMIN'), 
    'SYSADMIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_Albers, Corinna'), 
    'Albers, Corinna', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_This application user name represents co_3694c1'), 
    'This application user name represents conversion or feeder system programs and is stored in each updated tablesapos; LAST_UPDATED_BY column. This application user has no responsibilities.', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_Portuguese AP Localizations  Portuguese _28634e'), 
    'Portuguese AP Localizations | Portuguese AP Localizations', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_ANANDK'), 
    'ANANDK', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_MARIAB'), 
    'MARIAB', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_Verified'), 
    'Verified', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/td_EBS_UAR_04022026_075616'), 
    'EBS_UAR_04022026_075616', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/button_User Access Certification_P7_UAC_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/input_Close_a-PopupLOV-search apex-item-text'), 
    'MULTIEnv_UAR_0611')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/span_MULTIEnv_UAR_0611'))
WebUI.delay(60)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Details/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (13)'))

WebUI.closeBrowser()
