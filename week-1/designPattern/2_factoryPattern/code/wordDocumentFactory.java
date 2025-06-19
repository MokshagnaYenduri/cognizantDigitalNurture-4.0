package com.factory;

public class wordDocumentFactory extends documentFactory{

	@Override
	public document createDocument() {
		return new wordDocument();
	}

}
