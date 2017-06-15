package com.epam.patterns.singleton;

public class SimpleNotLazySingleton {
    private final static SimpleNotLazySingleton INSTANCE = new SimpleNotLazySingleton();
    public SimpleNotLazySingleton getInstance() {
    	return INSTANCE;
    }
}
