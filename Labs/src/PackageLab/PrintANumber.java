
package PackageLab;

import java.util.Scanner;
public class PrintANumber {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); 
		System.out.println("Type a number");
		int number = reader.nextInt(); 
		
		System.out.println("The number you have typed is    : " + number);
	}
}
