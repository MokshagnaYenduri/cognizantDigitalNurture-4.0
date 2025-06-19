package com.factory;

public class pdfDocumentFactory extends documentFactory{

	@Override
	public document createDocument() {
		// TODO Auto-generated method stub
		return new pdfDocument();
	}

}
