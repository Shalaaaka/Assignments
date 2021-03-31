package com.example.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfData extends AbstractPdfView
{

	@Override
	protected void buildPdfDocument(Map model, Document document, PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Map<String,String> empdata = (Map<String,String>) model.get("empdata");
		
		Table table = new Table(2);
		table.addCell("Name");
		table.addCell("Salary");
		
		for (Map.Entry<String, String> entry : empdata.entrySet()) {

			table.addCell(entry.getKey());
			table.addCell(entry.getValue());
			
        }
		
		document.add(table);
	}
		

}
