package com.ltts.screen.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="screen")
public class Screen implements Serializable{
 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private int screenId;
	@Column
	private String screenName;
	public Screen(int screenId, String screenName) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
	}
	public Screen() {
		super();
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + "]";
	}

	}
	 