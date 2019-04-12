package com.car.bean;

public class CarPart {

	 private static int partID = 0;
	 private String make;
	 private String model;
	 private int year;
	
	 
	 public CarPart(String make, String model, int year) {
			this.make = make;
			this.model = model;
			this.year = year;
			this.partID = partID+1;
		}
	 
	 
	/**
	 * @return the partID
	 */
	public int getPartID() {
		return this.partID;
	}
	
	public CarPart() {
		super();
	}


	/**
	 * @param partID the partID to set
	 */
	public void setPartID(int partID) {
		this.partID = partID;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
