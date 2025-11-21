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
import com.kms.katalon.core.testobject.ConditionType

//Rule with * values
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (63)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Access Monitor_a-TreeView-toggle (45)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle (33)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Define Scope_a-TreeView-label (13)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (12)'),
	'SAP_S4HANA', false)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/input_Import Rules_R247793226539899118_sear_84acb9 (7)'),
	'Z_AccessChecks_OR_Rule#4')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_Import Rules_R247793226539899118_sea_c93c8e (5)'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Z_AccessChecks_OR_Rule4_u-tL'),
	'LOW')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_LOW_u-tL'), 'Procure to Pay')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Procure to Pay_u-tL'),
	'Incompatible Sets')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_Incompatible Sets_u-tL (2)'),
	'SOD Detective')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SOD Detective_u-tL (2)'),
	'Approved')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_-_u-tL (2)'), 'SAPActivitySet1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/td_SAPActivitySet1_u-tL'),
	'SAPActivitySet4')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a (7)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/span (4)'))

//Chk. if there is any Reset Pagination
//And if it is there, click on it
String rP = "Reset Pagination"
TestObject dynamicObjrP = new TestObject("dynamicReset Pagination")
dynamicObjrP.addProperty("xpath", ConditionType.EQUALS,
   "//a[contains(normalize-space(.),'Reset Pagination')]"
)
if (WebUI.verifyElementVisible(dynamicObjrP, FailureHandling.OPTIONAL)) {
   WebUI.click(dynamicObjrP)
   println("Clicked on the '" + rP + "' button.")
} else {
   println("Button '" + rP + "' is NOT visible. Skipping click.")
}
//End checking for Reset Pagination

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Last Updated By_t-Report-cell (2)'),
	'ACTVT.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT_t-Report-cell'),
	'ACTVT.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT_t-Report-cell_1'),
	'ACTVT.*')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT_t-Report-cell_2'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell (3)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell (3)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_1 (3)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell (1)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell (2)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_1 (2)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_1 (3)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_2 (3)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_3 (3)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_1 (1)'),
	'V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Generate Condition UsageApplication Auth_84bd71 (2)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell (3)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_4 (2)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_5 (2)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_2 (1)'),
	'V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Generate Condition UsageApplication Auth_84bd71_1'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_1 (3)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_6 (2)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_7 (2)'),
	'Set1 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_3 (1)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.01_t-Report-cell_2 (2)'),
	'ACTVT.01')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_2 (3)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_8 (2)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_9 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_4 (1)'),
	'ACTVT.02')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.02_t-Report-cell (2)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_3 (3)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_10 (2)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_11 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_5 (1)'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell (2)'),
	'ACTVT.03')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.03_t-Report-cell_1 (2)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_4 (2)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_12 (2)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_13 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_6 (1)'),
	'ACTVT.04')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_ACTVT.04_t-Report-cell (2)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_5 (2)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_14 (2)'),
	'4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_15 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_7 (1)'),
	'CEAPPL.KP')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CEAPPL.KP_t-Report-cell (2)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_6 (2)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_16 (2)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_17 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_8 (1)'),
	'KAPPL.KE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KAPPL.KE_t-Report-cell (2)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_7 (2)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_18 (2)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_19 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_9 (1)'),
	'K_KA_RCS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_CO Drill-down reporting - line-column st_b39ca5 (2)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_2 (2)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_20 (2)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_21 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_10 (1)'),
	'SPART.$SPART')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_SPART.SPART_t-Report-cell (2)'),
	'Auth Field_Value')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Auth Field_Value_t-Report-cell_8 (2)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_22 (2)'),
	'1')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_23 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_11 (1)'),
	'V_KONG_VWE')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Generate Condition UsageApplication Auth_84bd71_2'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_3 (2)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_24 (2)'),
	'2')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_25 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_12 (1)'),
	'V_KONH_VKO')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Condition Authorization for Sales Organi_bb3947 (2)'),
	'Authorization Object')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_4 (1)'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_26 (2)'),
	'3')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_27 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_KATADMIN_t-Report-cell_13 (1)'),
	'V_KONH_VKS')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Authorization Object_t-Report-cell_5'),
	'AND')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_28 (2)'),
	'4')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_AND_t-Report-cell_29 (2)'),
	'Set2 Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/td_Condition Authorization for Condition Ty_77ec7a (2)'),
	'Authorization Object')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Rule Report/a_Define Scope_t-Breadcrumb-label (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/button_concat(Row text contains , , Z_Acces_8f9306'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/select_Environment_P0_ENVIRONMENT (12)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (12)'))

//Logout
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Inbox_L14205299837764170 (29)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_My Profile_menu_L14205299837764170_1i (30)'))

WebUI.closeBrowser()