import java.util.Scanner;
/**
 * Q.10 : Give number 'N' , Print all primes till N
 * Input : 13 Ouput : 2,3,5,7,11,13
 */
public class Program10{

	public static boolean checkPrime(int num){
		int cnt = 0;
		for(int i=1;i*i<=num;i++){
			if(num%i==0){
				cnt++;
				if(num/i!=i){
					cnt++;
				}
			}
		}
		return cnt==2;
	}

	//1 : Brute Force T.C : O(n*sqrt(n) S.C : O(1)
	public static void printPrime(int n){

		for(int i=2;i<=n;i++){
			if(checkPrime(i)) System.out.print(i+" ");
		}
	}
	
	//2 : We can use Sieve of Eratosthenes : It will check is number is prime or not in constant time : O(1)
        //T.C : O(n*log(log(n)) S.C : O(n)	
	public static void printPrime2(int n){

		int[] prime = new int[n+1];

		for(int i=2;i<=n;i++){
			prime[i] = 1;
		}

		for(int i=2;i<=n;i++){
			if(prime[i]==1){
				System.out.print(i+" ");
				for(int j=2*i;j<=n;j+=i){
					prime[j] = 0;
				}
			}
		}
	}

	//3. We can again optimize it
	//T.C : O(n*log(log(n)) S.C : O(n)
	public static void printPrime3(int n){

		int[] prime = new int[n+1];
		for(int i=2;i<=n;i++){
			prime[i] = 1;
		}

		for(int i=2;i<=n;i++){
			if(prime[i]==1){
				System.out.print(i+" ");
				for(int j=i*i;j<=n;j+=i){ // becz if we do 2*3 no need to do 3*2
					prime[j]=0;
				}
			}
		}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrime(n);
		printPrime2(n);
	}
}
