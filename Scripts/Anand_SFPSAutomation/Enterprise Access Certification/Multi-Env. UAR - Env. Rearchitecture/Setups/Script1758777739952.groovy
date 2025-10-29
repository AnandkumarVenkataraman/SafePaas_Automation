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
//import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.model.FailureHandling as FailureHandling

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login/input_Summer 2025_P101_COMPANY (1)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (21)'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (21)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Reset Password_loginBtn'))

//SFP-1008
//Pls. note -> Automation doesn't have access to Global Settings
//Hence, the App Type Categories were verified from Manage Environment under Company Settings

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (8)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_App Type Version_a-IRR-headerLink'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    'ITSM')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(App Type Category contains , _fcdddd'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_App Type Version_a-IRR-headerLink'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    'Identity Source')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_-_u-tC'), 'Test_IDM')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_OS_IDM_u-tL'), 
    'Identity Source')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(App Type Category contains , _fcdddd'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_App Type Version_a-IRR-headerLink'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    'Operations')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_-_u-tC_1'), 'EBizApp_JDBC_Env', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_-_u-tC_2'), 'Test_Environment', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_Oracle Cloud ERP 20x_u-tL'), 
    'Operations', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_EBS R12.2_u-tL'), 
    'Operations', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(App Type Category contains , _fcdddd'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_App Type Version_a-IRR-headerLink'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_App Type Version_a-IRR-headerLink'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    'People')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_Link_u-tC'), 'SUCCESSFACTORS_ENV', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_SUCCESS FACTOR_u-tL'), 
    'People', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(App Type Category contains , _fcdddd'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_App Type Version_a-IRR-headerLink'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    'Access Management')

WebUI.sendKeys(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Search_R258165063082313757_sort_widge_49344e'), 
    Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(App Type Category contains , _fcdddd'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//SFP-1009
//Verify Cross Application SOD is not available under Manage Company
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Company Settings_a-TreeView-label'))

WebUI.verifyTextNotPresent("Cross Application SOD", false, FailureHandling.STOP_ON_FAILURE)
WebUI.comment('Cross Application SOD not found, as expected')
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//SFP-1025 - Enterprise IT Map - Operations to ITSM mapping

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (10)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Environment_a-TreeView-label'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/input_Mappings Report_R275422977080048150_s_4fdaf0'),
	'Test_Environment')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mappings Report_R275422977080048150__6d4728'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/input_Mappings Report_R275422977080048150_s_4fdaf0'),
	'ITSM')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mappings Report_R275422977080048150__6d4728'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/img_Join Condition_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_Link_u-tL'),
	'Enterprise Access Monitor')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_Enterprise Access Monitor_u-tL'),
	'EAM_GET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_EAM_GET_u-tL'),
	'EAM_POST')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_EAM_POST_u-tL'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_EAM_POST_u-tL_1'),
	'Enterprise Access Certification')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_Enterprise Access Certification_u-tL'),
	'EACM_GET')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_EACM_GET_u-tL'),
	'EACM_POST')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/td_EACM_POST_u-tL'),
	'1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/img_Link_apex-edit-pencil'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/img_EAM_POST_apex-edit-pencil'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/button_Breadcrumbs_B289855795379879713'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Join Condition_u-tL'),
	'Test_Environment')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Test_Environment_u-tL'),
	'Operations')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Operations_u-tL'),
	'SailPoint_Env')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_SailPoint_Env_u-tL'),
	'ITSM')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_concat(Row text contains , , ITSM, ,_599747'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_concat(Row text contains , , ITSM, ,_599747'), FailureHandling.OPTIONAL)

//SFP-1036 - Enterprise IT Map - Operations to Identity Source mapping

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/input_Mappings Report_R275422977080048150_s_4fdaf0 (1)'),
	'Test_Environment')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mappings Report_R275422977080048150__6d4728 (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/input_Mappings Report_R275422977080048150_s_4fdaf0 (1)'),
	'Identity Source')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_Mappings Report_R275422977080048150__6d4728 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/img_Join Condition_apex-edit-page (1)'))

//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/select_User_f02'),
//	'USER_NAMEFIRST_NAMELAST_NAMEDISPLAY_NAMEEMAIL_ADDRESSTYPEORIG_ID')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/select__f03'),
//	'IDENTITY_IDFIRST_NAMELAST_NAMEEMPLOYEE_IDEMAIL_IDMANAGER_IDMGR_FIRST_NAMEMGR_LAST_NAMEMANAGER_EMAILMANAGER_FLAGDEPARTMENTBUSINESS_UNITACCESS_GROUP_NAME')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/option'), 'MANAGER_ID')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/option_1'), 'MGR_FIRST_NAME')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/option_2'), 'MGR_LAST_NAME')

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Create  Edit Mapping/button_Breadcrumbs_B289855795379879713 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Join Condition_u-tL (1)'),
	'Test_Environment', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Test_Environment_u-tL (1)'),
	'Operations', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Operations_u-tL (1)'),
	'Test_IDM', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Test_IDM_u-tL'),
	'Identity Source', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Identity Source_u-tL'),
	'Users', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/td_Users_u-tL'), 'FSOD.FSOD_USER_ALL.USER_NAME = FSOD.FSOD_NETWORK_USERS.IDENTITY_ID', FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_concat(Row text contains , , Test_En_29b6c0'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/button_concat(Row text contains , , Identit_3d68c8'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Enterprise IT Map/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

//SFP-1036 - Enterprise IT Map - Operations to Access Management mapping
//This will be automated, once an Access Mgmt. Env. is available

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i'))

WebUI.closeBrowser()
