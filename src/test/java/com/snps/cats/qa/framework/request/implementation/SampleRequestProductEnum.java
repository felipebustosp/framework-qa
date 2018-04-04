package com.snps.cats.qa.framework.request.implementation;

import com.snps.cats.qa.framework.request.RequestProduct;

public enum SampleRequestProductEnum implements RequestProduct {

	CATS("CATS"),
	PUMA("PUMA"),
	ICWEB("ICWEB"),
	OTHER("NA");
	
	private String product;
	
	private SampleRequestProductEnum(String product) {
		this.setProduct(product);
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
