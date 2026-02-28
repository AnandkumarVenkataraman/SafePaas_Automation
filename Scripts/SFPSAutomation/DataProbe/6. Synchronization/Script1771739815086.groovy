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

//Navigate to Manage Datasource
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Data Source (1)'))

//Synchronization
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (6)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (5)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Setup_a-TreeView-label'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Manage Data Source/select_Environment_P100_ENVIRONMENT'), 
    'EBizApp_JDBC_Env', false)

WebUI.setText(findTestObject('Object Repository/Page_Manage Data Source/input_Create_R119140564844328612_search_field (3)'), 
    'EBiz_JDBC_DS')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Create_R119140564844328612_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/input_Run script_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Manage Data Source_B117273309101097005'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Data Source/h2_Breadcrumb_t-Alert-title'), 'Synchronization processing in the background.', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Data Source/span'), 'Running', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Synchronization processing in the ba_b153f5'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_concat(Row text contains , , EBiz_JD_36edac (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_Environment_P100_ENVIRONMENT'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//WebUI.callTestCase(findTestCase('SFPSAutomation/DataProbe/7. Security'), [:])
WebUI.closeBrowser()