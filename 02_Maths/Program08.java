import java.util.Scanner;
/**
 *Q.8 : Print all prime factors of number 
 * Input : 60 
 * Output : 2,3,5
 */
public class Program08{
	
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
		return (cnt==2);
	}
	//T.C : We can't tell becz we don't know number of factors
	public static void primeFact(int n){
	
		if(n<2){
			System.out.println("No prime factors");
		}

		for(int i=2;i<=n;i++){

			if(n%i==0){
				if(checkPrime(i)){
					System.out.print(i+" ");
				}
			}
		}
	}

	//We can make above code better becz we are checking from 2 to N no need of that
	//T.C : Approx : O(sqrt(n)*sqrt(i) 
	public static void primeFact2(int n){

		for(int i=1;i*i<=n;i++){

			if(n%i==0){
				if(i!=1 && checkPrime(i)){
					System.out.print(i+" ");
				}

				if(n%i!=i){
					if(checkPrime(i)){
						System.out.print(n/i+" ");
					}
				}
			}
		}
	}

	//We can more better above code
	public static void primeFact3(int n){

		for(int i=2;i<=n;i++){

			if(n%i==0){
				System.out.print(i+" ");
				while(n%i==0){
					n = n/i;
				}
			}
		}
	}

	//Again we can make better 
	//Optimze code
	public static void primeFact4(int n){
		int temp = n;
		for(int i=2;i*i<=n;i++){

			if(n%i==0){
				System.out.print(i+" ");
				while(n%i==0){
					n = n/i;
				}
			}
		}
		if(n!=1) System.out.print(n+" ");
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeFact(n);
		primeFact2(n);
		primeFact3(n);
		primeFact4(n);
	}
}
