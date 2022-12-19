package com.springboot.rest.webservices.restfulwebservices.Assignments;

public class UserDetails {
    private Integer zipcode;
	private String state;
	private String city;
	private String country;
	public UserDetails(Integer zipcode, String state, String city, String country) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "UserDetails [zipcode=" + zipcode + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}



}


