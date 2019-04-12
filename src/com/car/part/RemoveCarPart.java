package com.car.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.car.bean.CarPart;

public class RemoveCarPart {

	/**
	 * Method to remove parts.
	 * 
	 * @param make, model, year
	 * @return string
	 */
	public String removePart(String make, String model, int year) {
		String msg = "";
		try {
			AddCarPart part = new AddCarPart();
			List<Integer> removedIds = new ArrayList<Integer>();
			Map<Integer, CarPart> existingPart = part.getCarParts();
			Iterator<Integer> iterator = existingPart.keySet().iterator();

			while (iterator.hasNext()) {
				Integer entry = iterator.next();
				CarPart cPart = existingPart.get(entry);
				if (cPart.getMake().equals(make) && cPart.getModel().equals(model) && cPart.getYear() == year) {
					iterator.remove();
					removedIds.add(entry);
				}
			}
			msg = "Removed parts with partIds: " + removedIds;
			System.out.println(msg);
			System.out.println("Updated List");
			for (Entry<Integer, CarPart> entry : existingPart.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Make = " + entry.getValue().getMake() + ", Model = "
						+ entry.getValue().getModel() + ", Year = " + entry.getValue().getYear());
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = "There was some problem while removing the car part";
		}
		return msg;
	}
}
