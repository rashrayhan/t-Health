package model;

public class VitalInfo {

	private int vitalInfoId;
	private String weight;
	private String height;
	private String bodyTemp;
	private String bloodPressure;
	private String heartRate;
	
	
	public VitalInfo() {
	}
	public VitalInfo(int vitalInfoId, String weight, String height, String bodyTemp, String bloodPressure,
			String heartRate) {
		super();
		this.vitalInfoId = vitalInfoId;
		this.weight = weight;
		this.height = height;
		this.bodyTemp = bodyTemp;
		this.bloodPressure = bloodPressure;
		this.heartRate = heartRate;
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
