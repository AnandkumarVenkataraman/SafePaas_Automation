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

WebUI.setText(findTestObject('Object Repository/ManageDatasource_OS/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/ManageDatasource_OS/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/ManageDatasource_OS/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Home/a_Manage Data Source'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_73a228'), 
    'Tririga_OS', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/a_Remote_File_DS_Tri'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/a_TririgaOS_API_DS'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/span_1 -                    2'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/a_Remote_File_DS_Tri'))

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/a_Remote_File_DS_Tri'))

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Active'), 'Active?')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/span_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Name (Value Required)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'))

variableHoldingValue = WebUI.getAttribute(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'), 
    'value')

WebUI.verifyEqual(variableHoldingValue, 'Remote_File_DS_Tri')

System.out.println(variableHoldingValue)

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Type Name (Value Required)'), 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/select_- Select Any -Azure RESTDB2Local Fil_e3ef38'), 
    'SFTP', false, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_SFTP Location (Value Required)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Local'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Remote'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Hostname (Value Required)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_HOSTNAME'))

variableHoldingValue1 = WebUI.getAttribute(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_HOSTNAME'), 
    'value')

WebUI.verifyEqual(variableHoldingValue1, 'ebiz1229.safepaas.com')

System.out.println(variableHoldingValue1)

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Remote Path (Value Required)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_REMOTE_PATH'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Security Protocol'), 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/select_- Select Any -SSHUser-Password'), 
    'User-Password', false, 0)

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Port'), 'Port')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Port_P4_DS_PORT'))

variableHoldingValue2 = WebUI.getAttribute(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Port_P4_DS_PORT'), 
    'value')

WebUI.verifyEqual(variableHoldingValue2, '22')

System.out.println(variableHoldingValue2)

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Username'), 
    'Username')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Username_P4_DS_USERNAME'))

variableHoldingValue3 = WebUI.getAttribute(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Username_P4_DS_USERNAME'), 
    'value')

WebUI.verifyEqual(variableHoldingValue3, 'dataprobe')

System.out.println(variableHoldingValue3)

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Password'), 
    'Password')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Password_P4_DS_ENCRYPTED_PWD'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/a_TririgaOS_API_DS'))

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/a_TririgaOS_API_DS'))

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Active'), 'Active?')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/span_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Name (Value Required)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'))

variableHoldingValue4 = WebUI.getAttribute(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_NAME'), 
    'value')

WebUI.verifyEqual(variableHoldingValue4, 'TririgaOS_API_DS')

System.out.println(variableHoldingValue4)

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Type Name (Value Required)'), 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/select_- Select Any -Azure RESTDB2Local Fil_e3ef38'), 
    'Oracle Cloud REST', false, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Hostname (Value Required)'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_HOSTNAME'))

variableHoldingValue5 = WebUI.getAttribute(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_(Value Required)_P4_DS_HOSTNAME'), 
    'value')

WebUI.verifyEqual(variableHoldingValue5, 'https://servicecafedev.service-now.com')

System.out.println(variableHoldingValue5)

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Security Protocol'), 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/select_- Select Any -User-Password'), 
    'User-Password', false, 0)

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Port'), 'Port')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Port_P4_DS_PORT'))

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Username'), 
    'Username')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Username_P4_DS_USERNAME'))

variableHoldingValue6 = WebUI.getAttribute(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Username_P4_DS_USERNAME'), 
    'value')

WebUI.verifyEqual(variableHoldingValue6, 'SafePaas. Integration User')

System.out.println(variableHoldingValue6)

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_Password'), 
    'Password')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_Password_P4_DS_ENCRYPTED_PWD'))

WebUI.verifyElementText(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/label_REST Demo URI'), 
    'REST Demo URI')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/input_REST Demo URI_P4_REST_DEMO_URI'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/button_Cancel'))

WebUI.click(findTestObject('Object Repository/ManageDatasource_OS/Page_Manage Data Source/button_Cancel'))

WebUI.closeBrowser()

