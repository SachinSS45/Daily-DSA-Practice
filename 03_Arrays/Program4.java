/* Q.Remove duplicates in-place from sorted array and return number of unique elements in array
 *  Input : arr[] = [1,1,2,2,2,3,3] -> [1,2,3,....] => Only thing is that we need to put unique elements to front 
 *  Output : 3
 */
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;
public class Program4{
	//Brute Force: T.C : O(N) S.C : O(N) : For set in worst case if all array is of unique elements
	public static int removeDuplicates1(int[] arr){

		Set<Integer> set = new LinkedHashSet<>();
		for(int ele : arr){
			set.add(ele);
		}
		int i=0;
		for(int data : set){
			arr[i] = data;
			i++;
		}
		return i;
	}
	//Optimize : Two Pointer Approch : T.C : O(N) S.C : O(1)
	public static int removeDuplicates2(int[] arr){

		int i=0;//we will start from index 1 becz index 0 ele is unique already

		for(int j = 1; j<arr.length;j++){
			
			if(arr[j]!=arr[i]){
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i+1;

	}
	public static void main(String[] args){

		int[] arr = {1,1,2,2,2,3,3};
		System.out.println(Arrays.toString(arr));
		System.out.println("Number of Unique elements 2nd Approch : " + removeDuplicates2(arr));

		System.out.println("Number of Unique elements 1st Approch  : " + removeDuplicates1(arr));
		System.out.println(Arrays.toString(arr));
	}
}

