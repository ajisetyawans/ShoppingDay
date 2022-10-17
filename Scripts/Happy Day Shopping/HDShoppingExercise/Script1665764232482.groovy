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

Mobile.startApplication('androidapp/HappyDayShopping.apk', true)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/SeacrhButton'), 0)

Mobile.setText(findTestObject('Happy Day Shopping Exercise/SearchField'), 'promo' + '\\n', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/ProductPromoMie'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/AddtoBagPromo'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/BackButtonPromo1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/PromoSebo'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/AddtoBagSebo'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/BackButtonPromo1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/BackButtonPromo2'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/FlashSaleButton'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/FS_ProductAnlene'), 0)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/AddtoBagAnlene'), 0)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/BackButtonPromo1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/FS_ProductEnergen'), 0)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/AddtoBagEnergen'), 0)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/YourBagButton'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/NextYourBagButton'), 0)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/ClearButton'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Happy Day Shopping Exercise/YesButton'), 0)

Mobile.verifyElementVisible(findTestObject('Happy Day Shopping Exercise/LastText'), 0)

Mobile.closeApplication()

