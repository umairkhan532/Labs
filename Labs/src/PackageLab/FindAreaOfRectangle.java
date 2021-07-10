package PackageLab;


import java.util.Scanner;
public class FindAreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter length for the Rectangle:  ");
		double length = scan.nextDouble(); 
		
		
		Scanner scanww = new Scanner(System.in); 
		System.out.println("Enter length for the Rectangle:  ");
		double width = scanww.nextDouble(); 
		
		double area =length*width; 
		System.out.println("Area of the Rectangle  : " + area);
		
	}

}
