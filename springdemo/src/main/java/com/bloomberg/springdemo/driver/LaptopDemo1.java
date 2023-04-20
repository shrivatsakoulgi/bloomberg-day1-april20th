package com.bloomberg.springdemo.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bloomberg.springdemo.config.LaptopConfig;
import com.bloomberg.springdemo.entity.Laptop;
import com.bloomberg.springdemo.entity.MotherBoard;
import com.bloomberg.springdemo.entity.Processor;
import com.bloomberg.springdemo.entity.Screen;

public class LaptopDemo1 {

	public static void main(String[] args) {

	
		// Spring Container (Factory)
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(LaptopConfig.class);
		
		ApplicationContext context2 = 
		new AnnotationConfigApplicationContext(LaptopConfig.class);
	
		//Object(Bean) creation using Dependency Injection
		// Loose Coupling
		MotherBoard motherBoard =   context.getBean(MotherBoard.class);
		MotherBoard motherBoard2 =   context2.getBean(MotherBoard.class);
		Processor processor = context.getBean(Processor.class);
		Screen screen =  context.getBean(Screen.class);
		Screen screen2 = context2.getBean(Screen.class);
		
		// Setter Injection
		motherBoard.setName("Intel MotherBoard");
		motherBoard.getFan().setFanSpeed(10000);
		processor.setName("Intel i5 9th Gen");
		screen.setName("SONY OLED 17\"");
		Laptop dell = new Laptop(); 
		
		dell.setMotherBoard(motherBoard);
		
		dell.setProcessor(processor);
		dell.setScreen(screen);
		System.out.println(dell);
		System.out.println();
		
		motherBoard2.setName("Asus MotherBoard");
		motherBoard2.getFan().setFanSpeed(15000);
		Laptop hp = new Laptop();
		hp.setMotherBoard(motherBoard2);
		hp.setProcessor(processor);
		screen2.setName("SAMSUNG 15\"");
		hp.setScreen(screen2);
		System.out.println(hp);
		
		
		System.out.println(motherBoard.hashCode());
		System.out.println(motherBoard2.hashCode());

	}

}
