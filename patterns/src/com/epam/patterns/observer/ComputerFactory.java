package com.epam.patterns.observer;

import com.epam.patterns.factory.ComputerTypes;

public class ComputerFactory implements Observable {
   
	AbstractComputer computer;
   
	public void createComputer(Class clazz) {

		Object obj=null;
		try {
			obj = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		if(obj!=null && obj instanceof AbstractComputer) {
	       computer = (AbstractComputer)obj;
		   notifyObservers();
		}
		else {
			System.out.println("Unknown class!");
		}
	}
	
	public AbstractComputer getComputer() {
		return computer;
	}

	@Override
	public void notifyObservers() {
		for(AbstractObserver observer: observers) {
			observer.createObject(this);
		}
		
	}

	@Override
	public void addObserver(AbstractObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(AbstractObserver observer) {
		observers.remove(observer);
		
	}
   
}
