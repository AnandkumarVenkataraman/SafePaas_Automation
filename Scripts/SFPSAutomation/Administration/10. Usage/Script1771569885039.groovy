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

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Role/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/button_concat(Row text contains , , all, , _45e6fd'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Roles/a_Assign Roles'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/input_Create_R127441311092542518_search_field'), 
    'KATADMIN')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/td_KATADMIN'), 'KATADMIN', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/td_ALL_ACCESS'), 'ALL_ACCESS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/button_concat(Row text contains , , KATADMI_68d78e'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Assign Roles/input_Create_R127441311092542518_search_field'), 
    'ANANDK1')

WebUI.callTestCase(findTestCase('SFPSAutomation/Administration/11. Release Update'), [:])

