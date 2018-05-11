package com.bridgeit.datastructureprogram;

public class StackCalendar <T>{
	 
		  Node top=null;
		  int size=0;
		  
		  
		  public class Node<T>{
		   Node next;
		   T data;
		  }
		  
		 public <T> void push(T data) {
		   //  System.out.println("i m here"+data);
		   
		  Node newNode=new Node();
		     newNode.data=data;
		     if(top==null) {
		    newNode.next=null;
		    top=newNode;
		     }else {
		        // Node n=new Node();
		         newNode.next=top;
		         top=newNode;
		     size++;
		    }
		    }
		  
		      public <T>String pop() {
		     Node temp=new Node();
		     if(top==null) {
		      System.out.println("stack is empty: ");
		     }
		     temp=top;
		     //System.out.print(""+temp.data);
		     top=temp.next;
		  size--; 
		  return (String) temp.data;
		    }
		   
		   
		    public int size() {
		     return size;
		    }
		  
		    public void display() {
		     Node temp=new Node();
		     temp=top;
		     if(top.next==null) {
		      System.out.println("stack is empty");
		     }
		     while(temp.next!=null){
		      System.out.print(" "+temp.data);
		   temp=temp.next;  
		     }
		     System.out.print(" "+temp.data);
		    }
		    
		    
		}


