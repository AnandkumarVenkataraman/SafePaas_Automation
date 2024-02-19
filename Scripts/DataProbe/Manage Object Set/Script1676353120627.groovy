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

WebUI.click(findTestObject('Manage Object Set/a_Manage Object Set1'))

WebUI.setText(findTestObject('Manage Object Set/Page_Manage Object Set/input_Report Search_P17_REPORT_SEARCH - Copy'), 'KTLN_OBJECT_SET')

WebUI.click(findTestObject('Manage Object Set/Page_Manage Object Set/button_Go1'))

String_result = WebUI.getText(findTestObject('Manage Object Set/Page_Manage Object Set/a_KTLN_OBJECT_SET2'), FailureHandling.CONTINUE_ON_FAILURE)

System.out.println(String_result)

WebUI.delay(3)

if (String_result == 'KTLN_OBJECT_SET') {
    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object Set/Page_Manage Object Set/a_KTLN_OBJECT_SET2'))

    String_result1 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/span_Oracle Cloud ERP 20x'))

    String_result2 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/div_Enterprise Access Monitor'))

    String_result3 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_10'))

    String_result4 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Users'))

    String_result5 = WebUI.getText(findTestObject('Manage Object Set/Page_Manage Object Set/td_Users_KTLN1'))

    String_result6 = WebUI.getText(findTestObject('Manage Object Set/Page_Manage Object Set/td_USERS1'))

    String_result7 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/td_14-FEB-23'))

    String_result8 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/td_KATALON_ADMIN'))

    String_result9 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/td_24-FEB-23'))

    String_result10 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/td_KATALON_ADMIN1'))

    String_result11 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_USERS'))

    String_result12 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_ENTRYROLES'))

    String_result13 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_ENTRYPRIVILEGES'))

    String_result14 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_ATTRIBUTES'))

    String_result15 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_USERENTRY'))

    String_result16 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_ENTRYHIERARCHY'))

    String_result17 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_ENTRYATTRIBUTE'))

    String_result18 = WebUI.getText(findTestObject('Object Repository/Manage Object Set/select_Attribute_KTLNAttributes-DTP701EntryAttribute_KTLNEntryHierarchy_KTLNEntryPrivileges_KTLNEntryRoles_KTLNUserEntryAttribute_KTLNUserEntry_KTLNUsers_KTLN_USERENTRYATTRIBUTE'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/button_Cancel'))
} else {
    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_Manage Object Set/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_Manage Object Set/button_Create'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Name'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/input_Name_P18_ENVIRONMENT_NAME'))

    WebUI.setText(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/input_Name_P18_ENVIRONMENT_NAME'), 
        'KTLN_OBJECT_SET')

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_App Type Version (Value Required)'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/select_Select any One11112019.xBeelinexDBXE_9b50fd'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/select_Select any One11112019.xBeelinexDBXE_9b50fd'), 
        '5150', true)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Product Type'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_MonitorPaaS'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Enterprise Access Monitor'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Enterprise iAccess'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Enterprise Access Certification'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Enterprise Access Monitor'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Sequence'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_10'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_20'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_20'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_20'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_20'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_30'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_40'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_50'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_60'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_70'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_80'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Entry Type Name'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Users'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Role'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Privilege'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_it'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Entitlement'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Attribute'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_User to Entry'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Entry Hierarchy'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Entry Attribute'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_User Entry Attribute'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_Entry Hierarchy Attribute'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Object'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Object'))

    WebUI.click(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_Users'))

    WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_Users'), '349761', true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryRole'))

    WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryRole'), '349591', true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryPrivilege'))

    WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryPrivilege'), '349601', true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_Attribute'))

    WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_Attribute'), '349371', true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_UserEntry'))

    WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_UserEntry'), '349621', true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryAttribute'))

    WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_EntryAttribute'), '349671', true)

    WebUI.delay(3)

    WebUI.click(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_UserEntryAttribute'))

    WebUI.selectOptionByValue(findTestObject('Manage Object Set/Page_AddEdit Objectset/Obj_UserEntryAttribute'), '349631', 
        true)

    WebUI.delay(3)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Object Type'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_USERS (1)'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_ENTRY'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_ATTRIBUTE (1)'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_USER_ENTRY'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_ENTRY_ATTRIBUTE'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_USER_ENTRY_ATTRIBUTE'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/div_SequenceEntry Type NameObjectObject Typ_145c20'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Creation Date'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_-'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Creation Date'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Created By'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Last Updated Date'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Last Updated Date'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/th_Last Updated By'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/td_-'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Start Date'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/div_NameStart DatePress Key down or Key up _37fc7f'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/span_Start Date_oj-inputdatetime-calendar-i_558149'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/a_14'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_End Date'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/span_Start Date_oj-inputdatetime-calendar-i_558149'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/div_Description'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/label_Description'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/textarea_Description_P18_DESCRIPTION'))

    WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/button_Create'))

    WebUI.click(findTestObject('Object Repository/Manage Object Set/Page_AddEdit Objectset/button_Create'))
}

WebUI.click(findTestObject('Manage Object Set/a_Manage Object Set1'))

WebUI.delay(3)

