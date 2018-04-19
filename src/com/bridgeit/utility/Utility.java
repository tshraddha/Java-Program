package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Utility {
	
	
	public static Scanner scan=new Scanner(System.in);
	
	/**
	 * Function to take user input string.
	 * @return string input
	 */
	public String inputString()
	{
       String input = scan.next(); 
	   return input;
	}
	

	/**
	 * Function to take user input string.
	 * @return string input
	 */
	public String inputString1()
	{
       String input = scan.nextLine(); 
	   return input;
	}
	
	/**
	 * Function to take user input integer.
	 * @return integer input
	 */
	public int inputInteger()
	{
       int input = scan.nextInt(); 
	   return input;
	}
	
	/**
	 * Function to take user input double value.
	 * 
	 * @return double input
	 */
	public double inputDouble()
	{
       double input = scan.nextDouble(); 
	   return input;
	}
	
	/**
	 * Function to take user input boolean value.
	 * 
	 * @return boolean input
	 */
	public boolean inputBoolean()
	{
       boolean input = scan.nextBoolean(); 
	   return input;
	}
	
	/**
	 * Function to take user input long value.
	 * @return long input
	 */
	public long inputLong()
	{
       long input = scan.nextLong(); 
	   return input;
	}
	
	/**
	 * Function to take user input float value.
	 * @return float input
	 */
	public float inputFloat()
	{
       float input = scan.nextFloat(); 
	   return input;
	}
	
		
   /**
    * Function to replace username with name
    * 
    * @param input
    * @param name
    * @return 
    */
public String replaceString(String input,String name)
	{
	   
	 //function to replace initialized input to user input string.
		input= input.replace(" <<UserName>>",name);
		
		return input;
	}
	
   
    
  /**
   * Function to  calculate number of heads and tails turned.
   * 
   * @param flip: How many times to flip a coin.
   */
public void percentHeadTail( int flip)
    {
	   double head=0,tail=0,i;
	   double percentHead,percentTail;
	   {
	  for(i=1;i<=flip;i++) 
		    
	  if(Math.random()<0.5)
	   {
		  System.out.println("Heads");
		  head++;
	    }
	  else
	    {
		  System.out.println("Tails");
		  tail++;
	    }
	  }
		  

	  percentHead=(head/flip)*100;
	  System.out.println("the percentage of no. of heads flipped is :"+percentHead);

	  percentTail=100-percentHead;
	  System.out.println("the percentage of no. of tails flipped is :"+percentTail);
	
    }
   
   
   
  // 3) To find the factors of given number.
   

   
   /**
    * Function to find factors of given number.
    * 
    * @param number is the user input number.
 */
public void factor(int number)  
	{
	 
		int f=2;
		while (number!=1)
		{
			while(number%f==0)
			{
			number=number/f;
			System.out.println(""+f); 
				
		}
			f++;
		}
  
	}
   
   
   // 4)To print the harmonic values.
   
  
   /**
    * Function to calculate N'th Harmonic Series.
 * @param number takes the term to calculate harmonic series
 */
public void Harmonic(int number) 
   {
	   int i;
	   double sum=0.0;
	 
   for (i=1;i<=number;i++)
   {
	   sum=sum+(double)1/i;
	   System.out.println(""+sum);
   }
	   
   }
   
   
   
   // 5) To find the year is a Leap Year or not.

   
  
  /**
   * 
   * Function to check whether year is leap year or not.
   * 
 * @param year to check whether Leap year or not.
 */
public void  leap(int year) 
   {
	 
	   if(year%1000==0)
	   {
	   if((year%100==0) && (year%400==0) && (year%4==0))    
	   
		   
		   {
			   System.out.println(year+"is a Leap Year.");
		   }
		   else
		   {
			   System.out.println(year+" is not a Leap Year."); 
		   }
	   
	   }
   }
   
   
   //6) To find the power of base value.
   
   /**
    * 
    * Function to find the power of base value.
    * 
    * @param times: takes how many powers user wants to take.
    */
public void  Power(int times)
   {
	   int i;
	   
	  for(i=1;i<=times;i++)
	  {
	
		 double r=Math.pow(2, i); 
		System.out.println("2^"+i+"="+r);		 
	  }
	
	   
   }
   
   // 7) Gambler.
  
   
   /**
    * Function Keeps track of the number of times he/she 
    * wins and the number of bets he/she makes.
    * 
    * @param play:Number of times he/she will play
    * @param stack:Stack amount he/she bets on.
    */
public void winloss(int play,int stack,int goal)
   {
	   int i,win=0;
	   double percentWin,percentLoss;
	   for(i=1;i<=play;i++)
	   {
		   //Check the condition for win or loss
		   while((stack>0) && (stack<goal))
			 {
			   
			 //Function to take random values. 
			   if(Math.random()<0.5)
			   
				      {
					   stack++;
					  
				      } 
				   else
				      {
					   stack--;
					   
				     }
			 }
			   if(stack==goal)
			   {
				   win++;
			   }	   
			 }	   
			
	 
	 //Calculate percentage of wins.
	   percentWin=(win/play)*100; 
	   System.out.println("the percentage of wins is:"+percentWin);
	   //Calculate percentage of loss.
	   percentLoss=100-percentWin;
	   System.out.println("the percentage of loss is:"+percentLoss);
	  
   }
   
   
   
/**
 * Function to generate random number and process to distinct coupons.
 * @param sizeArray:Determines the number of coupons.
 */
public void distinctCoupons(int sizeArray)

{
	double distinct=0;
	
	Random randomNum=new Random();
	
	int[] randomArray=new int[sizeArray];

	for(int i=0;i<sizeArray;i++)
	     {
		
		 randomArray[i]=1+randomNum.nextInt(10);
		
          }
		
		int i=0;
		while(distinct!=sizeArray)
		{
			int temp=randomArray[i];
			int random=randomNum.nextInt(10);
			if(temp!=random)
			{
				System.out.println("The distinct number is: "+temp);
				distinct++;
			}
			i++;
			
		}
		
	System.out.println("The number of distinct counter generated is:"+distinct);
	
	
}

 
  
   // 9) Program to print 2D array.

     /**
     * 
     */
  public static PrintWriter printwriter=new PrintWriter(System.out,true);
 
 
      /**
     * 
      * Function to print 2D Array.
      * 
     * @param array
     * @param row
     * @param column
     */
    public static <T> void printArray(T[][] array,int row,int column )
     {
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<column;j++)
    		{
    			printwriter.printf("%s ",array[i][j]);
    		}
    		printwriter.println();
    	}
    		 	 
     }
     
    /**
     * Function has integer form array.
     */
    public void Array()
    {
		System.out.println("Enter number for rows:");
		 int row=inputInteger(); 
		System.out.println("Enter number for colums:");
		int column=inputInteger(); 
		System.out.println("Enter the values in array:");
 	 
 	   Integer array[][]=new Integer[row][column];
 	   
 	  for(int i=0;i<row;i++)
 	  {
 		  for(int j=0;j<column;j++)
 		  {
 			  array[i][j]=inputInteger(); 
 			  
 		  }
 	  }
 	printArray(array,row,column);
 	
    }
    
    /**
     * Function has double form of arrays.
     */
    public void doubleArray()
    {
		System.out.println("Enter number for rows:");
		 int row=inputInteger(); 
		System.out.println("Enter number for colums:");
		int column=inputInteger(); 
		System.out.println("Enter the values in array:");
 	 
 	   Double array[][]=new Double[row][column];
 	   
 	  for(int i=0;i<row;i++)
 	  {
 		  for(int j=0;j<column;j++)
 		  {
 			  array[i][j]=inputDouble(); 
 			  
 		  }
 	  }
 	printArray(array,row,column);
 	
    }
     
    /**
     * Function has boolean form of arrays.
     */
    public void booleanArray()
    {
		System.out.println("Enter number for rows:");
		 int row=inputInteger(); 
		System.out.println("Enter number for colums:");
		int column=inputInteger(); 
		System.out.println("Enter the values in array:");
 	 
 	   Boolean array[][]=new Boolean[row][column];
 	   
 	  for(int i=0;i<row;i++)
 	  {
 		  for(int j=0;j<column;j++)
 		  {
 			  array[i][j]=inputBoolean(); 
 			  
 		  }
 	  }
 	printArray(array,row,column);
 	
    }
     
     
     
     
     
     
     
     //10)Sum of three integer adds to zero.
     
    
    /**
     * 
     * @param noOfUserValue:Determines the number of user input.
     * @return the user input elements feed in array.
     */
    public int[] Array1(int noOfUserValue)
     {
  	   int array1[]=new int[noOfUserValue];
  	   int i;
  	  for(i=0;i<noOfUserValue;i++)
  	  {
  			  array1[i]=scan.nextInt();  
  			
  	  }
  	    return array1;
     }

   /**
    * Function to find Sum of three integer adds to zero.
    * 
   * @param a: contains the 
   */
