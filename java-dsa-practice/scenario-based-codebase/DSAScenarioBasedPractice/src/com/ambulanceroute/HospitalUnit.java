package com.ambulanceroute;

public class HospitalUnit {
	String unitName;
	boolean available;
	HospitalUnit next;
	
	//constructor to initialize hospital unit
	HospitalUnit(String unitName, boolean available){
		this.unitName=unitName;
		this.available=available;
	}
}
