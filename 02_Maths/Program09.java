import java.util.Scanner;
/**
 * Q.9 : Power Exponetation
 *       Input : x = 2 , n = 5 i.e 2^5 = 32
 *       Output : 32
 */
public class Program09{
	
	//T.C : O(power) S.C : O(1)
	public static void answer(int base,int power){

		int ans = 1;

		for(int i=1;i<=power;i++){
			ans = ans * base;
		}

		System.out.println(ans);
	}
	//Optimize : T.C : O(log2(n)) S.C : O(1)
	public static void answer2(int base,int power){

		int ans = 1;
		while(power>0){

			if(power%2 == 1){
				ans = ans * base;
				power -=1;
			}else{
				power = power/2;
				base = base * base;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base : ");
		int base = sc.nextInt();
		System.out.println("Enter power : ");
		int power = sc.nextInt();

		answer(base,power);
		answer2(base,power);
	}
}
