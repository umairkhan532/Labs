package PackageLab;
import java.util.Scanner; 

public class FloydsTriangle {

	public static void main(String[] args) {
			int rows, number =1, counter, j ; 
			Scanner scan = new Scanner(System.in); 
			System.out.println("Enter the number of rows :   ");
			rows = scan.nextInt(); 
			System.out.println("Floyd Triangle");
			System.out.println("***********************");
			for (counter =1; counter <=rows ; counter++) {
				for (j = 1; j<=counter; j++) {
					System.out.print(number+"");
					number++; 
					
				}
				System.out.println();
			}
			
	}

}
