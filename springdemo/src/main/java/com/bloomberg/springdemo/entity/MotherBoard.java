package com.bloomberg.springdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MotherBoard {
	
	@Autowired
	private Fan fan;
	
	private String name;
	public MotherBoard() {
		//fan = new Fan();		// Tight Coupling
	}
	public MotherBoard(String name, Fan fan) {
		this.name = name;
		this.fan=fan;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Fan getFan() {
		return fan;
	}
	public void setFan(Fan fan) {
		this.fan = fan;
	}
	@Override
	public String toString() {
		return "MotherBoard [fan=" + fan + ", name=" + name + "]";
	}
	
	

	
}
