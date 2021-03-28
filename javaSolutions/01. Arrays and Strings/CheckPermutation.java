package Arrays_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
	
	public static void main(String[] args) {
		Scanner s=  new Scanner(System.in);
		String fir = s.next();
		String sec = s.next();
		System.out.println(check1(fir, sec));
	}
	
	private static boolean check1(String fir, String sec) {
		if(fir.length() != sec.length()) {
			return false;
		}
		if(sort(fir).equals(sort(sec))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static String sort(String a) {
		char[] tem = a.toCharArray();	// copy character of string to char array
		Arrays.sort(tem);		//Inbuilt function of array -- Sort a char Array
		return new String(tem);  // char array to string
	}
	
}
