/*
*ID : colink91
*LANG: JAVA
*/
package _1_2;
import java.util.*;
import java.io.*;

public class friday {	
	static Scanner in;
	static PrintWriter out;
	static String inFile = "friday.in";
	static String outFile = "friday.out";
	//static StringBuilder result;
	static String result = "";
	//Input Variables
		
	public static void main(String args[]) {
		
		try {
			//Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			result = solve();
			
			//Write out file
			out.print(result);
			
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