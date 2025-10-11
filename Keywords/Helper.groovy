import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Helper {
@Keyword
	def static enterDatePlusTwo()
	{
		String dayString = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("d"))
		WebUI.comment("Target Day: " + dayString)
		String dynamicXPath = "//a[@href='#' and normalize-space(text())='" + dayString + "']"
		WebUI.comment("Dynamic XPath: " + dynamicXPath)
		TestObject dynamicDateObject = new TestObject("dynamicDate")
		WebUI.delay(2)
		dynamicDateObject.addProperty("xpath", ConditionType.EQUALS, dynamicXPath)
		WebUI.delay(2)
return dynamicDateObject
	}
	@Keyword
	def static login() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.URL)
		WebUI.maximizeWindow()
		//WebUI.getElementLeftPosition(null)
		//Verify SafePaaS logo is available on the left-side of the page
		WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/SafePaaS_logo'),30)

		//similarly, add another line for the logo present or not [which is above Company]
		WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (12)'), "placeholder", "Company", 20)
		WebUI.clearText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (12)'))
		WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_Spring 2025_P101_COMPANY (12)'), GlobalVariable.COMPANY_NAME)

		WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (12)'),
				GlobalVariable.USER_ID)

		WebUI.setEncryptedText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/input_New_P101_PASSWORD (12)'),
				GlobalVariable.PWD)

		WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Login/button_Login (11)'))

		WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

		String loginPageTitle = 'Home'
		String actualTitle = WebUI.getWindowTitle()

		if (loginPageTitle == actualTitle) {
			WebUI.comment("Home Page title is correct: '${actualTitle}'")
			WebUI.comment("Login successful")
		}
		else {
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

		KeywordUtil.logInfo("Login successful and Home page is rendered")
	}
}
