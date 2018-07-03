package myJavaTuts;
/*
 * Used in MyInheritance 
 * Refer Class B also
 */
public class A {
	public int i; // available to all classes
	private int j; // private to A only
	
	// constructor
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public void showA(){
		System.out.println("i : "+ i + " and j : "+j);
	} 
	
	// Access specified is private; not visible outside class A; try from B/MyInheritance
	private int getJ(){
		return j;
	}
	
	// visible in B, and B's objects; 
	protected int protGetJ(){
		return j;
	}
}
