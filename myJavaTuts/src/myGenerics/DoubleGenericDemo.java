package myGenerics;

/*
 * more than one parameterized objects demo
 */

public class DoubleGenericDemo {

	public DoubleGenericDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDoubleGeneric <String, Integer> tbg = new TestDoubleGeneric<String, Integer>("Maya", 1989);
		tbg.print();

	}

}
