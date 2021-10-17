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

WebUI.navigateToUrl('https://www.cermati.com/gabung')

WebUI.setText(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__email'), 
    'hotnimsimatupang@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__password'), 
    'B79Os2S2TLkwDpd00VfNLAgmA7zh5Z82')

WebUI.setEncryptedText(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__confirmPassword'), 
    'B79Os2S2TLkwDpd00VfNLAgmA7zh5Z82')

WebUI.setText(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__firstName'), 
    'Hotni')

WebUI.setText(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__lastName'), 
    'Simatupang')

WebUI.setText(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__mobilePhone'), 
    '082365967050')

WebUI.setText(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__residenceCity'), 
    'Humba')

WebUI.click(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_KABUPATEN HUMBANG HASUNDUTAN'))

WebUI.click(findTestObject('Object Repository/TestCase1_Register/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/button_Daftar Akun'))

