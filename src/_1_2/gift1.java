/*
 * ID : colink91
 * LANG: JAVA
 * TASK: gift1
 */
package _1_2;
import java.util.*;
import java.io.*;


public class gift1 {	
	static Scanner in;
	static PrintWriter out;
	static String inFile = "gift1.in";
	static String outFile = "gift1.out";
	//static StringBuilder result;
	static String result = "";
	//Input Variables
	static String[] list;
	
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
		
	}
	private static String solve() {
		//Process and Output
		return result;

	}
	// Algorithm methods
//	private static int change(String s){
//
//
//}
}