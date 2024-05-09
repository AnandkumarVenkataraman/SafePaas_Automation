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

WebUI.setText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/a_Manage SafePaaS'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/a_Manage SafePaaS'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS Config/span_Settings'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS Config/span_Settings'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Directories'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Directories'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Directories/span_Passwords'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Directories/span_Passwords'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS_Password/span_Others'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS_Password/span_Others'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Others/a_Manage Companies'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Others/a_Manage Companies'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Filter'))

WebUI.verifyElementClickable(findTestObject('deba1/Administration_GlobalSettings/Page_Company/select_NameAddress1Address2Address3CityStat_4c47bd - Copy'))

WebUI.selectOptionByLabel(findTestObject('deba1/Administration_GlobalSettings/Page_Company/select_NameAddress1Address2Address3CityStat_4c47bd - Copy'), 
    'Name', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('deba1/Administration_GlobalSettings/Page_Company/input_p_ignore_10 - Copy'), '')

WebUI.setText(findTestObject('deba1/Administration_GlobalSettings/Page_Company/input_p_ignore_10 - Copy'), 'KATALON_STUDIO')

WebUI.verifyElementClickable(findTestObject('deba1/Administration_GlobalSettings/Page_Company/button_Apply - U10'))

WebUI.click(findTestObject('deba1/Administration_GlobalSettings/Page_Company/button_Apply - U10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/img_apex-edit-pencil'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Settings'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Settings'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Licensed Application'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Licensed Application'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Licensed Application/span_Users'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Licensed Application/span_Users'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Create Users/span_Users Access'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Create Users/span_Users Access'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Users Application Access/span_Security Profile'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Users Application Access/span_Security Profile'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Session Setup/span_SAML'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Session Setup/span_SAML'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SAML/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SAML/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Subscription'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Subscription'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Subscription/span_Email Configuration'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Subscription/span_Email Configuration'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Email Configuration/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Email Configuration/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/a_Global User Listing by Company'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/a_Global User Listing by Company'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/select_Company CodeCompany NameApplication _49b7ca'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/input_p_ignore_10'), 
    'KAT')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/button_Apply'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/a_Manage Applications'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/a_Manage Applications'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Add Edit Applications/a_Manage Programs'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Add Edit Applications/a_Manage Programs'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Programs/a_Manage ERP Scripts'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Programs/a_Manage ERP Scripts'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage ERP Scripts/a_Manage Application Types'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage ERP Scripts/a_Manage Application Types'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/select_VersionsApp Type CodeApp Type NameAp_e82f11'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/select_VersionsApp Type CodeApp Type NameAp_e82f11'), 
    'App Type Code', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/inputR152890075626908917_ig_FD_VALUE'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/inputR152890075626908917_ig_FD_VALUE'), 
    'CLOUDERP')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Save'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Save'))

WebUI.verifyElementClickable(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 881'))

WebUI.click(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 881'))

WebUI.verifyElementClickable(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 882'))

WebUI.click(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 882'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Entry and Attribute Types/a_Manage Application Type Version'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Entry and Attribute Types/a_Manage Application Type Version'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Type Version/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Type Version/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/a_Manage Rule Lookup'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/a_Manage Rule Lookup'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Rule Lookup/a_Manage Email Communication'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Rule Lookup/a_Manage Email Communication'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Email Communication/a_Manage Object Items Field'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Email Communication/a_Manage Object Items Field'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/td_a-IRR-linkCol u-tC'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/a_Company Level Stats'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/a_Company Level Stats'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company Level Stats/a_Logs for Services  Support'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company Level Stats/a_Logs for Services  Support'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/select_- Select a company -A.M.Castle  Co.(_5909ee'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/select_- Select a company -A.M.Castle  Co.(_5909ee'), 
    '71843', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/span_oj-inputdatetime-calendar-icon oj-clic_833c36'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/span_oj-inputdatetime-calendar-icon oj-clic_833c36'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/a_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/a_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/button_Filter'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

