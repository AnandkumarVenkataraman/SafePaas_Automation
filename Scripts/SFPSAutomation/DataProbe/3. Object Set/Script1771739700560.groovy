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

//Object Set
WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Objects/a_Manage Object Set (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Object Set/input_Create_R137674426230792379_search_field (1)'), 
    'EBizApp_JDBC_ObjSet')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_Go (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/a_EBizApp_JDBC_ObjSet'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_AddEdit Objectset/button_Cancel (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Object Set/button_concat(Row text contains , , EBizApp_af7ab9'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('SFPSAutomation/DataProbe/4. Manage Snapshot'), [:])

