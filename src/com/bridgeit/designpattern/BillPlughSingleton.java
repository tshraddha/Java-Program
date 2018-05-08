package com.bridgeit.designpattern;

public class BillPlughSingleton {
	
	
	
	private BillPlughSingleton(){}
	
	
	private static class SingletonHelper{
        private static final BillPlughSingleton instance = new BillPlughSingleton();
    }
    
    public static BillPlughSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
    public static void main(String[] args) {
    	BillPlughSingleton instance1 = BillPlughSingleton.getInstance();
    	BillPlughSingleton instance2 = BillPlughSingleton.getInstance();
    	
    	System.out.println(instance1);
    	System.out.println(instance2);
    	
		
	}
}
