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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (6)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (6)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (6)'))

//Datasource
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Data Source (4)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_- Select an Environment -Coupa_Env1E_6fdc1f (1)'), 
    2)

WebUI.setText(findTestObject('Object Repository/Page_Manage Data Source/input_Create_R119140564844328612_search_field (2)'), 
    'EBiz_JDBC_DS')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Active (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Data Source/input_Search_R119140564844328612_sort_widge_12399d (1)'), 
    'Yes')

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage Data Source/input_Search_R119140564844328612_sort_widge_12399d (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Completed (2)'))

WebUI.delay(2)
//WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Log Report/a_Inbox (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Data Source (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_concat(Active contains , , Yes, , )__d41043'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_concat(Active contains , , Yes, , )__d41043'), FailureHandling.OPTIONAL)

//Manage Objects
//Attribute

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Manage Object (2)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Objects/select_- All -MonitorPaaSEnterprise Access _717d25'),
	2)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (1)'),
	'EBiz_Attribute_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Attribute_JDBC'))
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (1)'))
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EBiz_At_3448eb'), FailureHandling.OPTIONAL)

//User
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EBiz_JD_2458d0'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (2)'),
	'EBiz_User_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_User_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AddEdit Object Details/label_JDBC (1)'), 0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EBiz_JD_2458d0'), FailureHandling.OPTIONAL)


//Concurrent Program

//WebUI.closeBrowser()

