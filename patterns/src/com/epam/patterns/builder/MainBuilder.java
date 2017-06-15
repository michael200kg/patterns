package com.epam.patterns.builder;

public class MainBuilder {
    public static void main(String ... args) {
    	
    	Director director = new Director();
    	
    	Computer comp = director.buildNewComputer(new CheapComputerBuilder());
    	System.out.println("Monitor="+comp.getMonitor()+" Cpu="+comp.getCpu()+" Storage="+comp.getStorage());

    	comp = director.buildNewComputer(new RichComputerBuilder());
    	System.out.println("Monitor="+comp.getMonitor()+" Cpu="+comp.getCpu()+" Storage="+comp.getStorage());    	
    	
    }
}
