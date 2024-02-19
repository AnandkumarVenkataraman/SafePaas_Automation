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

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Object'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM API Objects POST-GET/select_- Only Master Objects -CloudERPEBizA_667631'), 
    'SailPoint_ENV2', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/a_GRM2_GET'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/a_GRM2_POST'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_GRM2_POST'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_Object Name_P10_OBJECT_NAME'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_Object Description_P10_OBJECT_DESCR'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/div_Enterprise Access Certification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/label_Cloud'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/label_API Based'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_RESTSOAPSQL'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_GETPATCHPOST'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_URI_P10_OBJ_CLOUD_URI'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Object Items'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/label_API POST'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Seq'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Table Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Column Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_API Params'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Sub Query'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Key'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_7 - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_FSOD.FSOD_UAC_USER_ROLES (TABLE) - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_urgency'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_SELECT B.VALUE FROM FSOD.FSOD_POST_MAPPI_3f81ea - Copy'), 
    0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_8 - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_FSOD.FSOD_UAC_USER_ROLES (TABLE) - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_u_affected_environment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SELECT B.VALUE FROM FSOD.FSOD_POST_MAPPI_4a558d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_1'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_FSOD.FSOD_UAC_USER_ROLES (TABLE) - Copy'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_u_requester'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SELECT DISPLAY_NAME FROM FSOD.FSOD_USER__3892c5'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_2'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_FSOD.FSOD_UAC_USER_ROLES (TABLE) - Copy'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_contact_type'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SELECT B.VALUE FROM FSOD.FSOD_POST_MAPPI_c20c4b'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Total 10'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Object (1)'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_GRM2_GET'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_Object Name_P10_OBJECT_NAME'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_Object Description_P10_OBJECT_DESCR'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/div_Enterprise Access Certification'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_RESTSOAPSQL'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_GETPATCHPOST'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_URI_P10_OBJ_CLOUD_URI'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Object Items'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/label_API GET'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Seq'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Table Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Column Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_API Params'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Sub Query'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Key'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_FSOD.FSOD_UAC_USER_ROLES (TABLE) - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_sysparm_display_value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_true'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_2'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_FSOD.FSOD_UAC_USER_ROLES (TABLE) - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_sysparm_fields'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_number2Cstate'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Total 5'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Object (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SailPoint_ObjSet_API'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SailPoint_ObjSet_API'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Object Set'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/a_SailPoint_ObjSet_API'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SailPointX'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_18-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_KATALON_ADMIN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_18-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_KATALON_ADMIN'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_SailPoint_ObjSet_API'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_Name_P18_ENVIRONMENT_NAME'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_SailPointX'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/div_Enterprise Access Certification (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/option_GRM2_GET'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/option_GRM2_POST'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Assign Roles_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/EACM API Objects POST-GET/input_Create_R258165063082313757_search_field'), 
    'SailPoint_ENV2')

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/img_Link_apex-edit-pencil'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SailPoint_ENV2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SailPoint_ENV2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_05-MAY-23'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_A'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SailPointX (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_KATALON_ADMIN (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_05052023 101411'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_KATALON_ADMIN (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_05182023 002854'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/img_Link_apex-edit-pencil'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/label_API Enabled_u-checkbox'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_SailPoint_ObjSet_API'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_GRM2_POST'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_GRM2_GET'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/input_Get Job Interval (in Days)_P13_GET_JO_765698'), 
    0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Manage Load Query_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Manage User Access_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Role Groups'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM API Objects POST-GET/select_Select any oneCloudERPEBizApp_JDBC_E_6b6150'), 
    'SailPoint_ENV2', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/a_Category'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_AU  NZ'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_AU  NZ'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_AU  NZ'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_AU  NZ'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Role Groups Category Mapping'))

WebUI.rightClick(findTestObject('Object Repository/EACM API Objects POST-GET/th_Role Group Category'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Role Group Category'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_POST API Parameter'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Value'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_AU NZ (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_u_business_service (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_Global Role Manager (Global RM)'), 
    0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_AU NZ (3)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_assignment_group (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_MCDGLOBAL ROLE MANAGER'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_AU NZ (4)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_impact (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_2 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_AU NZ (5)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_urgency (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_2 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_AU NZ (6)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_u_service_category (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_Identity and Access (1)'), 0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_AU NZ (6)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_contact_type (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_Monitoring'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_u_affected_environment (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_Production'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Total 7'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Certification Configuration'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/h2_Company Setups'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/label_Both Approvers Responses'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/span_Yes'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_DataProbe_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Cross Datasources'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Edit'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Primary Datasource'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Secondary Datasource'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Main Table'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Join Name'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/img_Join Name_apex-edit-page'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_SailPoint_ENV2 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_KTLN_CloudERP'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_Entry'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_FSOD_ENTRY_ALL.SOURCE_KEY  FSOD_ENTRY_ALL.NAME'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_1 -                    1'), 
    0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/img_Join Name_apex-edit-page'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/div_- Please select one -CloudERPEBizApp_JD_e0d573'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/div_- Please select one -CloudERPEBizApp_JD_e0d573'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/div_- Please select one -User Entry AttributeEntry'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/div_- Please select one -EntitlementPrivile_53ee41'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Object'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Primary object join value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Operator'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Secondary object join value'), 
    0)

WebUI.verifyElementPresent(findTestObject('EACM API Objects POST-GET/td_Entry - Copy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_NAMEDISPLAY_NAMEDESCRIPTIONSOURCE_KEY'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_NAMEDISPLAY_NAMEDESCRIPTIONSOURCE_KEY_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_1 - 1'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Cross Datasources (1)'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/button_ktln_eacm_user1'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Logout'))

WebUI.setText(findTestObject('Object Repository/EACM API Objects POST-GET/input_Spring 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM API Objects POST-GET/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM API Objects POST-GET/input_New_P101_PASSWORD'), 'E9jDT7RxyN0+jhzlxRmzLQ==')

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/button_Login'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_DataProbe_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/span_Company Settings_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/a_Manage Object Items Field'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Table Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Table Owner'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Company'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Environment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Created Date'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/a_Last Updated Date'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM API Objects POST-GET/img_Link_apex-edit-pencil (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_FSOD_UAC_USER_ROLES'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_FSOD'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_Sfp_Int'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_-'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_03-JAN-22'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_08-FEB-22'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_1 -                    1 (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/img_Link_apex-edit-pencil (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_APEX_220100APEX_DEVAPPQOSSYSAUDSYSAU_2fdf85'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/select_AX_TESTBASE_RESP_TESTBASE_RESP_TEST__aa63a9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Column Name (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Column Data Type'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Column Data Length'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_ID'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_NUMBER'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_22'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_ROLE_NAME'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_VARCHAR2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_4000'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_TICK_SYS_NUMBER (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_VARCHAR2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_500'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_USER_NAME'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_VARCHAR2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_300'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_VERIFIED'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_VARCHAR2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/td_1 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/EACM API Objects POST-GET/span_Total 5 (1)'), 0)

WebUI.click(findTestObject('Object Repository/EACM API Objects POST-GET/button_Cancel (1)'))

