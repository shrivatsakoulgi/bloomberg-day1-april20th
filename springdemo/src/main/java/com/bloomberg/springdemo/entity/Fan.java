package com.bloomberg.springdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Fan {
	
	private int fanSpeed=12000;
	
	public Fan() {
		
	}
	
	public int getFanSpeed() {
		return fanSpeed;
	}
	
	public void setFanSpeed(int fanSpeed) {
		this.fanSpeed = fanSpeed;
	}

	@Override
	public String toString() {
		return "Fan [ fanSpeed = "+fanSpeed +" ]";
	}

}
