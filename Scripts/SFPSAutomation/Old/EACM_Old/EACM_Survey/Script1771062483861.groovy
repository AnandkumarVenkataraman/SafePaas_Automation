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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
//
//WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage Certification'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'), 
    1)

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage Certification/button_Create'))

def dateFormat = new SimpleDateFormat('ddMMyyyy_HHmmss')

def currentDateTime = dateFormat.format(new Date())

def dateTimeString = 'EBS_EACMSurvey_' + currentDateTime

WebUI.comment('The dateTimeString is: ' + dateTimeString)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/input_(Value Required)_P10_NAME'), 
    dateTimeString)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/input_(Value Required)_P10_NAME'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/textarea_Description_P10_DESCRIPTION'), 
    dateTimeString)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Popup Calendar End Date'))

LocalDate futureDate = LocalDate.now().plusDays(2)

String dayString = futureDate.format(DateTimeFormatter.ofPattern('d'))

String dynamicXPath = "//a[@href = '#' and (text() = '$dayString' or . = '$dayString')]"

TestObject dynamicDateObject = new TestObject()

dynamicDateObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

WebUI.enhancedClick(dynamicDateObject)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/a_12'))
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Close'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_Verified'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/label_Manual POST'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Initiate User Access/button_Create'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
String uacID = WebUI.getText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))

WebUI.comment('UAC ID is : ' + uacID)

WebUI.delay(1)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/h2_Certification job was initiated successf_3b953f'))
def matcher = uacID =~ '(FSOD_[A-Z0-9_]+)'

String actualUACId = matcher ? (matcher[0])[1] : null

WebUI.comment('Extracted UAC ID: ' + actualUACId)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/span_Company Settings_a-TreeView-toggle'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/span_Company Settings_a-TreeView-toggle'))
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_Scheduler'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/input_Job Time_SCHEDULER_search_field'), 
    actualUACId)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Go'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/td_RUNNING'), 0)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/span_Active'), 0)
//
//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Go'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/td_SUCCEEDED'), 0)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/span_Inactive'), 0)
def buttonGo = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Go')

def tdSucceeded = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/td_SUCCEEDED')

def spanInactive = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/span_Inactive')

// Set time limits
int maxAttempts = 60

int waitBetweenAttempts = 5

boolean found = false

for (int i = 0; i < maxAttempts; i++) {
    //	WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/input_Job Time_SCHEDULER_search_field'),
    //		actualUACId)
    WebUI.enhancedClick(buttonGo)

    WebUI.delay(waitBetweenAttempts)

    boolean isSucceededVisible = WebUI.verifyElementPresent(tdSucceeded, 5, FailureHandling.OPTIONAL)

    boolean isInactiveVisible = WebUI.verifyElementPresent(spanInactive, 5, FailureHandling.OPTIONAL)

    if (isSucceededVisible && isInactiveVisible) {
        found = true

        break
    }
}

if (!(found)) {
    KeywordUtil.markFailed('Elements \'SUCCEEDED\' and \'Inactive\' did not appear within 5 minutes.')
}

//WebUI.closeBrowser()
//WebUI.openBrowser('')
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_concat(Row text contains , , 21073, _fd4aac'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/span_Manage Load Query_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/span_Unassigned Accesses_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/a_Manage User Access'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'), 
    1)

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_EBS_EACMSurvey_10052025_021553'))
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/input_User Access_userAccessReport_search_field'), 
    dateTimeString)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_EBS_EACMSurvey_10052025_021553'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Open'), 'Open')

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/input_Send E-mail Reminder_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/input_Send E-mail Reminder_f02'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/input_Send E-mail Reminder_f03'), 
    FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Send E-mail Reminder'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/span_Breadcrumb_t-Icon'), 
    20)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/h2_Email reminder has been sent'), 
    20)

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/button_Email reminder has been sent_t-Butto_8b503d'))


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Manage User Access'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , EBS_EAC_92927d'))


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Inbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_My Dashboard'))

WebUI.comment(dateTimeString)
WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/input_My Certifications_R97799695751099620__683988'),
	dateTimeString)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_EBS_EACMSurvey_10052025_025233'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Terminate All'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All access terminated_t-Button t-But_d6984e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Verify All'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_OK'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_All access terminated_t-Button t-But_d6984e'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_Verified'))

WebUI.doubleClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_Verified_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/select_Not VerifiedVerifiedTerminate Access'),
	'J', true)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Save Changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/td_Terminate Access'),
	'Terminate Access')



WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Changes saved_t-Button t-Button--noU_f8b9da'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Confirm Changes'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/h2_User Access Certification has been Completed'),
//	0)
WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Confirm Changes'))
int maxDurationMinutes = 5//45
int intervalMinutes = 0.2//3
 
long maxDurationMillis = maxDurationMinutes * 60 * 1000
long intervalMillis = intervalMinutes * 60 * 1000
 
long startTime = System.currentTimeMillis()

while ((System.currentTimeMillis() - startTime) < maxDurationMillis) {
	if (WebUI.verifyElementPresent(
		findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/h2_User Access Certification has been Completed'),
		5, FailureHandling.OPTIONAL)) {
		WebUI.comment("Success element found. Ending the loop.")
		break
	}

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification Survey/button_Confirm Changes'))
	println("Clicked 'Confirm Changes' at: " + new Date().format("HH:mm:ss"))
 
WebUI.delay(intervalMinutes * 60)
}
 
WebUI.comment("Confirmed the changes for the survey at:" + new Date().format("HH:mm:ss"))


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/a_My Certifications'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Certification has been closed/button_OK'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Enterprise Access Monitor_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/span_Analytics_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Home/a_Manage User Access'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/select_Select any oneEBizApp_JDBC_EnvEBiz_S_b9e18a'),
	'5888', true)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/input_User Access_userAccessReport_search_field'),
	dateTimeString)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/a_EBS_EACMSurvey_10052025_055123'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/td_Completed'),
	'Completed')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_User Access Validation/a_Manage User Access'))

//WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Manage User Access/button_concat(Row text contains , , EBS_EAC_303be6'))

//WebUI.closeBrowser()
