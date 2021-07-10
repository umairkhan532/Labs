package PackageLab;

import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner search = new Scanner(System.in); 
		
		System.out.println("Please enter a value for a  :" );
		int a = search.nextInt(); 
		
		System.out.println("Please enter a value for b  :" );
		int b = search.nextInt(); 
		
		
		int m = a*b;
		
		System.out.println("When multiplying a and b we have : " + m);
		
	}
}
