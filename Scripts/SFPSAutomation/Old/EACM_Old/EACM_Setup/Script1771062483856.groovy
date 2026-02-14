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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Test Cases/SFPSAutomation/Old/commonFlow_Login'), [:], FailureHandling.STOP_ON_FAILURE)

//Company settings -> Verify EACM Product is selected
TestObject Administration = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_DataPaaS_a-TreeView-toggle')

WebUI.enhancedClick(Administration //click on Administration
    )

TestObject companySettings = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_Administration_a-TreeView-toggle')

WebUI.enhancedClick(companySettings //click on Company Settings
    )

TestObject manageCompany = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/a_Manage Company')

WebUI.enhancedClick(manageCompany)

TestObject eacmIsSelected = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/div_Enterprise Access Certification')

//boolean isChecked = eacmIsSelected.isSelected()
//boolean isDisabled = !eacmIsSelected.isEnabled()
String disabledAttr = WebUI.getAttribute(eacmIsSelected, 'disabled')

WebUI.comment(disabledAttr)

String checkedAttr = WebUI.getAttribute(eacmIsSelected, 'checked')

WebUI.comment(checkedAttr)

if ((checkedAttr == 'true') && (disabledAttr == 'true')) {
    println('EACM is selected and is disabled')
} else {
    WebUI.verifyMatch('EACM is either not selected; or, is selected and enabled for this user. So terminating the execution.', 
        '', false)
}

//Manage Environment -> Verify the Env. is Active
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Create_R258165063082313757_search_field'), 'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_A'), 'A')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Manage Load Query_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Manage User Access_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Access Groups'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'), 
    1)

WebUI.verifyElementChecked(findTestObject('Object Repository/Anand_SFPSAutomation/input_HCM_f01'), 10)

WebUI.verifyElementChecked(findTestObject('Object Repository/Anand_SFPSAutomation/input_Procurement_f01'), 10)

WebUI.verifyElementChecked(findTestObject('Object Repository/Anand_SFPSAutomation/input_Purchasing_f01'), 10)

KeywordUtil.logInfo('HCM, Procurement, and Purchasing Role-groups are selected')

////Click on AccessPaaS
//TestObject accessPaasHyperLink = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_AccessPaaS')
//WebUI.verifyElementPresent(accessPaasHyperLink, 0)
////write an if stmt for -> if element not present, later
//
//
//TestObject accessPaas = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_Help_a-TreeView-toggle')
//WebUI.enhancedClick(accessPaas)
//WebUI.comment("AccessPaaS menu is rendered, and able to click")
//
////Click on EACM > Setup > Manage Access Groups
//TestObject eacmHyperLink = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_Enterprise Access Certification')
//WebUI.verifyElementPresent(eacmHyperLink, 0)
////write an if stmt for -> if element not present, later
//
//TestObject eacm = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_Enterprise Access Monitor_a-TreeView-toggle')
//WebUI.enhancedClick(eacm)
//WebUI.comment("Enterprise Access Certification menu is rendered, and able to click")
//
//TestObject eacmSetupHyperLink = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_Setup')
//WebUI.verifyElementPresent(eacmSetupHyperLink, 0)
////write an if stmt for -> if element not present, later
//
//TestObject eacmSetup = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/span_Access Certification_a-TreeView-toggle')
//WebUI.enhancedClick(eacmSetup)
//WebUI.comment("Setup menu is rendered under EACM, and able to click")
//
//TestObject manageAccessGroups = findTestObject('Object Repository/Anand_SFPSAutomation/EACM/a_Manage Access Groups')
//WebUI.verifyElementPresent(manageAccessGroups, 0)
////write an if stmt for -> if element not present, later
//WebUI.enhancedClick(manageAccessGroups)
//WebUI.comment("Manage Access Groups menu is rendered under EACM > Setup, and able to click")
//WebUI.takeScreenshot()
//Scope Roles
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Scope Access'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'), 
    1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/a_HCM'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/a_Purchasing'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/a_Procurement'), 10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_HCM'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Scope Flag'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Y'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/td_Y'), 10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Scope Flag  , , Y, , )_a-Butt_397c15'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Role Groups in Scope'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Purchasing'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Scope Flag'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Y'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/td_Y'), 10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Scope Flag  , , Y, , )_a-Butt_397c15'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Role Groups in Scope'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Procurement'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Scope Flag'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Y'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/td_Y'), 10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Scope Flag  , , Y, , )_a-Butt_397c15'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/span_Role Groups in Scope'))

KeywordUtil.logInfo('All the Role-groups; viz., HCM, Procurement, and Purchasing, have Roles that have been scoped')

//Manage Approval Assignments
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Approval Assignments'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'), 
    1)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Role Group'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/a_HCM'), 'HCM')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_HCM'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_KATADMIN Kat Admin'), 'KATADMIN Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_KATALON_ADMIN Katalon Admin'), 'KATALON_ADMIN Katalon Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Approval Assignments (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Role Group'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Procurement'))
