/**
 * 
 */
package myJavaTuts;

/**
 * @author pa
 * 
 * On top of methods from MyInterface, the implementing class also has to 
 * deal with methodInExtendedInterface as well
 * 
 * Done in MyExtendedInterfaceDemo
 */
public interface MyExtendedInterface extends MyInterface {
	public void methodInExtendedInterface();
	//public void showValue(int x); //doesnt make any diff

}
