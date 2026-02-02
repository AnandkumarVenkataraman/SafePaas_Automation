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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl('https://prod.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.click(findTestObject('Object Repository/Page_Home/span_MonitorPaaS_a-TreeView-toggle (9)'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_SFTP File Explorer'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/span_data (6)'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/span_katdataadm_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/span_sftp (3)'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/span_net (2)_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/span_processed (4)'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/span_error (27)_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/span_20251230_101524_local_EBSDB_11122025_S_150a38'))

WebUI.click(findTestObject('Object Repository/Page_File Explorer/a_Inbox'))

