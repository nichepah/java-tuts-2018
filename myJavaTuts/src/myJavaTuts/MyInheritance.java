package myJavaTuts;
/* 
 * Class A is the super class of class B 
 * 
 */

public class MyInheritance {
	public static void main(String args[]){
		A myA = new A(1, 1);
		System.out.println("myA.i "+myA.i);
		// myA.j is private
		//System.out.println("myA.j "+myA.j);
		B myB = new B(1, 3, 10);
		
		myB.sum(); // No effect, can't access A's j from B since j is private;
		myB.showA();
	}
}