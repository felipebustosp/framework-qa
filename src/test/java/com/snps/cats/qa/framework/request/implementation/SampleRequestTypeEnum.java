package com.snps.cats.qa.framework.request.implementation;

import com.snps.cats.qa.framework.request.RequestType;

public enum SampleRequestTypeEnum implements RequestType {
	
	CINC("CINC"),
	TCL("TCL"),
	GUI("GUI"),
	OTHER("OTHER");
	
	private String requestType;
	private SampleRequestTypeEnum(String requestType) {
		this.setRequestType(requestType);
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	
}
