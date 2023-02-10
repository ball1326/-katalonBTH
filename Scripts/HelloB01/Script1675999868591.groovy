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

WebUI.navigateToUrl('https://nxtgenaiacademy.com/demo-site/')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-5'), 'อธิชา')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-7'), 'พรมบุตร')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Address_vfb-13address'), 
    'สมุทรสาคร')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Street Address_vfb-13address-2'), 
    '-')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Apt, Suite, Bldg. (optional)_vfb-13city'), 
    '-')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_City_vfb-13state'), 
    '-')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_State  Province  Region_vfb-13zip'), 
    'สมุทรสาคร')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-14'), 'aticha13264@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Date of Demo_vfb-18'), 
    '02/10/2023')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Mobile Number_vfb-19'), 
    '0642411826')

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Gender_vfb-31'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Course Interested_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Selenium WebDriver_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_UFT_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_TestNG_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Core Java_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Functional Testing_vfb-20'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/textarea_Enter your query_vfb-23'), 
    'Hello ')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-3'), '99')

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_This box is for spam protection - str_2dcb9b'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

