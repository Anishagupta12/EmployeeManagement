package in.oak.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_dtls")
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String fullName;
	
	private String dob;
	
	private String gender;

	private String address;
	
	private String city;
	
	private String state;

	private String email;

	private String password;
	
	




	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getFullName() {
		return fullName;
	}






	public void setFullName(String fullName) {
		this.fullName = fullName;
	}






	public String getDob() {
		return dob;
	}






	public void setDob(String dob) {
		this.dob = dob;
	}






	public String getGender() {
		return gender;
	}






	public void setGender(String gender) {
		this.gender = gender;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public String getCity() {
		return city;
	}






	public void setCity(String city) {
		this.city = city;
	}






	public String getState() {
		return state;
	}






	public void setState(String state) {
		this.state = state;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}






	@Override
	public String toString() {
		return "Emp [id=" + id + ", fullName=" + fullName + ", dob=" + dob + ", gender=" + gender + ", address="
				+ address + ", city=" + city + ", state=" + state + ", email=" + email + ", password=" + password + "]";
	}










}
