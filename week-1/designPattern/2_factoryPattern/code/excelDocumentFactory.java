package com.factory;

public class excelDocumentFactory extends documentFactory{

	@Override
	public document createDocument() {
		// TODO Auto-generated method stub
		return new excelDocument();
	}

}
