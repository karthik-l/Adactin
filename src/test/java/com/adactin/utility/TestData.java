package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	public static String data, firstName;

	@SuppressWarnings("static-access")
	public String TestDataMeth(String given) throws Throwable {
		List<String> kl = new ArrayList<String>();
		List<String> vl = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<String, String>();

		File f = new File(FileReaderManager.getInstance().getCRInstance().getTestDataPath());
		FileInputStream fis = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int totalRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < totalRows; i++) {
			Row row = sheet.getRow(i);
			Cell cell0 = row.getCell(1);
			Cell cell1 = row.getCell(2);
			if (cell0.getCellType().equals(cell0.getCellType().STRING)) {
				kl.add(cell0.getStringCellValue());
			}
			if (cell1.getCellType().equals(cell1.getCellType().STRING)) {
				vl.add(cell1.getStringCellValue().replace("`", ""));
			} else if (cell1.getCellType().equals(cell1.getCellType().NUMERIC)) {
				double valueN = cell1.getNumericCellValue();
				long l = (long) valueN;
				String valuel = String.valueOf(l);
				vl.add(valuel);
			}
			for (int j = 0; j < kl.size(); j++) {
				map.put(kl.get(j), vl.get(j));

			}

		}
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if (entry.getKey().equalsIgnoreCase(given)) {
				data = entry.getValue();
			}
		}
		
		firstName = map.get("First Name");
		return data;
	}

}
