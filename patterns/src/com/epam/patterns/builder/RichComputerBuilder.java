package com.epam.patterns.builder;

public class RichComputerBuilder extends ComputerBuilder {

	@Override
	void buildMonitor() {
		computer.setMonitor("Samsung 26");
	}

	@Override
	void buildCpu() {
		computer.setCpu("Intel Core i7");
	}

	@Override
	void buildStorage() {
		computer.setStorage("SSD 1Tb");
	}

}
