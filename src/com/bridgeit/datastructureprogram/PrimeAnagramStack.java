package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class PrimeAnagramStack {

	public static void main(String[] args) {
       Utility utility = new Utility();
		
		System.out.println("Enter the n'th term:");
		
		int number=utility.inputInteger();
		
		int []primeArray=utility.primeNumber(number);
		
		int anagram[]=utility.primeAnagram2D(primeArray);
	
        StackLinkedList sl=new StackLinkedList();
   
        for(int i=0;i<168;i++)
        {
        	if(anagram[i]!=0)
        	{
        sl.push(anagram[i]);
        	}
        }
        
        sl.display();
        

	}

}
