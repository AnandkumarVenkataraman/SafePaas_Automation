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

WebUI.setText(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Login/input_Spring 2024_P101_COMPANY'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 
    'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Login/input_New_P101_PASSWORD'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.click(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Home/span_Manage My Access_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Home/a_Maintain Approval Hierarchy'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Maintain Approval Hierarchy/select_Select any oneEBizApp_JDBC_EnvKTLNCl_cd37e2'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Maintain Approval Hierarchy/img_Create_apex-edit-pencil'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Maintain Approval Hierarchy/select_Select any oneAllViolation Only (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Maintain Approval Hierarchy/select_Select any oneAllViolation Only (1)'), 
    'VO', true)

WebUI.click(findTestObject('Object Repository/Auto-Approve/HierarchyLevels/Page_Maintain Approval Hierarchy/button_Apply Changes'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/button_katalon_admin'))

WebUI.click(findTestObject('Object Repository/EIA_Workflow_Approve/Page_Home/a_Logout'))

