package com.epam.patterns.singleton;

public class LazySynchronizedSingleton {
    
	private volatile LazySynchronizedSingleton INSTANCE;
    
	public LazySynchronizedSingleton getInstance() {
		LazySynchronizedSingleton localInstance = INSTANCE;
		if(localInstance==null) {
			synchronized (LazySynchronizedSingleton.class) {
				if(localInstance==null) {
					localInstance=INSTANCE=new LazySynchronizedSingleton();
				}
			}
		}
		return localInstance;
    }
	
}
