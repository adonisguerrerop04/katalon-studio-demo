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

WebUI.callTestCase(findTestCase('Test Case Login/Test5'), [('url') : 'https://www.amazon.com/', ('username') : 'adonis_elflaco04@hotmail.com'
        , ('password') : 'P3O4dNYapX+c1mhxBhAq8w=='], FailureHandling.STOP_ON_FAILURE)

//Validando input texto buscador
WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_field-keywords'), 
    0)

WebUI.setText(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_field-keywords'), 
    'mouse')

//Validando boton buscar
WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_nav-search-submit-button'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_nav-search-submit-button'))

//Validando enlace de mouse
WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com  mouse/span_Uiosmuph G12 - Ratn inalmbrico silenci_3da02e'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com  mouse/span_Uiosmuph G12 - Ratn inalmbrico silenci_3da02e'))

WebUI.click(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com  mouse/span_Uiosmuph G12 - Ratn inalmbrico silenci_3da02e'))

//Validando boton agregar al carrito
WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com Uiosmuph G12 - Ratn inalmbr_47194b/input_Desglose inicial del pago_submit.add-to-cart'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com Uiosmuph G12 - Ratn inalmbr_47194b/input_Desglose inicial del pago_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/Amazon Compra/Page_Amazon.com Uiosmuph G12 - Ratn inalmbr_47194b/input_Desglose inicial del pago_submit.add-to-cart'))

//Validando boton proceder al pago
WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Compra/Page_Carrito de compras de amazon.com/input_US12.98_proceedToRetailCheckout'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Amazon Compra/Page_Carrito de compras de amazon.com/input_US12.98_proceedToRetailCheckout'))

WebUI.click(findTestObject('Object Repository/Amazon Compra/Page_Carrito de compras de amazon.com/input_US12.98_proceedToRetailCheckout'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Amazon Compra/Page_Amazon Iniciar sesin/input_Olvidaste tu contrasea_password'), 
    'P3O4dNYapX+c1mhxBhAq8w==')

not_run: WebUI.click(findTestObject('Object Repository/Amazon Compra/Page_Amazon Iniciar sesin/input_Introduce tu contrasea_signInSubmit'))

//Validando boton agregar metodo de pago
WebUI.verifyElementPresent(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Amazon acepta las principales tarjeta_387d7f'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Amazon acepta las principales tarjeta_387d7f'))

WebUI.click(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Amazon acepta las principales tarjeta_387d7f'))

//Validando input número de tarjeta
WebUI.verifyElementPresent(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Nmero de tarjeta_addCreditCardNumber'), 
    0)

WebUI.setText(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Nmero de tarjeta_addCreditCardNumber'), 
    '1234 5678 9012 3456')

WebUI.setText(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Nombre en la tarjeta_ppw-accountHolderName'), 
    'Adonis Guerrero Peralta')

WebUI.click(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/span_01'))

WebUI.click(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/a_12'))

WebUI.click(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Cancelar_ppw-widgetEventAddCreditCardEvent'))

WebUI.click(findTestObject('Object Repository/Tarjeta Amazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/div_Se ha producido un problema.El nmero de_817415'))

