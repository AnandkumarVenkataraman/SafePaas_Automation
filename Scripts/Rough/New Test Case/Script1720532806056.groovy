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

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_USERNAME (3)'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_PASSWORD (3)'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Login/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1 (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1_2 (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/a_Manage Exception'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    '5409', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/select_EditRule NameUser NameException Type_96c83f'), 
    'JUSTIFICATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/buttonR240042226928873910_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/a_Justification 2 - Roles (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/a_Justification 2 - Roles (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageException_RolesWithConflict/Page_Manage Exception/button_Apply'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_USERNAME (3)'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Sample1/Page_Login/input_P101_PASSWORD (3)'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Login/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1 (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/span_a-TreeView-toggle_1_2 (3)'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Home/a_Manage Violation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    '5409', true)

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/div_Select any oneCERP_1CloudERPEBizApp_JDB_e9654f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn'))

WebUI.click(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/buttonP74_REQUEST_NAME_lov_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text'), 
    'KTLN_SODTest_Jan10_V2_all')

WebUI.sendKeys(findTestObject('Object Repository/deba3/Sample1/Page_Manage Violation/input_a-PopupLOV-search apex-item-text'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

