package PackageLab;
import java.util.Scanner; 
public class ReverseANumber {

	public static void main(String[] args) {

		
		int num =  0; 
		int reverse = 0; 
		System.out.println("Please enter a number to reverse it:   ");
		Scanner scan = new Scanner(System.in); 
		num = scan.nextInt(); 
		
		while(num != 0) {
			reverse *= 10;
			reverse =  reverse +num %10; 
			num = num/10; 
		}
		System.out.println("Reverse of input number is :  " + reverse);
	}
	

}
