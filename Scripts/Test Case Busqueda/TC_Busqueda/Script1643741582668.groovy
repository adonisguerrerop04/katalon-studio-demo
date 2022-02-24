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

for (int i = 1; i <= findTestData("Data Files/DataBusquedaAmazon").rowNumbers; i++) {
	
	//Validando input barra de busqueda
	WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Busqueda/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_field-keywords'), 0)
	
	WebUI.setText(findTestObject('Object Repository/Amazon Busqueda/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_field-keywords'), findTestData("Data Files/DataBusquedaAmazon").getValue(1, i))
	
	//Validando el boton buscar
	WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Busqueda/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_nav-search-submit-button'), 0)
	
	WebUI.verifyElementClickable(findTestObject('Object Repository/Amazon Busqueda/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_nav-search-submit-button'))
	
	WebUI.click(findTestObject('Object Repository/Amazon Busqueda/Page_Amazon.com. Gasta menos. Sonre ms/input_Todos_nav-search-submit-button'))
	
	WebUI.delay(7)
	
}

WebUI.closeBrowser()