public void sumResult(int array[])
   {
	   int i,j,k,sum,count=0;
	   for(i=0;i<array.length-2;i++)
	   {
		   for(j=i+1;j<array.length-1;j++)
		   {
			   for(k=j+1;k<array.length;k++)
			   {
				   sum=array[i]+array[j]+array[k];
				   
				   if(sum==0)
				   {
					   count++;
					   
					  System.out.println("Sum of three integer equals zero");
					  break;
				   }
				   else
				   {
					   System.out.println("Sum of three integer not equals zero"); 
					   break;
				   }
				   
			   }
		   }
	   }
	   
	   System.out.println("The count is: "+count);
 
   }
   

	
///11)Euclidean distance from the point (x, y). 

 	
/**
 * 
 * Function to calculate Euclidean distance from the point (x, y).
 * @param x1
 * @param y1
 */
public void  Distance(double x1,double y1)
{
	double x=Math.pow(x1, 2);
	double y=Math.pow(y1, 2);
	double dist =Math.sqrt(x+y);
	System.out.println("The Euclidean distance is: "+dist);
	
}


// 12) Program to find permutation of a String.

public void permute(String string,int starIndex,int endIndex)
{
if(starIndex==endIndex)
{
	System.out.println(string);
}
else
{
	for(int i=starIndex;i<=endIndex;i++)
	{
		string=swap(string,starIndex,i);
		permute(string,starIndex+1,endIndex);

		
	}
}
}
	
