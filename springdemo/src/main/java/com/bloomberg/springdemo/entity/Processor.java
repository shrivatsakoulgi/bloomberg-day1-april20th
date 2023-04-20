package com.bloomberg.springdemo.entity;

import org.springframework.stereotype.Component;
// indicates that the Object can be used as Bean
@Component
public class Processor {	
	private String name;
	
	public Processor() {
	}	
	public Processor(String name) {
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
		return "Processor [name=" + name + "]";
	}
}
