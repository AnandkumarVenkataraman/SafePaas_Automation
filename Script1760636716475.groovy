import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FH
import org.openqa.selenium.WebElement
import java.util.Arrays

// ======= Parámetros =======
String baseUrl = 'https://us21n.safepaas.com/monitor/f?p=1000:101::::::'
String company = 'kat'
String username = 'katadmin'
// <-- IMPORTANTE: contraseña CIFRADA válida (la tuya buena)
String encPwd  = 'Ioqy8emDrxi5mkiNQATzxQ=='
int T = 20

// ======= Helpers =======

// Click con espera + reintento
def safeClick = { String objPath, int timeout = T ->
    WebUI.waitForElementClickable(findTestObject(objPath), timeout)
    try { WebUI.enhancedClick(findTestObject(objPath)) }
    catch (Throwable e) { WebUI.delay(1); WebUI.click(findTestObject(objPath), FH.STOP_ON_FAILURE) }
}

// Click por JS a un elemento cuyo texto contenga "Manage EAM Roles"
def clickEamRolesByJS = {
    String js = '''
      var els = Array.from(document.querySelectorAll('a, span, div'));
      function visibleText(el){ var t=(el.innerText||'').trim(); return (t && el.offsetParent!==null)?t:''; }
      for (var el of els) {
        var t = visibleText(el).toLowerCase();
        if (t.includes('manage eam roles')) { el.click(); return true; }
      }
      return false;
    '''
    return (Boolean) WebUI.executeJavaScript(js, null)
}

