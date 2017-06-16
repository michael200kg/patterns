package com.epam.patterns.observer;

public class CustomObserver implements AbstractObserver {

	Observable subject;
	
	@Override
	public void createObject(Observable comp) {
		if(comp instanceof ComputerFactory) {
			ComputerFactory cf = (ComputerFactory) comp;
			System.out.println("Observer: "+cf.getComputer().getComputerName()+" computer created.");
		}
	}

	public CustomObserver(Observable subject) {
		this.subject=subject;
		subject.addObserver(this);
	}
    
	public void unSubscribe(){
        subject.removeObserver(this);
        subject = null;
    }
}
