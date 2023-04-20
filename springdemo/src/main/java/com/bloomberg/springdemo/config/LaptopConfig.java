package com.bloomberg.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Following is Config class
@Configuration

// scan the entire package for Component and return them as Bean
@ComponentScan(basePackages = {"com.bloomberg.springdemo.entity"})

public class LaptopConfig {
	
	
	  // The method returns an object which is Bean
	  
		/*
		 * @Bean("asus") public MotherBoard getAsusMotherBoard() { return new
		 * MotherBoard("ASUS MotherBoard"); }
		 * 
		 * @Bean("intel") public MotherBoard getIntelMotherBoard() { return new
		 * MotherBoard("Intel MotherBoard"); }
		 * 
		 * 
		 * @Bean("sony") public Screen getSonyScreen() { return new
		 * Screen("SONY 17\" OLED"); }
		 * 
		 * 
		 * @Bean("screen") public Screen getScreen() { return new Screen(); }
		 * 
		 * // @Bean public Processor getProcessor() { return new Processor(); }
		 * 
		 */
	 

}