// Verifica que estamos en Manage EAM Roles
def assertOnManageEamRoles = {
    WebUI.waitForElementVisible(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field'), T)
    WebUI.verifyElementPresent(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button'), T)
}

// Ir con certeza a Manage EAM Roles (después del login)
def goToManageEamRoles = {
    safeClick('Object Repository/ALEXOR/alex/Page_Home/span_Help_a-TreeView-toggle')
    safeClick('Object Repository/ALEXOR/alex/Page_Home/span_Access Monitor_a-TreeView-toggle')
    safeClick('Object Repository/ALEXOR/alex/Page_Home/span_Roles Manager_a-TreeView-toggle')
    boolean ok = true
    try {
        safeClick('Object Repository/ALEXOR/alex/Page_Home/a_Manage EAM Roles_a-TreeView-label')
    } catch (Throwable e) { ok = false }
    if (!ok) {
        boolean clicked = clickEamRolesByJS()
        if (!clicked) {
            WebUI.comment('No se encontró el link de Manage EAM Roles. Revisa el objeto del árbol.')
            WebUI.verifyEqual(true, false, FH.STOP_ON_FAILURE)
        }
    }
    assertOnManageEamRoles()
}

// Resuelve el checkbox asociado a un label y retorna mapa {found, id, checked}
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
    return (Map) WebUI.executeJavaScript(js, Arrays.asList(lbl))
}

// Asegura que un checkbox quede ON
def ensureOnByLabel = { String labelObjPath ->
    def to = findTestObject(labelObjPath)
    WebUI.waitForElementVisible(to, T)
    WebElement lbl = WebUI.findWebElement(to, T)
    Map res = resolveCheckFromLabel(lbl)
    if (!res.found) { safeClick(labelObjPath); return }
    if (!res.checked) {
        safeClick(labelObjPath)
        if (res.id) {
            boolean nowOn = (Boolean) WebUI.executeJavaScript(
                'return !!document.getElementById(arguments[0])?.checked;', Arrays.asList(res.id))
            WebUI.verifyEqual(nowOn, true, FH.STOP_ON_FAILURE)
        }
    }
}

// Asegura que un checkbox quede OFF
def ensureOffByLabel = { String labelObjPath ->
    def to = findTestObject(labelObjPath)
    WebUI.waitForElementVisible(to, T)
    WebElement lbl = WebUI.findWebElement(to, T)
    Map res = resolveCheckFromLabel(lbl)
    if (!res.found) { safeClick(labelObjPath); return }
    if (res.checked) {
        safeClick(labelObjPath)
        if (res.id) {
            boolean nowOff = (Boolean) WebUI.executeJavaScript(
                'return !!document.getElementById(arguments[0])?.checked;', Arrays.asList(res.id))
            WebUI.verifyEqual(nowOff, false, FH.STOP_ON_FAILURE)
        }
    }
}

try {
    WebUI.openBrowser('')
    WebUI.maximizeWindow()
    WebUI.navigateToUrl(baseUrl)
    WebUI.waitForPageLoad(T)

    // --- Login (con manejo claro de error de cifrado) ---
    WebUI.waitForElementVisible(findTestObject('Page_Login/input_Summer 2025_P101_COMPANY'), T)
    WebUI.setText(findTestObject('Page_Login/input_Summer 2025_P101_COMPANY'), company)
    WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), username)
    try {
        WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), encPwd)
    } catch (IllegalArgumentException e) {
        WebUI.comment('El password cifrado no es válido. Vuelve a **Encrypt Text** en Katalon y reemplaza encPwd.')
        throw e
    }
    safeClick('Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn')

    // --- Ir sí o sí a: MANAGE EAM ROLES ---
    goToManageEamRoles()

    // Buscar rol y editar
    WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/input_Create_R296130228590446614_search_field'), 'ktln')
    safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/button_Create_R296130228590446614_search_button')
    safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_ktln_apex-edit-page')

    // ========== DEFINIR SEGURIDAD (1ª sección) -> TODOS ON ==========
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758')
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a')
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490')
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Read only access_fa7825')
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea')
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c')
    safeClick('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474')

    // ========== DEFINIR SEGURIDAD (2ª sección)
    // Doble click en tu guión => ON ; Triple click => OFF ==========
    safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_EAM_apex-edit-page')

    // Deben quedar ON
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Read only a_af6758')
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Read only access to R_637490')
    ensureOnByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Read only access_fa7825')

    // Deben quedar OFF
    ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Create Assignments - Enables edit cap_27346c')
    ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Rules Reviews - Enables edit capabili_20abea')
    ensureOffByLabel('Object Repository/ALEXOR/alex/Page_Define Security/label_Manage Business Process - Enables edi_a0ef8a')

    safeClick('Object Repository/ALEXOR/alex/Page_Define Security/button_Security_B296312419684494474')

    // --- Remediation Plan / Mitigation Controls ---
    safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/a_Manage Remediation Plan_a-TreeView-label')
    safeClick('Object Repository/ALEXOR/alex/Page_Manage Mitigations/button_Mitigation Controls_B303188941954620028')

    WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_CODE'), 'Testeam1070')
    WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/input_(Value Required)_P178_NAME'), 'TestEam1070')
    WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/textarea_Description_P178_DESCRIPTION'), 'Kat Studio')

    safeClick('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/button_Cancel_B303288340752288580')
    safeClick('Object Repository/ALEXOR/alex/Page_Manage Mitigation Control/span_Mitigation Details_t-Tabs-label')

    // --- Asignación de Monitores ---
    safeClick('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Assigned Monitors_B303317908793999336')
    safeClick('Object Repository/ALEXOR/alex/Page_Assign Monitors to Mitigation/input_App Type Version_f01')
    safeClick('Object Repository/ALEXOR/alex/Page_Assign Monitors to Mitigation/input_Actions_select-all')
    safeClick('Object Repository/ALEXOR/alex/Page_Assign Monitors to Mitigation/button_Assign Available Monitors_B306023348_33c9de')

    // --- Breadcrumb / Inbox / Perfil ---
    safeClick('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/button_Breadcrumb_t-Button t-Button--noUI t_c90c1f')
    safeClick('Object Repository/ALEXOR/alex/Page_Mitigation Assigned Monitors/a_Inbox_t-Button t-Button--icon t-Button--h_469732')
    safeClick('Object Repository/ALEXOR/alex/Page_Home/button_Inbox_L14205299837764170')
    safeClick('Object Repository/ALEXOR/alex/Page_Home/a_My Profile_menu_L14205299837764170_1i')

} finally {
    WebUI.closeBrowser()
}
