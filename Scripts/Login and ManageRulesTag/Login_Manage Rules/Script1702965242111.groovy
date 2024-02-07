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

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_IQA - Fall 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/deba/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba/Page_Login/input_New_P101_PASSWORD'), '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/span_Access Monitor_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Home/a_Manage Rules'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Home/a_Manage Rules'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba/Page_Manage Rules/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba/Page_Manage Rules/button_Actions'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'APPROVAL_STATUS', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/input_Expression_p_ignore_10'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/a_Approved'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/a_Approved'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba/Page_Manage Rules/select_NameDescriptionRisk LevelRule TypeRu_fd1a3d'), 
    'RULE_TAGS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba/Page_Manage Rules/select_is nullis not nulllikenot likeinnot _365127'), 
    'in', true)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Expression_R247793226539899118_expre_19cd6b'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/a_ALL CERP RULES'))

WebUI.waitForElementPresent(findTestObject('deba/Page_Manage Rules/button_Apply'), 2)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/a_All'))

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/input_Expression_p_ignore_10'))

WebUI.waitForElementVisible(findTestObject('deba/Page_Manage Rules/button_Apply'), 2)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage Rules/button_Apply'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba/Page_Manage Rules/span_1 -                   15 of           _6956f5'))

