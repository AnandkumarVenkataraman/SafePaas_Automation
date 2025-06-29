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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Environment/span_Assign MonitorPaaS Roles_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Environment/span_SFTP File Explorer_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Environment/a_Manage Data Source'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/select_- Select an Environment -EBizApp_JDB_7716e6'), 
    '5888', true)

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/input_Create_R119140564844328612_search_field'), 
    'EBiz_JDBC_DS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/button_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/td_Yes'), 'Yes')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/input_Run script_f01'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/button_Synchronization'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/span_Breadcrumb_t-Icon'), 
    10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/h2_Syncronization processing in the background'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/span_Running'), 
    'Running')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/img'), 10)

//Verify that Synchronization completed successfully
//def buttonGo = findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/button_Go')

//WAIT FOR 1.30 hrs
def buttonGo = findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/button_Go')

def tdCompleted = findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/a_Completed')

//def spanInactive = findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/span_Running')

// Set time limits
int maxAttempts = 180

int waitBetweenAttempts = 5

boolean found = false

for (int i = 0; i < maxAttempts; i++) {
	//	WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/Page_Scheduler/input_Job Time_SCHEDULER_search_field'),
	//		actualUACId)
	WebUI.enhancedClick(buttonGo)

	WebUI.delay(waitBetweenAttempts)

	boolean isCompletedVisible = WebUI.verifyElementPresent(tdCompleted, 5, FailureHandling.OPTIONAL)

	//boolean isInactiveVisible = WebUI.verifyElementPresent(spanInactive, 5, FailureHandling.OPTIONAL)

	if (isCompletedVisible) {
		found = true

		break
	}
}

if (!(found)) {
	KeywordUtil.markFailed('Element Completed did not appear within 180 minutes.')
}
//x



//TODO -Commenting the logic to verify the Last Synchronize date - for now
//WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/td_24-MAY-2025 231134'),10)

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/a_EBiz_JDBC_DS'))

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/select_- Select Any -Azure RESTDB2Local Fil_9111db'),
	'Oracle')

TestObject hostName = findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/input_(Value Required)_P4_DS_HOSTNAME')

String hostNameValue = WebUI.getAttribute(hostName, 'value')
if ((hostNameValue = '10.7.25.198') ) {
	WebUI.comment('Hostname is correct')
} else {
	KeywordUtil.markFailed('Hostname is incorrect')
}

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/input_(Value Required)_P4_DS_HOSTNAME'),
	'10.7.25.198')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/select_- Select Any -User-Password'),
	'User-Password')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/select_- Select Any -TCPTCPS'),
	'TCP')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/input_Database_P4_DS_DATABASE'),
	'EBSDB')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/input_Port_P4_DS_PORT'),
	'1521')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/input_Username_P4_DS_USERNAME'),
	'APPS')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/DTP/Page_Manage Data Source/button_concat(Row text contains , , EBiz_JD_36edac'))



