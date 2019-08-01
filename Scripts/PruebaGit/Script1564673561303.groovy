import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ayni.dev.interbank.per/')

WebUI.setText(findTestObject('Object Repository/Page_Interbank AyniBot/input_Iniciar Sesin_username'), 'T00002')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Interbank AyniBot/input_Usuario_password'), 'iJjxP/bsvFDeSZ5Z57jzAA==')

WebUI.click(findTestObject('Object Repository/Page_Interbank AyniBot/button_Ingresar'))

WebUI.rightClick(findTestObject('Object Repository/Page_Interbank AyniBot/p_Hola soy AyniBot Estoy lista para ayudarte y trabajar junts  Puedes hacerme una pregunta por el chat o elegir uno de estos temas'))

WebUI.closeBrowser()

