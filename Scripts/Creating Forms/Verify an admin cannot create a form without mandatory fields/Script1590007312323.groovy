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

WebUI.callTestCase(findTestCase('Login/Verify an admin can login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Form_OR/Form Object Repo/button_Add New'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/a_ Form'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/span_Section 1'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/a_Static Text'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/a_Single-line Text'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/path_1_2'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/a_Numeric'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/a_Formatted Numeric'))

WebUI.click(findTestObject('Form_OR/Form Object Repo/button_Save'))

WebUI.verifyElementPresent(findTestObject('Form_OR/Form Object Repo/p_Please enter a title for the form'), 0)

WebUI.closeBrowser()

