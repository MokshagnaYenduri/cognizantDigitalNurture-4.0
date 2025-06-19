package com.factory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		documentFactory word = new wordDocumentFactory();
		document wordDoc = word.createDocument();
		wordDoc.open();
		
		documentFactory pdf = new pdfDocumentFactory();
		document pdfDoc = pdf.createDocument();
		pdfDoc.open();
		
		documentFactory excel = new wordDocumentFactory();
		document excelDoc = excel.createDocument();
		excelDoc.open();
		
	}

}
