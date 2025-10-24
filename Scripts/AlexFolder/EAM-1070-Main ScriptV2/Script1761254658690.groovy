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
WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Summer 2025_P101_COMPANY (13)'), 'kat')
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME (13)'), 'katadmin')
WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD (14)'), 'Ioqy8emDrxi5mkiNQATzxQ==')
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn (13)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle (9)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Access Monitor_a-TreeView-toggle (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/span_Roles Manager_a-TreeView-toggle (5)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_Manage Remediation Plan_a-TreeView-label (5)'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field (2)'), 'ktl')
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button (2)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_ktl_apex-edit-page'))

ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758 (3)')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490 (3)')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Read only access_fa7825 (3)')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (3)')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (3)')
ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (3)')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474 (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_EAM_apex-edit-page (3)'))

ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a (3)')
ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea (3)')
ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c (3)')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474 (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/a_Manage Remediation Plan_a-TreeView-label (1)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigations/button_Mitigation Controls_B303188941954620028 (1)'))

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_CODE (1)'), 'Testqakat')
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/div_Create_t-Form-labelContainer col col-2'))
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_CODE (1)'), 'TESTQAKAT')
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_CODE (1)'))
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_NAME (1)'), 'Testqakat')
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/textarea_Description_P178_DESCRIPTION (1)'), 'Testqakat')

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/button_Cancel_B303288340752288580 (1)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/span_Mitigation Details_t-Tabs-label (3)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Assigned Monitors_B303317908793999336 (1)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Assign Monitors to Mitigation/input_Actions_select-all (1)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Assign Monitors to Mitigation/button_Assign Available Monitors_B306023348_33c9de (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f (2)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/a_Inbox_t-Button t-Button--icon t-Button--h_469732 (1)'))

WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/button_Inbox_L14205299837764170 (19)'))
WebUI.click(findTestObject('Object Repository/ALEXOR/alex/Page_Home/a_My Profile_menu_L14205299837764170_1i (20)'))

WebUI.closeBrowser()
