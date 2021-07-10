package PackageLab;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {

		float i = 23.4f; 
		float j = 34.66f; 
		
		 System.out.println("--Before swap--");         
		 System.out.println("First number = " + i);         
		 System.out.println("Second number = " + j); 
		
		float temp = i; 
		
		i = j; 
		j = temp; 
		
		
		System.out.println("--After swap--");         
		System.out.println("First number = " + i);         
		System.out.println("Second number = " + j);
		
	}

}
