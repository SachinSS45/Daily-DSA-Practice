/* Q.Check if array is sorted or not
 *  arr = [1,2,2,3,3,4] Output : true
 *  arr = [1,2,1,3,5] Output : false
 */

public class Program3{
	
	public static boolean isSorted(int[] arr){

		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]) return false;
		}
		return true;
	}
	public static void main(String[] args){
		
		int[] arr = {1,2,1,3,4};
		
		if(isSorted(arr))
			System.out.println("Array is sorted");
		else
			System.out.println("Array is not sorted");

	}
}
