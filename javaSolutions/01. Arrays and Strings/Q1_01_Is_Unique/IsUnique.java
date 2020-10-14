// Is Unique: Implement an algorithm to determine if a string has all unique character. 
// What if you cannot use additional data structures?
package Arrays_Strings;

import java.util.Scanner;

public class IsUnique {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(checkUnique(str));
		System.out.println(checkUnique2(str));
	}

	// Time wise its not good and has time complexity of O(n^2)
	private static boolean checkUnique(String str) {
		if(str.length() <= 1) {
			return true;
		}
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	//Here in this case we are using an array boolean of size 128 to make time efficient
	//Time Complexity = O(n)
	private static boolean checkUnique2(String str) {
		if(str.length() <= 1) {
			return true;
		}
		boolean[] arrBol = new boolean[128];
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i);
			if(arrBol[val]) {
				return false;
			}
			arrBol[val] = true;
		}
		return true;
	}
	
}
