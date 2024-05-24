package labs;

import java.util.Arrays;

//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//


public class labs{

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] numArr = new int[6];
		numArr[0] = 100;
		numArr[1] = 5;
		numArr[2] = 2;
		numArr[3] = 8;
		numArr[4] = 13;
		numArr[5] = 6;

		
		// 2. Print out the first element in the array
		System.out.println(numArr[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(numArr[numArr.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
//		System.out.println(numArr[6]);  Out of bounds exception
		
		// 5. Print out the element in the array at position -1, what happens?
//		System.out.println(numArr[-1]); Out of bounds exception
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int num : numArr) {
			System.out.println(num);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int num : numArr) {
			sum += num;
		}
		System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		double avg = sum / numArr.length;
		System.out.println("average : " + avg);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int num : numArr) {
			if (num % 2 != 0) {
				System.out.println("odd : " + num);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = new String[4];
		names[0] = "Sam";
		names[1]= "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";

		// 12. Calculate the sum of all the letters in the new array
		int strLen = 0;
		for (String name : names) {
			strLen += name.length();
		}
		System.out.println(strLen);
		
		greet("Russell");
		
		String greeting = greet2("Billy");
		System.out.println(greeting);
		
		System.out.println("is string longer? " + isLonger("hello", 2));
		System.out.println("is string longer? " + isLonger("hello", 7));

		System.out.println("does array contain? " + doesContain(names, "Sally"));
		System.out.println("does array contain? " + doesContain(names, "Jen"));
		
		System.out.println("smallest" + smallestInt(numArr));
		
		double[] dblNumArr = new double[numArr.length];
		for (int i = 0; i < numArr.length; i++) {
			dblNumArr[i] = numArr[i];
		}
		System.out.println("average of doubles : " + findAvg(dblNumArr));
		
		strLenArr(names);
		
		System.out.println("more even lengths? " + evenVodd(names));
		
		System.out.println("is a palindrone? " + isPalin("Tacocat"));
		
	}
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		public static void greet (String name) {
			System.out.println("Greetings, " + name);
		}
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		public static String greet2 (String name) {
			String greeting = "Greetings, " + name;
			return greeting;
		}
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? you can't do anything after you return something, both can be reused with different args
		//		c. How are they different? One does something with the data, the other returns a result to be used elsewhere
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		public static boolean isLonger (String str, int num) {
			return str.length() > num;
		}
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		public static boolean doesContain (String[] arr, String str) {
			return Arrays.asList(arr).contains(str);
		}
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		public static int smallestInt (int[] intArr) {
			int smallest = intArr[0];
			for (int num : intArr) {
				if (num < smallest) {
					smallest = num;
				}
			}
			return smallest;
		}
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		public static double findAvg (double[] dblArr) {
			double sum = 0;
			for (double num : dblArr) {
				sum += num;
			}
			return sum / dblArr.length;
		}

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		public static int[] strLenArr (String[] strArr) {
			int[] lenArr = new int[strArr.length];
			for(int i = 0; i < strArr.length; i++) {
				lenArr[i] = strArr[i].length();
				System.out.println("length array position " + i + " is " + lenArr[i]);
			}
			return lenArr;
		}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		public static boolean evenVodd (String[] strArr) {
			int evens = 0;
			int odds = 0;
			for (String str : strArr) {
				if (str.length() % 2 == 0) {
					evens += str.length();
				} else {
					odds += str.length();
				}
			}
			return evens > odds;
		}
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		public static boolean isPalin (String strToCheck) {
			boolean bool = true;
			String str = strToCheck.toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != str.charAt( (str.length() - 1) - i)) {
					bool = false;
					break;
				}
			}
			return bool;
		}


}
	



