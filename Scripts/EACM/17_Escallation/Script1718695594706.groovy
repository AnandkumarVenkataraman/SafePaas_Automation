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

WebUI.setText(findTestObject('Object Repository/EACM/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/Page_Login/input_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Home/a_Manage Workflow'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Home/a_Manage Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd'), 
    'Enterprise Access Certification', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721'), 
    'INSTANCE_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Page_Manage Workflow/input_p_ignore_10'), '')

WebUI.setText(findTestObject('Object Repository/EACM/Page_Manage Workflow/input_p_ignore_10'), 'CLOUDERP_CERT_JUN6_V2')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/span_fa fa-search'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Manage Workflow/span_fa fa-search'))

WebUI.delay(180)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Page_Manage Workflow/h2_Manage Workflow - Level 2 - Test14'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/Page_Manage Workflow/h2_Manage Workflow - Level 2 - Test14'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/EACM/Page_Manage Workflow/a_Actions'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/Page_Manage Workflow/a_Actions'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select any -ReassignEscalationReminder'), 
    'ESCALATION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select any -KATALON_ADMINKT_eeb9ba'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/Page_Manage Workflow/select_- Please select any -KATALON_ADMINKT_eeb9ba'), 
    'KTLN_EACM_USER1', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Page_Manage Workflow/input_P35_MANAGER_NAME'), '')

WebUI.setText(findTestObject('Object Repository/EACM/Page_Manage Workflow/input_P35_MANAGER_NAME'), 'D PATEL')

WebUI.verifyElementText(findTestObject('Object Repository/EACM/Page_Manage Workflow/input_P35_MANAGER_EMAIL'), '')

WebUI.setText(findTestObject('Object Repository/EACM/Page_Manage Workflow/input_P35_MANAGER_EMAIL'), 'debabrata.patel@safepaas.com')

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Submit'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EACM/Page_Manage Workflow/h2_Escalation sent successfully'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.closeBrowser()

