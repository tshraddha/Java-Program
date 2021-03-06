package com.bridgeit.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeit.algorithm.program.BubbleSort;
import com.bridgeit.datastructureprogram.HashList.Node;
import com.bridgeit.objectorientedprograms.QueueLinkedList;

public class Utility {

	public static Scanner scan = new Scanner(System.in);

	/**
	 * Function to take user input string.
	 * 
	 * @return string input
	 */
	public String inputString() {
		String input = scan.next();
		return input;
	}

	/**
	 * Function to take user input string.
	 * 
	 * @return string input
	 */
	public String inputString1() {
		String input = scan.nextLine();
		return input;
	}

	/**
	 * Function to take user input integer.
	 * 
	 * @return integer input
	 */
	public int inputInteger() {
		int input = scan.nextInt();
		return input;
	}
	
	

	/**
	 * Function to take user input double value.
	 * 
	 * @return double input
	 */
	public double inputDouble() {
		double input = scan.nextDouble();
		return input;
	}

	/**
	 * Function to take user input boolean value.
	 * 
	 * @return boolean input
	 */
	public boolean inputBoolean() {
		boolean input = scan.nextBoolean();
		return input;
	}

	/**
	 * Function to take user input long value.
	 * 
	 * @return long input
	 */
	public long inputLong() {
		long input = scan.nextLong();
		return input;
	}

	/**
	 * Function to take user input float value.
	 * 
	 * @return float input
	 */
	public float inputFloat() {
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
	public String replaceString(String input, String name) {

		input = input.replace(" <<UserName>>", name);

		return input;
	}

	/**
	 * Function to calculate number of heads and tails turned.
	 * 
	 * @param flip:
	 *            How many times to flip a coin.
	 */
	public void percentHeadTail(int flip) {
		double head = 0, tail = 0;
		double percentHead, percentTail;
		{
			for (int i = 1; i <= flip; i++)

				if (Math.random() < 0.5) {
					System.out.println("Heads");
					head++;
				} else {
					System.out.println("Tails");
					tail++;
				}
		}

		percentHead = (head / flip) * 100;
		System.out.println("the percentage of no. of heads flipped is :" + percentHead);

		percentTail = 100 - percentHead;
		System.out.println("the percentage of no. of tails flipped is :" + percentTail);

	}

	// 3) To find the factors of given number.

	/**
	 * Function to find factors of given number.
	 * 
	 * @param number
	 *            is the user input number.
	 */
	public void factor(int number) {

		int f = 2;
		while (number != 1) {
			while (number % f == 0) {
				number = number / f;
				System.out.println("" + f);

			}
			f++;
		}

	}

	// 4)To print the harmonic values.

	/**
	 * Function to calculate N'th Harmonic Series.
	 * 
	 * @param number
	 *            takes the term to calculate harmonic series
	 */
	public void Harmonic(int number) {
		int i;
		double sum = 0.0;

		for (i = 1; i <= number; i++) {
			sum = sum + (double) 1 / i;
			System.out.println("" + sum);
		}

	}

	// 5) To find the year is a Leap Year or not.

	/**
	 * 
	 * Function to check whether year is leap year or not.
	 * 
	 * @param year
	 *            to check whether Leap year or not.
	 */
	public void leap(int year) {

		if (year / 1000 >= 1) {

			if ((year % 100 == 0) && (year % 400 == 0) && (year % 4 == 0))

			{
				System.out.println(year + "is a Leap Year.");
			} else {
				System.out.println(year + " is not a Leap Year.");
			}

		}
	}

	// 6) To find the power of base value.

	/**
	 * 
	 * Function to find the power of base value.
	 * 
	 * @param times:
	 *            takes how many powers user wants to take.
	 */
	public void Power(int times) {
		int i;

		for (i = 1; i <= times; i++) {

			double r = Math.pow(2, i);

			System.out.println("2^" + i + "=" + r);
		}

	}

	// 7) Gambler.

	/**
	 * Function Keeps track of the number of times he/she wins and the number of
	 * bets he/she makes.
	 * 
	 * @param play:Number
	 *            of times he/she will play
	 * @param stack:Stack
	 *            amount he/she bets on.
	 */
	public void winloss(int play, int stack, int goal) {
		int i;
		double win = 0, loss = 0;
		double percentWin, percentLoss;

		for (i = 1; i <= play; i++) {
			int cash = stack;

			while ((cash > 0) && (cash < goal)) {

				if (Math.random() > 0.5) {
					cash++;

				} else {
					cash--;

				}
			}
			if (cash == goal) {
				win++;
			} else {
				loss++;
			}
		}

		System.out.println("The number of times won:" + win);

		percentWin = 100 * (win / play);
		System.out.println("the percentage of wins is:" + percentWin);

		percentLoss = 100 - percentWin;
		System.out.println("the percentage of loss is:" + percentLoss);

	}

	/**
	 * Function to generate random number and process to distinct coupons.
	 * 
	 * @param sizeArray:Determines
	 *            the number of coupons.
	 */
	public void distinctCoupons(int sizeArray)

	{

		int[] d = new int[sizeArray];

		int count = 0;

		Random randomNum = new Random();

		for (int i = 0; i < sizeArray; i++) {
			int random = 1 + randomNum.nextInt(sizeArray);
			d[i] = random;
			count++;

			for (int j = 0; j < i; j++) {

				if (d[i] == d[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < sizeArray; i++) {
			System.out.println("The number of distinct counter generated is:" + d[i]);
		}

		System.out.println("The number of count is:" + count);

	}

	// 9) Program to print 2D array.

	public static PrintWriter printwriter = new PrintWriter(System.out, true);

	/**
	 * 
	 * Function to print 2D Array.
	 * 
	 * @param array
	 * @param row
	 * @param column
	 */
	public static <T> void printArray(T[][] array, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				printwriter.printf("%s ", array[i][j]);
			}
			printwriter.println();
		}

	}

	/**
	 * Function has integer form array.
	 */
	public void Array() {
		System.out.println("Enter number for rows:");
		int row = inputInteger();
		System.out.println("Enter number for colums:");
		int column = inputInteger();
		System.out.println("Enter the values in array:");

		Integer array[][] = new Integer[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = inputInteger();

			}
		}
		printArray(array, row, column);

	}

	/**
	 * Function has double form of arrays.
	 */
	public void doubleArray() {
		System.out.println("Enter number for rows:");
		int row = inputInteger();
		System.out.println("Enter number for colums:");
		int column = inputInteger();
		System.out.println("Enter the values in array:");

		Double array[][] = new Double[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = inputDouble();

			}
		}
		printArray(array, row, column);

	}

