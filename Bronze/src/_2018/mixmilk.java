package _2018;
import java.util.*;
import java.io.*;

public class mixmilk {
	 static Scanner in;
	    static PrintWriter out;

	    static int[] cap, milk;
	    
	    public static void main(String[] args) {
	    	init();
	    	solve();
	    	in.close();
	    	out.close();
	     }

	    private static void init() {

	    	cap = new int[3];
	    	milk = new int[3];
	    	try {
	    		in = new Scanner(new File("mixmilk.in"));
	    		out = new PrintWriter(new File("mixmilk.out"));
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	for(int i = 0; i < 3; i++) {
	    		cap[i] = in.nextInt();
	    		milk[i] = in.nextInt();
	    	}
	    	
	    }


	    private static void solve() {
	    	for(int i = 0; i < 100; i++) {
	    		int curr = i % 3;
	    		int next = (i+1)% 3;
	    		int space = cap[next] - milk[next];
	    		if(space>= milk[curr]) {
	    			milk[next]+= milk[curr];
	    			milk[curr] = 0;
	    		}else {
	    			milk[next] = cap[next];
	    			milk[curr] -= space;
	    		}
	    	}
	    	for(int j:milk)
	    		out.println(j);	    	

	    }

}
