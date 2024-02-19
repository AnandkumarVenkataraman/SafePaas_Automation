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

WebUI.navigateToUrl('https://uat.safepaas.com/monitor/f?p=1000:101:::::')

WebUI.setText(findTestObject('Object Repository/Scope Roles/input_Spring 2023_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/Scope Roles/input_OR CONTINUE WITH_P101_USERNAME'), 'KTLN_EACM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/Scope Roles/input_New_P101_PASSWORD'), '03lOr3vXk3RRBmreyIGpTg==')

WebUI.click(findTestObject('Object Repository/Scope Roles/button_Login'))

WebUI.click(findTestObject('Manage Approval Assignments/span_Help_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('Manage Approval Assignments/span_Enterprise Access Monitor_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('Manage Approval Assignments/span_Access Certification_a-TreeView-toggle - Copy'))

WebUI.click(findTestObject('Scope Roles/a_Scope Roles - Copy'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Scope Roles/select_Select any oneCloudERPEBizApp_JDBC_E_6b6150'), 
    'SailPoint_ENV2', false)

WebUI.delay(6)

'1st loop Table_Heading Verification loop'
for (def h = 1; h <= findTestData('Scope Roles Heading').getRowNumbers(); h++) {
    WebUI.verifyTextPresent(findTestData('Scope Roles Heading').getValue('table_heading', h), false)
}

WebUI.delay(3)

'loop for 1st grid data'
for (def i = 1; i <= findTestData('Scope Roles - Main Grid').getRowNumbers(); i++) {
    WebUI.click(findTestObject('Search bar 2'))

    WebUI.setText(findTestObject('Search bar 2'), findTestData('Scope Roles - Main Grid').getValue('Role Group name', i))

    WebUI.click(findTestObject('Go Button 2'))

    WebUI.verifyTextPresent(findTestData('Scope Roles - Main Grid').getValue('Role Group name', i), false)

    WebUI.verifyTextPresent(findTestData('Scope Roles - Main Grid').getValue('Description', i), false)

    WebUI.verifyTextPresent(findTestData('Scope Roles - Main Grid').getValue('Created by', i), false)

    WebUI.verifyTextPresent(findTestData('Scope Roles - Main Grid').getValue('Last updated by', i), false)

    '1st grid loop end here and it will click on details on 1st grid to open new option'
    WebUI.click(findTestObject('Scope Roles/a_IT-Roles_G1'))

    WebUI.delay(5)

    '2ndtable heading verification-'
    WebUI.verifyTextPresent('Role Name', false)

    '2ndtable heading verification-'
    WebUI.verifyTextPresent('Role Description', false)

    '2ndtable heading verification-'
    WebUI.verifyTextPresent('Created By', false)

    'verify 2nd grid data'
    for (def a = 1; a <= findTestData('Details G1').getRowNumbers(); a++) {
        WebUI.delay(4)

        WebUI.verifyTextPresent(findTestData('Details G1').getValue('Role Name', a), false, FailureHandling.OPTIONAL)

        WebUI.verifyTextPresent(findTestData('Details G1').getValue('Role Description', a), false, FailureHandling.OPTIONAL)

        WebUI.verifyTextPresent(findTestData('Details G1').getValue('Created By', a), false, FailureHandling.OPTIONAL)

        WebUI.delay(5)

        WebUI.click(findTestObject('Scope Roles/span_Assign Access Group'))

        WebUI.verifyTextPresent('Role name', false)

        WebUI.verifyTextPresent('Role Description', false)

        WebUI.verifyTextPresent('Access group', false)

        'verify 3st grid data'
        for (def b = 1; b <= findTestData('Assign Access Groups IT-Roles_G1').getRowNumbers(); b++) {
            WebUI.verifyTextPresent(findTestData('Assign Access Groups IT-Roles_G1').getValue('Role name', b), false)

            WebUI.verifyTextPresent(findTestData('Assign Access Groups IT-Roles_G1').getValue('Role Description', b), false)

            WebUI.verifyTextPresent(findTestData('Assign Access Groups IT-Roles_G1').getValue('Access group', b), false, 
                FailureHandling.OPTIONAL)

            WebUI.delay(5)

            WebUI.click(findTestObject('Scope Roles/span_Assign Risk Level'))

            WebUI.verifyTextPresent('Role Name', false)

            WebUI.verifyTextPresent('Role Description', false)

            WebUI.verifyTextPresent('Risk Level', false)

            'verify 4th grid data'
            for (def c = 1; c <= findTestData('Assign Risk Level IT-Roles_G1').getRowNumbers(); c++) {
                WebUI.verifyTextPresent(findTestData('Assign Risk Level IT-Roles_G1').getValue('Role Name', c), false)

                WebUI.verifyTextPresent(findTestData('Assign Risk Level IT-Roles_G1').getValue('Role Description', c), false)

                WebUI.verifyTextPresent(findTestData('Assign Risk Level IT-Roles_G1').getValue('Risk Level', c), false)
            }
        }
    }
    
    WebUI.click(findTestObject('Object Repository/Scope Roles/a_Scope Roles - Copy'))

    WebUI.click(findTestObject('Scope Roles/Button X Scope Roles'))
}

