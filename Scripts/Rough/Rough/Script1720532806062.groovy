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

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_COMPANY (1) (1) (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_USERNAME (1) (1) (1) (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/input_P101_PASSWORD (1) (1) (1) (1) (1)'), 
    '1NH9WJz7EqazrwnBTn527Q==')

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Login/button_Login (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1 (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1_2 (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/span_a-TreeView-toggle_1_2 (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/a_Manage Rule Tags (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Home/a_Manage Rule Tags (1) (1) (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Actions'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Actions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Filter'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/select_EditTag NameTag DescriptionTag Code'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/select_EditTag NameTag DescriptionTag Code'), 
    'TAG_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/buttonR189436115360253186_expression_icon_link'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/buttonR189436115360253186_expression_icon_link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/a_New'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/a_New'))

WebUI.comment('Capture the RuleTags New')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Apply'))

WebUI.click(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/td_New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageActivity/Page_Manage Tag/span_1 -                    1 of           _e353a0'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_t-Button t-Button--noUI t-Button--ic_cbe08f (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba2/DataProbe_JDBC/Page_Manage Data Source/button_Go (1)'))

WebUI.delay(5)

