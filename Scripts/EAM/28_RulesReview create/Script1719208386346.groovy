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

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/a_Manage Rules Review'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Home/a_Manage Rules Review'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/select_Select any oneEBizApp_JDBC_EnvKTLNCl_1d34dc'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/select_Select any oneEBizApp_JDBC_EnvKTLNCl_1d34dc'), 
    'KTLN_DEV22', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Create'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/input_Name_P138_NAME'), 
    '')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/input_Name_P138_NAME'), GlobalVariable.RulesReviewName)

WebUI.verifyElementText(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/textarea_Description_P138_DESCRIPTION'), 
    '')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/textarea_Description_P138_DESCRIPTION'), 
    GlobalVariable.RulesReviewName)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/span_Start Date_oj-inputdatetime-calendar-i_d77116'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/span_Start Date_oj-inputdatetime-calendar-i_d77116'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/a_21'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/a_21'))

WebUI.verifyElementClickable(findTestObject('EAM_RulesReview/Page_Initiate Rules Review/span_End Date_oj-inputdatetime-calendar-i_d77116 - Copy'))

WebUI.click(findTestObject('EAM_RulesReview/Page_Initiate Rules Review/span_End Date_oj-inputdatetime-calendar-i_d77116 - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/a_22'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/a_22'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/button_Create'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/Page_Initiate Rules Review/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_Survey/Page_Manage User Access/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Actions'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Filter'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/select_NameDescriptionStatusStart DateEnd D_aa7b45'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/input_Expression_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/input_Expression_p_ignore_10'), 
    GlobalVariable.RulesReviewName)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Apply'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/button_Apply'))

WebUI.delay(6)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/a_KTLN_RulesReview_DEV22_Jun21_v1'))

WebUI.click(findTestObject('Object Repository/EAM_RulesReview/RulesReview status/Page_Manage Rules Review/a_KTLN_RulesReview_DEV22_Jun21_v1'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

