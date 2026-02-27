import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FH
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import internal.GlobalVariable as GV
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import java.util.Arrays as Arrays

int T = 25

def waitGoneProcessing = {
	TestObject overlays = new TestObject('apexOverlays')
	overlays.addProperty('css', ConditionType.EQUALS,
		'.u-Processing,.a-Processing,.apex_wait_overlay,.ui-widget-overlay,.t-Dialog.js-modal,.js-busy')
	WebUI.waitForElementNotVisible(overlays, 25, FH.OPTIONAL)
	WebUI.delay(0.25)
}

def safeClick = { String path ->
	TestObject to = findTestObject(path)
	WebUI.waitForElementPresent(to, T)
	WebUI.waitForElementVisible(to, T, FH.OPTIONAL)
	WebUI.scrollToElement(to, T, FH.OPTIONAL)
	try {
		WebUI.enhancedClick(to)
	} catch (Throwable e) {
		WebElement el = WebUI.findWebElement(to, T)
		WebUI.executeJavaScript("arguments[0].scrollIntoView({block:'center'});", Arrays.asList(el))
		WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(el))
	}
}

def setCheckboxState = { String inputObjPath, boolean desired ->
	TestObject to = findTestObject(inputObjPath)
	WebUI.waitForElementPresent(to, T)
	WebUI.waitForElementVisible(to, T, FH.OPTIONAL)
	WebUI.scrollToElement(to, T, FH.OPTIONAL)
	WebElement el = WebUI.findWebElement(to, T)
	boolean current = (Boolean) WebUI.executeJavaScript("return !!arguments[0].checked;", Arrays.asList(el))
	if (current == desired) return
	try {
		WebUI.enhancedClick(to)
	} catch (Throwable ignore) {
		WebUI.executeJavaScript("""
			var cb = arguments[0];
			cb.checked = ${desired ? 'true' : 'false'};
			cb.dispatchEvent(new Event('input', {bubbles:true}));
			cb.dispatchEvent(new Event('change', {bubbles:true}));
		""", Arrays.asList(el))
	}
	boolean after = (Boolean) WebUI.executeJavaScript("return !!arguments[0].checked;", Arrays.asList(el))
	WebUI.verifyEqual(after, desired, FH.STOP_ON_FAILURE)
}

def assertCheckboxState = { String inputObjPath, boolean expected ->
	TestObject to = findTestObject(inputObjPath)
	WebUI.waitForElementPresent(to, T)
	WebUI.waitForElementVisible(to, T, FH.OPTIONAL)
	WebElement el = WebUI.findWebElement(to, T)
	boolean state = (Boolean) WebUI.executeJavaScript("return !!arguments[0].checked;", Arrays.asList(el))
	WebUI.verifyEqual(state, expected, FH.STOP_ON_FAILURE)
}

String CB_READ  = 'Object Repository/ALEXOR/alex/Page_Define Security/input_Function Read Access_P26_FUNCTION_REA_5d7da0'
String CB_WRITE = 'Object Repository/ALEXOR/alex/Page_Define Security/input_Function Write Access_P26_FUNCTION_WR_e60222'

String URL_LOGIN  = (GV.hasProperty('URL') && GV.URL) ? GV.URL : 'https://us21n.safepaas.com/monitor/f?p=1000:101::::::'
String URL_ROLES  = (GV.hasProperty('URL_EAM_MANAGE_ROLES') && GV.URL_EAM_MANAGE_ROLES) ? GV.URL_EAM_MANAGE_ROLES : 'https://us21n.safepaas.com/monitor/f?p=1180:25:0:::25::'
String URL_FFP    = (GV.hasProperty('URL_EAM_FILTER_FALSE_POSITIVE') && GV.URL_EAM_FILTER_FALSE_POSITIVE) ? GV.URL_EAM_FILTER_FALSE_POSITIVE : 'https://us21n.safepaas.com/monitor/f?p=1180:210:0:::210::'

