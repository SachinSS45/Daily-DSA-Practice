/*
 * Q.3 Check a number is palindrome or not: 
 * Input 1 : 121
 * Output 1: true
 * Input 2 : 1234
 * Output 2 : false
 */

import java.util.Scanner;

public class Program03{
	/**
	 * T.C : O(log10(n) S.C: O(1)
	 * This method calculates the reverse of number
	 * @param num is the input number whose reverse need to find
	 * @return reverse of input number and 0 if overflow occurs
	 */
	public static boolean checkPalindrome(int num){
		
		//Here we are checking if number is negative then it will not palindrome eg. -121 after reverse 121-
		if(num < 0) return false;
		int temp = num;
		int rev = 0;//intialize rev to store reverse of number
		//Loop runs until all digits are proceed
		while(num!=0){
			int rem = num%10; // Finding the last digits 
			
			//Check overflow condition
			if(rev > Integer.MAX_VALUE/10){
				return false;
			}
			if(rev < Integer.MIN_VALUE/10){
				return false;
			}

			rev = rev * 10 + rem;//Update the reverse number
			num/=10;//Remove the last digit of number
		}
		return rev==temp;//return the reversed number
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);//Creating scanner object for user input

		System.out.println("Enter the number : ");//Prompt to user to enter number
		int num = sc.nextInt();//Read the number input from user
				       
		// check whether the number is palindrome or not
                System.out.println("Is " + num + " palindrome ?" + checkPalindrome(num));

                // Close the scanner to prevent resource leaks
                sc.close();
	}
}
