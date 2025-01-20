import java.util.Scanner;

public class Program04{
	static boolean armstrongNumber(int n) {
        // code here
		int temp = n;
		int sum = 0;
        
        	//Divide till all numbers extracted
        	while(temp!=0){
           		int rem = temp%10;
           		sum = sum + rem*rem*rem;//Doing cube of everydigit and adding in sum
            		temp/=10;
        	}
        	return sum==n;//comparing sum with original number
    	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(armstrongNumber(n)){
			System.out.println(n + " is Armstrong Number " );
		}else{
			System.out.println(n + " is not Armstrong Number ");
		}
	}
}
