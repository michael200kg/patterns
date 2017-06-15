package com.epam.patterns.factory;

public class CheapComputer implements IComputer {

	@Override
	public String getMonitor() {
		// TODO Auto-generated method stub
		return "LG 14";
	}

	@Override
	public String getStorage() {
		// TODO Auto-generated method stub
		return "HDD 240Gb";
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return "Celeron";
	}

}
