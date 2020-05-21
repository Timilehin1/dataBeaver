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

WebUI.callTestCase(findTestCase('Login/Verify an admin can login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create_Admin/button_Add New'))

WebUI.click(findTestObject('Object Repository/Create_Admin/a_ User'))

WebUI.click(findTestObject('Object Repository/Create_Admin/svg_Create User_svg-inline--fa fa-times-cir_446c70'))

WebUI.click(findTestObject('Object Repository/Create_Admin/a_Admins'))

WebUI.click(findTestObject('Object Repository/Create_Admin/a_Invite Sent_btn btn-primary btn-sm mr-2'))

//WebUI.click(findTestObject('Object Repository/Create_Admin/path'))

//WebUI.click(findTestObject('Object Repository/Create_Admin/a_Invite Sent_btn btn-primary btn-sm mr-2'))

WebUI.setText(findTestObject('Object Repository/Create_Admin/input_First Name_fname'), 'Tega')

WebUI.setText(findTestObject('Object Repository/Create_Admin/input_Last Name_lname'), 'Ekakite')

WebUI.click(findTestObject('Object Repository/Create_Admin/input_Phone Number_phone'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create_Admin/select_Select Roletest_14Timis Role'), 'string:5ec5475b9c1c060552c2769e', 
    true)

WebUI.click(findTestObject('Object Repository/Create_Admin/button_Submit      Working'))

WebUI.verifyElementPresent(findTestObject('Create_Admin/div_Admin Successfully Updated'), 0)

WebUI.click(findTestObject('Object Repository/Create_Admin/button_Cancel'))

WebUI.closeBrowser()

