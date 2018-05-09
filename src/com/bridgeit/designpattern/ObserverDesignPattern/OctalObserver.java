package com.bridgeit.designpattern.ObserverDesignPattern;

public class OctalObserver extends Observer{
	
	 public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach((java.util.Observer) this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }

}
