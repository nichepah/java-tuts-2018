package myExceptions;
/*
 * Uses try and catch on ArithmeticException
 */
public class MyTryCatch {

	public MyTryCatch() {
		// TODO Auto-g.enerated constructor stub
	}

	public static void myDiv(){
		int val, denom;
		try{
			denom = 0;
			val = 1/denom;
			System.out.println("This will not be printed");
		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero");
			// prints error description
			System.out.println("Exception: " +e);
			val = 1; // set val and continue
			System.out.println("Val in catch block: "+val);
		}
		System.out.println("Val after catch block: "+val);
	}
	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDiv();

	}

}
