package calculator;

import java.util.Scanner;

public class SimpleCalculatorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double entry1;
		double entry2;
		double result;
		String op;
		SimpleCalculator calc = new SimpleCalculator();		
		
do {
		System.out.print(">");
		entry1 = input.nextDouble();
		op = input.next();
		entry2 = input.nextDouble();
		

		
		if (op.equals("+")) {
			 result = calc.addition(entry1, entry2);
			System.out.println(result);
		}
		
		if (op.equals("-")) {
			result = calc.subtract(entry1, entry2);
			System.out.println(result);
		}
		
		if (op.equals("*")) {
			result = calc.multiply(entry1, entry2);
			System.out.println(result);
		}
		
		if (op.equals("/")) {
			result = calc.divide(entry1, entry2);
			System.out.println(result);
		}
		
		if (op.equals("^")) {
			result = calc.toThePowerOf(entry1, entry2);
			System.out.println(result);
		}
		
		if (op.equals("%")) {
			result = calc.mod(entry1, entry2);
			System.out.println(result);
		}
		
}while (entry1 != 0);
		
		input.close();
	}
	
}
