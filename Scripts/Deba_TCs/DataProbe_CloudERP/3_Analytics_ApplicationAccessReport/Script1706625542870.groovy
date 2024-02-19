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

WebUI.setText(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Login/input_P101_COMPANY (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Login/input_P101_USERNAME (1)'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Login/input_P101_PASSWORD (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Login/button_Login (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle_1 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle_1_2 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/span_a-TreeView-toggle_1_2_3 (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/a_User Listing and access (1)'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Home/a_User Listing and access (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/span_1 -                   15 of more than _0e8ce3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/span_1 -                   15 of more than _0e8ce3'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/a_Entry Listing'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/a_Entry Listing'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'), 
    'Role', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/span_1 -                   15 of           _cfec26'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/span_1 -                   15 of           _cfec26'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'), 
    'Privilege', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/span_1 -                   15 of           _149965'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/span_1 -                   15 of           _149965'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'), 
    'Procurement Agent', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/span_1 -                   12 of           _1be87c'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/span_1 -                   12 of           _1be87c'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_entry listing/select_Select any oneRolePrivilegeProcureme_138647'), 
    'AR Adjustment Profile', true, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Debabrata/Analytics_ApplicationAccessReport/Page_Home/a_User Entry Access Listing - Copy'))

WebUI.click(findTestObject('Debabrata/Analytics_ApplicationAccessReport/Page_Home/a_User Entry Access Listing - Copy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Entry Access Listing/span_1 -                   15 of more than _0e8ce3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Entry Access Listing/span_1 -                   15 of more than _0e8ce3'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Entry Access Listing/a_User Entry Attribute Access Listing'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Entry Access Listing/a_User Entry Attribute Access Listing'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Entry Attribute Access Listing/span_1 -                   15 of           _fd529f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Entry Attribute Access Listing/a_Entry Attributes'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Entry Attribute Access Listing/a_Entry Attributes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Entry Attributes/span_1 -                   15 of           _b6d037'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Entry Attributes/span_1 -                   15 of           _b6d037'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Entry Attributes/a_Access Hierarchy'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Entry Attributes/a_Access Hierarchy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_User Listing/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/buttonP13_RESPONSIBILITY_lov_btn'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/buttonP13_RESPONSIBILITY_lov_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/input_a-PopupLOV-search apex-item-text'), 
    '')

WebUI.setText(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/input_a-PopupLOV-search apex-item-text'), 
    'Application Implementation Consultant[ORA_ASM_APPLICATION_IMPLEMENTATION_CONSULTANT_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/button_a-Button a-PopupLOV-doSearch'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/button_a-Button a-PopupLOV-doSearch'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/span_Application Implementation ConsultantO_f55710'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/span_Application Implementation ConsultantO_f55710'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/button_Go'))

WebUI.click(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/button_Go'))

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/span_1 -                   15 of           _b6d037'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Analytics_ApplicationAccessReport/Page_Tree Page/span_1 -                   15 of           _b6d037'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

