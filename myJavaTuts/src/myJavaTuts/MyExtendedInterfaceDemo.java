/**
 * 
 */
package myJavaTuts;

/**
 * @author pa
 *
 */
public class MyExtendedInterfaceDemo implements MyExtendedInterface {

	/**
	 * 
	 */
	public MyExtendedInterfaceDemo() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see myJavaTuts.MyInterface#showValue(int)
	 */
	@Override
	public void showValue(int param) {
		// TODO Auto-generated method stub
		// Overrides implementation in MyInterface
		System.out.println("MyExtendedInterfaceDemo.showValue: param" + param);
	}

	/* (non-Javadoc)
	 * @see myJavaTuts.MyExtendedInterface#methodInExtendedInterface()
	 */
	@Override
	public void methodInExtendedInterface() {
		// TODO Auto-generated method stub
		// Overrides implementation from MyExtendedInterface
		System.out.println("methodInExtendedInterface implemented in ExtendedInterfaceDemo");
	}

}
