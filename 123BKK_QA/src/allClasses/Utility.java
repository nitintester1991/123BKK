package allClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Utility {

	public static String excelRead(int row, int cell) {
	String text = null;
	try {
		File src = new File(System.getProperty("user.dir") +"InputExcel\\inputfile.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		text = sh1.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(text);
		fis.close();
	} catch (Exception e) {

		System.out.println(e.getMessage());

	}
	return text;
}

public static String excelReadInt(int row, int cell) {
	String intText = null;
	try {
		File src = new File(System.getProperty("user.dir") +"InputExcel\\inputfile.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		int x = (int) sh1.getRow(row).getCell(cell).getNumericCellValue();
		intText = String.valueOf(x);
		fis.close();
	} catch (Exception e) {

		System.out.println(e.getMessage());

	}
	return intText;
}

/*public static void ExcelReadAndWrite(int row, int cell) {
	try {
		File src = new File(System.getProperty("user.dir") +"InputExcel\\inputfile.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String datetext = dateFormat.format(date);
		String q = sh1.getRow(row).getCell(cell).getStringCellValue().substring(0, 6);
		String s1 = q + datetext;
		fis.close();

		File src1 = new File(System.getProperty("user.dir") +"InputExcel\\inputfile.xlsx");
		FileInputStream fis1 = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		XSSFSheet sh12 = wb1.getSheetAt(0);
		sh12.getRow(row).createCell(cell).setCellValue(s1);

		FileOutputStream fout = new FileOutputStream(new File(System.getProperty("user.dir") +"InputExcel\\inputfile.xlsx"));

		wb1.write(fout);

		fout.close();

	} catch (Exception e) {

		System.out.println(e.getMessage());

	}

}*/

/*public static void ExcelWrite() {
	try {
		File src1 = new File(System.getProperty("user.dir") +"InputExcel\\inputfile.xlsx");
		FileInputStream fis1 = new FileInputStream(src1);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		XSSFSheet sh12 = wb1.getSheetAt(0);
		sh12.getRow(1).createCell(1).setCellValue(s1);

		FileOutputStream fout = new FileOutputStream(new File(System.getProperty("user.dir") +"InputExcel\\inputfile.xlsx"));

		wb1.write(fout);

		fout.close();

	} catch (Exception e) {

		System.out.println(e.getMessage());

	}
}*/


}
