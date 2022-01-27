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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Gasta menos. Sonre ms/a_Hola, Identifcate  Cuenta y Listas'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Iniciar sesin/input_Direccin de correo electrnico o nmero_cfb2c0'), 
    'adonis_elflaco04@hotmail.com')

WebUI.click(findTestObject('Object Repository/Page_Amazon Iniciar sesin/input_Escriba su correo electrnico o su nme_4466f0'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Iniciar sesin/input_Olvidaste tu contrasea_password'), 
    'P3O4dNYapX+c1mhxBhAq8w==')

WebUI.click(findTestObject('Object Repository/Page_Amazon Iniciar sesin/input_Introduce tu contrasea_signInSubmit'))

WebUI.delay(5)

WebUI.closeBrowser()
