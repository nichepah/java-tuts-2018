package myJavaTuts;
/*
 * refers to MyInterface, MyInterfaceA, MyInterfaceB
 * 
 * demonstrates use of interface and of variables in interface
 * 
 * Also demonstrates extended interfaces
 * 
 * 
 */
public class MyInterfaceDemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		MyInterfaceClass myInterfaceClass = new MyInterfaceClass();
		myInterfaceClass.showValue(10);   // calls the implemented method
		
		// prints variable declared in Interface
		myInterfaceClass.anotherMethod();
		
		MyExtendedInterfaceDemo myExtendedInterfaceDemo = new MyExtendedInterfaceDemo();
		myExtendedInterfaceDemo.showValue(100); // Implementation overrides the one in MyInterfaceA
		myExtendedInterfaceDemo.methodInExtendedInterface();
	}

}
