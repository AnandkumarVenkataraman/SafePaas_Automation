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

WebUI.comment('launch the url in IQA : https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.comment('Enter Company as KAT')

WebUI.setText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.comment('Enter username as KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/input_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.comment('Enter Password')

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Login/button_Login'))

WebUI.comment('Click on login button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle'))

WebUI.comment('verify the Expand Navigation for administration is clickable')

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle'))

WebUI.comment('click on the Expand navigation for Administration')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/span_a-TreeView-toggle_1'))

WebUI.comment('Click on expand navigation for Global settings')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/a_Manage SafePaaS'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Home/a_Manage SafePaaS'))

WebUI.comment('click on Manage SafepaaS')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS Config/span_Settings'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS Config/span_Settings'))

WebUI.comment('click on Settings tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Directories'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Directories'))

WebUI.comment('click on Directories tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Directories/span_Passwords'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Directories/span_Passwords'))

WebUI.comment('click on Passwords tab')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS_Password/span_Others'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SafePaaS_Password/span_Others'))

WebUI.comment('click on Others tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Others/a_Manage Companies'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Others/a_Manage Companies'))

WebUI.comment('click on Manage Companies from the Navigation menu')

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

WebUI.comment('Filter with the name : KATALON_STUDIO')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/img_apex-edit-pencil'))

WebUI.comment('click on the edit icon of the Company Name')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Settings'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Settings'))

WebUI.comment('click on Settings tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Licensed Application'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Settings/span_Licensed Application'))

WebUI.comment('click on Licensed Application tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Licensed Application/span_Users'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Licensed Application/span_Users'))

WebUI.comment('click on Users tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Create Users/span_Users Access'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Create Users/span_Users Access'))

WebUI.comment('click on User Access tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Users Application Access/span_Security Profile'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Users Application Access/span_Security Profile'))

WebUI.comment('click on Security Profile tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Session Setup/span_SAML'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Session Setup/span_SAML'))

WebUI.comment('click on SAML tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SAML/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_SAML/button_Cancel'))

WebUI.comment('click on Cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Subscription'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_Subscription'))

WebUI.comment('click on Subscription tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Subscription/span_Email Configuration'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Subscription/span_Email Configuration'))

WebUI.comment('click on Email configuration tab')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Email Configuration/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Email Configuration/button_Cancel'))

WebUI.comment('click on Cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/span_a-TreeView-toggle'))

WebUI.comment('click on Global Settings navigation dropdown menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/a_Global User Listing by Company'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company/a_Global User Listing by Company'))

WebUI.comment('click on Global User Listing by Company navigation menu')

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

WebUI.comment('Filter by KAT company')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/a_Manage Applications'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_User Listing/a_Manage Applications'))

WebUI.comment('click on Manage Application from navigation menu')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Add Edit Applications/a_Manage Programs'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Add Edit Applications/a_Manage Programs'))

WebUI.comment('click on Manage programs from navigation menu')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Programs/a_Manage ERP Scripts'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Programs/a_Manage ERP Scripts'))

WebUI.comment('click on Manage ERP Scripts from navigation menu')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage ERP Scripts/a_Manage Application Types'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage ERP Scripts/a_Manage Application Types'))

WebUI.comment('click on Manage Application types from navigation menu')

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

WebUI.comment('fliter by App type code as CLOUDERP')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Save'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/button_Save'))

WebUI.comment('click on Save button')

WebUI.verifyElementClickable(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 881'))

WebUI.click(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 881'))

WebUI.comment('click on the edit icon of the Application type')

WebUI.verifyElementClickable(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 882'))

WebUI.click(findTestObject('deba1/Administration_GlobalSettings/Page_Manage Application Types/img_apex-edit-pencil - 882'))

WebUI.comment('click on the edit icon of the application type version')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Entry and Attribute Types/a_Manage Application Type Version'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Entry and Attribute Types/a_Manage Application Type Version'))

WebUI.comment('click on Manage Application type version from the path to go back ')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Type Version/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Type Version/button_Cancel'))

WebUI.comment('click on cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/a_Manage Rule Lookup'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Application Types/a_Manage Rule Lookup'))

WebUI.comment('click on Manage Rule Lookup')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Rule Lookup/a_Manage Email Communication'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Rule Lookup/a_Manage Email Communication'))

WebUI.comment('click on Manage Email communication')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Email Communication/a_Manage Object Items Field'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Manage Email Communication/a_Manage Object Items Field'))

WebUI.comment('Click on Manage Object Items')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on the edit icon of the 1st table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('click on cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on edit icon of 2nd table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('click on Cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on edit icon of 3rd table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('click on cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/td_a-IRR-linkCol u-tC'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on edit icon of 4th table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('click on cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on edit icon of 5th table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('click on Cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on edit icon of 6th table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('Click on Cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on edit icon of 7th table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('click on Cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/img_apex-edit-pencil'))

WebUI.comment('click on edit icon of 8th table')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Edit Table entry type/button_Cancel'))

WebUI.comment('click on Cancel button')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/span_a-TreeView-toggle'))

WebUI.comment('Click on Usage from Navigation Menu')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/a_Company Level Stats'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Table entry type/a_Company Level Stats'))

WebUI.comment('click on Company Level stats')

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company Level Stats/a_Logs for Services  Support'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Company Level Stats/a_Logs for Services  Support'))

WebUI.comment('click on Logs for Services and Support')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/select_- Select a company -A.M.Castle  Co.(_5909ee'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/select_- Select a company -A.M.Castle  Co.(_5909ee'), 
    '71843', true)

WebUI.comment('Select the company : Fulcrum Test Company ')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/span_oj-inputdatetime-calendar-icon oj-clic_833c36'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/span_oj-inputdatetime-calendar-icon oj-clic_833c36'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/a_1'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/a_1'))

WebUI.comment('Select the start date')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/Administration_GlobalSettings/Page_Logging Information for Services  Support/button_Filter'))

WebUI.comment('click on filter button')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Capture all the details')

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

