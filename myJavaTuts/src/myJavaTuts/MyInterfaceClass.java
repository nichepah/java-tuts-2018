package myJavaTuts;

public class MyInterfaceClass implements MyInterface {

	public MyInterfaceClass() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void showValue(int param) {
		// TODO Auto-generated method stub
		System.out.println("MyInterfaceClass showValue: " +param );
		
	}
	
	public void anotherMethod(){
		// Do something
		 System.out.println("MyInterfaceA.anotherMethod: april "+april);
	}

}
