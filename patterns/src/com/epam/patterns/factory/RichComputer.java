package com.epam.patterns.factory;

public class RichComputer implements IComputer {

	@Override
	public String getMonitor() {
		// TODO Auto-generated method stub
		return "Samsung 26";
	}

	@Override
	public String getStorage() {
		// TODO Auto-generated method stub
		return "SSD 1Tb";
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return "Intel Core i7";
	}

}
