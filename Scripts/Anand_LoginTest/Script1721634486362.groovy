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

//Open the browser and launch IQA
String IQA_url = 'https://us21n.safepaas.com'
String expectedTitle = '' //Pls. note -> the Login page does not have a title
String actualTitle

	WebUI.openBrowser('')
	WebUI.navigateToUrl(IQA_url)
	WebUI.maximizeWindow()
	actualTitle = WebUI.getWindowTitle()
	println("Anand IQA Test Jul 20 2024") // jus for test purpose, to verify in the console
	println("The title of the current window is: " + actualTitle)
	
if(expectedTitle == actualTitle)
{
	println("IQA launched successfully July22")
}
else
{
	println("An error occurred when trying to launch IQA ") //+ e.getMessage())
	WebUI.takeScreenshot()
	KeywordUtil.markFailedAndStop("Terminating the execution")
	WebUI.closeBrowser()
}
	
// Verify SafePaaS Logo, and if it does not exists, terminate the execution
TestObject SafePaaS_Logo = findTestObject('Object Repository/Page_Login/img_Logo left_P101_LOGO_LEFT')
boolean isElementPresent_SafePaaS_Logo = WebUI.verifyElementPresent(SafePaaS_Logo, 10)

if(isElementPresent_SafePaaS_Logo)
	{
			println("SafePaaS Logo is present")
	}
	else
	{
		KeywordUtil.markFailedAndStop("SafePaaS Logo was not found, hence, terminating the execution")
	}

// Verify Company field is present; enabled [in order to enter the Company name], and the placeholder 'Company', and if not, terminate the execution
TestObject Company_textField = findTestObject('Object Repository/Page_Login/input_Spring 2024_P101_COMPANY')

//Step1 -> Verify if the text-box field for Company is present
	boolean isElementPresent_Company_textField = WebUI.verifyElementPresent(Company_textField, 10)
	if(isElementPresent_Company_textField)
	{
		println("Company text field is available")
	}
	else
	{
			KeywordUtil.markFailedAndStop("Company field was not found, hence, terminating the execution")
	}

//Step2 -> Verify if the text-box field for Company is enabled [i.e., editable or not]
	boolean isElementPresent_Company_clickable = WebUI.verifyElementClickable(Company_textField, 10)
	if(isElementPresent_Company_clickable)
	{
		println("Company text field is editable")
	}
	else
	{
		KeywordUtil.markFailedAndStop("Company field was not editable, hence, terminating the execution")
	}

//Step3 -> Verify if the placeholder text [i.e., the grey color text 'Company'] is displayed in the text-box field for Company
	String expectedPlaceholder_Company = 'Company'
	String actualPlaceholder_Company = WebUI.getAttribute(Company_textField, 'placeholder')
	if(expectedPlaceholder_Company == actualPlaceholder_Company)
	{
		WebUI.setText(Company_textField, "KAT") //Step4 -> Entering the value for Company field, after all the conditions are satisfied
	}
	else
	{
		KeywordUtil.markFailedAndStop("The grey colored text 'Company' was not found in the Company's text field, hence, terminating the execution")
	}

			

