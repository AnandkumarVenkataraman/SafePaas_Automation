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

WebUI.setText(findTestObject('Object Repository/Manage Role Groups/input_Spring 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Manage Role Groups/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Role Groups/input_New_P101_PASSWORD'), '/oyGi+VPjy0E/jTWlcsxLg==')

WebUI.click(findTestObject('Object Repository/Manage Role Groups/button_Login'))

WebUI.click(findTestObject('Manage Approval Assignments/span_Help_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('Manage Approval Assignments/span_Enterprise Access Monitor_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('Manage Approval Assignments/span_Access Certification_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('Object Repository/Manage Role Groups/a_Manage Role Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/select_Select any oneCloudERPEBizApp_JDBC_E_6b6150'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage Role Groups/select_Select any oneCloudERPEBizApp_JDBC_E_6b6150'), 
    'SailPoint_ENV2', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/a_Role Group name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_IT-Roles_G1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_IT-Roles_G2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_IT-Roles_G3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_IT-Roles_G4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/a_Creation date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_09-MAY-23'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_09-MAY-23'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_09-MAY-23'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_09-MAY-23'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/a_Scope'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/input_IT-Roles_G1_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/input_IT-Roles_G1_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/input_IT-Roles_G1_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/input_IT-Roles_G1_f01'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/a_Category'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/h2_Scope Role Groups'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/button_Create Role Group'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/button_Map Roles'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Manage Role Groups/button_Submit'))

