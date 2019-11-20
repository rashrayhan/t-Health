package model;

public class Nurse {

	private int nurseId;
	private String nurseFname;
	private String nurseLname;
	private String email;
	private User user;
	
	
	public Nurse() {
	}
	public Nurse(int nurseId, String nurseFname, String nurseLname, String email, User user) {
		super();
		this.nurseId = nurseId;
		this.nurseFname = nurseFname;
		this.nurseLname = nurseLname;
		this.email = email;
		this.user = user;
	}
	public int getNurseId() {
		return nurseId;
	}
	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}
	public String getNurseFname() {
		return nurseFname;
	}
	public void setNurseFname(String nurseFname) {
		this.nurseFname = nurseFname;
	}
	public String getNurseLname() {
		return nurseLname;
	}
	public void setNurseLname(String nurseLname) {
		this.nurseLname = nurseLname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return user.getUserId();
	}

	public void setUserId(User user) {
		this.user = user;
	}
	
	
}
