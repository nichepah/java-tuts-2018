/*
 * Calculates 1000 lightyear in meters;
 * Shows auto conversion of int to long;
 * int range –2,147,483,648 to 2,147,483,647
 */

public class LightDistance {
	public static void main(String args[]) {
		int lightspeed, days, seconds, distance;
		
		lightspeed = 299792458; // m/s
		days = 365; // approx integer
		seconds = days*24*60*60; 
		distance = 1000 * lightspeed * days * seconds;
		System.out.println(distance + " meters is equivalent to a lightyear");		
	}

}
