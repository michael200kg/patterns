package com.epam.patterns.singleton;

public class LazyHolderSingleton {
    
	private static class SingletonHolder {
	   private final static LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
    }
	
	public LazyHolderSingleton getInstance() {
    	return SingletonHolder.INSTANCE;
    }
}
