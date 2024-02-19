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

WebUI.navigateToUrl('https://us21n.safepaas.com/')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Debabrata/Page_Login/input_New_P101_PASSWORD'), 's/1ExrNgNNDJZKCaQrOIMg==')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Login/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Debabrata/Page_Login/input_New_P101_PASSWORD'), 'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Home/a_Manage Company'))

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Page_Company/input_Name_P15_NAME'), '')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Company/span_KAT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Company/span_KAT'), 0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Company/span_Users'))

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Create Users/input_Create_R23213727076438815_search_field'), 
    'KATALON_ADMIN')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Create Users/button_Go'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Create Users/a_Users Access'))

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Users Application Access/input_Submit_R259422667645149962_ig_toolbar_d69900'), 
    'KATALON_ADMIN')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Users Application Access/button_Go'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Users Application Access/a_Company'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Company/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/Debabrata/Page_Manage Environment/input_Create_R258165063082313757_search_field'), 
    'CERP')

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/button_Go'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/img_Link_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_AddEdit Environment/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/span_Manage Property Type_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/button_katalon_admin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Debabrata/Page_Manage Environment/a_Logout'), 0)

WebUI.click(findTestObject('Object Repository/Debabrata/Page_Manage Environment/a_Logout'))

WebUI.closeBrowser()

