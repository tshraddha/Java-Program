package com.bridgeit.designpattern.AdapterPattren;

public class Socket {
	public Volt getVolt(){
		
		return new Volt(120);
	}
}
