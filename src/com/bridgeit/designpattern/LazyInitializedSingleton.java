package com.bridgeit.designpattern;

public class LazyInitializedSingleton {
	
	@SuppressWarnings("unused")
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton(){}
	
	public static LazyInitializedSingleton getInstance()
	{
		if(instance ==null)
		{
			instance=new LazyInitializedSingleton();
		}
		return instance;
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(instance);
		
	}

}

