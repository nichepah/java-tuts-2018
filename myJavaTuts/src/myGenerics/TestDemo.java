package myGenerics;

public class TestDemo {

	public TestDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test parameterized with integer
		Test<Integer> myIntObj = new Test<Integer>(10);
		System.out.println(myIntObj.getObject());
		
		Test<String> myStringObj = new Test<String>("This is generic");
		System.out.println(myStringObj.getObject());
	}

}
