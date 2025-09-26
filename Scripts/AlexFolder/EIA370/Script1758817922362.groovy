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
// Tras pulsar "Request Deactivate User" ya estás en Role Selection
import org.openqa.selenium.support.ui.Select as Select

WebUI.openBrowser('')

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'katalon_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Enterprise Access Certification_a-Tree_1e8bd7'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Analytics_a-TreeView-label'))

WebUI.waitForPageLoad(20)

WebUI.enableSmartWait()

TestObject ddl = findTestObject('Object Repository/ALEXOR/alex/Page_Manage My Access/select_Environment_P0_ENVIRONMENT')

WebUI.waitForElementPresent(ddl, 15)

WebUI.scrollToElement(ddl, 10)

WebUI.waitForElementClickable(ddl, 15)

WebUI.selectOptionByValue(ddl, '5888', false)

WebUI.verifyOptionSelectedByValue(ddl, '5888', false, 5)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage My Access/button_User Name_P114_USER_LIST_lov_btn'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage My Access/li_MARIAB11 - Maria11 Brum11_a-IconList-item'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage My Access/button_User Name_B162774244382928185'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage My Access/button_Request Deactivate User_B162775359869928197'))

TestObject leftList = findTestObject('Object Repository/ALEXOR/alex/Page_Role Selection/select_Role Group  Role_P5_ENTRY_REQUEST_LEFT')

TestObject moveRightBtn = findTestObject('Object Repository/ALEXOR/alex/Page_Role Selection/button_Role Group  Role_P5_ENTRY_REQUEST_MOVE')

TestObject rightList = findTestObject('Object Repository/ALEXOR/alex/Page_Role Selection/select_Role Group  Role_P5_ENTRY_REQUEST_RIGHT')

WebUI.waitForElementVisible(leftList, 15)

WebUI.scrollToElement(leftList, 10)

WebUI.waitForElementClickable(leftList, 10)

// --- Seleccionar la PRIMERA opción por ÍNDICE ---
WebUI.selectOptionByIndex(leftList, 0 // índice 0 = primera opción
    )

// Mover a la derecha con el botón ">"
WebUI.click(moveRightBtn)

WebUI.click(findTestObject('Page_Role Selection/button_Back_B160043427427310368'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Role Provision and Deprovision/button_Back_B161484147755320297'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Review Violations/button_Request Submitted. Please check afte_fe3187'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Review Violations/button_Step 4 of 4 - Violations Review_B162_df356c'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage My Access/button_Access Request Submitted. Please che_0dc3e5'))

WebUI.click(findTestObject('Page_Home/button_User Access Request Review Success_t_e28262'))

WebUI.click(findTestObject('Page_Manage My Access/button_Inbox_L188588310201480885'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage My Access/a_My Profile_menu_L188588310201480885_1i'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY'), 'kat')

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'jcarey')

WebUI.setEncryptedText(findTestObject('Page_Login/input_New_P101_PASSWORD'), '8ONjX3ggx5RmoBbvnoZOyw==')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn'))

WebUI.click(findTestObject('Page_Home/a'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Review Access Request/label_Action_u-radio'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Review Access Request/button_User Access Request Approval_B202484_77ab37'))

WebUI.click(findTestObject('Page_Home/button_User Access Request Review Success_t_e28262'))

