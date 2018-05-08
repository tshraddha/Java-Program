package com.bridgeit.designpattern;

import java.io.Serializable;

public class SerialisationAndSingleton implements Serializable {

	

	    private static final long serialVersionUID = -7604766932017737115L;

	    private SerialisationAndSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final SerialisationAndSingleton instance = new SerialisationAndSingleton();
	    }
	    
	    public static SerialisationAndSingleton getInstance(){
	        return SingletonHelper.instance;
	    }
	    
	    public static void main(String[] args) {
	    	
	    	SerialisationAndSingleton instance1 = SerialisationAndSingleton.getInstance();
	    	SerialisationAndSingleton instance2 = SerialisationAndSingleton.getInstance();
			System.out.println(instance1);
			System.out.println(instance2);
		}

}
