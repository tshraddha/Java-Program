package com.bridgeit.designpattern;

import java.lang.reflect.Constructor;

public class ReflectionToDestroySingleton {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
        EagerIntializedSingleton instanceOne = EagerIntializedSingleton.getInstance();
        EagerIntializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerIntializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerIntializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
