package com.snps.cats.qa.framework.request;

import com.snps.cats.qa.framework.exception.RequestException;

public interface Request {
	
	public String getHeader();
	public String getBody();
	public RequestType getType();
	public RequestProduct getProduct();
	
	public Object buildRequest();
	public Boolean sendRequest() throws RequestException;
	public String serializeRequest();

}
