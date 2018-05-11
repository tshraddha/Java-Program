package com.bridgeit.designpattern.FacadePattern;

public class FacadePattern {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();	

	}

}