package PackageLab;

import java.util.Scanner; 

public class OddOrEven {

	public static void main(String[] args) {
		int num; 
		System.out.println("Please enter an integer   :   ");
		Scanner input = new Scanner(System.in); 
		num = input.nextInt(); 
		
		if (num % 2 == 0 ) {
			System.out.println("Entered number is even");
		}
		else {
			System.out.println("Entered number is odd");
		}
		
	}

}
