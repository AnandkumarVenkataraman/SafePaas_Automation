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

WebUI.navigateToUrl('https://uat.safepaas.com/monitor/f?p=1000:101:::::')

WebUI.setText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Winter 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_Login'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/span_AccessPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/span_Roles Manager_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/a_Manage Remediation Plan'))

WebUI.setText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Create_R327963090047660484_search_field'), 
    'KTLN_S')

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/img'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Code (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/span_KTLN_S'), 'KTLN_S')

WebUI.rightClick(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_(Value Required)_P121_GCA_MEANING'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Meaning (Value Required)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_(Value Required)_P121_GCA_MEANING'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Description'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Description_P121_GCA_DESCRIPTION'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Start Date (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Start Date_P121_GCA_START_DATE'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Scope'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/select_Select any oneSelectedAll User Viola_4d72e2 (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/select_Select any oneSingle NotificationMul_93fa0c (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_Cancel (1)'))

WebUI.click(findTestObject('EAM - Manage Remediation Plan/button_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_concat(Row text contains , , KTLN_S,_45b172'))

WebUI.setText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Create_R327963090047660484_search_field'), 
    'KTLN_U')

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_Go'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/a_Code'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/a_KTLN_U'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/img'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Code (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/span_KTLN_U'), 'KTLN_U')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Meaning (Value Required)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_(Value Required)_P121_GCA_MEANING'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Start Date (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Start Date_P121_GCA_START_DATE'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Start Date_P121_GCA_START_DATE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Scope'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/select_Select any oneSelectedAll User Viola_4d72e2 (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/select_Select any oneSingle NotificationMul_93fa0c (1)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Enabled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Enabled_u-checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_Cancel (1)'))

WebUI.click(findTestObject('EAM - Manage Remediation Plan/button_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_concat(Row text contains , , KTLN_S,_45b172'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_concat(Row text contains , , KTLN_S,_45b172'))

WebUI.setText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Create_R327963090047660484_search_field'), 
    'KTLN_UR')

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/img'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Code (2)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/span_KTLN_UR'), 'KTLN_UR')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Meaning (Value Required)'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_(Value Required)_P121_GCA_MEANING'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Description'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Description_P121_GCA_DESCRIPTION'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Description_P121_GCA_DESCRIPTION'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Start Date (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Start Date_P121_GCA_START_DATE'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Remediation Plan/input_Start Date_P121_GCA_START_DATE'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Scope'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/select_Select any oneSelectedAll User Viola_4d72e2 (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Workflow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/select_Select any oneSingle NotificationMul_93fa0c (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Enabled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/label_Enabled_u-checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_Cancel (2)'))

WebUI.click(findTestObject('EAM - Manage Remediation Plan/button_Cancel (2)'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/button_concat(Row text contains , , KTLN_S,_45b172'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Remediation Plan/a_Manage Remediation Plan (1)'))

