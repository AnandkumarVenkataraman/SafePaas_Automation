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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Launch browser, enter IQA url, and maximize window
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.baseUrl_IQA)
WebUI.maximizeWindow()

//Enter Coompany /User name / Pwd
TestObject companyTextbox = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Winter 2025_P101_COMPANY')
TestObject userIDTextbox = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME')
TestObject pwdTextbox = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD')

WebUI.setText(companyTextbox, GlobalVariable.companyLogin)
WebUI.setText(userIDTextbox, GlobalVariable.USER_IDLogin)
WebUI.setEncryptedText(pwdTextbox, GlobalVariable.PWDLogin)

//click on Login, verify the page title
TestObject loginButton = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login')
WebUI.enhancedClick(loginButton)
WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

String loginPageTitle = 'Home'
String actualTitle = WebUI.getWindowTitle()

if (loginPageTitle == actualTitle)
	{
	WebUI.comment("Home Page title is correct: '${actualTitle}'")
	WebUI.comment("Login successful")
	} 
else
	{
	WebUI.comment("Home Page title mismatch! Expected: '${loginPageTitle}', but found: '${actualTitle}'")
	}

//Click on Inbox, My Inbox tab, and My Dashboard tab
//This is to ensure the script has landed correctly on the home page after successful login
	
TestObject inbox1 = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Inbox')
WebUI.verifyElementClickable(inbox1)
//put the if condition later 

TestObject myDashboard1 = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_My Dashboard')
WebUI.verifyElementClickable(myDashboard1)
//put an if condition later

TestObject myInbox1 = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_My Inbox')
WebUI.verifyElementClickable(myInbox1)
//put an if condition later

//Take screenshots and write to logs
WebUI.takeScreenshot()
WebUI.comment("Screenshot taken successfully")

//send email that script execution was successful and create a tkt# in Jira if not successful


//Catch Exceptions [try-catch]


//Commit to GITHUB and run from TestOps -> Done
