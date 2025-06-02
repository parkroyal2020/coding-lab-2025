
public class StackOverFlow2 {
	public static void main(String[] args) {
		
		drink(5);
	}
	
	static void drink(int x){
		
		// 1. base case
		if (x < 1) {
			System.out.println("I am full.");
			return;
		}
		
		// 2. recursive case
		drink(x - 1);
	}

}

