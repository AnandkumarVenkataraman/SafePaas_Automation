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

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASKXGp21gWdfL93Jrss3V27iGaHDDLL8zYoChsSgS9JFtoTh94dm9Wkc5c68qDNzsiXWeFAUJpOVbA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1811896103%3A1706521853315031&theme=glif')

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/input_identifier (1) (1) (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/input_identifier (1) (1) (1)'), 
    'debabrata.patel@safepaas.com')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/span_Next - 01 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/span_Next - 01 (1) (1) (1)'))

WebUI.delay(7)

WebUI.verifyElementText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/input_Passwd (1) (1) (1)'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/input_Passwd (1) (1) (1)'), 
    '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/span_Next - 02 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/span_Next - 02 (1) (1) (1)'))

WebUI.delay(7)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Inbox (15) - debabrata.patelsafepaas.c_bbfb8c/button_No thanks'))

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Inbox (15) - debabrata.patelsafepaas.c_bbfb8c/button_No thanks'))

WebUI.verifyElementText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Inbox (15) - debabrata.patelsafepaas.c_bbfb8c/input_q (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Inbox (15) - debabrata.patelsafepaas.c_bbfb8c/input_q (1)'), 
    'Test3')

WebUI.sendKeys(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Inbox (15) - debabrata.patelsafepaas.c_bbfb8c/input_q (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Search results - debabrata.patelsafepa_a7d49a/span_noreplysafepaas.com (1) (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Action Required SOD Review Notificatio_49c23b/a_httpsus21n.safepaas.commonitorferm.survey_32e736 (2) (1)'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Action Required SOD Review Notificatio_49c23b/a_httpsus21n.safepaas.commonitorferm.survey_32e736 (2) (1)'))

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/input_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/input_P101_USERNAME (1) (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/input_P101_PASSWORD (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/button_Login (1) (1) (1)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASKXGp14Nbj8zC21jh4sNW9u_Yp0GHnyV14RVho_DAPCo_qwEQ7mUxBzdiE-sKAlNK7OWHiio9rWdA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-536801158%3A1706538269950512&theme=glif')

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/input_identifier (1) (1) (1)'), 
    'debabrata.patel@safepaas.com')

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/span_Next - 01 (1) (1) (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/input_Passwd (1) (1) (1)'), 
    '0zGlmfjtZXdd0J79v48Xbw==')

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Gmail/span_Next - 01 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Inbox (17) - debabrata.patelsafepaas.c_a03c71/button_No thanks (1)'))

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Inbox (17) - debabrata.patelsafepaas.c_a03c71/input_q (1)'), 
    'noreply')

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Search results - debabrata.patelsafepa_a7d49a/span_noreply (2)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Action Required SOD Review Notificatio_49c23b/a_httpsus21n.safepaas.commonitorferm.survey_32e736 (2) (1)'))

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Action Required SOD Review Notificatio_49c23b/a_httpsus21n.safepaas.commonitorferm.survey_32e736 (2) (1)'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/input_P101_COMPANY (1) (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/input_P101_USERNAME (1) (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/input_P101_PASSWORD (1) (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba3/Gmail_SODReviewEmailNotifications/Page_Login/button_Login (1) (1) (1)'))

WebUI.closeBrowser()

