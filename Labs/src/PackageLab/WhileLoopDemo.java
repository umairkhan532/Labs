package PackageLab;

import  java.util.Scanner; 
public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number, sum = 0;
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter an integer below 10:  ");
		number = scan.nextInt(); 
		
		while(number<=10) {
			sum +=number; 
			number++; 
			
		}
		System.out.println("Sum of the numbers from the while loop :   " + sum);
		
	}

}
