package com.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	// adding validation rules
	@NotNull(message="Is required")
	@Size(min=1, message="Is required")
	private String lastName;
	
	// adding validation rules	
	@NotNull(message="Is required")
	@Min(value=0, message="must be greater than 0")
	@Max(value=10, message="must be lower than 10")
	private Integer freePasses;
	
	
	// Postal code - Regular Expressions	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	
	// Custom validation 
	@CourseCode(value="TOPS", message="Must start with TOPS" )
	private String courseCode;
	
	
	
	// getter and setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	


	
}
