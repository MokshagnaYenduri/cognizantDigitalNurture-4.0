package com.cognizant.countryWebService.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	public static Logger LOGGER = LoggerFactory.getLogger(Country.class);
	private String code;
	private String name;
	
	public Country() {
		LOGGER.debug("Inside country constructor");
	}

	public String getCode() {
		LOGGER.debug("In getCode()");
		return code;
	}

	public void setCode(String code) {
		LOGGER.debug("In setCode()");
		this.code = code;
	}

	public String getName() {
		LOGGER.debug("In getName()");
		return name;
	}

	public void setName(String name) {
		LOGGER.debug("In setName()");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
}
