package PackageLab;
import java.util.Scanner; 

public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your number:  ");
		
		int num = scan.nextInt(); 
		
		
		if (num %2 == 0) {
			System.out.println( num + "   : This is an even number !!!!!!");
			
		}
		else {
			System.out.println( num + "   : This is a odd number <><><><>");
		}
	}

}
