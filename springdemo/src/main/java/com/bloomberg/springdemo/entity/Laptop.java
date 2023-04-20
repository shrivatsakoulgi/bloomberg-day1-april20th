package com.bloomberg.springdemo.entity;

public class Laptop {
	
	private MotherBoard motherBoard;
	private Processor processor;
	private Screen screen;
	
	public Laptop() {		
	
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Laptop [motherBoard=" + motherBoard + ",\n processor=" + processor + ",\n screen=" + screen + "]";
	}
	

	
	

}
