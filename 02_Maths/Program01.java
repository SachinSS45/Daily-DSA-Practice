/*
 *
 * Q.1 : Number of digits in number : 
 *  Input : num = 1234
 *  Output : 4
 */
import java.util.Scanner;
public class Program01{

        // T.C: O(log10(n)), where n is the input number
        // S.C: O(1), constant space as no additional data structures are used
        
        /**
         * This method calculates the number of digits in a given number.
         * @param num The input number whose digits need to be counted.
         * @return The count of digits in the input number.
         */
        public static int digits(int num){

                int count = 0; // Initialize count to store the number of digits

                // Loop runs until all digits are processed
                while(num != 0){
                        count++; // Increment count for each digit
                        num /= 10; // Remove the last digit of the number
                }
                return count; // Return the total count of digits
        }
	/**
         * This method calculates the number of digits in a given number using logarithms.
         * @param num The input number whose digits need to be counted.
         * @return The count of digits in the input number.
         * Note: Assumes num > 0 as log10 is undefined for non-positive numbers.
         */
	public static int digits2(int num){

		int count = (int)(Math.log10(num)+1);//count the digits using log10
		return count;//returning the count of digits
	}

        public static void main(String[] args){

                // Create a Scanner object for user input
                Scanner sc = new Scanner(System.in);

                // Prompt the user to enter a number
                System.out.println("Enter the number: ");
                int num = sc.nextInt(); // Read the number input from the user

                // Display the number of digits in the entered number
                System.out.println("Number of digits in " + num + " : " + digits(num));
		
		//Display the number of digits in the entered number by second way(logarthmic Method)
                System.out.println("Number of digits in " + num + " : " + digits2(num));
                // Close the scanner to prevent resource leaks
                sc.close();
        }
}
