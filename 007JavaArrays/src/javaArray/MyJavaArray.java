package javaArray;
// Taken from Herbert Schildt
public class MyJavaArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int month_days[];  // Declaration 
		month_days = new int[12];  // Initialization
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		System.out.println("March has " + month_days[2] + " days");
	}

}
