package PackageLab;
import java.util.Scanner; 
public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Please type an integer: ");
		Scanner scan = new Scanner(System.in); 
		
		int x= scan.nextInt(); 
		switch (x) {
		case 1:{
			System.out.println("Value is 1");
			break; 
		}
		case 2:{
			System.out.println("Value is 2");
			break; 
		}
		case 3:{
			System.out.println("Value is 3");
			break; 
		}
		default:{
			System.out.println("Invalid input");
		}
		}
	}

}
