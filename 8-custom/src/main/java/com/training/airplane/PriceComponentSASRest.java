package com.training.airplane;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class PriceComponentSASRest {
	@GET
	@Produces("text/plain")
	@Path("/{name}")
	public String greet(@PathParam("name") String input) {		
		return new PriceComponentSAS().getPrice(input);
	}
}