//WebUI.delay(3)
//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/a_Procurement_1'), 'Procurement')

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Procurement_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_KATADMIN Kat Admin'), 'KATADMIN Kat Admin')
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/td_KATADMIN Kat Admin'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_KATALON_ADMIN Katalon Admin'), 'KATALON_ADMIN Katalon Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Approval Assignments (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Role Group'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Purchasing'))

//WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/a_Purchasing_1'), 'Purchasing')

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Purchasing_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_KATADMIN Kat Admin'), 'KATADMIN Kat Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_KATALON_ADMIN Katalon Admin'), 'KATALON_ADMIN Katalon Admin')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Approval Assignments (1)'))

TestObject hcmLink = findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099')

// Wait up to 15 seconds for the element to be present
if (WebUI.waitForElementPresent(hcmLink, 15, FailureHandling.OPTIONAL)) {
   WebUI.enhancedClick(hcmLink, FailureHandling.OPTIONAL)
}

//TestObject hcmLink = findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099')

// Wait up to 15 seconds for the element to be present
if (WebUI.waitForElementPresent(hcmLink, 15, FailureHandling.OPTIONAL)) {
   WebUI.enhancedClick(hcmLink, FailureHandling.OPTIONAL)
}

//TestObject hcmLink = findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099')

// Wait up to 15 seconds for the element to be present
if (WebUI.waitForElementPresent(hcmLink, 15, FailureHandling.OPTIONAL)) {
   WebUI.enhancedClick(hcmLink, FailureHandling.OPTIONAL)
}

KeywordUtil.logInfo('Primary and Secondary ownershave been successfully assigned for all the 3 Role-groups; viz., HCM, Procurement, and Purchasing')

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099'), FailureHandling.OPTIONAL)
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099'), FailureHandling.OPTIONAL)
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099'), FailureHandling.OPTIONAL)
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099'))
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099'))
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_concat(Role Group  , , HCM, , )_a-Bu_7cf099'))

//Certification Configuration
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/a_Certification Configuration'))

TestObject oneApproverResponse = findTestObject('Object Repository/Anand_SFPSAutomation/label_One Approver Response')
//findTestObject('Object Repository/Anand_SFPSAutomation/EACM/div_Enterprise Access Certification')
checkedAttr = WebUI.getAttribute(oneApproverResponse, 'checked')

WebUI.comment(checkedAttr)

if ((checkedAttr == 'true')) {
	println('oneApproverResponse is selected')
} else {
	WebUI.verifyMatch('oneApproverResponse is not selected.',
		'', false)
}


TestObject labelNo1 = findTestObject('Object Repository/Anand_SFPSAutomation/label_No')
//findTestObject('Object Repository/Anand_SFPSAutomation/EACM/div_Enterprise Access Certification')
checkedAttr = WebUI.getAttribute(labelNo1, 'checked')

WebUI.comment(checkedAttr)

if ((checkedAttr == 'true')) {
	println('labelNo1 is selected')
} else {
	WebUI.verifyMatch('labelNo1 is not selected.',
		'', false)
}

TestObject labelNo2 = findTestObject('Object Repository/Anand_SFPSAutomation/label_No')
//findTestObject('Object Repository/Anand_SFPSAutomation/EACM/div_Enterprise Access Certification')
checkedAttr = WebUI.getAttribute(labelNo2, 'checked')

WebUI.comment(checkedAttr)

if ((checkedAttr == 'true')) {
	println('labelNo2 is selected')
} else {
	WebUI.verifyMatch('labelNo2 is not selected.',
		'', false)
}

TestObject labelNo3 = findTestObject('Object Repository/Anand_SFPSAutomation/label_No')
//findTestObject('Object Repository/Anand_SFPSAutomation/EACM/div_Enterprise Access Certification')
checkedAttr = WebUI.getAttribute(labelNo3, 'checked')

WebUI.comment(checkedAttr)

if ((checkedAttr == 'true')) {
	println('labelNo3 is selected')
} else {
	WebUI.verifyMatch('labelNo3 is not selected.',
		'', false)
}


WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/span_Please select an environment'),10)


WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/select_CERP_1 (Inactive)CloudERP (Inactive)_be71c8'),
	'5888', true)


TestObject roleGroupCheckbox = findTestObject('Object Repository/Anand_SFPSAutomation/label_Role Group')
//findTestObject('Object Repository/Anand_SFPSAutomation/EACM/div_Enterprise Access Certification')
checkedAttr = WebUI.getAttribute(roleGroupCheckbox, 'checked')

WebUI.comment(checkedAttr)

if ((checkedAttr == 'true')) {
	println('roleGroupCheckbox is selected')
} else {
	WebUI.verifyMatch('roleGroupCheckbox is not selected.',
		'', false)
}

//Pls. add an if-condition for pop-up
WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/a_Inbox'))

KeywordUtil.logInfo('Certification Configuration successfully verified')
