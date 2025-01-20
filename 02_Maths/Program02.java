/*
 * Q.2 Reverse of a number : 
 * Input : 1234
 * Output : 4321
 */

import java.util.Scanner;

public class Program02{
	/**
	 * T.C : O(log10(n) S.C: O(1)
	 * This method calculates the reverse of number
	 * @param num is the input number whose reverse need to find
	 * @return reverse of input number and 0 if overflow occurs
	 */
	public static int reverse(int num){
		
		int rev = 0;//intialize rev to store reverse of number
		//Loop runs until all digits are proceed
		while(num!=0){
			int rem = num%10; // Finding the last digits 
			
			//Check overflow condition
			if(rev > Integer.MAX_VALUE/10){
				return 0;
			}
			if(rev < Integer.MIN_VALUE/10){
				return 0;
			}

			rev = rev * 10 + rem;//Update the reverse number
			num/=10;//Remove the last digit of number
		}
		return rev;//return the reversed number
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);//Creating scanner object for user input

		System.out.println("Enter the number : ");//Prompt to user to enter number
		int num = sc.nextInt();//Read the number input from user
				       
		// Display the reverse of the number
                System.out.println("Reverse of " + num + " : " + reverse(num));

                // Close the scanner to prevent resource leaks
                sc.close();
	}
}
