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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY (2)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (2)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (2)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataPaaS_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Administration_a-TreeView-toggle (6)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Company (6)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/div_DataProbe'), 0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Company/a_Manage Environment (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/input_Create_R258165063082313757_search_field (1)'), 
    'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/td_A (1)'), 'A')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/button_concat(Row text contains , , EBizApp_4f016a (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Environment/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_SFTP File Explorer_a-TreeView-toggle (1)'))

//DataSource
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Data Source'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/select_- Select an Environment -Coupa_Env1E_2c3357'), 
    2)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/input_Create_R119140564844328612_search_field'), 
    'EBiz_JDBC_DS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/a_Completed'), 'Completed')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/td_Yes'), 'Yes')

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/a_EBiz_JDBC_DS'))
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/button_Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/td_Oracle'), 'Oracle')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/td_10.7.25.198'), 
    '10.7.25.198')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/td_APPS'), 'APPS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/td_EBSDB'), 'EBSDB')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Data Source/button_concat(Row text contains , , EBiz_JD_36edac'), FailureHandling.OPTIONAL)

//Manage Objects
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Object'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- Select an Environment -Coupa_Env1E_bcbb9d'),
	2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- All -MonitorPaaSEnterprise Access _717d25'),
	3)
WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_Object Sets'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBizApp_JDBC_ObjSet'))

//Attribute object
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_Attribute_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ATTRIBUTE_EBSAPPL_V'),
	0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ORIG_ID'), 'ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Orig ID'), 'Orig ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ORIG_ID'), 'ORIG_ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ATTRIBUTE_EBSAPPL_V'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Name (1)'), 'Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ATTRIBUTE_EBSAPPL_V'),
	'APPS.XXSP_ATTRIBUTE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Display Name'),
	'Display Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ATTRIBUTE_EBSAPPL_V'),
	'APPS.XXSP_ATTRIBUTE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Description (1)'),
	'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ATTRIBUTE_EBSAPPL_V'),
	'APPS.XXSP_ATTRIBUTE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ATTRIBUTE_EBSAPPL_V'),
	'APPS.XXSP_ATTRIBUTE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ATTRIBUTE_TYPE_ID'),
	'ATTRIBUTE_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Attribute Type ID'),
	'Attribute Type ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ATTRIBUTE_TYPE_ID'),
	'ATTRIBUTE_TYPE_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//EntryAttribute
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_EntryAttribute_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRYATTRIBUTE_EBSAPPL_V'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ID'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry ID'), 'Entry ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ENTRY_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ID'), 'ENTRY_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRYATTRIBUTE_EBSAPPL_V'),
	'APPS.XXSP_ENTRYATTRIBUTE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ATTRIBUTE_ID'),
	'ATTRIBUTE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Attribute ID'),
	'Attribute ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ATTRIBUTE_ALL'),
	'FSOD.FSOD_ENTRY_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ATTRIBUTE_ID'),
	'ATTRIBUTE_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//EntryHierarchy
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_EntryHierarchy_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRYHIERARCHY_EBSAPPL_V'),
	'APPS.XXSP_ENTRYHIERARCHY_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_PARENT_ID'), 'PARENT_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Parent ID'), 'Parent ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_HIERARCHY_ALL'),
	'FSOD.FSOD_ENTRY_HIERARCHY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_PARENT_ENTRY_ID'),
	'PARENT_ENTRY_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRYHIERARCHY_EBSAPPL_V'),
	'APPS.XXSP_ENTRYHIERARCHY_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_CHILD_ID'), 'CHILD_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Child ID'), 'Child ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_HIERARCHY_ALL'),
	'FSOD.FSOD_ENTRY_HIERARCHY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_CHILD_ENTRY_ID'),
	'CHILD_ENTRY_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//Concurrent Program
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_Entry_Concurrent_Program_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/div_1 rows selectedPage rows Total 6'),
	'1 rows selectedPage rows Total 6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ORIG_ID'),
	'ENTRY_ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Conc Program ID'),
	'Conc Program ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_SOURCE_KEY'),
	0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Conc Program Name'),
	'Conc Program Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry Type ID'),
	'Entry Type ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_CONPROGM_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Display Name'),
	'Display Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//Function
WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_Entry_Form_Functions_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V_1'),
	'APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ORIG_ID'),
	'ENTRY_ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Function ID'), 'Function ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_SOURCE_KEY'), 'SOURCE_KEY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V_1'),
	'APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Function Name'),
	'Function Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V_1'),
	'APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_User Function Name'),
	'User Function Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V_1'),
	'APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V_1'),
	'APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry Type ID'),
	'Entry Type ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V_1'),
	'APPS.XXSP_ENTRY_FUNCTION_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//Grants
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_Entry_Grant_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_GRANT_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_GRANT_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ORIG_ID'),
	'ENTRY_ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Source Key'), 'Source Key')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_SOURCE_KEY'), 'SOURCE_KEY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_GRANT_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_GRANT_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Grant Name'), 'Grant Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_GRANT_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_GRANT_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Grant Display Name'),
	'Grant Display Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_GRANT_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_GRANT_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_GRANT_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_GRANT_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'Active')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_GRANT_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_GRANT_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry Type ID'),
	'Entry Type ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//Roles
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_ROLE_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_ROLE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_LOCAL_ROLES_KEY'),
	'LOCAL_ROLES_KEY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Local Roles Key'),
	'Local Roles Key')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_SOURCE_KEY'), 'SOURCE_KEY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_ROLE_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_ROLE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_LOCAL_ROLES_NAME'),
	'LOCAL_ROLES_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Local Roles Name'),
	'Local Roles Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_ROLE_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_ROLE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_LOCAL_ROLES_DISPLAY_NAME'),
	'LOCAL_ROLES_DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Local Roles Display Name'),
	'Local Roles Display Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_ROLE_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_ROLE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_LOCAL_ROLES_DESCRIPTION'),
	'LOCAL_ROLES_DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Local Roles Description'),
	'Local Roles Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_ROLE_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_ROLE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry Type ID'),
	'Entry Type ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_ROLE_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_ROLE_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'Active')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//Menu

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_Entry_Menu_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_MENU_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_MENU_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ORIG_ID'),
	'ENTRY_ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Menu ID'), 'Menu ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_SOURCE_KEY'), 'SOURCE_KEY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_MENU_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_MENU_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Menu Name'), 'Menu Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_MENU_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_MENU_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_User Menu Name'),
	'User Menu Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_MENU_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_MENU_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_MENU_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_MENU_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry Type ID'),
	'Entry Type ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_MENU_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_MENU_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//Request Group

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_Entry_Request_Group_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ORIG_ID'),
	'ENTRY_ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Request Group ID'),
	'Request Group ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_SOURCE_KEY'), 'SOURCE_KEY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Display Name'),
	'Display Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Status'), 'Status')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_REQSTGRUP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry Type ID'),
	'Entry Type ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//Responsibility

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_Entry_Responsibility_JDBC'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_RESP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_RESP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ORIG_ID'),
	'ENTRY_ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Responsbility Key'),
	'Responsbility Key')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_SOURCE_KEY'), 'SOURCE_KEY')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_RESP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_RESP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Responsilibty Name'),
	'Responsilibty Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_NAME'), 'NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_RESP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_RESP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Responsibility Display Name'),
	'Responsibility Display Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_RESP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_RESP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DESCRIPTION'), 'DESCRIPTION')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_RESP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_RESP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'Active')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ACTIVE'), 'ACTIVE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_ENTRY_RESP_EBSAPPL_V'),
	'APPS.XXSP_ENTRY_RESP_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry Type ID'),
	'Entry Type Id')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_ENTRY_ALL'),
	'FSOD.FSOD_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_TYPE_ID'),
	'ENTRY_TYPE_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

