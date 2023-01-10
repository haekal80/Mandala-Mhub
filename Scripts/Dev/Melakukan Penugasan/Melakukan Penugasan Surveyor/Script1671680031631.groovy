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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.ui.Console
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//int tr = 30;  //Atas ke bawah (Jam Penugasan). Minimal 1, Maksimal 37
//int td = 5;  //Kiri ke kanan (Tanggal Penugasan). Minimal 2, Maksimal 8

Date d=new Date()

int day = d.getDay()

KeywordUtil.logInfo('Ini adalah hari nya 1: ' +day)
switch (day) {
  case 0:
	day = 8
	break;
  case 1:
	day = 2
	break;
  case 2:
	day = 3
	break;
  case 3:
	day = 4
	break;
  case 4:
	day = 5
	break;
  case 5:
	day = 6
	break;
  case 6:
  	day = 7
	break;
}

String attribute

KeywordUtil.logInfo('Ini adalah hari nya 2: ' +day)
Boolean clicked = false
for(int i = day; i<=8; i++) {
	for(int j = 1; j<=37; j++) {
		attribute = WebUI.getAttribute(findTestObject('Object Repository/Dev/Penugasan/Waktu Penugasan', [('tr') : j, ('td') : i]), 'class')
		KeywordUtil.logInfo('Ini adalah class attributenya: ' +attribute)
		if(!attribute.contains('disabled')) {
			WebUI.click(findTestObject('Object Repository/Dev/Penugasan/Waktu Penugasan', [('tr') : j, ('td') : i]))
			clicked = true
			KeywordUtil.logInfo('ke print kok if nya. i (td) = ' +i+ '. j (tr) = ' +j)
			break
		}
	}
	if(clicked)
		break
}

//WebUI.click(findTestObject('Object Repository/Dev/Penugasan/Waktu Penugasan', [('tr') : tr, ('td') : td]))
WebUI.click(findTestObject('Object Repository/Dev/Penugasan/Label Saya yakin melakukan penugasan (Konfirmasi 1)'))
WebUI.click(findTestObject('Object Repository/Dev/Penugasan/Button Ya (Konfirmasi 1)'))

WebUI.delay(1)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Dev/Penugasan/Button Submit Penugasan'))
WebUI.click(findTestObject('Object Repository/Dev/Penugasan/Label Saya yakin melakukan penugasan (Konfirmasi 2)'))
WebUI.click(findTestObject('Object Repository/Dev/Penugasan/Button Ya (Konfirmasi 2)'))

WebUI.delay(1)
WebUI.takeScreenshot()