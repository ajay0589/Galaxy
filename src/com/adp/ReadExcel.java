package com.adp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// workbook, sheet, row, cell

		String filePath = "C:\\Users\\ajayj\\eclipse-workspace\\Galaxy\\ReadFiles\\Testdata.xlsx";

		File file = new File(filePath);

		FileInputStream fis = new FileInputStream(file);

		BufferedInputStream bis = new BufferedInputStream(fis);

		Workbook workbook = new XSSFWorkbook(bis);

		Sheet sheet = workbook.getSheet("data");

		Row row = sheet.getRow(0);

		Cell cell1 = row.getCell(0);
		Cell cell2 = row.getCell(1);

		System.out.println(cell1);
		System.out.println(cell2);

	}

}
