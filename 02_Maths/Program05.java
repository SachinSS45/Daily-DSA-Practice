import java.util.Scanner;
/**
 * Print all divisors : 
 * Input : 36
 * Output : 1,2,3,4,6,9,12,18,36
 */
public class Program05{
	
	//T.C : O(n) S.C : O(1)
	public static void divisors(int n){

		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	//T.C : O(sqr(n)) S.C : O(1)
	public static void divisors2(int n){

		for(int i=1;i*i <=n;i++){

			if(n%i==0){
				System.out.print(i+" ");

				if(n/i!=i){
					System.out.print(n/i+" ");
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		divisors(n);
		divisors2(n);
	}
}
