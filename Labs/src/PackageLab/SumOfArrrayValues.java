package PackageLab;

public class SumOfArrrayValues {

	public static void main(String[] args) {

		int []array = {10,20,30,40}; 
		int sum = 0; 
		
		for(int  num: array ) {
			sum = num +sum;
			
			
		}
		System.out.println("Sum of the array elements  :   " +  sum);
	}

}
