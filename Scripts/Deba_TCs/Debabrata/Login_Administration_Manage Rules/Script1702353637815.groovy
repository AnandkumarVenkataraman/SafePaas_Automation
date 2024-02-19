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

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Debabrata/Page_Login/input_New_P101_PASSWORD'), 'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/div_Administration'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_DataProbe_a-TreeView-toggle'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Company Settings'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration_a-TreeView-toggle'), 
    0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Company'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Company'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Company'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Page_Company/input_Name_P15_NAME'), '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Company/label_Products'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Company/span_Users'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Company/span_Users'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Company/a_Users'))

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Page_Create Users/input_Create_R23213727076438815_search_field'), 
    '')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Create Users/input_Create_R23213727076438815_search_field'), 
    'DPATEL')

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Create Users/button_Go'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Create Users/button_Go'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Create Users/span_Users Access'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Create Users/span_Users Access'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Create Users/span_Users Access'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Users Application Access/span_User Name'), 0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Users Application Access/span_Company'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Company/a_Manage Environment'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Company/a_Manage Environment'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Company/a_Manage Environment'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Page_Manage Environment/input_Create_R258165063082313757_search_field'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Environment/img_-_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/img_-_apex-edit-pencil'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_AddEdit Environment/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_AddEdit Environment/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Manage Property Type_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Manage Property Type_a-TreeView-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_AccessPaaS'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Help_a-TreeView-toggle'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Request Status_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Request Status_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Rules Summary By Exceptions_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Rules Summary By Exceptions_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Debabrata/Page_Manage Environment/a_Manage Rules'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/a_Manage Rules'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Approval Status'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Approval Status'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Approval Status'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Approved'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Approved'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Approved'))

WebUI.delay(7)

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_AR_AdjustmentProfile'), 0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_AR_AdjustmentProfile'))

WebUI.delay(7)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_ProcurementAgent'))

WebUI.delay(7)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_RA'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_RA'))

WebUI.delay(7)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_ALL CERP RULES'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_ALL CERP RULES'))

WebUI.delay(7)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_Rule Tags'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_All'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Rules/a_All'))

WebUI.delay(7)

WebUI.closeBrowser()

