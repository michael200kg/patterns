package com.epam.patterns.factory;

public class MainFactory {
   public static void main(String ... args) {
	   ComputerFactory factory = new ComputerFactory();
	   IComputer comp = factory.getComputer(ComputerTypes.RICH);
	   printComputer(comp);
	   comp = factory.getComputer(ComputerTypes.CHEAP);
	   printComputer(comp);  	   
	   
   }
   public static void printComputer(IComputer comp) {
	   System.out.println(comp.asString());
   }
}
