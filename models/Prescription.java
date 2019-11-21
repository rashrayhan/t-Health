package model;

public class Prescription {
	private int prescription_Id;
	private String medicine_name;
	private String direction;
	private String currentTimeDirection;
	private String pill_count;
	public int getPrescription_Id() {
		return prescription_Id;
	}
	public void setPrescription_Id(int prescription_Id) {
		this.prescription_Id = prescription_Id;
	}
	public String getMedicine_name() {
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getCurrentTimeDirection() {
		return currentTimeDirection;
	}
	public void setCurrentTimeDirection(String currentTimeDirection) {
		this.currentTimeDirection = currentTimeDirection;
	}
	public String getPill_count() {
		return pill_count;
	}
	public void setPill_count(String pill_count) {
		this.pill_count = pill_count;
	}

}
