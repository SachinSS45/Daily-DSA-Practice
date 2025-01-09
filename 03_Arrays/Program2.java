/*
 * Q.Second Largest and Second Smallest Element in array without sorting : 
 * 	arr[] = { 1, 2, 4, 7, 7, 5 }
 * 	Output : secondLargest = 5
 * 		 secondSmallest = 2
 */
import java.util.Arrays;
public class Program2{
	
	//Brute-force : T.C : O(nlogn) [sorting] + for finding slargest in array after sorting in worst case it will take O(n)
	public static int secondLargest1(int[] arr){
		
		Arrays.sort(arr);
		int n = arr.length;
		//now we need to check from second last pos which element is not equal to largest that will second largest

		int largest = arr[n-1];
		int slargest = Integer.MIN_VALUE;
		for(int i = n-2;i>=0;i--){
			if(arr[i] != largest){
				slargest = arr[i];
				return slargest;
			}
		}
		return slargest;
	}

	//Better-Approch : In first pass we can find largest and second pass we can find secondLargest 
	//T.C : O(N) [largest] + O(N) [Second Largest] i.e O(2N) and S.C : O(1)
	public static int secondLargest2(int[] arr){

		int largest = arr[0];
		for(int ele : arr){
			if(ele > largest) largest = ele;
		}
		//Now we need to find secondlargest
		int slargest = Integer.MIN_VALUE;
		//we will start checking from 1 index becz if array of size 1 then only largest ele is present 
		for(int i = 1; i < arr.length ; i++){
			if(arr[i] < largest && arr[i] > slargest) slargest = arr[i];
		}
		return slargest;
	}

	//Optimize Approch : In One pass we can find second-Largest T.C : O(N) , S.C : O(1)
	public static int secondLargest3(int[] arr){

		int largest = arr[0];
		int slargest = Integer.MIN_VALUE;

		for(int i=1;i<arr.length;i++){
			//here we are checking if current ele is larger than prev then it is correct to say that previous eleshould be second Largest i.e why firstly we are assigning slargest = largest and second case i.e if we are checking that if the ele is not greater than largest and it is greater than slargest it means we should update slargest
			if(arr[i]>largest){
				slargest = largest;
				largest = arr[i];
			}else if(arr[i]>slargest && arr[i] < largest){
				slargest = arr[i];
			}
		}
		return slargest;
	}
	
	//Optimize Approch : T.C :  O(N) , S.C : O(1)
	public static int secondSmallest(int[] arr){
		
		int smallest = arr[0];
		int secSmallest = Integer.MAX_VALUE;

		for(int i=1;i<arr.length;i++){
			
			if(arr[i]< smallest){
				secSmallest = smallest;
				smallest = arr[i];
			}else if(arr[i]>smallest && arr[i]< secSmallest){
				secSmallest = arr[i];
			}
		}
		return secSmallest;
	}
	public static void main(String[] args){

		int[] arr = {1,2,4,7,7,5};

		int slargest1 = secondLargest1(arr);
		int slargest2 = secondLargest2(arr);
		int slargest3 = secondLargest3(arr);
		System.out.println("SecondLargest ele : " + slargest1 + " : " + slargest2 + " : " + slargest3);

		int ssmallest = secondSmallest(arr);
		System.out.println("SecondSmallest ele : "  + ssmallest);
	}
}
