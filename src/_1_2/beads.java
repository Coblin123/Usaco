/*
ID : colink91
LANG: JAVA
TASK: beads
 */
package _1_2;
import java.util.*;
import java.io.*;

public class beads {

    static Scanner in;
    static PrintWriter out;

    //Input Variables
    static String [] list;
    static String input;
    static String temp;
    static int length;

    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("beads.in"));
            out = new PrintWriter(new File("beads.out"));

            init();

            //Write out file
            out.println(solve());

            out.close();
            in.close();

        }catch(Exception e) {
            e.printStackTrace();
        }



    }

    private static void init() {
        //Get data 
        //Initialize Input Variables
    	temp= in.nextLine();
    	input = in.nextLine();
    	length = Integer.parseInt(temp);
    	
    	
    }


    private static int solve() {
    	int result = 0;
        int ans = 0;
        input += input;
       
    	for(int i = 0; i < input.length()/2; i++) {
    		int c = 1;
    		char start = input.charAt(i);
    		
    		if(start == 'w') {
    			c = Math.max(recur(i, 'b'), recur(i, 'r'));
    		}else {
    			c = recur(i, start);
    			
    		}
    		if(ans < c) {
				ans = c;
			}
    	}
        result = ans;

        return result;

    }
    private static int recur(int i, char start) {
    	boolean change = false;
    	int indx = i+1;
    	int count = 1;
        
    	while (count < input.length()/2) {
    		char curr = input.charAt(indx);
    		if(!change) {
    			if(curr == start || curr == 'w') {
    				count++;
    			}else {
    				change = true;
    				count++;
    			}
    		}else {
    			if(curr != start || curr == 'w') {
    				count++;
    			}else {
    				break;
    			}
    		}
    		indx++;
    	}
        return count;
    }

    //Algorithm methods
//    private static int change(String s) {
//
//
//    }


}