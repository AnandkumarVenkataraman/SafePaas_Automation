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

WebUI.click(findTestObject('Manage Approval Assignments/a_Manage Approval Assignments - Copy'))

WebUI.click(findTestObject('Object Repository/Manage Approval Assignments/select_Select any oneCloudERPEBizApp_JDBC_E_6b6150'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage Approval Assignments/select_Select any oneCloudERPEBizApp_JDBC_E_6b6150'), 
    'SailPoint_ENV2', false)

WebUI.delay(6)

'1st loop Table_Heading Verification loop'
for (def i = 1; i <= findTestData('1st table heading verification').getRowNumbers(); i++) {
    WebUI.verifyTextPresent(findTestData('1st table heading verification').getValue('table_heading', i), false)
}

WebUI.delay(3)

'verify 1stgrid data'
for (def a = 1; a <= findTestData('Details').getRowNumbers(); a++) {
    WebUI.click(findTestObject('Manage Approval Assignments/Search_bar'))

    WebUI.setText(findTestObject('Manage Approval Assignments/Search_bar'), findTestData('Details').getValue('Role', a))

    WebUI.delay(4)

    WebUI.click(findTestObject('Manage Approval Assignments/Go_Button'))

    WebUI.delay(4)

    WebUI.verifyTextPresent(findTestData('Details').getValue('Role Group', a), false)

    WebUI.verifyTextPresent(findTestData('Details').getValue('Description', a), false)

    WebUI.verifyTextPresent(findTestData('Details').getValue('Role', a), false)

    WebUI.verifyTextPresent(findTestData('Details').getValue('Primary owner', a), false)

    WebUI.verifyTextPresent(findTestData('Details').getValue('Secondary owner', a), false)

    '1st grid loop end here and it will click on details on 1st grid to open new option'
    WebUI.click(findTestObject('Object Repository/Manage Approval Assignments/a_IT-Roles_G1'))

    WebUI.delay(5)

    '2ndtable heading verification-'
    WebUI.verifyTextPresent('Role Group', false)

    '2ndtable heading verification-'
    WebUI.verifyTextPresent('Primary owner', false)

    '2ndtable heading verification-'
    WebUI.verifyTextPresent('Secondary owner', false)

    '2nd grid data in assign role group'
    for (def t = 1; t <= findTestData('Details').getRowNumbers(); t++) {
        WebUI.verifyTextPresent(findTestData('Assign Role Groups Owners').getValue('Role Group', t), false)

        WebUI.verifyTextPresent(findTestData('Assign Role Groups Owners').getValue('Primary owner', t), false)

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Manage Approval Assignments/span_Assign Role Owners'))

        'heading verification in assign role owner'
        WebUI.verifyTextPresent('Role Name', false)

        WebUI.verifyTextPresent('Primary Owner', false)

        WebUI.verifyTextPresent('Secondary Owner', false)

        WebUI.verifyTextPresent('Role Description', false)

        'third grid data verification'
        for (def th = 1; th <= findTestData('Assign Role Owners Tab').getRowNumbers(); th++) {
            WebUI.verifyTextPresent(findTestData('Assign Role Owners Tab').getValue('A', th), false)

            WebUI.verifyTextPresent(findTestData('Assign Role Owners Tab').getValue('B', th), false)

            WebUI.verifyTextPresent(findTestData('Assign Role Owners Tab').getValue('C', th), false)

            WebUI.verifyTextPresent(findTestData('Assign Role Owners Tab').getValue('D', th), false)
        }
    }
    
    WebUI.click(findTestObject('Manage Approval Assignments/a_Manage Approval Assignments - Copy'))

    WebUI.click(findTestObject('Manage Approval Assignments/X button'))
}

