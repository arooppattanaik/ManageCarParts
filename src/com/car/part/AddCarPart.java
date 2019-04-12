package com.car.part;

import java.util.HashMap;
import java.util.Map;

import com.car.bean.CarPart;

public class AddCarPart {
	 private static Map<Integer, CarPart> carParts = new HashMap<Integer, CarPart>();
	 
	public String addPart(String make, String model, int year) {
		String msg = "";
		try {
		CarPart newPart = new CarPart(make, model, year);
		int partId = newPart.getPartID();
		carParts.put(partId, newPart);
		msg = "New part is added with id: "+partId;
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "There was some problem while adding the car part";
		}
		return msg;	
	}

	/**
	 * @return the carParts
	 */
	public  Map<Integer, CarPart> getCarParts() {
		return this.carParts;
	}

	/**
	 * @param carParts the carParts to set
	 * @return 
	 */
	public void setCarParts(Map<Integer, CarPart> carParts) {
		this.carParts = carParts;
	}
	
}
