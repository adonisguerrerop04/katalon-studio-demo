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

WebUI.callTestCase(findTestCase('Claro Dealer/TC_LoginClaroDealer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

//Validando input buscador

WebUI.verifyElementPresent(findTestObject('Claro Busqueda/Page_Tienda DAC/input_Gift Cards_input'), 0)

WebUI.setText(findTestObject('Claro Busqueda/Page_Tienda DAC/input_Gift Cards_input'), 'apple')

//Validando boton buscador

WebUI.verifyElementPresent(findTestObject('Claro Busqueda/Page_Tienda DAC/button_Gift Cards_button search-button'), 0)

WebUI.verifyElementClickable(findTestObject('Claro Busqueda/Page_Tienda DAC/button_Gift Cards_button search-button'))

WebUI.click(findTestObject('Claro Busqueda/Page_Tienda DAC/button_Gift Cards_button search-button'))

