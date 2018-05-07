package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class PrimeAnagramQueue {

	public static void main(String[] args) {
Utility utility = new Utility();
		
		System.out.println("Enter the n'th term:");
		
		int number=utility.inputInteger();
		
		int []primeArray=utility.primeNumber(number);
		
		int anagram[]=utility.primeAnagram2D(primeArray);
	
        QueueLinkedList ql=new QueueLinkedList();
   
        for(int i=0;i<158;i++)
        {
        ql.enQueue(anagram[i]);
        }
        
        ql.displayList();

	}

}
