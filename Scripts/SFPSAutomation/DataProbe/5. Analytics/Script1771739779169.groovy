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

//Analytics
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Help_a-TreeView-toggle (2)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Access Monitor_a-TreeView-toggle (2)'))

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Dashboard_a-TreeView-toggle')) //Prod.
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Dashboard_a-TreeView-toggle') //IQA
    )

WebUI.delay(2)

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Violation Report_a-TreeView-toggle')) //Prod.
WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/span_Violation Report_a-TreeView-toggle') //IQA
    )

WebUI.enhancedClick(findTestObject('Object Repository/Page_Home/a_Application Access Report_a-TreeView-label'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_User Listing/select_Environment_P0_ENVIRONMENT'), 'EBizApp_JDBC_Env', 
    false)

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Listing/a_User Listing and access_a-TreeView-label'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Entry Access Listing/a_User Entry Access Listing_a-TreeView-label'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_User Entry Attribute Access Listing/a_User Entry Attribute Access Listing_a-Tre_258751'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 'Responsibility', 
    false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 'Menu', 
    false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 'Function', 
    false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 'Grant', 
    false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 'Concurrent Program', 
    false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 'Role', 
    false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Entry Listing/select_Entry Type_P76_ENTRY_TYPE'), 'Request Group', 
    false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Listing/a_Entry Listing_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'), 
    FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'), 
    FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/button_Entry Type_a-Button a-IRR-button a-B_36387a'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Entry Attributes/a_Entry Attributes_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/button_Access Type_P13_RESPONSIBILITY_lov_btn'))

WebUI.setText(findTestObject('Object Repository/Page_Access Hierarchy/input_Search_a-PopupLOV-search apex-item-text'), 'General Ledger Super User')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/button_Search_a-Button a-PopupLOV-doSearch'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/li_Select List 20 rows. Use arrow keys_a-Ic_89dcca'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/button_Access Type_P13_GO'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/span_SOD Review Survey_a-TreeView-toggle'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Access Hierarchy/a_Define Scope_a-TreeView-label'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Rules/button_Export Rules_B237699209801060311'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Filter False-Positives/label_Report Settings_a-IRR-controlsCheckboxLabel'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Filter False-Positives/label_Report Settings_a-IRR-controlsCheckboxLabel'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Filter False-Positives/button_Submit_B245973424258406093'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Manage Rules/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))

WebUI.callTestCase(findTestCase('SFPSAutomation/DataProbe/6. Synchronization'), [:])

