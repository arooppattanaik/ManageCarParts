package com.car.part;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.car.bean.CarPart;

public class SearchCarPart {
	public String searchPartWithMake(String make) {
		String msg = "";
		try {
		AddCarPart part = new AddCarPart();
		List<Integer> searchedIds = new ArrayList<Integer>();
		//Map<Integer, CarPart> existingPart = new HashMap<>();
		for (Map.Entry<Integer, CarPart> entry : part.getCarParts().entrySet())  {
         
			CarPart cPart = entry.getValue();
			if(cPart.getMake().equals(make)) {
				//existingPart.put(cPart.getPartID(), cPart);
				searchedIds.add(entry.getKey());
			}
		}
		
		msg = "Searched parts are using Make are ids: "+searchedIds;
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "There was some problem while searching the car part";
		}
		return msg;	
	}
	
	
	public String searchPartWithModel(String model) {
		String msg = "";
		try {
		AddCarPart part = new AddCarPart();
		List<Integer> searchedIds = new ArrayList<Integer>();
		//Map<Integer, CarPart> existingPart = new HashMap<>();
		for (Map.Entry<Integer, CarPart> entry : part.getCarParts().entrySet())  {
			CarPart cPart = entry.getValue();
			if(cPart.getModel().equals(model) ) {
				//existingPart.put(cPart.getPartID(), cPart);
				searchedIds.add(entry.getKey());
			}
		}
		
		msg = "Searched parts using model are ids: "+searchedIds;
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "There was some problem while searching the car part";
		}
		return msg;	
	}
	
	public String searchPartWithId(int partId) {
		String msg = "";
		try {
		AddCarPart part = new AddCarPart();
		List<Integer> searchedIds = new ArrayList<Integer>();
		//Map<Integer, CarPart> existingPart = new HashMap<>();
		for (Map.Entry<Integer, CarPart> entry : part.getCarParts().entrySet())  {
			//CarPart cPart = entry.getValue();
			if(entry.getKey() == partId){
				//existingPart.put(cPart.getPartID(), cPart);
				searchedIds.add(entry.getKey());
				break;
			}
		}
		
		msg = "Searched parts are with PartId ids: "+searchedIds;
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "There was some problem while searching the car part";
		}
		return msg;	
	}
	
	public String searchPartWithYear(int year) {
		String msg = "";
		try {
		AddCarPart part = new AddCarPart();
		List<Integer> searchedIds = new ArrayList<Integer>();
		//Map<Integer, CarPart> existingPart = new HashMap<>();
		for (Map.Entry<Integer, CarPart> entry : part.getCarParts().entrySet())  {
          
			CarPart cPart = entry.getValue();
			if(cPart.getYear() == year){
				//existingPart.put(cPart.getPartID(), cPart);
				searchedIds.add(entry.getKey());
			}
		}
		
		msg = "Searched parts are with Year ids: "+searchedIds;
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "There was some problem while searching the car part";
		}
		return msg;	
	}
}
