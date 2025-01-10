/*Q.Move all zeros at left side of Array
 * arr[] = {1,0,2,3,0,0,4,5,1}
 * Output : arr[] = {1,2,3,4,5,1,0,0,0}
 *
 */
import java.util.Arrays;
import java.util.ArrayList;
public class Program7{
	//T.C : O(n) + O(size) + O(n-size) i.e O(2n) S.C : O(n) worst case	
	public static void moveZeros1(int[] arr){

		ArrayList<Integer> list = new ArrayList<>();
		for(int data:arr){
			if(data!=0) list.add(data);
		}
		int size = list.size();

		for(int i=0;i<size;i++){
			arr[i] = list.get(i);
		}
		for(int i=size;i<arr.length;i++){
			arr[i] = 0;
		}
	}

	//Optimize Approch : T.C : O(n) S.C : O(1)
	public static void moveZeros2(int[] arr){
		
		int i=-1;//we will use to keep on eye on zero value
		int len = arr.length;
		for(int j=0;j<len;j++){
			if(arr[j]==0){
				i=j;
				break;
			}
		}
		//Now we got first O value element index , after that we have to do if we get non zero element then swap with zero and move i and j else move j only
		for(int j=i+1;j<len;j++){
			
			if(arr[j]!=0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}
	public static void main(String[] args){

		int[] arr = {1,0,2,3,0,0,4,5,1};
		moveZeros2(arr);
		System.out.println(Arrays.toString(arr));
	}
}

