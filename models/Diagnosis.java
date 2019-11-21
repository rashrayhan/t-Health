package model;


public class Diagnosis {
	private int diagnosis_id;
	private String symptoms;
	private String finding;
	private String currentMedication;
	private String treatment;
	private int prescription_id;
	
	public int getDiagnosis_id() {
		return diagnosis_id;
	}
	public void setDiagnosis_id(int diagnosis_id) {
		this.diagnosis_id = diagnosis_id;
	}
	public String getFinding() {
		return finding;
	}
	public void setFinding(String finding) {
		this.finding = finding;
	}
	public String getCurrentMedication() {
		return currentMedication;
	}
	public void setCurrentMedication(String currentMedication) {
		this.currentMedication = currentMedication;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public int getPrescription_id() {
		return prescription_id;
	}
	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
        
}
