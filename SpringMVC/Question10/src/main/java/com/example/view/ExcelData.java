package com.example.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelData  extends AbstractExcelView
{

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Map<String,String> empdata = (Map<String,String>) model.get("empdata");
		HSSFSheet sheet = workbook.createSheet("Emp Report");
		
		HSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("Name");
		header.createCell(1).setCellValue("Salary");
		
		int rowNum = 1;
		for (Map.Entry<String, String> entry : empdata.entrySet())
		{
			HSSFRow row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(entry.getKey());
			row.createCell(1).setCellValue(entry.getValue());
			
        }
		
	}

}
