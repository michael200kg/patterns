package com.epam.patterns.factory;

public class MainFactory {
   public static void main(String ... args) {
	   IComputer comp = (new ComputerFactory(ComputerTypes.RICH)).getComputer();
	   printComputer(comp);
	   comp = (new ComputerFactory(ComputerTypes.CHEAP)).getComputer();
	   printComputer(comp);  	   
	   
   }
   public static void printComputer(IComputer comp) {
	   System.out.println(comp.asString());
   }
}
