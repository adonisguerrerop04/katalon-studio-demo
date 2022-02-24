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

WebUI.navigateToUrl(GlobalVariable.urlClaroDealer)

//Validando el input del correo

WebUI.verifyElementPresent(findTestObject('Claro Login/Page_Tienda DAC/input_Correo_input'), 0)

WebUI.setText(findTestObject('Object Repository/Claro Login/Page_Tienda DAC/input_Correo_input'), GlobalVariable.emailClaroDealer)

//Validando el input de contraseña

WebUI.verifyElementPresent(findTestObject('Claro Login/Page_Tienda DAC/input_Contrasea_input'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Claro Login/Page_Tienda DAC/input_Contrasea_input'), GlobalVariable.passwordClaroDealer)

//Validando el boton de iniciar sesión

WebUI.verifyElementPresent(findTestObject('Claro Login/Page_Tienda DAC/button_Iniciar'), 0)

WebUI.verifyElementClickable(findTestObject('Claro Login/Page_Tienda DAC/button_Iniciar'))

WebUI.click(findTestObject('Object Repository/Claro Login/Page_Tienda DAC/button_Iniciar'))

WebUI.delay(5)

