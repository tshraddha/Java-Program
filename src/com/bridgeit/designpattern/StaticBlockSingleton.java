package com.bridgeit.designpattern;

public class StaticBlockSingleton {

	public static StaticBlockSingleton instances;
	
	public StaticBlockSingleton(){}
	
	static{
		
	
	try{
		instances=new StaticBlockSingleton();
	}catch(Exception e){
	throw new RuntimeException("Exception occured in creating singleton instance");		
	}
		
	}
	
	public static StaticBlockSingleton getInstance(){
        return instances;	
    }
		public static void main(String[] args) {
			
			System.out.println(instances);
	}
}
