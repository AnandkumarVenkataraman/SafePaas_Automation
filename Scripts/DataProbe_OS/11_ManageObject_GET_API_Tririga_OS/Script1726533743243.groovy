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

WebUI.setText(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Home/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Home/a_Manage Object'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Manage Objects/select_- Select an Environment -EBizApp_JDB_73a228'), 
    'Tririga_OS', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Manage Objects/a_GET_API_Tririga_OS'))

WebUI.click(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Manage Objects/a_GET_API_Tririga_OS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_Object Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/input_(Value Required)_P10_OBJECT_NAME'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_Object Description'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_Product Type (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/div_Enterprise Access Certification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_Type of Object (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_Cloud'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_Action'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_API Based'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_API Type (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/select_RESTSOAPSQL'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_API Method (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/select_GETPATCHPOST'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_File Format (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/select_JSONXML'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_URI'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/input_URI_P10_OBJ_CLOUD_URI'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/label_Limit Parameter (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/select_CountLimit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/a_Get Sample'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/th_Seq'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_Table Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_Column Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)_oItemsA_553f04'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)_oItemsA_553f04'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_TICK_SYS_NUMBER'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_API Params'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_sysparm_display_value'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_sysparm_fields'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_sys_id'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_Sub Query'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_true'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_number2Cstate'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/th_Key'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_-'))

WebUI.rightClick(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_Datatype'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_Datatype'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)_oItemsA_553f04'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)_oItemsA_553f04'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_FSOD.FSOD_UAC_USER_ROLES (TABLE)_oItemsA_553f04'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_Date Mask'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_GET_API_Tririga_OS/Page_Add Object Items/span_Total 3'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_POST_API_Tririga_OS/Page_Add Object Items/button_Cancel'))

WebUI.click(findTestObject('Object Repository/OS_Obj_POST_API_Tririga_OS/Page_Add Object Items/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OS_Obj_POST_API_Tririga_OS/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/OS_Obj_POST_API_Tririga_OS/Page_AddEdit Object Details/button_Cancel'))

WebUI.closeBrowser()

