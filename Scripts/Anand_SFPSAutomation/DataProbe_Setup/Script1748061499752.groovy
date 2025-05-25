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

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Home/span_DataPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Home/a_Manage Company'))

WebUI.scrollToElement(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Company/div_DataProbe'), 10)

TestObject dtpIsSelected = findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Company/div_DataProbe')

String isChecked = WebUI.getAttribute(dtpIsSelected, 'checked')

String isDisabled = WebUI.getAttribute(dtpIsSelected, 'disabled')

if ((isChecked != 'true') && (isDisabled != 'true')) {
    WebUI.comment('Checkbox is correctly checked and disabled.')
} else {
    KeywordUtil.markFailed('Checkbox is not both checked and disabled.')
}

//Manage Environment -> Verify the Env. is Active
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/input_Create_R258165063082313757_search_field'), 'EBizApp_JDBC_Env')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/button_Go'))

WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/td_A'), 'A')


WebUI.click(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Environment/button_concat(Row text contains , , EBizApp_4f016a'))


//
