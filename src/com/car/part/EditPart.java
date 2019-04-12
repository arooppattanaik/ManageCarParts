package com.car.part;

/**
 * The class with the main method.
 * 
 * @author Aroop
 */
public class EditPart {
	public static void main(String args[]) {
		addNewPart("Ford", "M190", 2019);
		addNewPart("Audi", "M191", 2019);
		addNewPart("Volvo", "M192", 2018);
		addNewPart("BMW", "M194", 2017);
		addNewPart("Datsun", "M193", 2017);
		addNewPart("Chevrolet", "M195", 2017);
		addNewPart("Fiat", "M196", 2015);
		addNewPart("Hyundai", "M197", 2014);

		searchWithMakePart("Audi");
		searchWithModelPart("M195");
		searchWithYearPart(2019);
		searchWithIdPart(4);

		removePart("Chevrolet", "M195", 2017);

	}

	/**
	 * Method to remove parts.
	 * 
	 * @param make, model, year
	 */
	private static void removePart(String make, String model, int year) {
		RemoveCarPart car = new RemoveCarPart();
		car.removePart(make, model, year);

	}

	/**
	 * Method to add new parts.
	 * 
	 * @param make, model, year
	 */
	private static void addNewPart(String make, String model, int year) {
		AddCarPart car = new AddCarPart();
		car.addPart(make, model, year);
	}

	/**
	 * Method to search parts by year.
	 * 
	 * @param year
	 */
	private static void searchWithYearPart(int year) {
		SearchCarPart car = new SearchCarPart();
		car.searchPartWithYear(year);
	}

	/**
	 * Method to search parts by id.
	 * 
	 * @param partId
	 */
	private static void searchWithIdPart(int Id) {
		SearchCarPart car = new SearchCarPart();
		car.searchPartWithId(Id);
	}

	/**
	 * Method to search parts by make.
	 * 
	 * @param make
	 */
	private static void searchWithMakePart(String make) {
		SearchCarPart car = new SearchCarPart();
		car.searchPartWithMake(make);
	}

	/**
	 * Method to search parts by model.
	 * 
	 * @param model
	 */
	private static void searchWithModelPart(String model) {
		SearchCarPart car = new SearchCarPart();
		car.searchPartWithModel(model);

	}

}
