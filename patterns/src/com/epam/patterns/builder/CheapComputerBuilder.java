package com.epam.patterns.builder;

public class CheapComputerBuilder extends ComputerBuilder {

	@Override
	void buildMonitor() {
		computer.setMonitor("LG 14");
	}

	@Override
	void buildCpu() {
		computer.setCpu("Athlon");
	}

	@Override
	void buildStorage() {
		computer.setStorage("HDD 240GB");
	}

}
