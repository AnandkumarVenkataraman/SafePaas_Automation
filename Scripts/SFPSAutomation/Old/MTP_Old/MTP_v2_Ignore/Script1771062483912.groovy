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

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Coupa_Env1EBizA_d51d0f (1)'), 
    '- Please select one -', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d (3)'), 
    '- Please select one -', true)

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Breadcrumbs_t-Button t-Button--noUI _fee11d (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Inbox'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (13)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (1)'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise iAccess_a-TreeView-toggle'))

WebUI.closeBrowser()

//Request status

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Coupa_Env1EBizA_d51d0f (1)'),
	0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/select_- Please select one -Enterprise Acce_bd443d (3)'),
	0)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/button_Breadcrumbs_t-Button t-Button--noUI _fee11d (1)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Workflow/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle (13)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise iAccess_a-TreeView-toggle'))

WebUI.closeBrowser()