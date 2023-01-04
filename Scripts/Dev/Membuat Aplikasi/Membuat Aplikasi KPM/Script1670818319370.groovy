import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
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
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.interactions.Actions as Keys

long last14 = ((Math.random() * 100000000000000) as long)

long noKTP = 7300000000000000 + last14

long last8 = ((Math.random() * 100000000) as long)

String year1 = '2019'
String year2 = '1997'
String date = '10'

String noHP = '0852' + last8.toString()

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/button_Data Aplikasi'))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Nama Lengkap'), GlobalVariable.namaAplikasi)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Pekerjaan', [('id') : 1]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Jenis Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Jenis Pekerjaan', [('id') : 1]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Bidang Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Bidang Pekerjaan', [('id') : 1]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Jabatan'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Jabatan', [('id') : 8]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Status'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Status', [('id') : 1]))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Bekerja Sejak'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/year1'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : year1]))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : date]))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Tempat Lahir'), 'Blora')

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Tanggal Lahir'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/year2'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : year2]))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : date]))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Jenis Kelamin', [('id') : 0]))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Nomor KTP'), noKTP.toString())

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Checkbox_Masa Berlaku KTP Seumur Hidup'))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Alamat tinggal'), 'ALAMAT TES')

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Provinsi'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Provinsi', [('id') : 8]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih KotaKabupaten'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Kota', [('id') : 4]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Kecamatan'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Kecamatan', [('id') : 24]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Kelurahan'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Kelurahan', [('id') : 3]))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Kode Pos'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Kode Pos', [('id') : 0]))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/RT'), '001')

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/RW'), '010')

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/No HP 1'), noHP)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Cabang'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Cabang', [('id') : 41]))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Pilih Nama Karyawan'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Value Karyawan', [('id') : 2]))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Upload Foto KTP'), 
    'C:/Users/haeka/Downloads/saleseffectiveness.jpeg')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/button_Berikutnya'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Nama Pemilik Kendaraan'), GlobalVariable.namaAplikasi)

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Nomor Polisi Kendaraan'), 'B 2345 CZ')

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Pilih Merk'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Value Merk Kendaraan Bermotor'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Pilih Tipe'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Value Tipe Kendaraan Bermotor'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Pilih Tahun'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Value Tahun'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Pilih Program Marketing'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Value Program Marketing'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Pilih Aktivitas Marketing'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/Value Aktivitas Marketing'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/button_Submit'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Jaminan/button_Ok'))