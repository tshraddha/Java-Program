package com.bridgeit.designpattern;

public class EagerIntializedSingleton {

 
private static final EagerIntializedSingleton instance = new EagerIntializedSingleton();
    
   
    private EagerIntializedSingleton(){}
    

    public static EagerIntializedSingleton getInstance(){
        return instance;	
    }
		public static void main(String[] args) {
			
			System.out.println(instance);
			
		}
	}


