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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (6)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (6)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (94)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (70)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (51)'))
//Attributes
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Rules (8)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1 (1)'),
	'5888', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Filter False - Positives (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/input_Exclude  Unexclude All_control_298068_f41ab9'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/input_Exclude  Unexclude All_control_298068_f41ab9'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Filter False-Positives/button_Cancel (3)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1 (1)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (94)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (70)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Dashboard_a-TreeView-toggle (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Violation Report_a-TreeView-toggle (3)'))
//Application Access Reports - all EAM Security objects
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_User Listing and access'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'),
	'5888', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Listing/a_User Entry Access Listing (1)'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Access Listing/a_User Entry Attribute Access Listing (1)'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Entry Attribute Access Listing/a_Entry Listing (1)'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81 (1)'),
	'21', true)
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81 (1)'),
	'480', true)
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81 (1)'),
	'481', true)
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81 (1)'),
	'482', true)
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81 (1)'),
	'483', true)
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81 (1)'),
	'582', true)
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/select_Select any oneResponsibilityMenuFunc_024d81 (1)'),
	'584', true)
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Listing/a_Entry Attributes (1)'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Entry Attributes/a_Access Hierarchy (1)'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Access Type_P13_RESPONSIBILITY_lov_btn (2)'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/input_Search_a-PopupLOV-search apex-item-text (2)'),
	'General Ledger Super User (Process Operations)[GL_VISION_PROCESS] (RESPONSIBILITY)')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Search_a-Button a-PopupLOV-doSearch (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/span_General Ledger Super User'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/button_Go (1)'))
WebUI.delay(5)
WebUI.takeScreenshot()
WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Access Hierarchy/a_Inbox (1)'))
//Application Role Group

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (95)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage My Access_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Role Groups'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/select_Select any oneCoupa_Env1EBizApp_JDBC_73bea7'),
	'5888', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/select_Select any oneCoupa_Env1EBizApp_JDBC_73bea7'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Role Groups/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (26)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (34)'))

WebUI.closeBrowser()

//ENd