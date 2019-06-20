/*
ID : colink91
LANG: JAVA
TASK: ride
 */
package _1_2;
import java.util.*;
import java.io.*;

public class ride {	
	static Scanner in;
	static PrintWriter out;
	static String inFile = "ride.in";
	static String outFile = "ride.out";
	//static StringBuilder result;
	static String result = "";
	//Input Variables
	static String[] list;
	static String input;
	static String input2; 
	static int word1;
	static int word2;
	
	public static void main(String args[]) {
		
		try {
			//Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			result = solve();
			
			//Write out file
			out.println(result);
			
			out.close();
			in.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	} 
	

	private static void init() {
		//get data
		//Initialize Input Variables
		input = in.nextLine();
		input2 = in.nextLine();
		word1 = 1;
		word2 = 1;
		
	}
	private static String solve() {
		//Process and Output
		for(int i = 0; i < input.length(); i++) {
			word1 *= (int)input.charAt(i) - 64;
		}
		for(int i = 0; i < input2.length(); i++) {
			word2 *= (int)input2.charAt(i) - 64;
		}

		if(word1% 47  == word2%47) {
			result = "GO";
		}else {
			result = "STAY";
		}
		return result;

	}
	// Algorithm methods
//	private static int change(String s){
//
//
//}
}