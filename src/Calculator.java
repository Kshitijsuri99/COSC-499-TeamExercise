import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the action you want to perform '+' for addition, '-' for subtraction, '*' for multiplication, '/' for division: 2");
		String action = in.nextLine();
		action = action.trim();
		
		System.out.println("Enter the first number:");
		int firstNumber = in.nextInt();
		
		System.out.println("Enter the second number:");
		int secondNumber = in.nextInt();
		
		chooseAction(firstNumber, secondNumber, action);
	}
	
	public static void chooseAction (int x, int y, String action) {
		int solution = 0;
		
		if (action.equals("+")) {
			//TODO
		}
		else if (action.equals("*")) {
			solution = multiply(x, y);
			System.out.println("Answer: " + solution);
		}
		else if (action.equals("-")) {
			//TODO
		}
		else if (action.equals("/")) {
			solution = division(x, y);
			System.out.println("Answer: " + solution);
		}
		else {
			System.out.println("Worng Action");
		}
	}
	
	
	//Multiplication Method
	public static int multiply (int x, int y) {
		int product = x * y;
		return product;
	}

	//TODO: Addition Method

	//TODO: Subtraction Method
	
	//Division Method
	public static int division (int x, int y) {
		int quotient = x/y;
		return quotient;
	}

}
