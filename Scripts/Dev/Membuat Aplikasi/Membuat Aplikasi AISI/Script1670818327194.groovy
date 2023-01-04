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

long first14 = ((Math.random() * 100000000000000) as long)

long noKTP = 7300000000000000 + first14

long first8 = ((Math.random() * 100000000) as long)

String tempatLahir = 'Blora'
String alamatTinggal = 'alamat tes'
String noHP = '0852' + first8.toString()
String year = '1997'
String date = '10'
String jenisKelamin = 'LAKI - LAKI'
String provinsi = 'JAWA BARAT'
String kota = 'BOGOR'
String kecamatan = 'KOTA BOGOR SELATAN'
String kelurahan = 'CIKARET'
String kodePos = '16132'
String rt = '001'
String rw = '010'
String cabang = 'BOGOR'
String dealer = 'JAYARAMA ARTHA RODA'
String merkMotor = 'HONDA'
String tipeMotor = 'ADV 150 ABS'

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/button_Tambah Data AISI'))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Nama Lengkap'), GlobalVariable.namaAplikasi)

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/No HP'), noHP)

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Tempat Lahir'), tempatLahir)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Tanggal Lahir'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/DatePicker/Tahun'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : year]))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : date]))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : jenisKelamin]))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/No KTP'), noKTP.toString())

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Checkbox_Masa Berlaku KTP Seumur Hidup'))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi KPM/Data Diri/Alamat tinggal'), alamatTinggal)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Provinsi'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : provinsi]))

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih KotaKabupaten'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : kota]))

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Kecamatan'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : kecamatan]))

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Kelurahan'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : kelurahan]))

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Kode Pos'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Value KodePos'))

WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/RT'), rt)
WebUI.setText(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/RW'), rw)

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Cabang'))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Value Cabang'))

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Dealer'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : dealer]))

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Merk'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : merkMotor]))

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Pilih Tipe'))

WebUI.click(findTestObject('Object Repository/All/Value', [('value') : tipeMotor]))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/Upload KTP'),
	'C:/Users/haeka/Downloads/saleseffectiveness.jpeg')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/button_Simpan'))
WebUI.click(findTestObject('Object Repository/Dev/Tambah Aplikasi AISI/button_Ok'))

WebUI.delay(2)