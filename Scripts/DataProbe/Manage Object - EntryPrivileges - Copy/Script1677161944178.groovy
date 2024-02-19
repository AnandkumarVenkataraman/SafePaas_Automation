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

WebUI.navigateToUrl('https://uat.safepaas.com/monitor/f?p=1000:101:::::')

WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Login/input_Winter 2023_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Object - Attributes/Page_Login/input_New_P101_PASSWORD'), 
    'E9jDT7RxyN0+jhzlxRmzLQ==')

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/div_DataProbe'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/div_Setup'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Home/a_Manage Object'))

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/select_- Only Master Objects -CloudERPKTLN__069ca0'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/select_- Only Master Objects -CloudERPKTLN__069ca0'), 
    'KTLN_CloudERP', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e'), 
    'EntryPrivileges_KTLN')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Go'))

String_result = WebUI.getText(findTestObject('Object Repository/Other Objects/a_EntryPrivileges_KTLN'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(String_result)

WebUI.delay(3)

if (String_result == 'EntryPrivileges_KTLN') {
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Other Objects/a_EntryPrivileges_KTLN'))

    String_result1 = WebUI.getText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'))

    WebUI.click(findTestObject('Object Repository/Manage Object/button_Cancel'))
} else {
    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Object Name'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'))

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'), 
        'EntryPrivileges_KTLN')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Object Description'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'))

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'), 
        'Entry Privileges')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Product Type'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Enterprise Access Monitor'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Enterprise Access Monitor'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Type of Object'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Action'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Use File Headers'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Column Delimiter'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/span_Object Items'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/span_Object Items'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Seq'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/td_Translation Function_a-GV-cell u-tE'))

    WebUI.doubleClick(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur1'))

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146571971917766617'), 
        '1')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Object Item Name'))

    WebUI.doubleClick(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_a-GV-cell u-tS is-focused'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        'PRIVILEGE_ID')

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS:G_1:PRIVILEGE_ID')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_ENTRY_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_SOURCE_KEY'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_C146572807689766626'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Datatype'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/DataType'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/select_-- Select DataType -- DATELISTVARCHAR2'), 
        'VARCHAR2', true)

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Key'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Key'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/label'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Translation Function'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Translation'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.TAB))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146571971917766617'), 
        '2')

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Object Item Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Item Name'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        'CODE')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path2'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS: G_1:CODE')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name2'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_ENTRY_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name2'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_NAME_EntryRoles'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_C146572807689766626'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Datatype'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/DataType2'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/select_-- Select DataType -- DATELISTVARCHAR2'), 
        'VARCHAR2', true)

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Key'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Key2'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Translation Function'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Translation2'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.TAB))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146571971917766617'), 
        '3')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Object Item Name'))

    WebUI.doubleClick(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Item Name3'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        'PRIVILEGE_NAME')

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path3'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS: G_1:PRIVILEGE_NAME')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name3'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_ENTRY_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name3'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_DISPLAY_NAME_EntryRoles'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_C146572807689766626'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Datatype'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/DataType3'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/select_-- Select DataType -- DATELISTVARCHAR2'), 
        'VARCHAR2', true)

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Key'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Key3'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Translation Function'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Translation3'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.TAB))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146571971917766617'), 
        '4')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Object Item Name'))

    WebUI.doubleClick(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Item Name4'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        'DESCRIPTION')

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path4'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS: G_1:DESCRIPTION')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name4'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_ENTRY_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name4'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_DESCRIPTION_EntryRoles'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_C146572807689766626'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Datatype'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/DataType4'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/select_-- Select DataType -- DATELISTVARCHAR2'), 
        'VARCHAR2', true)

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Key'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Key4'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Translation Function'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Translation4'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.TAB))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146571971917766617'), 
        '5')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Object Item Name'))

    WebUI.doubleClick(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Item Name5'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        'ACTIVE')

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path5'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS: G_1:ACTIVE')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name5'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_ENTRY_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name5'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/li_ACTIVE'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_C146572807689766626'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Datatype'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/DataType5'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/select_-- Select DataType -- DATELISTVARCHAR2'), 
        'VARCHAR2', true)

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Key'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Key5'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Translation Function'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Translation5'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.TAB))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_Save'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_Save'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_OK'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/a_Manage Objects'))
}

WebUI.delay(5)

