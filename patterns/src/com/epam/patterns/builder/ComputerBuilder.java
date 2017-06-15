package com.epam.patterns.builder;

abstract class ComputerBuilder {
    
	Computer computer;
    
	public void createNewComputer() {
		computer = new Computer();
	}
	
	abstract void buildMonitor();
	abstract void buildCpu();
	abstract void buildStorage();
}
