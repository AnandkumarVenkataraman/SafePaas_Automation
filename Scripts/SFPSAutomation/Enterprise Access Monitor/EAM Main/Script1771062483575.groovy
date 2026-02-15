import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/1. EAM Setups'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/2. EAM Templates'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/3. Manage Rules'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/4. SOD Test'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/5. Manage Violations'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/6. Analytics - Violation Reports'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/7. Analytics - Application Test Env. Reports'), 
    [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/8. Dashboard'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/9. Exceptions Responsibility'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/10_Exceptions Functions'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/11. MassUpdateException UsersWithConflict'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/12. MassUpdateException RolesWiithConflict'), 
    [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/13. Remediations AllUsersViolation'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/14. Remediations Selected'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/15. Remediations AllUsersRolesViolations'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/16. Remediations SODTest'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/17. Mindmaps for Violation Reports'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/18. CrossApp_SOD'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/19. EnterpriseRolesManager(ERM)'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/28. SAP Setups'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/29. SAP Rules - AND and OR Conditions'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/30. SAP Rules - Auth Field Values'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/31. SAP Rules - with STAR Values'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/32. SAP - SOD Test and Manage Violations'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/33. SAP - Analytics'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/34. SAP - Restricted Access'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/35. Mitigations - Main'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/36. Mitigations - Reverse'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/37. RestrictedAccess'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/38. FilterFalse-Positives'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/40. Scheduler'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/41. Security'), [:])

WebUI.callTestCase(findTestCase('SFPSAutomation/Enterprise Access Monitor/42. Back-up and Restore'), [:])
