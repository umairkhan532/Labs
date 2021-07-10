package PackageLab;

import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {

		int t; 
		boolean issPrime =true; 
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter a number:   ");
		int num = scan.nextInt(); 
		scan.close();
		for(int i = 2; i<=num/2; i++ ) {
			t = num%i; 
			if(t==0) {
				issPrime =false; 
				break; 
			}
		}
			
		
		if (issPrime)
			System.out.println(num + "  is a prime number ");
		else {
			System.out.println(num + "  is not a prime number");
		}
	}

}
