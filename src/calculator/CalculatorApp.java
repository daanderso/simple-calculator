package calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double entry1;
		double entry2;
		double result;
		double c;
		

		System.out.print(">");
		entry1 = input.nextDouble();
		String op = input.next();
		entry2 = input.nextDouble();
		

			Calculator calc = new Calculator();
		
		if (op.equals("+")) {
			 result = calc.addition(entry1, entry2);
			System.out.println(result);
		}
		
		if (op.equals("-")) {
			c = entry1 - entry2;
			System.out.println(c);
		}
		
		if (op.equals("*")) {
			c = entry1 * entry2;
			System.out.println(c);
		}
		
		if (op.equals("/")) {
			c = entry1 / entry2;
			System.out.println(c);
		}
		
		if (op.equals("^")) {
			c = Math.pow(entry1, entry2);
			System.out.println(c);
		}
		
		input.close();
	}
	
}
