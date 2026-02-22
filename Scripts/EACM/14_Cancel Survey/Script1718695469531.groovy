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

WebUI.callTestCase(findTestCase('SFPSAutomation/Other/EACM/Initiate Survey for Cancel'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Login/button_Login'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Home/a_Manage Workflow'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Home/a_Manage Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_- Please select one -Enterprise Acce_e8a0fd'), 
    'Enterprise Access Certification', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_- Please select one -EBizApp_JDBC_En_bcca2a'), 
    'KTLN_CloudERP_EACM', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Actions'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Filter'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_Select DetailsActionsWorkflow NamePr_1ec721'), 
    'INSTANCE_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/input_p_ignore_10'), GlobalVariable.EACM_SurveyName_Cancel)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Apply'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/i_fa fa-wrench'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_- Please select any -Cancel'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/select_- Please select any -Cancel'), 
    'CANCEL', true)

WebUI.verifyElementText(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/textarea_P35_ACTION_COMMENTS'), 
    '')

WebUI.setText(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/textarea_P35_ACTION_COMMENTS'), 
    GlobalVariable.EACM_SurveyName_Cancel)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Submit'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.click(findTestObject('Object Repository/EACM/EACM_ManageWorkflow/Page_Manage Workflow/button_t-Button t-Button--noUI t-Button--ic_cbe08f'))

WebUI.closeBrowser()

