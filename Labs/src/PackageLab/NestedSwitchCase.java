package PackageLab;

public class NestedSwitchCase {

	public static void main(String[] args) {
		
		int x = 1; 
		int k = 2; 
		
		switch (x) {
		case 1: {
			switch (k) {
			case 1:{
				
				System.out.println("k (Case 1) -    "   +  k--);
				break; 
			}
			case 2:{
				System.out.println("k (Case 2) -    "   +  ++k);
				break; 
			}
			}
		break; 
		}
		case 2:{
				System.out.println("x "  +  x++);
			}
		
		
		}
	}

}
