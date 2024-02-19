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

WebUI.click(findTestObject('EAM - Manage Exception Type/Manage Exception Type'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/select_Select any oneCloudERPKTLN_CloudERP'))

WebUI.click(findTestObject('EAM - Manage Exception Type/select_Select any oneCloudERPKTLN_CloudERP'))

WebUI.selectOptionByLabel(findTestObject('EAM - Manage Exception Type/select_Select any oneCloudERPKTLN_CloudERP - Copy'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/EAM - Manage Exception Type/input_Create_R228322127981644711_search_field'), 
    'Role')

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EAM - Manage Exception Type/img_Role_apex-edit-page'), 0)

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/img_Role_apex-edit-page'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Exception Type/input_Name_P70_NAME'), '')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Exception Type/textarea_Role'), 'Role')

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Exception Type/input_Exception Code_P70_EXCEPTION_TYPE_CODE'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/label_Entry Type'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/option_Privilege'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/option_it'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/option_Entitlement'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/label_Include User'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/label_Include User_u-checkbox'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Exception Type/input_Start Date_P70_START_DATE'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/button_concat(Row text contains , , Role, ,_c015dc'))

WebUI.setText(findTestObject('Object Repository/EAM - Manage Exception Type/input_Create_R228322127981644711_search_field'), 
    'Privilege')

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/button_Go'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/img_Role_apex-edit-page'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/img_Role_apex-edit-page'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/input_Name_P70_NAME'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/textarea_Privilege'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/input_Exception Code_P70_EXCEPTION_TYPE_CODE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/option_Role'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/option_it'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/option_Entitlement'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/option_Privilege'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/label_Include User'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/label_Include User_u-checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/label_Start Date'))

WebUI.verifyElementText(findTestObject('Object Repository/EAM - Manage Exception Type/input_Start Date_P70_START_DATE'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/EAM - Manage Exception Type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/button_Cancel'))

WebUI.click(findTestObject('Object Repository/EAM - Manage Exception Type/button_concat(Row text contains , , Role, ,_c015dc'))

WebUI.click(findTestObject('EAM - Manage Exception Type/Manage Exception Type'))

