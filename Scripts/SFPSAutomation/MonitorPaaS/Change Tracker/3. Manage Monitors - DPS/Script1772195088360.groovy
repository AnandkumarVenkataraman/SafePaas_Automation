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

WebUI.navigateToUrl(GlobalVariable.URL) //IQA or Prod. Profile should be selected during execution

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (10)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (10)'),
	'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (10)'),
	'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (9)'))

//First, verify the Monitor is Use Triggers, in DataPaaS > Setup > Manage Objects
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_DataProbe_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Manage Snapshot_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Object (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_Environment_P0_ENVIRONMENT_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/input_Close_a-PopupLOV-search apex-item-text (1)'),
	'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/span_EBizApp_JDBC_Env (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/input_Objects Report_R341149055177983350_se_81fe9c (1)'),
	'DPS_PR_PO_SameUser V2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_DPS_PR_PO_SameUser V2'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_MonitorPaaS (1)'),
	'MonitorPaaS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/div_Use Triggers (1)'),
	'Use Triggers')
WebUI.takeScreenshot()
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/span_Object Items (3)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Object Items/li_PR  PO Created By Same User V3 (1)'),
	'PR & PO Created By Same User V3')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Object Items/button_Continue (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Apply Transformation Rule/button_Continue (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Column Selection/button_Save and Continue (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_View Sample/button_Cancel (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_AddEdit Object Details/a_Manage Object (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_Remove Filter (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_Environment_P0_ENVIRONMENT_lov_btn (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/input_Close_a-PopupLOV-search apex-item-text_1 (1)'),
	'- Select an Environment -')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/button_- Select an Environment - (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Objects/a_Inbox (3)'))

//Deploy from Manage Monitors for ->
//Object Type = JDBC
//Incident Workflow = Consolidated Level
//Type = Occurrences
//CT Type = Use Triggers

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_AccessPaaS_a-TreeView-toggle (11)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Monitors (4)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/select_- Select -559_ObjectSet_V2559_ObjectSet (2)'),
	'559_ObjectSet_V2', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_Deploy (1)'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/input_Cancel_R433726316682115957_search_field (2)'),
	'DPS_PR_PO_SameUser V2')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/button_Go (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/input_DPS_PR_PO_SameUser V_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/button_Remove Filter (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/button_Deploy Objects (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Move Process/button_OK (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/h2_Monitor Created Successfully (2)'),
	'Monitor Created Successfully')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/button_Monitor Created Successfully_t-Butto_4161d3 (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_DPS_PR_PO_SameUser V2'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/label_Consolidated Level (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/select_Procure to Pay (1)'),
	'Procure to Pay', false)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/button_Apply Changes (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/button_Action Processed_t-Button t-Button--_8cc6df (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Monitor Details/span_People (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any One1164301711814158119098_7d90a7 (1)'),
	'KATADMIN', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any OneApproverReviewer (2)'),
	'Approver', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/input_Start Date_P35_START_DATE (1)'),
	'01-Mar-2026')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/button_Add Another (2)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any One1164301711814158119098_7d90a7 (1)'),
	'KATALON_ADMIN', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/select_Select any OneApproverReviewer (2)'),
	'Reviewer', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/input_Start Date_P35_START_DATE (1)'),
	'01-Mar-2026')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/button_Add Another (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Approver/a_Manage Monitors (2)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/select_- Select -559_ObjectSet_V2559_ObjectSet (2)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Monitors/a_Inbox (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_katadmin (32)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Logout (40)'))

WebUI.closeBrowser()