public String swap(String string,int i,int j)
{
	char temp;
	char[] charArray=string.toCharArray();
	temp=charArray[i];
	charArray[i]=charArray[j];
	charArray[j]=temp;
	
	return String.valueOf(charArray);
}


// 13) Program for Stop Watch.


/**
 * Function to calculate  elapses between the start and end clicks

 * @param start: determines the user start time
 * @param stop: Determines the user stop time.
 */
public void eTime(long start,long stop)
{
	
	for(long i=start;i<stop;i++)
	{
		
		System.out.println(System.currentTimeMillis());
	}
	
}


//15) Program to roots of Quadratic Equation.


/**
 * Function to calculate roots of Quadratic Equation.
 * 
 * @param a
 * @param b
 * @param c
 */
public void quadraticEqu(double a ,double b,double c)
{
	double delta=(b*b)-(4*a*c);

	
	double root1=-b+(Math.sqrt(delta))/2*a;
	
	double root2=-b-(Math.sqrt(delta))/(2*a);
	
	System.out.println("Root1 of x is: "+root1);
	System.out.println("Root2 of x is: "+root2);
	
}

//16) Program that takes two double command-line arguments t and v and prints the wind chill temp.

/**
 * Function Program that takes two double command-line arguments
 *  temperature and speed and prints the wind chill temperature.
 *  
 * @param temp: Determines the temperature.
 * @param speed: Determines the speed.
 */
