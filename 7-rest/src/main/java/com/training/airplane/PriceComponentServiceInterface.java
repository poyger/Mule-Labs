package com.training.airplane;

import javax.jws.WebService;
import javax.jws.WebParam;

@WebService
public interface PriceComponentServiceInterface {
	String getPrice(@WebParam(name = "destination") String destination);
}
