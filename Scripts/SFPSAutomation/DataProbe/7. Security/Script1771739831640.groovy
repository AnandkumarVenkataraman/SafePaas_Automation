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

//Security

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Object Set_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Page_Manage DataProbe Roles/input_Create_R637454319923923464_search_field'),
	'admin')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage DataProbe Roles/button_Create_R637454319923923464_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage DataProbe Roles/img_admin_apex-edit-page'))
WebUI.takeScreenshot()
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_CreateEdit Role/button_Security_B171632388479850263'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage DataProbe Roles/button_concat(Row text contains , , admin, _30fb6d'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage DataProbe Roles/input_Create_R637454319923923464_search_field'),
	'readonly')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage DataProbe Roles/button_Create_R637454319923923464_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage DataProbe Roles/img_admin_apex-edit-page'))
WebUI.takeScreenshot()
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_CreateEdit Role/button_Security_B171632388479850263'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage DataProbe Roles/button_concat(Row text contains , , admin, _30fb6d'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage DataProbe Roles/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/button_Inbox_L14205299837764170'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_My Profile_menu_L14205299837764170_1i'))

//Login as the user with read-only role and verify

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (2)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (7)'), 'ANANDK1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (7)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Reset Password_loginBtn'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (8)'))

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_DataProbe_a-TreeView-label (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Manage Snapshot/select_Object Set_P100_OBJECT_SET (1)'),
	'EBizApp_JDBC_ObjSet', false)
WebUI.delay(1)
WebUI.takeScreenshot()

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/h1_DataProbe_t-Breadcrumb-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Snapshot/select_Object Set_P100_OBJECT_SET (1)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/button_Inbox_L14205299837764170 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_My Profile_menu_L14205299837764170_1i (1)'))

//SFTP
//WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (1)'), 'KAT')
//
//WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (6)'), 'KATADMIN')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (6)'), 'Ioqy8emDrxi5mkiNQATzxQ==')
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (6)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (9)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_SFTP File Explorer'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/span_data (6)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/span_katdataadm_a-TreeView-toggle'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/span_sftp (3)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/span_net (2)_a-TreeView-toggle'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/span_processed (4)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/span_error (27)_a-TreeView-toggle'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/span_20251230_101524_local_EBSDB_11122025_S_150a38'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_File Explorer/a_Inbox'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/button_Inbox_L14205299837764170 (1)'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_My Profile_menu_L14205299837764170_1i (1)'))

WebUI.closeBrowser()