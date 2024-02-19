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

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/span_Roles Manager_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/a_Manage Activity'))

WebUI.setText(findTestObject('Object Repository/EAM - Manage Activity/input_Activity Report_R242004504603843036_s_342084'), 
    'Activity_1')

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Activity/img_Activity_1_apex-edit-page'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/img_Activity_1_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/input_Name_P4_NAME'), '')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/textarea_Application Implementation Consultant'), 
    'Application Implementation Consultant')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/input_Start Date_P4_START_DATE'), '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Activity/span_Entry'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/span_Entry'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/td_ORA_ASM_APPLICATION_IMPLEMENTATION_CONSU_18b9bb'), 
    'ORA_ASM_APPLICATION_IMPLEMENTATION_CONSULTANT_JOB')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/td_-'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/td_Role'), 'Role')

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/a_Manage Activity (1)'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/button_concat(Row text contains , , Activit_03f483'))

WebUI.setText(findTestObject('Object Repository/EAM - Manage Activity/input_Activity Report_R242004504603843036_s_342084'), 
    'Activity_2')

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Activity/img_Activity_1_apex-edit-page'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/img_Activity_1_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/input_Name_P4_NAME'), '')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/textarea_Application Implementation Manager'), 
    'Application Implementation Manager')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/input_Start Date_P4_START_DATE'), '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Activity/span_Entry'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Activity/span_Entry'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/td_ORA_ASM_APPLICATION_IMPLEMENTATION_MANAGER_JOB'), 
    'ORA_ASM_APPLICATION_IMPLEMENTATION_MANAGER_JOB')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/td_-'), '-')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Activity/td_Role'), 'Role')

WebUI.delay(3)

WebUI.click(findTestObject('EAM - Manage Activity/a_Manage Activity'))

WebUI.delay(1)

