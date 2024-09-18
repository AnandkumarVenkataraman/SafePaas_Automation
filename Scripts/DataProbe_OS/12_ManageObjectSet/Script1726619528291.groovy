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

WebUI.setText(findTestObject('Object Repository/ManageObjectSet_OS/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/ManageObjectSet_OS/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/ManageObjectSet_OS/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ManageObjectSet_OS/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/ManageObjectSet_OS/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ManageObjectSet_OS/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/ManageObjectSet_OS/Page_Home/a_Manage Object'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/select_- Select an Environment -EBizApp_JDB_73a228'), 
    'Tririga_OS', false)

WebUI.setText(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e'), 
    'Tririga_OS_ObjSet')

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_AD_Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_AD_NetUs'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_AD_User_Entry'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_AD_Users'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_OS_Entry'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_OS_User'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_OS_User_entry_g'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_OS_User_entry_p'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/td_Tririga_OS_ObjSet'))

WebUI.click(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_Object Sets'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/a_Tririga_OS_ObjSet'))

WebUI.click(findTestObject('Object Repository/ManageObjectSet_OS/Page_Manage Objects/div_Filters                            Type_cdbcdb'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

