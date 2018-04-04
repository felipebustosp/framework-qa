package com.snps.cats.qa.framework.request.implementation;

import com.snps.cats.qa.framework.exception.RequestException;
import com.snps.cats.qa.framework.request.Request;
import com.snps.cats.qa.framework.request.RequestProduct;
import com.snps.cats.qa.framework.request.RequestType;

public class SampleRequest implements Request {

	private String header;
	private String body;
	private RequestProduct requestProduct;
	private RequestType requestType;
	
	@Override
	public String getHeader() {
		return header;
	}

	@Override
	public String getBody() {
		return body;
	}

	@Override
	public RequestType getType() {
		return requestType;
	}

	@Override
	public RequestProduct getProduct() {
		return requestProduct;
	}

	@Override
	public Object buildRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sendRequest() throws RequestException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String serializeRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
