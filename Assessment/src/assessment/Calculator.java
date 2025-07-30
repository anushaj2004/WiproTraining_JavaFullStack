package assessment;

public class Calculator {
	static int powerint(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	static double powerdouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		int res=Calculator.powerint(2,2);
		double res1=Calculator.powerdouble(2, 2);
		System.out.println(res);
		System.out.println(res1);
	}
}
