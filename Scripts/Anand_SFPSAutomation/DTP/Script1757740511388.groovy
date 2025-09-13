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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Summer 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (6)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (6)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (6)'))

//Datasource
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Data Source (4)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_- Select an Environment -Coupa_Env1E_6fdc1f (1)'), 
    2)

WebUI.setText(findTestObject('Object Repository/Page_Manage Data Source/input_Create_R119140564844328612_search_field (2)'), 
    'EBiz_JDBC_DS')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Active (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Data Source/input_Search_R119140564844328612_sort_widge_12399d (1)'), 
    'Yes')

WebUI.sendKeys(findTestObject('Object Repository/Page_Manage Data Source/input_Search_R119140564844328612_sort_widge_12399d (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Completed (2)'))

WebUI.delay(2)
//WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Log Report/a_Inbox (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Data Source (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_concat(Active contains , , Yes, , )__d41043'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_concat(Active contains , , Yes, , )__d41043'), FailureHandling.OPTIONAL)

//Manage Objects
//Attribute

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Manage Object (2)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Objects/select_- All -MonitorPaaSEnterprise Access _717d25'),
	2)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (1)'),
	'EBiz_Attribute_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Attribute_JDBC'))
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (1)'))
WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EBiz_At_3448eb'), FailureHandling.OPTIONAL)

//User
//WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EBiz_JD_2458d0'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (2)'),
	'EBiz_User_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_User_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AddEdit Object Details/label_JDBC (1)'), 0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EBiz_JD_2458d0'), FailureHandling.OPTIONAL)


//Concurrent Program, Menu, Grants, Functions, Responsibility, Roles and Request Groups

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (3)'),
	'Concurrent_Program')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Entry_Concurrent_Program_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , Concurr_8ac5e6'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (3)'),
	'Form_Functions')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Entry_Form_Functions_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , Concurr_8ac5e6'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (3)'),
	'LocalRoles')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Entry_LocalRoles_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , Concurr_8ac5e6'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (3)'),
	'Grant')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Entry_Grant_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , Concurr_8ac5e6'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (3)'),
	'Menu_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , Concurr_8ac5e6'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (3)'),
	'Request_Group')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , Concurr_8ac5e6'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (3)'),
	'Responsibility')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (3)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Objects/td_XXSP_ENTRY_RESP_EBSAPPL_V'), 0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AddEdit Object Details/label_JDBC (2)'), 0, FailureHandling.OPTIONAL)
WebUI.takeScreenshot()
WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , Concurr_8ac5e6'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (4)'),
	'EntryAttribute_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_EntryAttribute_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (3)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Objects/td_XXSP_ENTRYATTRIBUTE_EBSAPPL_V'), 0, FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EntryAt_e48873'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (4)'),
	'EBiz_EntryHierarchy_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_EntryHierarchy_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EntryAt_e48873'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (4)'),
	'EBiz_UserEntry_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_UserEntry_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EntryAt_e48873'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (4)'),
	'EBiz_User_Entry_Attribute_JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EntryAt_e48873'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e (4)'),
	'EIA_ApplicationRoleGroupName')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_EIA_ApplicationRoleGroupName'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/a_Manage Objects (3)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Objects/td_FND_APPLICATION_VL'), 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , EntryAt_e48873'), FailureHandling.OPTIONAL)

//Object Set
WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_Manage Object Set (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Object Set/input_Create_R137674426230792379_search_field (1)'),
	'EBizApp_JDBC_ObjSet')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Objectset/button_Cancel (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_concat(Row text contains , , EBizApp_af7ab9'), FailureHandling.OPTIONAL)

//Snapshot Extract
//def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
//def currentDateTime = dateFormat.format(new Date())
//def dtpEBSJob1 = 'DTPEBS_' + currentDateTime

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_DataProbe_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Snapshot/select_Object Set_P100_OBJECT_SET'), 7)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_Auto Refresh_B135207553892711001'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Job Detail/select_(Value Required)_P30_DS_ID'), 3)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job Detail/select_(Value Required)_P30_DS_ID_1'), '4170',
//	true)

WebUI.setText(findTestObject('Object Repository/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 'DTPEBS_Sept13_v2')

WebUI.setText(findTestObject('Object Repository/Page_Job Detail/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'), 'DTPEBS_Sept13_v2')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Job Detail/button_Cancel_B123623581915827245'))
WebUI.delay(8)

WebUI.setText(findTestObject('Object Repository/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field'), 'DTPEBS_Sept13_v2')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_Upload Data_mngSnap_search_button'))
WebUI.delay(900)

WebUI.setText(findTestObject('Object Repository/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field'), 'PARENT')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_Upload Data_mngSnap_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/a'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Log Report/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_DataProbe_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_concat(Row text contains , , PARENT,_dbb688'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/button_concat(Row text contains , , DTPEBS__269b5d'), FailureHandling.OPTIONAL)

//Analytics

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Snapshot/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Monitor_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Dashboard_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Violation Report_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Application Access Report_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_User Listing/select_Environment_P0_ENVIRONMENT'), 2)

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Listing/a_User Listing and access_a-TreeView-label'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Entry Access Listing/a_User Entry Access Listing_a-TreeView-label'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Entry Attribute Access Listing/a_User Entry Attribute Access Listing_a-Tre_258751'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 1)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 2)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 3)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 4)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 5)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 6)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 7)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Listing/a_Entry Listing_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'), FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/a_Entry Attributes_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/button_Access Type_P13_RESPONSIBILITY_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Page_Access Hierarchy/input_Search_a-PopupLOV-search apex-item-text'), 'General Ledger Super User')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/button_Search_a-Button a-PopupLOV-doSearch'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/li_Select List 20 rows. Use arrow keys_a-Ic_89dcca'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/button_Access Type_P13_GO'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/span_SOD Review Survey_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/a_Define Scope_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Rules/button_Export Rules_B237699209801060311'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Filter False-Positives/label_Report Settings_a-IRR-controlsCheckboxLabel'))
WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Filter False-Positives/label_Report Settings_a-IRR-controlsCheckboxLabel'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Filter False-Positives/button_Submit_B245973424258406093'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Synchronization

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (5)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Setup_a-TreeView-label'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_Environment_P100_ENVIRONMENT'),
	2)

WebUI.setText(findTestObject('Object Repository/Page_Manage Data Source/input_Create_R119140564844328612_search_field (3)'),
	'EBiz_JDBC_DS')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Create_R119140564844328612_search_button'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/input_Run script_f01 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Manage Data Source_B117273309101097005'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Data Source/h2_Breadcrumb_t-Alert-title'), 'Synchronization processing in the background.', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Data Source/span'), 'Running', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_Synchronization processing in the ba_b153f5'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/button_concat(Row text contains , , EBiz_JD_36edac (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_Environment_P100_ENVIRONMENT'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//Security


//WebUI.closeBrowser()


