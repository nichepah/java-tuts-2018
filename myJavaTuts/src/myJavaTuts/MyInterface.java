package myJavaTuts;

/*
 * Interface, similar to abstract classes does not specify how to implement
 * a method; just specify what a class must do.
 *  * it a means to polymorphism
 * 
 *  interface can import shared constants into multiple classes. eg: int March, April etc
 *  
 *  Usage: class MyClass [extends superclass] [implements interface1[, interface2]] 
 */
public interface MyInterface {
	// To be shared among implementation classes
	int jan = 1;
	int feb = 2;
	int march = 3;
	int april = 4;
	
	void showValue(int param); // no body
}
