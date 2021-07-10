package PackageLab;

import java.util.Scanner; 
public class FindAreaOfCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the radius :   ");
		double radius = scan.nextDouble(); 
		
		double area = Math.PI * (radius*radius); 
		
		System.out.println("Area of the Circle is :  "+ area);
		
		double circumference= Math.PI * 2*radius;           
		System.out.println( "The circumference of the circle is:   "+circumference) ;
		
	}

}
