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

WebUI.setText(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Login/input_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Login/input_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Login/input_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Home/a_Manage Snapshot'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Home/a_Manage Snapshot'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/select_Select any oneCERP_ObjSetEBizApp_JDB_4cd3ab'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/select_Select any oneCERP_ObjSetEBizApp_JDB_4cd3ab'), 
    'KTLN_OBJECT_SET', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/label_u-checkbox'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/label_u-checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Actions'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Filter'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/select_is nullis not nulllikenot likeinnot _365127'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/select_is nullis not nulllikenot likeinnot _365127'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/input_p_ignore_10'), 
    '')

WebUI.setText(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/input_p_ignore_10'), 'KTLN_Jan30_V1')

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Apply'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Apply'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Actions'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Filter'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/select_NameObjects NameDescriptionLast Upda_0c2a2d'), 
    'STATUS_CODE', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/buttonmngSnap_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/buttonmngSnap_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/a_Completed'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/a_Completed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Apply'))

WebUI.click(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/button_Apply'))

WebUI.scrollToElement(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/span_1 -                   11'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Debabrata/Manage Snapshot/Page_Manage Snapshot/span_1 -                   11'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.closeBrowser()

