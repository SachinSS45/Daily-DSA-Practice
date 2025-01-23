import java.util.Scanner;
/** Q.6 Prime Number : Number has exactly two factors 1 & itself
 *  Input : n = 11 : factors : 1 & 11 => prime number
 *  Input : n = 4 : factors : 1,2 & 4 => not a prime number
 */
public class Program06{
	//T.C : O(n) S.C : O(1)
	public static void checkPrime(int n){
		int count = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count == 2){
			System.out.println(n + " is a prime number ");
		}else{
			System.out.println(n + " is not a prime number ");
		}
	}
	//T.C : O(n/2)i.e O(n) S.C : O(1)
	public static void checkPrime2(int n){
		
		//if number is less than 2 it means it is not prime number
		if(n<2){
			System.out.println(n + " is not prime number ");
		}
		//n = 2 definetly it is prime number
		if(n==2){
			System.out.println("2 is prime number");
		}
		boolean flag = false;	
		//we are starting from 2 becz 1 and n always divisors of numbers
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag = true;
				break;
			}
		}

		if(flag){
			System.out.println(n + "is not a prime number");
		}else{
			System.out.println(n + " is prime number");
		}
	}
	//T.C : O(sqrt(n)) S.C : O(1)
	public static void checkPrime3(int n){

		int cnt = 0;

		for(int i=1;i*i <=n;i++){
			if(n%i==0){
				cnt++;

				if(n/i!=i){
					cnt++;
				}
			}
		}
		if(cnt==2){
			System.out.println(n + " is prime number");
		}else{
			System.out.println(n + " is not prime number");
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkPrime(n);
		checkPrime2(n);
		checkPrime3(n);
	}
}
