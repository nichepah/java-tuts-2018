package myJavaTuts;
/*
 *  Taken from Schildts
 */

public class MyString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strObj1 = "First String";
		String strObj2 = "Second String";
		String strObj3 = strObj1 + "and" + strObj2;
		
		System.out.println(strObj1);
		System.out.println(strObj2);
		System.out.println(strObj3);
		
		// check equality with 'equals
		// boolean equals(String object);
		// int length()
		// char charAt(int index)
		
		System.out.println(strObj1.length());
		System.out.println(strObj1.charAt(4));
		// out of bounds raises exception 
		// StringIndexOutOfBoundsException
		// System.out.println(strObj1.charAt(20));
		
		if(strObj1.equals(strObj2)) {
			System.out.println("strObj1 == strObj2");
		}
		else{
			System.out.println("strObj1 != strObj2");
		}
	}

}
