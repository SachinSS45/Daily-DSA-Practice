import java.util.Scanner;
import java.util.Arrays;

class ArraysQuestions{
	
	public static int smallest1(int[] arr){

		int min = Integer.MAX_VALUE;

		for(int ele : arr){
			if(ele < min ) min = ele;
		}
		return min;

	}

	public static int smallest2(int[] arr){

		Arrays.sort(arr);
		return arr[0];
	}

	public static int max1(int[] arr){

		int max = Integer.MIN_VALUE;

		for(int ele : arr) {
			if(ele > max ) max = ele;
		}
		return max;
	}

	public static int max2(int[] arr){

		Arrays.sort(arr);

		return arr[arr.length-1];
	}

	//Q.3 Solution : 
	public static void secondSmallAndLargest(int[] arr){
		

	}
	public static void main(String[] args){

		/* Q.1 : Find the smallest Number in Array 
			Ex : 1 
			Input : arr[] = {2,5,1,3,0};
			Output : 0
		*/

		Scanner sc = new Scanner(System.in);//It is used to take the input present in util package
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements in array : ");

		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));
		
		System.out.println("The smallest number in the array is : " + smallest1(arr));
		System.out.println("The smallest number in the array is : " + smallest2(arr));

		
		/* Q.2 : Find the largest Number in Array 
			Ex : 1 
			Input : arr[] = {2,5,1,3,0};
			Output : 5
		*/

		System.out.println("The largest ele in the array is : " + max1(arr));
		System.out.println("The largest ele in the array is : " + max2(arr));

		/* Q.3 : Find the second smallest and second largest in array : 
		 	Ex : 1 
			Input : [1,2,4,7,7,5]
			Output : 
			 Second Smallest : 2
			 Second Largest : 2
		*/
		
	}
}
