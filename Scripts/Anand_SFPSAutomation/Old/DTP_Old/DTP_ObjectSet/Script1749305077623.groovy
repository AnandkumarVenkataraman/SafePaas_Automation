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

WebUI.closeBrowser()

