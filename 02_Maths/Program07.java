import java.util.Scanner;
/** Q.7 : GCD/HCF(Greatest Common Divisor)/(Highest Common Factor)
 * Input : n1 = 13 n2 = 26 Output : 13
 * Input : n1 = 4  n2 = 6  Output : 2
 */
public class Program07{
	
	//T.C : O(min(num1,num2) S.C : O(1)
	public static void gcd(int num1,int num2){
		
		int min = Math.min(num1,num2);
		int ans = 1;
		for(int i=min;i>=1;i--){
			if(num1%i==0 && num2%i==0){
				System.out.println("GCD of : " + "(" + num1 + "," + num2 + ")" + "=" + i);
				break;
			}
		}

	}

	public static void gcd2(int num1,int num2){

		while(num1>0 && num2>0){

			if(num1>=num2){
				num1 = num1-num2;
			}else{
				num2 = num2-num1;
			}
		}
		if(num1==0){
				System.out.println("GCD :  = " + num2);
		}else{
			System.out.println("GCD = " + num1);
		}
	}
	//T.C : O(log(pie)(min(num1,num2)) S.C : O(1)	
	public static void gcd3(int num1,int num2){

		while(num1>0 && num2>0){
			if(num1>num2){
				num1 = num1%num2;
			}else{
				num2 = num2%num1;
			}
		}
		if(num1==0) System.out.println("GCD = " + num2);
		else System.out.println("GCD = " + num1);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		gcd(num1,num2);
		gcd2(num1,num2);
		gcd3(num1,num2);
	}
}
