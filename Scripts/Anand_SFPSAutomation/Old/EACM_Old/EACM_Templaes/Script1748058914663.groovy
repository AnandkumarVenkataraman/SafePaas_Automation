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


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Home/span_DataPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Home/span_Administration_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Home/a_Manage Company'))

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Company/span_Email Configuration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Please select one -DataProbeEnterp_9ed873'), 
    'UAC', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Please select one -After Review No_1d58b0'), 
    'Cancelling Notification', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '710', true, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
    'Hi :APPROVER,The Survey :SURVEYNAME for which you were designated as approver has been cancelled.All user access has been set to a Not Verified status by default.Cancelling reason: :CANCELREASON', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Please select one -After Review No_1d58b0'), 
    'Delegation Notification', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '711', true, FailureHandling.OPTIONAL)

//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
//    '<p style="">Hi :DELEGATE,</p><p>This is a delegation notification email.</p><p>You have been selected as the delegate for :ORIG_APPROVER - :ORIG_USER_EMAIL, and may receive notifications related to survey certification between :STARTDATE and :ENDDATE.</p><p>Please be aware of your new responsibilities and take appropriate action as necessary.</p><p>Thank you for your attention to this matter. Best regards.</p>')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
    'Hi :DELEGATE,This is a delegation notification email.You have been selected as the delegate for :ORIG_APPROVER - :ORIG_USER_EMAIL, and may receive notifications related to survey certification between :STARTDATE and :ENDDATE.Please be aware of your new responsibilities and take appropriate action as necessary.Thank you for your attention to this matter. Best regards.', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Please select one -After Review No_1d58b0'), 
    'Escalation Notification', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '712', true, FailureHandling.OPTIONAL)

//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
//    '<p style="">Hi :MANAGER,</p><p>This is an escalation notification email.</p><p>A survey requires the immediate attention of the approver. Below are the Approver and Survey details -</p><p>Approver Name - :APPROVERNAME<br>Approver Email - :APPROVEREMAIL<br>Survey Name - :SURVEYNAME<br>Start Date - :STARTDATE<br>End Date - :ENDDATE<br>Company - :COMPANY<br>Role Group Name - :ROLEGROUPNAME</p><p>Note - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATE</p><p>Thank you for your attention to this matter. Best regards</p>')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
    'Hi :MANAGER,This is an escalation notification email.A survey requires the immediate attention of the approver. Below are the Approver and Survey details -Approver Name - :APPROVERNAMEApprover Email - :APPROVEREMAILSurvey Name - :SURVEYNAMEStart Date - :STARTDATEEnd Date - :ENDDATECompany - :COMPANYRole Group Name - :ROLEGROUPNAMENote - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATEThank you for your attention to this matter. Best regards', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Please select one -After Review No_1d58b0'), 
    'Generic', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '707', true, FailureHandling.OPTIONAL)

//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
//    '<p style="">Hi :APPROVER,</p><p>The Survey :SURVEYNAME is awaiting to be reviewed and closed. Below are the Survey details -</p><p>Survey Name - :SURVEYNAME<br>Start Date - :STARTDATE<br>End Date - :ENDDATE<br>Company - :COMPANY<br>Role Group Name - :ROLEGROUPNAME<br>URL - :URL</p><p>Note - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATE</p>')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
    'Hi :APPROVER,The Survey :SURVEYNAME is awaiting to be reviewed and closed. Below are the Survey details -Survey Name - :SURVEYNAMEStart Date - :STARTDATEEnd Date - :ENDDATECompany - :COMPANYRole Group Name - :ROLEGROUPNAMEURL - :URLNote - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATE', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Please select one -After Review No_1d58b0'), 
    'Reassignment Notification', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '709', true, FailureHandling.OPTIONAL)

//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
//    '<p style="">Hi :APPROVER,</p><p>This is a reassignment notification email.</p><p>A new survey has been assigned to you and requires your approval. Below are the details of the assigned survey:</p><p>Survey Name: :SURVEYNAME<br>Start Date: :STARTDATE<br>End Date: :ENDDATE<br>Company: :COMPANY<br>Role Group Name: :ROLEGROUPNAME<br>URL: :URL</p><p>Note - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATE</p><p>Please review the survey and take appropriate action.</p><p>Thank you for your attention to this matter. Best regards.</p>')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
    'Hi :APPROVER,This is a reassignment notification email.A new survey has been assigned to you and requires your approval. Below are the details of the assigned survey:Survey Name: :SURVEYNAMEStart Date: :STARTDATEEnd Date: :ENDDATECompany: :COMPANYRole Group Name: :ROLEGROUPNAMEURL: :URLNote - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATEPlease review the survey and take appropriate action.Thank you for your attention to this matter. Best regards.', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Please select one -After Review No_1d58b0'), 
    'Reminder Notification', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/select_- Select a template OR create a new _80e157'), 
    '713', true, FailureHandling.OPTIONAL)

//WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
//    '<p style="">Hi :APPROVER,</p><p>The Survey :SURVEYNAME is reminding you for your attention. Below are the Survey details -</p><p>Survey Name - :SURVEYNAME<br>Start Date - :STARTDATE<br>End Date - :ENDDATE<br>Company - :COMPANY<br>Role Group Name - :ROLEGROUPNAME<br>URL - :URL</p><p>Note - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATE</p>')

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/div_Redo_ck ck-content ck-editor__editable _b16a5a'), 
    'Hi :APPROVER,The Survey :SURVEYNAME is reminding you for your attention. Below are the Survey details -Survey Name - :SURVEYNAMEStart Date - :STARTDATEEnd Date - :ENDDATECompany - :COMPANYRole Group Name - :ROLEGROUPNAMEURL - :URLNote - The Survey automatically updates to :STATUSONSURVEYEXPIRY for open items in Surveys after :ENDDATE', FailureHandling.OPTIONAL)


WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Email Configuration/span_Settings'))

WebUI.setText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Settings/input_Settings_R307838823214507554_ig_toolb_058319'),
	'Enterprise Access Certification')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Settings/button_Go'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Settings/td_Interval to First Reminder'),
	10)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Settings/td_5'), '5')

WebUI.verifyElementPresent(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Settings/td_Interval Days Between Reminders'),
	10)

WebUI.verifyElementText(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Settings/td_3'), '3')

WebUI.enhancedClick(findTestObject('Object Repository/Anand_SFPSAutomation/EACM/Page_Settings/button_concat(Search for , , Enterprise Acc_57ba07'))