//User, UserEntry, and UserEntryAttribute

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_UserEntry_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USERENTRY_EBSAPPL_V'),
	'APPS.XXSP_USERENTRY_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_USER_ID'), 'USER_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_User ID'), 'User ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ENTRY_ALL'),
	'FSOD.FSOD_USER_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_USER_ID'), 'USER_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USERENTRY_EBSAPPL_V'),
	'APPS.XXSP_USERENTRY_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ID'), 'ENTRY_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry ID'), 'Entry ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ENTRY_ALL'),
	'FSOD.FSOD_USER_ENTRY_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ID'), 'ENTRY_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_User_Entry_Attribute_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USERENTRYATTR_EBSAPPL_V1'),
	'APPS.XXSP_USERENTRYATTR_EBSAPPL_V1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_USER_ID'), 'USER_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_User ID'), 'User ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL'),
	'FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_USER_ID'), 'USER_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USERENTRYATTR_EBSAPPL_V1'),
	'APPS.XXSP_USERENTRYATTR_EBSAPPL_V1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ID'), 'ENTRY_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Entry ID'), 'Entry ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL'),
	'FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ENTRY_ID'), 'ENTRY_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USERENTRYATTR_EBSAPPL_V1'),
	'APPS.XXSP_USERENTRYATTR_EBSAPPL_V1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ATTRIBUTE_ID'),
	'ATTRIBUTE_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Attribute ID'),
	'Attribute ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL'),
	'FSOD.FSOD_USER_ENTRY_ATTRIBUTE_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ATTRIBUTE_ID'),
	'ATTRIBUTE_ID')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_EBiz_User_JDBC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Security'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/label_JDBC'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USER_EBSAPPL_V'),
	'APPS.XXSP_USER_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_USER_ORIG_ID'),
	'USER_ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Orig ID'), 'Orig ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ALL'),
	'FSOD.FSOD_USER_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_ORIG_ID'), 'ORIG_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_2'), '2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USER_EBSAPPL_V'),
	'APPS.XXSP_USER_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_USER_NAME'), 'USER_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_User Name'), 'User Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ALL'),
	'FSOD.FSOD_USER_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_USER_NAME'), 'USER_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_3'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USER_EBSAPPL_V'),
	'APPS.XXSP_USER_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FIRST_NAME'), 'FIRST_NAME')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/div_GoActionsEditSaveAdd RowSaveReset'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ALL'),
	'FSOD.FSOD_USER_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FIRST_NAME'), 'FIRST_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USER_EBSAPPL_V'),
	'APPS.XXSP_USER_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_LAST_NAME'), 'LAST_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ALL'),
	'FSOD.FSOD_USER_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_LAST_NAME'), 'LAST_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_5'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USER_EBSAPPL_V'),
	'APPS.XXSP_USER_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Display Name'),
	'Display Name')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ALL'),
	'FSOD.FSOD_USER_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_DISPLAY_NAME'),
	'DISPLAY_NAME')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_6'), '6')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_APPS.XXSP_USER_EBSAPPL_V'),
	'APPS.XXSP_USER_EBSAPPL_V')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_EMAIL_ADDRESS'),
	'EMAIL_ADDRESS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_Email Address'),
	'Email Address')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_FSOD.FSOD_USER_ALL'),
	'FSOD.FSOD_USER_ALL')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/td_EMAIL_ADDRESS'),
	'EMAIL_ADDRESS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_concat(Object Sets  , , EBizApp_JDBC_2689b2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- All -MonitorPaaSEnterprise Access _717d25'),
	'-1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- Select an Environment -Coupa_Env1E_bcbb9d'),
	'-1', true)

//WebUI.closeBrowser()

//Object set
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_SFTP File Explorer_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Object Set'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/input_Create_R137674426230792379_search_field'),
	'EBizApp_JDBC_ObjSet')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/button_Go'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/span_EBS R12.2'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_10'), '10')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Users'), 'Users')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_User_JDBC'),
	'EBiz_User_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Role'), 'Role')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_LocalRoles_JDBC'),
	'EBiz_Entry_LocalRoles_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Menu'), 'Menu')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Menu_JDBC'),
	'EBiz_Entry_Menu_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Grant'), 'Grant')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Grant_JDBC'),
	'EBiz_Entry_Grant_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Function'), 'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Form_Functions_JDBC'),
	'EBiz_Entry_Form_Functions_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Concurrent Program'),
	'Concurrent Program')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Concurrent_Program_JDBC'),
	'EBiz_Entry_Concurrent_Program_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Responsibility'),
	'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Responsibility_JDBC'),
	'EBiz_Entry_Responsibility_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Request Group'),
	'Request Group')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Request_Group_JDBC'),
	'EBiz_Entry_Request_Group_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_30'), '30')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Attribute'), 'Attribute')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Attribute_JDBC'),
	'EBiz_Attribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_40'), '40')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_User to Entry'),
	'User to Entry')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_UserEntry_JDBC'),
	'EBiz_UserEntry_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_50'), '50')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Entry Hierarchy'),
	'Entry Hierarchy')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_EntryHierarchy_JDBC'),
	'EBiz_EntryHierarchy_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_60'), '60')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Entry Attribute'),
	'Entry Attribute')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_EntryAttribute_JDBC'),
	'EBiz_EntryAttribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_70'), '70')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_User Entry Attribute'),
	'User Entry Attribute')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_User_Entry_Attribute_JDBC'),
	'EBiz_User_Entry_Attribute_JDBC')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/button_concat(Row text contains , , EBizApp_af7ab9'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/a_Inbox'))

