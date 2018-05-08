package com.bridgeit.designpattern;

public class EagerIntializedSingleton {

 
private static final EagerIntializedSingleton instance = new EagerIntializedSingleton();
    
   
    private EagerIntializedSingleton(){}
    

    public static EagerIntializedSingleton getInstance(){
        return instance;	
    }
		public static void main(String[] args) {
			 EagerIntializedSingleton instance1 =EagerIntializedSingleton.getInstance();
			 EagerIntializedSingleton instance2 =EagerIntializedSingleton.getInstance();
			 EagerIntializedSingleton instance3 =EagerIntializedSingleton.getInstance();
			System.out.println(instance);
			System.out.println(instance1.hashCode());
			System.out.println(instance2.hashCode());
			System.out.println(instance3.hashCode());
			
		}
	}


