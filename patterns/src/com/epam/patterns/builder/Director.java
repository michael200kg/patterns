package com.epam.patterns.builder;

public class Director {
   
   private ComputerBuilder computerBuilder;

   public Computer buildNewComputer(ComputerBuilder computerBuilder) {
	  this.computerBuilder = computerBuilder;
	   computerBuilder.createNewComputer();
	   computerBuilder.buildMonitor();
	   computerBuilder.buildCpu();
	   computerBuilder.buildStorage();	
	   return computerBuilder.computer;
   }
   
   Computer getComputer() {
	   return computerBuilder.computer;
   }

   
}