public void windChill(double temp,double speed)
{   
	if((temp>50)&&((speed>120)&&(speed<3)))
	{
		/*
		 * Formula to calculate wind chill temperature.
		 * Where wct=wind chill temperature.
		 *       temp=output temperature.
		 *       Speed=User input speed.
		 */
	double wct=35.74+(0.6215*temp)-(35.75*(Math.pow(speed, 0.16)))+(0.4275*temp*(Math.pow(speed, 0.16)));
	
	System.out.println("The wind chill temperature is :"+wct);
	}
	else
	{
		System.out.println("Temperature or speed is out of range");
		
	}
	
	
}



                                       //Algorithm Programs//

// 1)  Anagram Detection.
 
/**
 * Function to check whether the string is anagram or not.
 * 
 * @param s1:Takes the first string from user.
 * @param s2:Takes the second string from user.
 * @return
 */
public void anagramDetect(String string1,String string2)

{
	
	
	String string11 = string1.replaceAll("\\s", "");
	
	String string22 = string2.replaceAll("\\s", "");
	
	
	string1=string11.toLowerCase();
	string2=string22.toLowerCase();
	
	
	
	if(string11.length()!=string22.length())
	{
		System.out.println("Strings are not anagram.");
	}
	else
	{
	
	char[] Char1=string1.toCharArray() ;
	char[] Char2=string2.toCharArray() ;
	
	 Arrays.sort(Char1);
	 Arrays.sort(Char2);
	 
	 boolean result=Arrays.equals(Char1,Char2);
	 if (result==true)
	 {
		 System.out.println(" Anagram.");
	 }
	 else
	 {
		 System.out.println("Anagram.");
	 }
	}
	
 }


//2) Prime Number.

/**
 * Function to find the Prime Number.
 */
public void primeNumber()
{
	
	
	int i,num,numOfPrime=0,k=0;
	
	
	for(num=2;num<=100;num++)
	{
		int count=0;
		
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
					
			{
				count++;
			}
			
		}
		if(count==2)
		{
			//numOfPrime++;
			
		System.out.println(""+num);	
		
		//int[] primeNumArray1=new int[numOfPrime];
		
		  // primeNumArray1[k]=num;
		   
		   //k++;
		}

	}
	
}

//Program to find 1 to 100 prime number that are anagram and palindrome.

public void primeNumAnagram()
{
	
}



// 4)Static Function
public static <T> void print(T[] array )
{
	
		 	 
}

public void binarySearchInt()
{
	int i,first,last,middle,search;
	System.out.println("Enter number of elemnt in array:");
	int n=inputInteger();
	
	System.out.println("Enter elements in array:");
	Integer array[]=new Integer[n];
	for(i=0;i<n;i++)
	{
		array[i]=inputInteger();
	}
	System.out.println("Enter the search element:");
	search=inputInteger();
	first=0;
	last=n-1;
	middle=(first+last)/2;
	while(first<=last)
	{
		if(array[middle]<search)
		{
			first=middle+1;
		}
		//elseif (array[middle]==search);
		{
			System.out.println("Location found"+middle+1);
		}
		//else
		{
			last=middle-1;
			middle=(first+last)/2;
			
		}
		if(first>last)
		{
			System.out.println("not Present");
		}
		
	}
}


public void insertionSortInt()
{
	int i,j,position;
	System.out.println("Enter number of elemnt in array:");
	int n=inputInteger();
	
	System.out.println("Enter elements in array:");
	Integer array[]=new Integer[n];
	for( i=0;i<n;i++)
	{
		array[i]=inputInteger();
	}
	
	for( i=0;i<position;i++)
	{
		for( j=i+1;j<position-1;j++)
		{
			if()
			
	}
	}
	
	
	System.out.println("The Sorted array list are as under:");
	for(i=0;i<n;i++)
	{
		System.out.println(""+array[i]);
	}
	
}


