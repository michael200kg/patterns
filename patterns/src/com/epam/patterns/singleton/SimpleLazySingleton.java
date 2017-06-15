package com.epam.patterns.singleton;

public class SimpleLazySingleton {
    
	private static SimpleLazySingleton INSTANCE;
    
	public SimpleLazySingleton getInstance() {
    	if(INSTANCE==null) {
    	   INSTANCE = new SimpleLazySingleton();
    	}
    	return INSTANCE;
    }
	
}
