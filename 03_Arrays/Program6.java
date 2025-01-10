/*Q.Left rotate array by D position
 * Input : arr[] = {1,2,3,4,5,6,7} d = 3
 * Output : arr[] = {4,5,6,7,1,2,3}
 */
import java.util.Arrays;
public class Program6{
	//Brute-Force T.C : O(d) to put in temp array + O(n-d) for shifting + O(d) Again put back into orginal array i.e O(n+d) S.C : O(d)
	public static void leftRotateByD1(int[] arr,int d){

		//We will find the number of time we need to rotate
		int len = arr.length;
		d = d % len;

		//We will take temporary array to store the d elements
		int[] temp = new int[d];

		for(int i=0;i<d;i++){ 
			temp[i] = arr[i];
		}

		//No we can put (len-d)elements at front

		for(int i=d;i<len;i++){
			arr[i-d] = arr[i];
		}
		//put back temp array in original
		//i will start from d=3 is i = 4 therefore arr[4] = we should put temp[0] we can find by using i-(len-d)i.e 4-(7-3) = 4 - 4 = 0 correct 
		for(int i=len-d;i<len;i++){
			arr[i] = temp[i-(len-d)];
		}

	}
	
	public static void reverse(int[] arr,int start,int end){

		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	//Optimize Approch : T.C : O(2n) + S.C : O(1)
	public static void leftRotateByD2(int[] arr,int d){
		
		int len = arr.length;
		d = d % len;
		reverse(arr,0,d-1);
		reverse(arr,d,len-1);
		reverse(arr,0,len-1);
	}
	public static void main(String[] args){

		int[] arr = {1,2,3,4,5,6,7};
		int d = 3;
		leftRotateByD2(arr,d);

		System.out.println("Array after rotating left by " + d + " positions : " + Arrays.toString(arr));
	}
}
