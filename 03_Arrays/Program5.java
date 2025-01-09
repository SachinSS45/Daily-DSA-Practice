/*Q.5 Left Rotate Array by one position
 *    Input : arr[] = [1,2,3,4,5]
 *    Output : arr[] = [2,3,4,5,1]
 */
import java.util.Arrays;
public class Program5{
	//T.C : O(N) S.C: O(1)	
	public static void rotateArray(int[] arr){

		int temp = arr[0];
		int length = arr.length;
		for(int i=1;i<length;i++){
			arr[i-1] = arr[i];
		}
		arr[length-1] = temp;
	}
	public static void main(String[] args){
	
		int[] arr = {1,2,3,4,5};
		rotateArray(arr);
		System.out.println("After rotation array by one position : " + Arrays.toString(arr));
	}
}
