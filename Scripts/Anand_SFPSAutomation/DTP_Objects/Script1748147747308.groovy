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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY'), 'KAT')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_SFTP File Explorer_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Object'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- Select an Environment -Coupa_Env1E_bcbb9d'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/select_- All -MonitorPaaSEnterprise Access _717d25'), 
    'EAM', true)
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



