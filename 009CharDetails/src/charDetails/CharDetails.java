package charDetails;

public class CharDetails {
	public static void main(String args[]){
		char char1, char2, char3;
		char1 = 'X'; // code for X is 88
		char2 = 88;
		char3 = 'y';
		byte char3byte = (byte) char3;
		char1++; // notice ++ is not needed in println; Try ++char1/ char1++ in prinline
		System.out.println("char1: " + char1 + " char2: " + char2 + " char3: " + char3 + " char3byte :" + char3byte + " char1++: " + char1); 
	}
}
