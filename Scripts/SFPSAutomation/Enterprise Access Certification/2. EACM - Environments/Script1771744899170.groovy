import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (3)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (8)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (8)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Company_a-TreeView-label'))

//WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
//	'EBizApp_JDBC')
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'))
WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
	'Coupa_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_-_u-tC (1)'), 'A')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A_u-tC (1)'), 'CoupaX')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_Oracle Cloud ERP 20x_u-tL'), 'Operations')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (3)'),
	'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Create_R258165063082313757_search_button (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_-_u-tC (1)'), 'A')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A_u-tC_1'), 'EBS R12.2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_Oracle Cloud ERP 20x_u-tL'), 'Operations')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , EBizApp_824ca1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))
WebUI.closeBrowser()