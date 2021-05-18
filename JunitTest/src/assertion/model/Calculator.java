package assertion.model;

public class Calculator {
	
	public static int add(int a , int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mult(int a, int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static int sqaure(int n) {
		return n*n;
	}
	public static int cube(int n) {
		return sqaure(n)*n;
	}
	public static double sqaureroot(int n) {
		return Math.sqrt(n);
	}

}
