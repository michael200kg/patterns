package com.epam.patterns.factory;

public class ComputerFactory {
   
   IComputer computer;
   
   public ComputerFactory() {}
   
   IComputer getComputer(ComputerTypes type) {
	   if(type==ComputerTypes.RICH) {
		   computer = new RichComputer();
	   }
	   else if(type==ComputerTypes.CHEAP) {
		   computer = new CheapComputer();
	   }
	   else {
		   computer = new CheapComputer(); 
	   }
	   return computer;
   }
}
