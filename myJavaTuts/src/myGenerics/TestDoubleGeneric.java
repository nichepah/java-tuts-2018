package myGenerics;
/*
 * Demo of 2 parameterized arguments
 */

public class TestDoubleGeneric<T, U> {
	T objT;
	U objU;

	public TestDoubleGeneric(T objT, U objU) {
		// TODO Auto-generated constructor stub
		this.objT = objT;
		this.objU = objU;
	}
	
	public void print(){
		System.out.println("objT: " + objT);
		System.out.println("objU: " + objU);
	}
}
