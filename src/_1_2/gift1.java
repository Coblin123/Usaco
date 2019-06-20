/*
ID : colink91
LANG: JAVA
TASK: gift1
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
	static LinkedHashMap<String, Integer> accounts;
	static int give;
	static int NP;
	
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
		NP = Integer.parseInt(in.nextLine());
		accounts = new LinkedHashMap<String, Integer>();
		for(int i = 0; i < NP; i++) {
			accounts.put(in.nextLine(), 0);
		}
	}
	private static String solve() {
		//Process and Output
		for(int i = 0; i < NP; i++) {
			String giver = in.nextLine();
			String[] money = in.nextLine().split(" ");
			System.out.println(Arrays.toString(money));
			int totalG = Integer.parseInt(money[0]);
			int gifted = Integer.parseInt(money[1]);
			if(gifted == 0) {
				continue;
			}
			int moneyL = totalG % gifted;
			int moneyG = totalG / gifted;
			int temp = (accounts.get(giver) - Integer.parseInt(money[0])) + moneyL; 
			accounts.put(giver, temp);
			temp = 0;
			
			for(int j = 0; j < gifted; j++) {
				String reciever = in.nextLine();
				temp = accounts.get(reciever) + moneyG;
				accounts.put(reciever, temp);
			}
			
		}
		for(String s: accounts.keySet()) {
			result += s + " " + accounts.get(s) + "\n";
		}
		return result;
		
	}
	// Algorithm methods
//	private static int change(String s){
//
//
//}
}