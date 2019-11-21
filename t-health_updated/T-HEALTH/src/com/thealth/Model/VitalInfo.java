package com.thealth.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;



public class VitalInfo {

	private int vitalInfoId;
	private String weight;
	private String height;
	private String bodyTemp;
	private String bloodPressure;
	private String heartRate;
	private String oxygen_level;
	private LocalDate Visit_date;
	
	public LocalDate getVisit_date() {
		return Visit_date;
	}
	public void setVisit_date(LocalDate visit_date) {
		Visit_date = visit_date;
	}
	public VitalInfo() {
	}
	public VitalInfo(int vitalInfoId, String weight, String height, String bodyTemp, String bloodPressure,
			String heartRate,String oxygen_level) {
		super();
		this.vitalInfoId = vitalInfoId;
		this.weight = weight;
		this.height = height;
		this.bodyTemp = bodyTemp;
		this.bloodPressure = bloodPressure;
		this.heartRate = heartRate;
		this.oxygen_level=oxygen_level;
	}
	
	
	public String getOxygen_level() {
		return oxygen_level;
	}
	public void setOxygen_level(String oxygen_level) {
		this.oxygen_level = oxygen_level;
	}
	public int getVitalInfoId() {
		return vitalInfoId;
	}
	public void setVitalInfoId(int vitalInfoId) {
		this.vitalInfoId = vitalInfoId;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBodyTemp() {
		return bodyTemp;
	}
	public void setBodyTemp(String bodyTemp) {
		this.bodyTemp = bodyTemp;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public String getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}
}