String COMPANY = (GV.hasProperty('COMPANY') && GV.COMPANY) ? GV.COMPANY : ((GV.hasProperty('COMPANY_NAME') && GV.COMPANY_NAME) ? GV.COMPANY_NAME : 'KAT')
String USER    = (GV.hasProperty('USERNAME') && GV.USERNAME) ? GV.USERNAME : ((GV.hasProperty('USER_ID') && GV.USER_ID) ? GV.USER_ID : 'KATADMIN')
String PWDENC  = (GV.hasProperty('PASSWORD') && GV.PASSWORD) ? GV.PASSWORD : ((GV.hasProperty('PWD') && GV.PWD) ? GV.PWD : 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.openBrowser('')
WebUI.navigateToUrl(URL_LOGIN)
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_Winter 2026_P101_COMPANY'), COMPANY)
WebUI.setText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), USER)
WebUI.setEncryptedText(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), PWDENC)

boolean clicked = false
for (String p : [
	'Object Repository/ALEXOR/alex/Page_Login/button_Login',
	'Object Repository/ALEXOR/alex/Page_Login/button_Reset Password_loginBtn (13)',
	'Object Repository/ALEXOR/button_Login',
	'Object Repository/ALEXOR/button_Sign In'
]) {
	try { safeClick(p); clicked = true; break } catch (Throwable ignore) {}
}
if (!clicked) {
	try { WebUI.sendKeys(findTestObject('Object Repository/ALEXOR/alex/Page_Login/input_New_P101_PASSWORD'), Keys.chord(Keys.ENTER)) } catch (Throwable ignore) {}
}
waitGoneProcessing()

WebUI.navigateToUrl(URL_ROLES)
waitGoneProcessing()
safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_Actions_apex-edit-page')
waitGoneProcessing()

safeClick('Object Repository/ALEXOR/alex/Page_Define Security/label_Filter False Positive Reports - View _6739e8')
setCheckboxState(CB_READ, true)
setCheckboxState(CB_WRITE, false)
assertCheckboxState(CB_READ, true)
assertCheckboxState(CB_WRITE, false)
safeClick('Object Repository/ALEXOR/alex/Page_Define Security/button_Update')
waitGoneProcessing()

WebUI.navigateToUrl(URL_FFP)
waitGoneProcessing()

WebUI.selectOptionByValue(findTestObject('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/select_Select any oneCoupa_Env1EBizApp_JDBC_743da1'), '5888', true)
waitGoneProcessing()

safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_General - Entries')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_General - Users')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/a_Advanced Logic')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/a_Path Exclusion')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/a_General - Attributes')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_General - Entries')

WebUI.navigateToUrl(URL_ROLES)
waitGoneProcessing()
safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_Actions_apex-edit-page')
waitGoneProcessing()

safeClick('Object Repository/ALEXOR/alex/Page_Define Security/label_Filter False Positive Reports - Able _dc1d0f')
setCheckboxState(CB_READ, true)
setCheckboxState(CB_WRITE, true)
assertCheckboxState(CB_READ, true)
assertCheckboxState(CB_WRITE, true)
safeClick('Object Repository/ALEXOR/alex/Page_Define Security/button_Update')
waitGoneProcessing()

WebUI.navigateToUrl(URL_FFP)
waitGoneProcessing()

safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/a_General - Users')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_Advanced Logic')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_General - Attributes')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_Advanced Logic')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/button_Schedule Download')
waitGoneProcessing()

safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_DataPaaS_a-TreeView-toggle')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/span_Company Settings_a-TreeView-toggle')
safeClick('Object Repository/ALEXOR/alex/Page_Filter False Positive Definition Report/a_Scheduled Downloads')
waitGoneProcessing()

safeClick('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/i_KATADMIN_fa fa-download')
safeClick('Object Repository/ALEXOR/alex/Page_Scheduled Downloads/button_OK')
waitGoneProcessing()

WebUI.navigateToUrl(URL_ROLES)
waitGoneProcessing()
safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_Actions_apex-edit-page')
waitGoneProcessing()

setCheckboxState(CB_READ, false)
setCheckboxState(CB_WRITE, false)
assertCheckboxState(CB_READ, false)
assertCheckboxState(CB_WRITE, false)
safeClick('Object Repository/ALEXOR/alex/Page_Define Security/button_Update')
waitGoneProcessing()

safeClick('Object Repository/ALEXOR/alex/Page_Manage EAM Roles/img_Inbox_AppLogoIco')
waitGoneProcessing()
safeClick('Object Repository/ALEXOR/alex/Page_Dashboard/button_katadmin')
safeClick('Object Repository/ALEXOR/alex/Page_Dashboard/a_Logout')

WebUI.closeBrowser()