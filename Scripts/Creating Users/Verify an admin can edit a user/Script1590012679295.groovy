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

WebUI.click(findTestObject('Object Repository/Creating_user/button_Add New'))

WebUI.click(findTestObject('Object Repository/Creating_user/a_ User'))

WebUI.click(findTestObject('Object Repository/Creating_user/button_Cancel'))

WebUI.click(findTestObject('Creating_user/path'))

WebUI.setText(findTestObject('Object Repository/Creating_user/input_First Name_fname'), 'Olayiwunola')

WebUI.setText(findTestObject('Object Repository/Creating_user/input_Last Name_lname'), 'Jimoh')

WebUI.setText(findTestObject('Object Repository/Creating_user/textarea_Address_address'), 'Nil')

WebUI.setText(findTestObject('Object Repository/Creating_user/input_BVN_bvn'), '090909900999')

WebUI.click(findTestObject('Object Repository/Creating_user/input_Date of Birth_dob'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Creating_user/select_Select GenderMaleFemale'), 'string:male', 
    true)

WebUI.click(findTestObject('Object Repository/Creating_user/button_Submit      Working'))

WebUI.click(findTestObject('Object Repository/Creating_user/input_Date of Birth_dob'))

WebUI.click(findTestObject('Object Repository/Creating_user/td_Nov'))

WebUI.click(findTestObject('Object Repository/Creating_user/td_5'))

WebUI.click(findTestObject('Object Repository/Creating_user/button_Submit      Working'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Creating_user/div_Record Successfully Updated'), 3)

WebUI.click(findTestObject('Object Repository/Creating_user/button_Cancel'))

WebUI.closeBrowser()

