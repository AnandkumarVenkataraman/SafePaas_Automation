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

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e'), 
    'UserEntryAttribute_KTLN')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Go'))

String_result = WebUI.getText(findTestObject('Manage Object/a_UserEntryAttribute_KTLN'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(String_result)

WebUI.delay(5)

if (String_result == 'UserEntryAttribute_KTLN') {
    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object/a_UserEntryAttribute_KTLN'))

    String_result1 = WebUI.getText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'))

    String_result2 = WebUI.getText(findTestObject('Object Repository/Other Objects/select_RESTSOAPSQL'))

    String_result3 = WebUI.getText(findTestObject('Object Repository/Other Objects/input_URI_P10_OBJ_CLOUD_URI_UserEntryAttribute'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/span_Object Items'))

    String_result4 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL1'))

    String_result5 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL2'))

    String_result6 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL3'))

    WebUI.click(findTestObject('Object Repository/Other Objects/button_Cancel_UserEntryAttribute'))

    WebUI.click(findTestObject('Object Repository/Manage Object/button_Cancel'))

    WebUI.click(findTestObject('Manage Object/button_concat(Row text contains , , Users_KTLN, , )_a-Button a-IRR-button a-Button--noUI a-IRR-button--remove'))
} else {
    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Object Name'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'))

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'), 
        'UserEntryAttribute_KTLN')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Object Description'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'))

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'), 
        'User Entry Attribute')

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
        'USER_ID')

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS:G_1:USER_ID')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_USER_ID'))

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
        'ENTRY_ID')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path2'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS:G_1:ROLE_ID')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name2'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name2'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_ENTRY_ID'))

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

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/label'))

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
        'ATTRIBUTE_ID')

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path3'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS:G_1:ATTRIBUTE_ID')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name3'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name3'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Other Objects/li_ATTRIBUTE_ID'))

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

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/label'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Translation Function'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Translation3'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.delay(3)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_Save'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_Save'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_OK'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/a_Manage Objects'))
}

WebUI.click(findTestObject('Manage Object - Attributes/Page_Home/a_Manage Object - Copy'))

WebUI.delay(1)

