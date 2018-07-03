package myJavaTuts;
/*
 * Used in MyInheritance
 * Refer to Class A also;
 * Uncomment this.getJ() line to show private scope
 */
public class B extends A{

	private int total; // B's own variable;
	B(int x, int y, int total) {
		super(x, y); // calls A(i, j)
		this.total = total;
	}
	
	void sum(){
    //	total = i + j; // Error, j is not visible to B
		this.showA();
	//	int k = this.getJ();
		// Visible since protected
		int m = this.protGetJ();
		System.out.println("m is ----" + m);
	}

}
