package com.epam.patterns.observer;

import java.util.HashMap;
import java.util.Map;

public class CheapComputer implements AbstractComputer {

	@Override
	public String getComputerName() {
		return "My cheap work computer";
	}

	@Override
	public Map<String, String> getComputerProps() {
		Map<String,String> map = new HashMap() {{ put("CPU","Celeron"); put("MONITOR","Samsung 15inch");}};
		return map;
	}

}
