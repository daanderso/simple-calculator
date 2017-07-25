package calculator;

public class SimpleCalculator {

	public double addition(double entry1, double entry2) {
		double result = entry1 + entry2;
		
		return result;
	}
	
	public double subtract(double entry1, double entry2) {
		double result = entry1 - entry2;
		return result;
	}
	
	public double multiply(double entry1, double entry2) {
		double result = entry1 * entry2;
		return result;
	}
	
	public double divide(double entry1, double entry2) {
		double result = entry1 / entry2;
		return result;
	}
	
	public double toThePowerOf(double entry1, double entry2) {
		double result = Math.pow(entry1, entry2);
		return result;
	}
	
	public double mod(double entry1, double entry2) {
		double result = entry1 % entry2;
		return result;
	}
	
    
	
}
