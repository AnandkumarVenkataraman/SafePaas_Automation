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

WebUI.setText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/input_P101_COMPANY (1) (1) (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/input_P101_USERNAME (1) (1) (1)'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/input_P101_PASSWORD (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Login/button_Login (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/a_Manage Data Source (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Home/a_Manage Data Source (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 -Z1'))

WebUI.selectOptionByLabel(findTestObject('deba2/DataProbe_JDBC/Page_Manage Data Source/select_- Select an Environment -CERP_1Cloud_f2f181 -Z1'), 
    'EBizApp_JDBC_Env', true, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_EBiz_JDBC_DS (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_EBiz_JDBC_DS (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/label_Active (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/label_Name (Value Required) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_P4_DS_ENCRYPTED_PWD (1)'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_P4_DS_ENCRYPTED_PWD (1)'), 
    'MdqPWYggwm0=')

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Apply Changes (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Apply Changes (1)'))

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/h2_The Datasource was successfully saved (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_f01 (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/input_f01 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Synchronization (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Synchronization (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/h2_Syncronization processing in the background (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/span_Running (1)'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Last Synchronization Status'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/a_Last Synchronize Date'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser()

