package PackageLab;

public class LargestNumber {

	public static void main(String[] args) {

		double l = 10.34; 
		double n = 34.3; 
		double m = 34.5; 
		
		if (l >= n && l >= m ) {
			System.out.println(l + " :   This is the Largest number");
		}
		else if (n>=l && n>= m ) {
			System.out.println(n + " :   This is the Largest number");
		}
		else {
			System.out.println(m + " :   This is the Largest number");

		}
	}

}
