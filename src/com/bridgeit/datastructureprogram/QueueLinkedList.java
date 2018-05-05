package com.bridgeit.datastructureprogram;

public class QueueLinkedList <T>{

       static Node head;
       
	   // static int size=0;
		static Node front;

		static Node rear=null;
		
		public static <T extends Comparable<T>> void enQueue(T data) {
			Node node = new Node();
			//node.data = data;
			//node.next = null;
			Node temp =new Node() ;
			temp.data=data;
			if(rear==null)
			{
				front=temp;
				rear=temp;
			}
			else
			{
				while(rear.next!=null)
				{
					rear=rear.next;
				}
				rear.next=temp;
				rear=temp;
			}

		}
		
		
		public static <T extends Comparable <T>> void deQueue()
		{
			
			Node temp = null;
			Node temp1 = null;
			if(front==null)
			{
				System.out.println("Queue is empty.");
				
			}
			else
			{
				while(temp1.next!=null)
				{
					temp.data=temp1.data;
				   temp1=temp1.next;
				   System.out.println("deleted"+temp.data);
					
				}
				System.out.println("dequeue last element"+temp1.data);
			}
		}
		
		public static <T extends Comparable <T>> void displayList()
		{
			Node node = front;
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			//System.out.println(node.data);
		}


		public boolean empty() {
			
			return false;
		}

	
}
