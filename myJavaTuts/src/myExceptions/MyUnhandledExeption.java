package myExceptions;
/*
 * Shows what happens when exception is not handled
 * 
 * ArithmeticException raised
 * 
 */
public class MyUnhandledExeption {

	public MyUnhandledExeption() {
		// TODO Auto-generated constructor stub
	}
	
	public static void myMethod(){
		int denom = 0;
		int val = 1/denom;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();

	}

}
