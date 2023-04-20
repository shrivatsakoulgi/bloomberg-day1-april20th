package com.bloomberg.springdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Screen {

	private String name;

	public Screen() {
	}

	public Screen(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Screen [name=" + name + "]";
	}
	
}
