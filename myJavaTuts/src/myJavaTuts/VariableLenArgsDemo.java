package myJavaTuts;
// pay attention to static member
// pay attention to overloading issues
// eg vaTest() / vaTest(int, int ... v) etc
public class VariableLenArgsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VariableLenArgs.vaTest(); // pay attention to how static member is called;
		System.out.println("---------");
		VariableLenArgs.vaTest(100);
		System.out.println("---------");
		VariableLenArgs.vaTest(10, 20, 30, 40, 50);
		System.out.println("---------");
		System.out.println("----boolean-----");
		VariableLenArgs.vaTest(true, true, false, true);
	}

}
