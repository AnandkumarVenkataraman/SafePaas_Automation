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

WebUI.setText(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/a_Assignment Report'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Home/a_Assignment Report'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/select_Select any oneCERP_1CloudERPEBizApp__a9def6'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/select_Select any oneCERP_1CloudERPEBizApp__a9def6'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/button_Schedule'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/button_Schedule'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/h2_Your request has been submitted in queue_ad4388'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/a_Scheduled Downloads'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Assignment Report/a_Scheduled Downloads'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/span_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/select_SP ComponentFile nameStatusFiltersRe_200e32'), 
    'FILTERS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/input_p_ignore_10'), 
    'EACM')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/EACM_AssignmentReport/Page_Scheduled Downloads/a_Status'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.closeBrowser()

