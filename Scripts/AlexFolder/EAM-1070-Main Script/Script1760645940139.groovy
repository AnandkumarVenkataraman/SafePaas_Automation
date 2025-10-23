import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FH
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
import org.openqa.selenium.WebElement
import java.util.Arrays

int T = 20

def resolveCheckFromLabel = { WebElement lbl ->
  String js = '''
    var el = arguments[0];
    var id = el.getAttribute('for');
    var cb = null;
    if (id) cb = document.getElementById(id);
    if (!cb) cb = el.querySelector('input[type="checkbox"]');
    if (!cb) {
      var nxt = el.nextElementSibling;
      if (nxt && nxt.tagName === 'INPUT' && nxt.type === 'checkbox') cb = nxt;
    }
    if (!cb) return {found:false, id:null, checked:false};
    return {found:true, id: cb.id || null, checked: !!cb.checked};
  '''
  (Map) WebUI.executeJavaScript(js, Arrays.asList(lbl))
}

def ensureOnByLabel = { String labelObjPath ->
  def to = findTestObject(labelObjPath)
  WebUI.waitForElementVisible(to, T)
  WebElement lbl = WebUI.findWebElement(to, T)
  Map res = resolveCheckFromLabel(lbl)
  if (!res.found) { WebUI.enhancedClick(to); return }
  if (!res.checked) {
    WebUI.enhancedClick(to)
    if (res.id) {
      boolean nowOn = (Boolean) WebUI.executeJavaScript(
        'return !!document.getElementById(arguments[0])?.checked;', Arrays.asList(res.id))
      WebUI.verifyEqual(nowOn, true, FH.STOP_ON_FAILURE)
    }
  }
}

def ensureOffByLabel = { String labelObjPath ->
  def to = findTestObject(labelObjPath)
  WebUI.waitForElementVisible(to, T)
  WebElement lbl = WebUI.findWebElement(to, T)
  Map res = resolveCheckFromLabel(lbl)
  if (!res.found) { WebUI.enhancedClick(to); return }
  if (res.checked) {
    WebUI.enhancedClick(to)
    if (res.id) {
      boolean nowOff = (Boolean) WebUI.executeJavaScript(
        'return !!document.getElementById(arguments[0])?.checked;', Arrays.asList(res.id))
      WebUI.verifyEqual(nowOff, false, FH.STOP_ON_FAILURE)
    }
  }
}

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

// Login
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY'), 'KAT')
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATADMIN')
WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn'))

// Ir directo a Manage EAM Roles
WebUI.waitForPageLoad(T)
WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1180:25:9002208168838:::25::')
WebUI.waitForPageLoad(T)

// Buscar y abrir el rol
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field'), 'ktln')
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_ktln_apex-edit-page'))

// Primera comprobación (ON)
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Read only access_fa7825')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474'))

// Segunda comprobación (OFF)
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_EAM_apex-edit-page'))
ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a')
ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea')
ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c')
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474'))

// Ir directo a Manage Mitigations (deep link que pasaste)
WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1180:149:11187932713631:::149::&cs=341s45D1ac_z_5jWb7sKvfhestYb4bg-7zp5Go4DESLkux_ilhi2lcEiSQZBfFxvSqrydxwEHy2o3YwKB3L1gMg')
WebUI.waitForPageLoad(T)

// Form de Mitigation Control
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_CODE'), 'Test1070kat')
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_NAME'), 'test1070kat')
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/textarea_Description_P178_DESCRIPTION'), 'Test Automation')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/button_Cancel_B303288340752288580'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/span_Mitigation Details_t-Tabs-label'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Assigned Monitors_B303317908793999336'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Assign Monitors to Mitigation/input_Actions_select-all'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Assign Monitors to Mitigation/button_Assign Available Monitors_B306023348_33c9de'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/a_Inbox_t-Button t-Button--icon t-Button--h_469732'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/button_Inbox_L14205299837764170'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_My Profile_menu_L14205299837764170_1i'))

WebUI.closeBrowser()
