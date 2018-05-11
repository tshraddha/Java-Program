package com.bridgeit.designpattern.VisitorPattern;

public interface ItemElement {
	
	public int accept(ShoppingCartVisitor visitor);
}
