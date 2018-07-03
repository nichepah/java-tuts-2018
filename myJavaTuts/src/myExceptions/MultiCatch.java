package myExceptions;

public class MultiCatch {

	public MultiCatch() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = args.length;
			System.out.println("a :"+a);
			// if a = 0, divide by zero
			int b = 1/a;
			//out of bounds array
			System.out.println("args[a+1]" + args[a+1]);
		} catch(ArithmeticException e){
			System.out.println(e);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally after try/catch blocks");
		}
		
	}

}
