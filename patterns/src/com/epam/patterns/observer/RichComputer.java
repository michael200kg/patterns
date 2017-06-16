package com.epam.patterns.observer;

import java.util.HashMap;
import java.util.Map;

public class RichComputer implements AbstractComputer {

	@Override
	public String getComputerName() {
		return "My rich home computer";
	}

	@Override
	public Map<String, String> getComputerProps() {
		Map<String,String> map = new HashMap() {{ put("CPU","Core i7"); put("MONITOR","LG 26inch");}};
		return map;
	}

}
