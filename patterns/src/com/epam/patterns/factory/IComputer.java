package com.epam.patterns.factory;

public interface IComputer {
   
   String getMonitor();
   String getStorage();
   String getCpu();
   
   default String asString() {
	   return "Monitor="+getMonitor()+" Cpu="+getCpu()+" Storage="+getStorage();
   }
   
}
