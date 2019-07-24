/* 
ID : colink91
LANG: JAVA
TASK: friday
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
	static int[] Mday;
	static int year;
	static int Tyears;
	static int[] total;
	
		
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
		Tyears = in.nextInt();
		year = 1900;
		Mday = new int[]{31, 28, 31,30,31,30,31,31,30,31,30,31};
		total = new int[7];
	}
	private static String solve() {
		//Process and Output
		int day = 13;
		for(int j = 1900; j < year + Tyears; j++) {
			for(int i = 0; i < 12; i++) {
				total[day%7]++;
				day += Mday[i];
				if(i == 1 && isLeapYear(j)) {
					day++;
				}
				System.out.println(day);
			}
		}
		
		result = total[6]+ " " + total[0]+ " "+ total[1]+ " " + total[2]+ " " + total[3]+" " + total[4]+ " "+ total[5];
		
		return result;

	}
	private static boolean isLeapYear(int j) {
		return (j % 4 == 0 && (j % 100 != 0 || j % 400 == 0));		
	}
		
	// Algorithm methods
//	private static int change(String s){
//
//
//}
}