public void bubbleSortInt()
{
	int i,j;
	System.out.println("Enter number of elemnt in array:");
	int n=inputInteger();
	
	System.out.println("Enter elements in array:");
	Integer array[]=new Integer[n];
	for( i=0;i<n;i++)
	{
		array[i]=inputInteger();
	}
	
	for( i=0;i<n;i++)
	{
		for( j=i+1;j<n;j++)
		{
			if(array[i]>array[j])
			{	
		     int temp=array[i];
		     array[i]=array[j];
		        array[j]=temp;
		}
	}
	}
	
	System.out.println("The Sorted array list are as under:");
	for(i=0;i<n;i++)
	{
		System.out.println(""+array[i]);
	}
	
}

public void bubbleSortString()
{
	int i,j;
	System.out.println("Enter number of strings in array:");
	
	int n=inputInteger();
	

	String array[]=new String[n];
	System.out.println("Enter strings in array:");
	
	for( i=0;i<n;i++)
	{
		array[i]=inputString();
	}
	
	for( i=0;i<n;i++)
	{
		for( j=i+1;j<n;j++)
		{
			if(array[i].compareTo(array[j])>0)
			{	
		     String temp=array[i];
		     array[i]=array[j];
		        array[j]=temp;
		}
	}
	}
	
	System.out.println("The Sorted array list are as under:");
	for(i=0;i<n;i++)
	{
		System.out.println(""+array[i]);
	}
	
}
// 10) Vending Machine.

/**
 * Function for Vending Machine.
 * 
 * @param amount:It is the amount the person need to withdraw.
 */
public void vendingMachine(int amount)
{
	
	int array[]={1000,500,100,50,10,5,2,1};
	
	int note=0;
	
	for(int i=0;i<array.length;i++){
	
		if( amount>=array[i] )
		{
		int n =amount/array[i];
		
		System.out.println(""+array[i]+"x"+n);
		
		amount=amount-n*array[i];
		
		note=note+n;
		}
	}
	System.out.println("The number of notes are: "+note);
	}
	
	
	








// 12 )Program to convert temperature from Celsius to farenheit.


/**
 * Function to convert temperature from celsius to farenheit.
 * @param tempInCel:Takes temperature in celsius.
 * @return
 */
public void tempConvert(double tempInCel)
{
	double convrt=(tempInCel*(9/5)+32);
	System.out.println("The converted temperature from "
			+ "celcius to farenheit is:"+convrt+"degree f");
	
}

//11)Program to find day of week by taking input as date.

/**
 * Function to find day of week from date.
 * 
 * @param date:Takes date from command line.
 * @param month:Takes month from command line.
 * @param year:Takes year from command line.
 */
public void dayofWeek(int date,int month,int year)
{
	int yo=(year-(14-month))/12;
	
	int x=yo+(yo/4)-(4/100)+(yo/400);
	
	int mo=month+12*((14-month)/12)-2;
	
	int day=((date+x+31*mo)/12)%7;
	
	System.out.println("The day of respected date is:"+day);

}


//13 )Program to check the Monthly Payment.

/**
 * Function to calculate Monthly Payment.
 * @param principal
 * @param year
 * @param rate
 */
public void monthPayment(double principal,double year,double rate)
{
	double r=rate/(12*100);
	double n=12*year;
	double monthPayment=(principal*r)/(1-(Math.pow((1+r), (-n))));
	System.out.println("The Monthly income is: "+monthPayment+"Rs");

}

	
// 14)Program to compute the square root using Newton's Method. 


/**
 * Function to compute the square root using Newton's Method.
 * 
 * @param number: Takes number from user to find the square root.
 */
public void computeSqrtRoot(float number)
{
	float sqrtRoot=0;
	float temp=0;
	temp=number/2;
	while(number>=0)
	{
		sqrtRoot=temp-((temp*temp)-number)/(2*temp);
		float value=Math.abs(temp-sqrtRoot);
		if(value<0.001)
		{
			number=sqrtRoot;
		}
		else
		{
			temp=sqrtRoot;
		}
	}
	
}


}




