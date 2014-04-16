package org.ics.oauth2.provider.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class User implements Serializable {
	private static final long serialVersionUID = -6000386930102268769L;
	private long id;
	private String name;
	@DateTimeFormat(iso=ISO.DATE) 
	private Date borthday;
	private Gender gender;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBorthday() {
		return borthday;
	}
	public void setBorthday(Date borthday) {
		this.borthday = borthday;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", borthday=" + borthday
				+ ", gender=" + gender + "]";
	}

}