//Object set
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_SFTP File Explorer_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Object Set'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/input_Create_R137674426230792379_search_field'),
	'EBizApp_JDBC_ObjSet')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/button_Go'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/span_EBS R12.2'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/div_Enterprise Access Monitor'),
	0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_10'), '10')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Users'), 'Users')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_User_JDBC'),
	'EBiz_User_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Role'), 'Role')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_LocalRoles_JDBC'),
	'EBiz_Entry_LocalRoles_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Menu'), 'Menu')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Menu_JDBC'),
	'EBiz_Entry_Menu_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Grant'), 'Grant')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Grant_JDBC'),
	'EBiz_Entry_Grant_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Function'), 'Function')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Form_Functions_JDBC'),
	'EBiz_Entry_Form_Functions_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Concurrent Program'),
	'Concurrent Program')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Concurrent_Program_JDBC'),
	'EBiz_Entry_Concurrent_Program_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Responsibility'),
	'Responsibility')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Responsibility_JDBC'),
	'EBiz_Entry_Responsibility_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_20'), '20')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Request Group'),
	'Request Group')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Entry_Request_Group_JDBC'),
	'EBiz_Entry_Request_Group_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_30'), '30')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Attribute'), 'Attribute')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_Attribute_JDBC'),
	'EBiz_Attribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_40'), '40')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_User to Entry'),
	'User to Entry')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_UserEntry_JDBC'),
	'EBiz_UserEntry_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_50'), '50')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Entry Hierarchy'),
	'Entry Hierarchy')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_EntryHierarchy_JDBC'),
	'EBiz_EntryHierarchy_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_60'), '60')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_Entry Attribute'),
	'Entry Attribute')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_EntryAttribute_JDBC'),
	'EBiz_EntryAttribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_70'), '70')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_User Entry Attribute'),
	'User Entry Attribute')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/td_EBiz_User_Entry_Attribute_JDBC'),
	'EBiz_User_Entry_Attribute_JDBC')

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Objectset/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/button_concat(Row text contains , , EBizApp_af7ab9'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Object Set/a_Inbox'))

//Snapshot Extract
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Snapshot'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/select_Select any oneAccountsPayableCERP_Ob_d1baf4'),
	7)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Extract Data'))

//WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_-- Select any one ---- Local File --_84239e'),
//    3)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/div_Security'), 0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/select_KTLNEBS_MonitorPaaS_Vision122_DSSFTP_41615f'),
	3)

WebUI.rightClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Attribute_JDBC'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Attribute_JDBC'),
	'EBiz_Attribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_EntryAttribute_JDBC'),
	'EBiz_EntryAttribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_EntryHierarchy_JDBC'),
	'EBiz_EntryHierarchy_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Concurrent_Program_JDBC'),
	'EBiz_Entry_Concurrent_Program_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Form_Functions_JDBC'),
	'EBiz_Entry_Form_Functions_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Grant_JDBC'),
	'EBiz_Entry_Grant_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_LocalRoles_JDBC'),
	'EBiz_Entry_LocalRoles_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Menu_JDBC'),
	'EBiz_Entry_Menu_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Request_Group_JDBC'),
	'EBiz_Entry_Request_Group_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_Entry_Responsibility_JDBC'),
	'EBiz_Entry_Responsibility_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_UserEntry_JDBC'),
	'EBiz_UserEntry_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_User_Entry_Attribute_JDBC'),
	'EBiz_User_Entry_Attribute_JDBC')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/td_EBiz_User_JDBC'), 'EBiz_User_JDBC')

//Enter the Snapshot Extract's job name in the format -> KTLN_DDMMYYYY_HHSS
//def formatter = new SimpleDateFormat("ddMMyyyy_HHmm")
//def timestamp = formatter.format(new Date())
//println("Dynamic timestamp: " + timestamp)
//def fileName = "KTLN_" + timestamp
//WebUI.comment(fileName)

//def dateFormat = new SimpleDateFormat('ddMMyyyyHHmmss')
//def currentDateTime = dateFormat..format(new Date())
//def fileName = 'DTP_' + currentDateTime

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/input_(Value Required)_P30_SCHEDULER_JOB_NAME'),
	EBS_08302025_V1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Job Detail/button_Create'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Snapshot successfully submitted_t-Bu_ba886c'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/input_Upload Data_mngSnap_search_field'),
	fileName)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Snapshot/button_Go'))
//Wait for a max. of 1.5 hrs, and verify the Snapshot extract is completed

//Verify the logs
