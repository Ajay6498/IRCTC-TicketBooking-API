package com.java.irctc.binding;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement


public class Request {

	private String name;
	private String dob;
	private Integer age;
	private String gender;
	private String from;
	private String to;
	private String journydate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getJournydate() {
		return journydate;
	}
	public void setJournydate(String journydate) {
		this.journydate = journydate;
	}
	@Override
	public String toString() {
		return "Request [name=" + name + ", dob=" + dob + ", age=" + age + ", gender=" + gender + ", from=" + from
				+ ", to=" + to + ", journydate=" + journydate + "]";
	}
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
}
