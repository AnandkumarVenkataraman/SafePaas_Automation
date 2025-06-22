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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Spring 2025_P101_COMPANY (2)'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (2)'), 'KATADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_New_P101_PASSWORD (2)'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/button_Login (2)'))

//Verifying the MTP Setups for -> Company Settings, Env.
//Datasource synchronization, MTP Object details & object items, and Objectset

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_DataPaaS_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Administration_a-TreeView-toggle (3)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Company (2)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Company/div_MonitorPaaS'), 25)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Company/a_Manage Environment'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Environment/input_Create_R258165063082313757_search_field (1)'), 
    'KTLNEBS_MonitorPaaS')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_Go (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_KTLNEBS_MonitorPaaS'), 'KTLNEBS_MonitorPaaS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Environment/td_A (1)'), 'A')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/button_concat(Row text contains , , KTLNEBS_78bb73'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Environment/a_Inbox (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_SFTP File Explorer_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Manage Data Source'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Manage Data Source/select_- Select an Environment -Coupa_Env1E_bcbb9d'), 
    9)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Data Source/a_Completed'), 'Completed')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Data Source/a_Manage Object'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Objects/input_Objects Report_R122864292076293001_se_c86a1e'), 
    'AR Approval Limits')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_AR Approval Limits'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Object Details/div_MonitorPaaS'), 'MonitorPaaS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Object Details/label_JDBC'), 'JDBC')

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AMOUNT_FROM'), 'AMOUNT_FROM')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AMOUNT_TO'), 'AMOUNT_TO')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_REASON_CODE'), 'REASON_CODE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_CURRENCY_CODE'), 'CURRENCY_CODE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_LAST_UPDATE_DATE'), 'LAST_UPDATE_DATE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_CREATION_DATE'), 'CREATION_DATE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_LAST_UPDATED_BY'), 'LAST_UPDATED_BY')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

//WebUI.rightClick(findTestObject('Object Repository/Page_Add Object Items/label'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_CREATED_BY'), 'CREATED_BY')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_USER_ID'), 'USER_ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_DOCUMENT_TYPE'), 'DOCUMENT_TYPE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_AR.AR_APPROVAL_USER_LIMITS (TABLE)'), 
    'AR.AR_APPROVAL_USER_LIMITS (TABLE)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Add Object Items/label'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Object Items/td_PRIMARY_FLAG'), 'PRIMARY_FLAG')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Add Object Items/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Object Details/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/button_concat(Row text contains , , AR Appr_08c992'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_Manage Object Set'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Object Set/input_Create_R137674426230792379_search_field'), 
    'AccountsPayable')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_Go'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_AccountsPayable'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Objectset/span_EBS R12.2'), 'EBS R12.2')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AddEdit Objectset/div_MonitorPaaS'), 25)

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddEdit Objectset/option_AR Approval Limits'), 'AR Approval Limits')

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Objectset/button_Cancel'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_concat(Row text contains , , Account_12e1bf'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_Inbox'))

