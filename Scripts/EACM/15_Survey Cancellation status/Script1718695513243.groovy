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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/a_Manage User Access'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Home/a_Manage User Access'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvKTLN_C_10fa97'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/select_NameDescriptionEnd Date ActionStatus_dc9709'))

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/input_p_ignore_10'), 
    GlobalVariable.EACM_Schedule_SurveyName)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/button_Apply'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/a_Comments'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_CancellationVerify/Page_Manage User Access/a_Comments'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

