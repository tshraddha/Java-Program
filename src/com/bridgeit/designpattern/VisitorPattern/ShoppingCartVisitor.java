package com.bridgeit.designpattern.VisitorPattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
