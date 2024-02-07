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

WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e'), 
    'Attribute_KTLN')

WebUI.delay(2)

WebUI.click(findTestObject('Manage Object - Attributes/Page_Manage Objects/button_Go - Copy'))

String_result = WebUI.getText(findTestObject('Object Repository/Other Objects/a_Attribute_KTLN'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(String_result)

WebUI.delay(3)

if (String_result == 'Attribute_KTLN') {
    WebUI.click(findTestObject('Object Repository/Other Objects/a_Attribute_KTLN'))

    String_result1 = WebUI.getText(findTestObject('Object Repository/Other Objects/input_Object Name_P10_OBJECT_NAME'))

    String_result2 = WebUI.getText(findTestObject('Object Repository/Other Objects/select_RESTSOAPSQL'))

    String_result3 = WebUI.getText(findTestObject('Object Repository/Other Objects/input_URI_P10_OBJ_CLOUD_URI_Attribute'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/span_Object Items'))

    String_result4 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_ATTRIBUTE_ALL1'))

    String_result5 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_ATTRIBUTE_ALL2'))

    String_result6 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_ATTRIBUTE_ALL3'))

    String_result7 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_ATTRIBUTE_ALL4'))

    String_result8 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_ATTRIBUTE_ALL5'))

    String_result9 = WebUI.getText(findTestObject('Object Repository/Other Objects/td_FSOD.FSOD_ATTRIBUTE_ALL6'))

    WebUI.click(findTestObject('Object Repository/Other Objects/button_Cancel_Users'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('Manage Object/button_Cancel_new'), 3)

    WebUI.delay(2)

    WebUI.click(findTestObject('Manage Object/button_Cancel_new'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('Manage Object/Page_Manage Objects/button_concat_Remove - Copy'), 3)

    WebUI.delay(2)

    WebUI.click(findTestObject('Manage Object/Page_Manage Objects/button_concat_Remove - Copy'))

    WebUI.click(findTestObject('Manage Object/Page_Manage Objects/button_concat_Remove - Copy2'))

    WebUI.delay(3)
} else {
    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Manage Objects/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Object Name'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'))

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Name_P10_OBJECT_NAME'), 
        'Attribute_KTLN')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/label_Object Description'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'))

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'), 
        'Attributes')

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
        'ORIG_ID')

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS:G_1:ORIG_ID')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/li_FSOD.FSOD_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/li_ORIG_ID'))

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
        'NAME')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path2'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS: G_1:NAME')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name2'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/li_FSOD.FSOD_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name2'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/li_NAME'))

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
        'DISPLAY_NAME')

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path3'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS: G_1:DISPLAY_NAME')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name3'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/li_FSOD.FSOD_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name3'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/li_DISPLAY_NAME'))

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

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/li_FSOD.FSOD_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name4'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/li_DESCRIPTION'))

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

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/li_FSOD.FSOD_ATTRIBUTE_ALL'))

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

    WebUI.setText(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146571971917766617'), 
        '6')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(2)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Object Item Name'))

    WebUI.doubleClick(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Item Name6'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_146570690835766604'), 
        'ATTRIBUTE_TYPE_ID')

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Cloud path'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Cloud path6'))

    WebUI.setText(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        'DATA_DS: G_1:ATTRIBUTE_TYPE_ID')

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/textarea_concat(id(, , C146571805019766616,_6dda72'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_Translation Function_igSod_ig_grid_vc_cur3'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Table Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Table Name6'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_CountryORIG_ID_C146572706494766625_lov_btn'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/li_FSOD.FSOD_ATTRIBUTE_ALL'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572706494766625'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Column Name'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Column Name6'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/input_Translation Function_C146572807689766626'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/button_Translation Function_C146572807689766626_lov_btn'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/li_ATTRIBUTE_TYPE_ID'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/input_Translation Function_C146572807689766626'), 
        Keys.chord(Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Datatype'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/DataType6'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/select_-- Select DataType -- DATELISTVARCHAR2'), 
        'VARCHAR2', true)

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Key'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Key6'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --'), Keys.chord(
            Keys.ARROW_RIGHT))

    WebUI.delay(5)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/span_Translation Function'))

    WebUI.click(findTestObject('Manage Object - Attributes/Page_Add Object Items/Page_Add Object Items/Translation6'))

    WebUI.sendKeys(findTestObject('Manage Object - Attributes/Page_Add Object Items/td_-- Select DataType --_igSod_ig_grid_vc_cur1'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_Save'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_Save'))

    WebUI.click(findTestObject('Object Repository/Manage Object - Attributes/Page_Add Object Items/button_OK'))
}

WebUI.delay(1)

