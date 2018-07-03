package myJavaTuts;
/*
 * Available from jdk5 onwards
 * 
 * static void vaTest(int ... v) 
 * 
 * vaTest can be with 0 or more arguments
 * 
 * pay attention to for loop without explicit bounds
 * 
 * called from VariableLenArgsDemo
 */
public class VariableLenArgs {
	static void vaTest( int ... v){
		System.out.println("Number of args: "+ v.length);
		System.out.println("V is :");
		for (int x : v){
			System.out.println(x + " ");
		}
	}
	
	// overloaded for boolean
	static void vaTest( boolean ... bs){
		System.out.println("Number of boolean args: "+ bs.length);
		System.out.println("V is :");
		for (boolean x : bs){
			System.out.println(x + " ");
		}

    }
} 