	/**
	 * Function has boolean form of arrays.
	 */
	public void booleanArray() {
		System.out.println("Enter number for rows:");
		int row = inputInteger();
		System.out.println("Enter number for colums:");
		int column = inputInteger();
		System.out.println("Enter the values in array:");

		Boolean array[][] = new Boolean[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = inputBoolean();

			}
		}
		printArray(array, row, column);

	}

	// 10)Sum of three integer adds to zero.

	/**
	 * 
	 * @param number:Determines
	 *            the number of user input.
	 * 
	 * @return the user input elements feed in array.
	 */
	public int[] Array1(int number) {
		int array1[] = new int[number];
		int i;
		for (i = 0; i < number; i++) {
			array1[i] = scan.nextInt();

		}
		return array1;
	}

	/**
	 * Function to find Sum of three integer adds to zero.
	 * 
	 * @param a:
	 *            contains the
	 */
	public void sumResult(int array[]) {
		int i, j, k, sum, count = 0;
		for (i = 0; i < array.length - 2; i++) {
			for (j = i + 1; j < array.length - 1; j++) {
				for (k = j + 1; k < array.length; k++) {
					sum = array[i] + array[j] + array[k];

					if (sum == 0) {
						count++;

						System.out.println("Sum of three integer equals zero");
						break;
					} else {
						System.out.println("Sum of three integer not equals zero");
						break;
					}

				}
			}
		}

		System.out.println("The count is: " + count);

	}

	/// 11)Euclidean distance from the point (x, y).

	/**
	 * 
	 * Function to calculate Euclidean distance from the point (x, y).
	 * 
	 * @param x1:X
	 *            value
	 * @param y1:Y
	 *            value
	 */
	public void Distance(double x1, double y1) {
		double x = Math.pow(x1, 2);
		double y = Math.pow(y1, 2);
		double dist = Math.sqrt(x + y);
		System.out.println("The Euclidean distance is: " + dist);

	}

	// 12) Program to find permutation of a String.

	/**
	 * @param string:User
	 *            input string to find permutation of.
	 * @param starIndex:starting
	 *            index.
	 * @param endIndex:ending
	 *            index.
	 */
	public void permute(String string, int starIndex, int endIndex) {
		if (starIndex == endIndex) {
			System.out.println(string);
		} else {
			for (int i = starIndex; i <= endIndex; i++) {
				string = swap(string, starIndex, i);
				permute(string, starIndex + 1, endIndex);

			}
		}
	}

	public String swap(String string, int i, int j) {
		char temp;
		char[] charArray = string.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);
	}

	// 13) Program for Stop Watch.

	/**
	 * Function to calculate elapses between the start and end clicks
	 * 
	 * @param start:
	 *            determines the user start time
	 * @param stop:
	 *            Determines the user stop time.
	 */
	public void eTime(long start, long stop) {

		long startTime = System.currentTimeMillis();

		System.out.println(startTime);
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100000; j++) {
				System.out.println(j);
			}
		}

		long stopTime = System.currentTimeMillis();

		System.out.println(stopTime);

		long totalTime = stopTime - startTime;
		System.out.println("total time:" + totalTime / 1000 + "s");

	}

	// 15) Program to roots of Quadratic Equation.

	/**
	 * Function to calculate roots of Quadratic Equation.
	 * 
	 * @param a:User
	 *            input value of a.
	 * @param b:User
	 *            input value of b.
	 * @param c:User
	 *            input value of c
	 */
	public void quadraticEqu(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);

		double root1 = -b + (Math.sqrt(delta)) / 2 * a;

		double root2 = -b - (Math.sqrt(delta)) / (2 * a);

		System.out.println("Root1 of x is: " + root1);
		System.out.println("Root2 of x is: " + root2);

	}

	// 16) Program that takes two double command-line arguments t and v and
	// prints the wind chill temp.

	/**
	 * Function Program that takes two double command-line arguments temperature
	 * and speed and prints the wind chill temperature.
	 * 
	 * @param temp:
	 *            Determines the temperature.
	 * @param speed:
	 *            Determines the speed.
	 */
	public void windChill(double temp, double speed) {
		if ((temp > 50) && ((speed > 120) && (speed < 3))) {
			/*
			 * Formula to calculate wind chill temperature. Where wct=wind chill
			 * temperature. temp=output temperature. Speed=User input speed.
			 */
			double wct = 35.74 + (0.6215 * temp) - (35.75 * (Math.pow(speed, 0.16)))
					+ (0.4275 * temp * (Math.pow(speed, 0.16)));

			System.out.println("The wind chill temperature is :" + wct);
		} else {
			System.out.println("Temperature or speed is out of range");

		}

	}

	// Algorithm Programs//

	// 1) Anagram Detection.

	/**
	 * Function to check whether the string is anagram or not.
	 * 
	 * @param s1:Takes
	 *            the first string from user.
	 * @param s2:Takes
	 *            the second string from user.
	 * @return
	 */
	public void anagramDetect(String string1, String string2)

	{

		string1 = string1.replaceAll("\\s", "");

		string2 = string2.replaceAll("\\s", "");

		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();

		if (string1.length() != string2.length()) {

		} else {

			char[] Char1 = string1.toCharArray();
			char[] Char2 = string2.toCharArray();

			Arrays.sort(Char1);
			Arrays.sort(Char2);

			boolean result = Arrays.equals(Char1, Char2);
			if (result == true) {
				System.out.printf(" Anagram.");
			} else {
				System.out.println("Not Anagram.");
			}
		}

	}

	// 2) Prime Number.

	/**
	 * Function to find prime numbers.
	 * 
	 * @param size:Determines
	 *            the N'th number .
	 * @return: Prime number
	 */
	public int[] primeNumber(int size) {

		int i, num, numOfPrime = 0, k = 0;

		int[] primeNumArray1 = new int[size];

		for (num = 1; num <= size; num++) {

			int count = 0;

			for (i = 1; i <= num; i++) {
				if (num % i == 0)

				{
					count++;
				}

			}
			if (count == 2) {
				numOfPrime++;
				primeNumArray1[k] = num;
				k++;
			}
		}
		int[] primeArray = new int[numOfPrime];
		for (i = 0; i < numOfPrime; i++) {
			primeArray[i] = primeNumArray1[i];
			System.out.println(primeNumArray1[i]);
		}
		return primeArray;
	}

	/**
	 * Function to find the anagram of prime number.
	 * 
	 * @param p1:String
	 *            value.
	 * @param p2:String
	 *            value.
	 */
	public void primeAnagram(String p1, String p2) {
		if (p1.length() != p2.length()) {

		} else {

			char[] ch1 = p1.toCharArray();
			char[] ch2 = p2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			String s1 = new String(ch1);
			String s2 = new String(ch2);

			if (s1.equals(s2)) {
				System.out.println("Anagram" + s1);
			}
		}

	}

	// Program to find 1 to 100 prime number that are anagram and palindrome.

	/**
	 * Function to check anagram of prime number.
	 * 
	 * @param primeNumber:Prime
	 *            Number Array
	 */
	public static boolean primeNumAnagram(int[] primeNumber) {
		System.out.println("abc");
		// String anagram[]=new String[primeNumber.length];
		boolean result = false;
		int x = 0;
		String string1 = "";
		String string2 = "";

		int i, j;
		for (i = 0; i < primeNumber.length - 1; i++) {
			System.out.println(i + "this is i");
			for (j = i + 1; j < primeNumber.length; j++) {
				System.out.println(j + "thcj");
				string1 = "" + primeNumber[i];
				System.out.println(string1 + "kiiji");
				string2 = "" + primeNumber[j];
				result = primeAnagram1(string1, string2);
				/*
				 * System.out.println(s); //System.out.println(r); anagram[x]=s;
				 * x++; } } for(int k=0;k<primeNumber.length-1;i++) {
				 * System.out.println(anagram[k]); }
				 */

			}
		}
		return result;

	}

	public void palindrome(int[] primeNumber) {

		int i, r, temp, k = 0, count = 0, sum = 0;

		int temp1[] = new int[primeNumber.length];

		for (i = 1; i < primeNumber.length - 1; i++) {
			sum = 0;
			temp = primeNumber[i];

			while (primeNumber[i] > 0) {

				r = primeNumber[i] % 10;

				sum = (sum * 10) + r;

				primeNumber[i] = primeNumber[i] / 10;
			}

			if (temp == sum) {
				count++;
				temp1[k] = temp;
				k++;
			}
		}
		int palindrome[] = new int[count];

		for (i = 0; i < count; i++) {
			palindrome[i] = temp1[i];
			System.out.println("Palindrome " + palindrome[i]);
		}

	}

	// 4)Static Function

	/**
	 * @param size:Determines
	 *            the size of array
	 * @return:Returns the string elements in array.
	 */
	public String[] arrayString(int size) {
		String array[] = new String[size];
		int i;
		for (i = 0; i < size; i++) {
			array[i] = inputString();
		}
		return array;
	}

	/**
	 * @param number:Determines
	 *            the size of array.
	 * 
	 * @return :Returns the integer elements in array.
	 */
	public Integer[] arrayInt(int number) {
		Integer array[] = new Integer[number];
		int i;
		for (i = 0; i < number; i++) {
			array[i] = inputInteger();
		}
		return array;
	}

	/**
	 * Generic Function to find the binary search.
	 * 
	 * @param array1:Contains
	 *            elements in array.
	 * @param first:States
	 *            the starting point.
	 * @param last:States
	 *            the ending point.
	 * @param key:Has
	 *            the key to be found.
	 * @return:Returns the value.
	 */
	public <T extends Comparable<T>> int binarySearch(T[] array1, int first, int last, T key) {

		long startTime = System.nanoTime();

		if (first <= last) {

			int middle = first + (last - first) / 2;

			if (((array1[middle]).compareTo(key)) < 0) {
				return binarySearch(array1, middle + 1, last, key);
			} else if (((array1[middle]).compareTo(key)) > 0) {

				return binarySearch(array1, first, middle - 1, key);

			} else {
				return middle;
			}

		}

		long endTime = System.nanoTime();

		long totalTime = endTime - startTime;

		System.out.println("The exectution time for binary search is:" + totalTime);

		return -1;

	}

	/**
	 * Generic Function to find insertion sort.
	 * 
	 * @param array:Contains
	 *            element in array.
	 * @param key:Has
	 *            key to be found.
	 */
	public <T extends Comparable<T>> void insertionSort(T[] array, T key) {
		long startTime = System.nanoTime();
		int i, j;
		for (i = 1; i < array.length; i++) {

			key = array[i];

			j = i - 1;

			while (j >= 0 && array[j].compareTo(key) > 0)

			{
				array[j + 1] = array[j];

				j = j - 1;
			}
			array[j + 1] = key;

		}
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		long stopTime = System.nanoTime();

		long totalTime = stopTime - startTime;

		System.out.println("The total time taken is:" + totalTime);
	}

	/**
	 * Generic Function to find the bubble sort.
	 * 
	 * @param array:Contains
	 *            the element in array.
	 * @return:Returns the sorted array.
	 */
	public static <T extends Comparable<T>> long bubbleSort(T[] array) {

		long startTime = System.nanoTime();
		T temp;
		// Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ((array[i]).compareTo(array[j]) < 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}

		System.out.println("The Sorted array list are as under:");

		for (int i = 0; i < array.length; i++) {
			System.out.println("" + array[i]);
		}
		long endTime = System.nanoTime();

		long totalTime = endTime - startTime;

		System.out.println(totalTime + "nsec");

		return totalTime;
	}

	public Integer[] sortInt(Integer array[]) {
		Arrays.sort(array);

		System.out.println("The Sorted array list are as under:");

		for (int i = 0; i < array.length; i++) {
			System.out.println("" + array[i]);
		}
		return array;
	}

	// 6) Binary Search the word from word list.

	/**
	 * Function to sort words.
	 * 
	 * @param array:Contains
	 *            the elements in array.
	 * @return:Returns the sorted array.
	 */
	public String[] wordSort(String[] array) {
		Arrays.sort(array);

		System.out.println("The Sorted array list are as under:");

		for (int i = 0; i < array.length; i++) {
			System.out.println("" + array[i]);
		}
		return array;
	}

	/**
	 * Function to binary search word from word list.
	 * 
	 * @param stringArray1:Contains
	 *            the string elements in array.
	 * @param start:States
	 *            the starting point.
	 * @param end:States
	 *            the ending point.
	 * @param key:Has
	 *            the key to be found.
	 * @return
	 */
	public int binarySearchWord(String[] stringArray1, int start, int end, String key) {
		String array1[] = wordSort(stringArray1);

		if (end >= start) {
			int middle = start + (end - start) / 2;

			if ((array1[middle]).compareTo(key) > 0) {
				return binarySearchWord(stringArray1, start, middle - 1, key);

			} else if (((stringArray1[middle]).compareTo(key)) < 0) {
				return binarySearchWord(stringArray1, middle + 1, end, key);

			} else {
				return middle;
			}

		}
		return -1;

	}

	// 9) Merge Sort

	/**
	 * Functions to do Merge Sort of list of Strings.
	 * 
	 * @param n1:Contains
	 *            half of elements.
	 * @param n2:Contains
	 *            later half of elements.
	 */
	public void merge(int n1, int n2) {
		int i;

		int array1[] = new int[n1];

		for (i = 0; i < n1; i++) {
			array1[i] = inputInteger();

		}

		int array2[] = new int[n2];

		for (i = 0; i < n2; i++) {
			array2[i] = inputInteger();
		}

	}

	// 5) Find your Number.

	/**
	 * Function to find the number.
	 * 
	 * @param array:Contains
	 *            the rangepower to find the number.
	 * @return
	 */
	public int findNumber(int first, int end) {

		int middle = 0;

		if (first <= end) {
			middle = first + (end - first) / 2;
			System.out.println(middle);
			System.out.println("The range is between:" + first + "to" + end);

			System.out.println("Enter true or false");

			boolean answer = inputBoolean();

			if (answer == true) {
				return findNumber(middle + 1, end);
			} else if (answer == false) {
				return findNumber(first, middle - 1);
			} else {

			}

		}

		return middle;

	}

	// 9) Merge Sort

	/**
	 * @param array:Contains
	 *            the elements in array.
	 * @param left:starting
	 *            point.
	 * @param right:ending
	 *            point.
	 */
	public void sort(int array[], int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			sort(array, left, middle);

			sort(array, middle + 1, right);

			merge(array, left, middle, right);
		}
	}

	/**
	 * @param array:Contains
	 *            the elements in array.
	 * @param left:Starting
	 *            point.
	 * @param middle:middle
	 *            point.
	 * @param right:ending
	 *            point.
	 */
	public void merge(int array[], int left, int middle, int right) {

		int i, j;

		int n1 = middle - left + 1;
		int n2 = right - middle;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (i = 0; i < n1; ++i) {
			leftArray[i] = array[left + i];

		}
		for (j = 0; j < n2; ++j) {
			rightArray[j] = array[middle + 1 + j];

		}

		i = 0;
		j = 0;

		int k = left;

		while ((i < n1) && (j < n2)) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (i < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}

	}

	public void mergedArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// 10) Vending Machine.

	/**
	 * Function for Vending Machine.
	 * 
	 * @param amount:It
	 *            is the amount the person need to withdraw.
	 */
	public void vendingMachine(int amount) {

		int array[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };

		int note = 0;

		for (int i = 0; i < array.length; i++) {

			if (amount >= array[i]) {
				int n = amount / array[i];

				System.out.println("" + array[i] + "x" + n);

				amount = amount - n * array[i];

				note = note + n;
			}
		}
		System.out.println("The number of notes are: " + note);
	}

	// 12 )Program to convert temperature from Celsius to farenheit.

	/**
	 * Function to convert temperature from celsius to farenheit.
	 * 
	 * @param tempInCel:Takes
	 *            temperature in celsius.
	 * @return
	 */
	public void tempConvert(double tempInCel) {
		double convrt = (tempInCel * (9.0 / 5) + 32);
		System.out.println("The converted temperature from " + "celcius to farenheit is:" + convrt + "degree f");

	}

	// 11)Program to find day of week by taking input as date.

	/**
	 * Function to find day of week from date.
	 * 
	 * @param date:Takes
	 *            date from command line.
	 * @param month:Takes
	 *            month from command line.
	 * @param year:Takes
	 *            year from command line.
	 */
	public void dayofWeek(int date, int month, int year) {
		int yo = year - ((14 - month) / 12);

		int x = yo + (yo / 4) - (yo / 100) + (yo / 400);

		int mo = month + 12 * ((14 - month) / 12) - 2;

		int day = (date + x + (31 * mo) / 12) % 7;

		String[] weekDay = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday" };

		System.out.println("The day of respected date is:" + weekDay[day]);

	}

	// 13 )Program to check the Monthly Payment.

	/**
	 * Function to calculate Monthly Payment.
	 * 
	 * @param principal:Principal
	 *            amount of loan
	 * @param year:Number
	 *            of year.
	 * @param rate:Rate
	 *            of interest.
	 */
	public void monthPayment(double principal, double year, double rate) {
		double r = rate / (12 * 100);
		double n = 12 * year;
		double monthPayment = (principal * r) / (1 - (Math.pow((1 + r), (-n))));
		System.out.println("The Monthly income is: " + monthPayment + "Rs");

	}

	// 14)Program to compute the square root using Newton's Method.

	/**
	 * Function to compute the square root using Newton's Method.
	 * 
	 * @param number:
	 *            Takes number from user to find the square root.
	 */
	public void computeSqrtRoot(double number) {
		double temp;
		double epsilon = 1e-15;
		temp = number;
		while (Math.abs(temp - (number / temp)) > epsilon * temp) {
			temp = ((number / temp) + temp) / 2.0;
		}
		System.out.println("the square root using Newton's Method:" + temp);

	}

	// 15) Program to convert a static function to Binary.

	/**
	 * Function to convert decimal number to binary.
	 * 
	 * @param decimalNum:the
	 *            user decimal integer.
	 */

	/**
	 * Function to convert decimal number to binary.
	 * 
	 * @param decimalNum:User
	 *            input to convert into binary.
	 * @return
	 */
	public String convertBinary(int decimalNum) {
		String string1 = "";
		int value = 0;
		while (decimalNum > 0) {
			value = decimalNum % 2;

			string1 = value + string1;

			decimalNum = decimalNum / 2;

		}

		while (string1.length() < 8) {
			string1 = 0 + string1;
		}
		System.out.println("The converted decimal number to binary is: " + string1);
		return string1;
	}

	public void convertDecimal(String binaryString) {

		char[] arrayBinary = binaryString.toCharArray();

		double sum = 0;
		int j = 0;
		for (int i = arrayBinary.length - 1; i >= 0; i--) {

			int binaryNum = Integer.parseInt(Character.toString(arrayBinary[j]));

			sum = sum + ((binaryNum) * Math.pow(2, i));
			j++;
		}
		System.out.println(sum);

	}

	/**
	 * Function to swap nibbles.
	 * 
	 * @param decimalNum:
	 *            User input in decimal form.
	 */
	public String swap(int decimalNum) {
		String a = convertBinary(decimalNum);

		String string1, string2, temp1, temp2, temp;

		string1 = a.substring(0, 4);
		temp1 = string1;
		System.out.println("First half of string before swapping:" + temp1);
		string2 = a.substring(4, 8);
		temp2 = string2;
		System.out.println("Later half of string before swapping:" + temp2);

		temp = string1;
		string2 = string1;
		string1 = temp;
		System.out.println("Strings after swapping:");
		// System.out.println(string1);
		// System.out.println(string2);
		String stringAfterSwap = temp2 + temp1;
		System.out.println(stringAfterSwap);

		return stringAfterSwap;
	}

	/**
	 * 
	 * 
	 * @param stringAfterSwap
	 */
	public void convertDecimal1(String stringAfterSwap) {
		char[] arrayBinary = stringAfterSwap.toCharArray();
		// System.out.println(arrayBinary.length);
		double sum = 0;

		for (int i = 0; i < arrayBinary.length; i++) {

			int binaryNum = Integer.parseInt(Character.toString(arrayBinary[i]));

			sum = sum + ((binaryNum) * Math.pow(2, i));

			// System.out.println(sum);

		}
		System.out.println(sum);

	}

	/**
	 * Function to determine the days.
	 * @param month:Takes the month from the user.
	 * @param days:Takes the day from the user.
	 * @param year:Takes the year from the user.
	 * @return
	 */
	public int day(int month, int days, int year) {
		int yo = year - ((14 - month) / 12);

		int x = yo + (yo / 4) - (yo / 100) + (yo / 400);

		int mo = month + 12 * ((14 - month) / 12) - 2;

		int d = (days + x + (31 * mo) / 12) % 7;

		return d;
	}

	/**
	 * @param year:Takes the year .
	 * @return:returns the boolean value whether the year is leap year or not.
	 * 
	 */
	public boolean leapYear(int year) {
		if ((year % 100 == 0) && (year % 400 == 0) && (year % 4 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Function to find the Catalian Number.
	 * 
	 * @param number:Contains the number for test cases.
	 */
	public void catalianNumber(double number) 
	{
		
		double t=2*number;
		double t1=number+1;
		double catlianNo = factorial(t) / (factorial(t1) * factorial(number));

		System.out.println(" " + catlianNo);
	}

	public double factorial(double number) {
		double fact = 1;

		for (int i = 1; i <= number; i++)
		{
			fact = fact * i;
		}
//System.out.println(fact);
		return fact;
	}

	/**
	 * Function to check whether the number is prime or not.
	 * 
	 * @param number:Takes
	 *            the n'th term from user.
	 * @return: boolean value.
	 */
	public boolean prime(int number) {
		int c = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				c++;
		}
		if (c == 2)
			return true;
		else
			return false;
	}

	/**
	 * Function to print the prime number in 2 d array.
	 * 
	 * @param row:Takes
	 *            the number of rows.
	 * @param col:Takes
	 *            the number of column.
	 * @return
	 */
	public int[][] prime2d(int row, int col) {

		int array[][] = new int[row][col];
		int[][] prime = new int[row][col];

		int c = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = c;
				c++;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (prime(array[i][j])) {
					prime[i][j] = array[i][j];
				} else {
					prime[i][j] = 0;
				}

			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (prime[i][j] != 0) {

					System.out.print(String.format("%5d",prime[i][j]));
				}
			}

			System.out.println();
		}

		return prime;
	}

	public static boolean primeAnagram1(String p1, String p2) {

		boolean flag = false;
		int x = 0;

		if (p1.length() != p2.length()) {
			flag = false;
		} else {

			char[] ch1 = p1.toCharArray();
			char[] ch2 = p2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			String s1 = new String(ch1);
			String s2 = new String(ch2);

			if (s1.equals(s2)) {
				flag = true;
			} 
			else {
				flag = false;
			}

		}

		return flag;

	}

	/*
	 * public static primeNumNonAnagram(int[] primeNumber) { boolean
	 * nonAnagram=new String[100];
	 * 
	 * String string1 = ""; String string2 = "";
	 * 
	 * int i, j; for (i = 0; i < primeNumber.length-1; i++) { for (j = i + 1; j
	 * < primeNumber.length; j++) { string1 = "" + primeNumber[i]; string2 = ""
	 * + primeNumber[j]; nonAnagram=primeNonAnagram1(string1, string2);
	 * //System.out.println(r); } } return nonAnagram;
	 * 
	 * }
	 */
	/*
	 * public static boolean primeNonAnagram1(String p1,String p2) { boolean
	 * flag=false; int x=0;
	 * 
	 * if (p1.length() != p2.length()) {
	 * 
	 * } else {
	 * 
	 * char[] ch1 = p1.toCharArray(); char[] ch2 = p2.toCharArray();
	 * 
	 * Arrays.sort(ch1); Arrays.sort(ch2);
	 * 
	 * String s1=new String(ch1); String s2=new String(ch2);
	 * 
	 * if(s1.equals(s2)) { flag=false;
	 * 
	 * } else { flag= true; }
	 * 
	 * } return flag;
	 * 
	 * }
	 */

	/**
	 * Function to check prime anagram number.
	 * 
	 * @param primeArray:Contains prime number.
	 * @return
	 */
	public int[] primeAnagram2D(int[] primeArray) {
		boolean result = false;

		int[] anagram = new int[primeArray.length];
		int x = 0;
		int count=0;
		String string1 = "";
		String string2 = "";

		int i, j;
		for (i = 0; i < primeArray.length - 1; i++) {

			for (j = i + 1; j < primeArray.length; j++) {

				string1 = "" + primeArray[i];

				string2 = "" + primeArray[j];

				result = primeAnagram1(string1, string2);

				if (result == true) {
					anagram[x++] = primeArray[i];
					anagram[x] = primeArray[j];
					x++;


				}

			}
		}

	
	System.out.println("The Anagram Numbers are:");
		for (i = 0; i < 158; i++) 
		{
			
			System.out.println(anagram[i]);
		}

		return anagram;

	}

	/**
	 * 
	 * @param anagram:Contains Anagram number.
	 */
	public void prime2DAnagram(int[] anagram) {
	
		int array[][] = new int[10][100];

		
		Arrays.sort(anagram);
		

		int k=0;
		int temp[]=new int[anagram.length];
		for(int  i=0;i<anagram.length-1;i++)
		{
			if(anagram[i]!=anagram[i+1])
			{
				temp[k++]=anagram[i];
			}
		}
		/*for(int  i=1;i<k-1;i++)
		{
		System.out.println(temp[i]);
		}*/
		
        int x = 0;
		int c = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = c;
				c++;
			}
		}

		x = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {

				if (array[i][j] == temp[x]) {
	

					x++;
				} else {
					
					array[i][j] = 0;
					
				}
			}
		}
		System.out.println("Prime Anagrm 2D Array");
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 100; j++) {

				if (array[i][j] != 0) {

					System.out.print(String.format("%5d",array[i][j] ));
				}
			}

			System.out.println();
		}



	}
	/*
	 * public static int[] primeNonAnagram2D(int [] primeArray) { boolean
	 * result=false; int count=0;
	 * 
	 * int[] nonAnagram=new int[100]; System.out.println(nonAnagram.length); int
	 * x=0,y=0; String string1 = ""; String string2 = "";
	 * 
	 * int i, j; for (i = 0; i < primeArray.length-1 ; i++) {
	 * 
	 * for (j = i + 1; j < primeArray.length-1; j++) {
	 * 
	 * string1 = "" + primeArray[i];
	 * 
	 * string2 = "" + primeArray[j];
	 * 
	 * result= primeNonAnagram1(string1, string2); System.out.println(result);
	 * if(result==true) { nonAnagram[x]=primeArray[i];
	 * nonAnagram[++x]=primeArray[j]; //x++; count++; }
	 * 
	 * } } int []nonAnagram1=new int[count]; for (i = 0; i < count; i++) {
	 * nonAnagram1[i]=nonAnagram[i]; //System.out.println(primeNumArray1[i]); }
	 * return nonAnagram1; }
	 */

	/*
	 * public void prime2DAnagram(int[] anagram, int[] nonAnagram) {
	 * 
	 * int temp[][]=new int[anagram.length][nonAnagram.length]; int i,k,l;
	 * 
	 * for( i=0;i<anagram.length-1;i++) {
	 * 
	 * temp[i][0]=anagram[i];
	 * 
	 * }
	 * 
	 * for(i=0;i<nonAnagram.length-1;i++) { temp[i][1]=nonAnagram[i]; }
	 * 
	 * System.out.println("The final result is:");
	 * 
	 * for(k=0;k<temp.length;k++) { for(l=0;l<temp[i].length;l++) {
	 * if(temp[k][l]!=0) { System.out.print(temp[k][l]); } }
	 * System.out.println();
	 * 
	 * }
	 * 
	 * }
	 */
	
	/**
	 * Function to write the file.
	 * @param str:Contains the file string
	 * @param table:Contains the data in the node.
	 */
	public void write1(String str,Node[] table) {
		try
		{
			PrintStream o=new PrintStream(new File(str));
			System.setOut(o);
			
			for(int i=0;i<table.length;i++)
			{
				Node t=table[i];
				while(t!=null)
				{
					System.out.print(t.data+" ");
					t=t.next;
				}
				
			}
			
		}catch(Exception e){
			System.out.println("oops");
		}
			
		}

	/**
	 * Function to manage the inventory data.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public void InventoryDataManagement() throws IOException {
		//System.out.println("Enter your Choice...");
		//System.out.println("Enter 1 for Rice");
		//System.out.println("Enter 2 for pulses");
		//System.out.println("Enter 3 for Wheat");
		
		//int choice=inputInteger();
		
		//switch(choice)
		//{
		//case 1:
			 System.out.println("Enter the name of rice:");
		   	   String riceName=inputString();
		   	   System.out.println("Enter the price per kg:");
		   	   int ricePrice=inputInteger();
		   	   System.out.println("Enter how many kg.?");
		   	   int riceKg=inputInteger();
		   	 //  System.out.println("The total amount to pay");
		   	   int amount=ricePrice*riceKg;
		   	   System.out.println("Total amount: "+amount);
		   	   System.out.println(amount);
		   	JSONObject obj = new JSONObject();
			obj.put("Rice Name", riceName);
			obj.put("Rice Price", ricePrice);
			obj.put("Rice Kg", riceKg);
			obj.put("Total amount ", amount);
			System.out.println(obj);
			try (FileWriter file = new FileWriter("/home/bridgeit/shraddha/JsonExample.json")) {
				file.write(obj.toJSONString());
				System.out.println();
				System.out.println("Successfully Copied JSON Object to File...");
				System.out.println("\nJSON Object: " + obj);
			}
		
		//case 2:
			System.out.println("Enter the name of pulse:");
	   	   String pulseName=inputString();
	   	   System.out.println("Enter the price per kg:");
	   	   int pulsePrice=inputInteger();
	   	   System.out.println("Enter how many kg.?");
	   	   int pulseKg=inputInteger();
	   	   System.out.println("The total amount to pay");
	   	   int amountPulse=pulsePrice*pulseKg;
	   	   System.out.println(amountPulse);
	   	JSONObject obj1 = new JSONObject();
		obj1.put("Pulse Name", pulseName);
		obj1.put("Pulse Price", pulsePrice);
		obj1.put("Pulse Kg", pulseKg);
		obj1.put("Total amount to pay", amountPulse);
		System.out.println(obj1);
		try (FileWriter file = new FileWriter("/home/bridgeit/shraddha/JsonExample.json")) {
			file.write(obj1.toJSONString());
			System.out.println();
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj1);
		}
		
		//case 3:
			System.out.println("Enter the name of wheat:");
	   	   String wheatName=inputString();
	   	   System.out.println("Enter the price per kg:");
	   	   int wheatPrice=inputInteger();
	   	   System.out.println("Enter how many kg.?");
	   	   int wheatKg=inputInteger();
	   	   System.out.println("The total amount to pay");
	   	   int amountWheat=wheatPrice*wheatKg;
	   	   System.out.println(amountWheat);
	   	JSONObject obj2 = new JSONObject();
		obj2.put("Wheat Name", wheatName);
		obj2.put("Wheat Price", wheatPrice);
		obj2.put("Wheat Kg", wheatKg);
		obj2.put("Total amount to pay", amountWheat);
		System.out.println(obj2);
		try (FileWriter file = new FileWriter("/home/bridgeit/shraddha/JsonExample.json")) {
			file.write(obj2.toJSONString());
			System.out.println();
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj2);
		}
				
}
	
	
	/**
	 * Function to validate the full name.
	 * 
	 * @param fullname:Takes the full name to validate the name.
	 * @return:Return the boolean value.
	 */
	public boolean nameValidate(String fullname)
	{
		return Pattern.matches("[a-zA-Z\\s]*",fullname);
	}
	
	/**
	 * Function to validate the phone number.
	 * 
	 * @param number:Takes the number to validate the phone number.
	 * @return:Returns the boolean value.
	 */
	public boolean numberValidate(String number)
	{
		return Pattern.matches("[789]{1}[0-9]{9}",number);
	}
	
	
	/**
	 *Function to implement regular expression. 
	 */
	public void regularExpression() {
		
String string1= "Hello <<name>>, We have your full name as <<full name>> in our system.";
String string2="your contact number is 91-xxxxxxxxxx.";
String string3= "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";	
        System.out.println("Enter the name:");
        String name=inputString();	
		string1 = string1.replace("<<name>>", name);
		System.out.println("Enter full name:");
		String fullname=inputString();
		string1=string1.replaceAll("<<full name>>", fullname);
		boolean result=nameValidate(fullname);
		System.out.println("Name Validation result:"+result);
		
		System.out.println("Enter the number:");
		String number=inputString();
		string2=string2.replaceAll("xxxxxxxxxx",number);
		boolean result1=numberValidate(number);
		System.out.println("Number validation result:"+result1);
		
		System.out.println("Enter the date:");
		String date=inputString();
		string3=string3.replaceAll("01/01/2016",date);
		
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		
	}
	
	
	/**
	 *Function to initialize deck of card. 
	 */
	public void deckOfCards() {
		
String[] suit = { "Spades", "Hearts", "Diamonds", "Clubs" };
String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		 int n = suit.length * rank.length;
	        String[] deck = new String[n];
		// Initialize cards
		for (int i = 0; i < rank.length; i++) 
		{
			for(int j=0;j<suit.length;j++)
			{
		
				 deck[suit.length*i + j] = rank[i] + " of " + suit[j];
		}
		}
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++)
		{
			 int random = i + (int) (Math.random() * (n-i));

			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}

		// Display the all the cards
		int l=0;
		String twoDArray[][]=new String[4][9];
		for (int i = 0; i < 4; i++) 
		{
			System.out.println("Player:"+i);
			for (int j = 0; j < 9; j++) 
			{
			twoDArray[i][j]=deck[l++];
			System.out.println("\t"+twoDArray[i][j]+"\t\t");
		}
			System.out.println();
	}
}

	/**
	 * Function to initialize the deck of card in the queue.
	 */
	public void deckOfCardsQueue() {
		
String[] suit = { "Spades", "Hearts", "Diamonds", "Clubs" };
String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
				 int n = suit.length * rank.length;
			        String[] deck = new String[n];
				// Initialize cards
				for (int i = 0; i < rank.length; i++) 
				{
					for(int j=0;j<suit.length;j++)
					{
				
						 deck[suit.length*i + j] = rank[i] + " of " + suit[j];
				}
				}
				// Shuffle the cards
				for (int i = 0; i < deck.length; i++)
				{
					 int random = i + (int) (Math.random() * (n-i));

					String temp = deck[random];
					deck[random] = deck[i];
					deck[i] = temp;
				}

				// Display the all the cards
				int l=0;
				String twoDArray[][]=new String[4][9];
				for (int i = 0; i < 4; i++) 
				{
					System.out.println("Player:"+i);
					for (int j = 0; j < 9; j++) 
					{
					twoDArray[i][j]=deck[l++];
					
					
					System.out.println("\t"+twoDArray[i][j]+"\t\t");
				}
					System.out.println();
			}
				
			
				
				
			
		}

