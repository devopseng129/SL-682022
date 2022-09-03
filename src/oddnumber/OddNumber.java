package oddnumber;
import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i = sc.nextInt();
	
		String result = null;
		int m;
		for (m=2; m<i; m++) {
			if (i%m==0) {
				result = "The number " + i +" is not a prime number" ;
				break;
			}
			else {
				result = "The number " + i + " is a prime number";
			}
		}
		System.out.println(result);	

	}

}
