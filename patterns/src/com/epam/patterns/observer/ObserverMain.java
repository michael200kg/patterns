package com.epam.patterns.observer;

public class ObserverMain {
   public static void main(String ...strings)  {
	   ComputerFactory cf = new ComputerFactory();
	   CustomObserver co = new CustomObserver(cf);
	   cf.createComputer(RichComputer.class);
	   cf.createComputer(CheapComputer.class);
	   cf.removeObserver(co);
   }
}
