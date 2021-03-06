package com.mulesoft.training;


public class PriceComponent {

	public String getPrice(String destination) {
		if (destination != null && "SFO".equalsIgnoreCase(destination.trim())) {
			return "800";
		} else if (destination != null && "/SFO".equalsIgnoreCase(destination.trim())) {
			return "600";
			
		} else if (destination != null && "BOS".equalsIgnoreCase(destination.trim())) {
			return "400";
		} else if (destination != null && "LAX".equalsIgnoreCase(destination.trim())) {
			return "500";
		} else {
			return "This destination is not available";
		}
		
	}
}