/*	public static void bubbleSort(String array) {

		
		T temp;
		// Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ((array[i]).compareTo(array[j]) < 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}*/
	
	/**
	 * Function to take the stock report.
	 */
	
	public void stockReport() {
   JSONParser parser = new JSONParser();
	try {

		Object obj = parser.parse(new FileReader("/home/bridgeit/shraddha/stock.json"));
		JSONObject jsonObject = (JSONObject) obj;
		//JSONArray list = (JSONArray) jsonObject.get("choice");
		
		System.out.println("Enter the choice:");
		System.out.println("Enter 1 for abDynamics");
		System.out.println("Enter 2 for LandT");
		System.out.println("Enter 3 for Syntel");		
		int choice=inputInteger();
		
		switch(choice)
		{
		case 1:System.out.println("Details of AB Dynamics");
			   String share1=jsonObject.get("abDynamic").toString();
			   JSONArray list1 = (JSONArray) jsonObject.get("share1");
			   System.out.println("AB Dynamics"+share1);
			   Iterator<String> iterator1 = list1.iterator();
				while (iterator1.hasNext())
				{
					System.out.println(iterator1.next()); 
				}
		case 2:System.out.println("Details of L&T ");
		   String share2=jsonObject.get("LandT").toString();
		   JSONArray list2 = (JSONArray) jsonObject.get("share1");
		   System.out.println("L&T"+share2);
	       Iterator<String> iterator2 = list2.iterator();
			while (iterator2.hasNext())
			{
				System.out.println(iterator2.next()); 
			}   
		case 3:System.out.println("Details of Syntel ");
		   String share3=jsonObject.get("Syntel").toString();
		   JSONArray list3 = (JSONArray) jsonObject.get("share3");
		   System.out.println("Syntel"+share3);
		  @SuppressWarnings("unchecked") Iterator<String> iterator3 = list3.iterator();
			while (iterator3.hasNext())
			{
				System.out.println(iterator3.next()); 
			} 
		}
	
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
				
		
		
}

	
	
	
	


	
	
	

		
	
	
	
	


