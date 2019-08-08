/*
ID : colink91
LANG: JAVA
TASK: milk2
 */
package _1_3;
import java.util.*;
import java.io.*;

public class milk2 {

    static Scanner in;
    static PrintWriter out;

    //Input Variables
    static int N;
    static cow[] list;
    
    static class cow implements Comparable<cow>{
    	int start;
    	int end;
    	public cow(int s, int e) {
    		start = s;
    		end = e;
    	}

		@Override
		public int compareTo(cow arg0) {
			return this.start - arg0.start;
		}
    }
    
    public static void main(String[] args) {

        try {

            //Initialize in & out
            in = new Scanner(new File("milk2.in"));
            out = new PrintWriter(new File("milk2.out"));

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
    	N  = in.nextInt();
    	list = new cow[N];
    	for(int i = 0; i < list.length; i++) {
    		int start = in.nextInt();
    		int end = in.nextInt();
    		list[i] = new cow(start, end);
    
    	}
    	Arrays.sort(list);
    }


    private static String solve() {
    	int start = list[0].start;
    	int end = list[0].end;
    	int discontinued = 0;
    	int chain = 0;
    	int mDiscontinued = 0;
    	int mChain = 0;
    	
    	    	
    	for(int j = 0; j < list.length; j++) {
    		int currStart = list[j].start;
    		int currEnd = list[j].end;
    		if(currEnd <= end) {
    			continue;
    		}else if(currStart <= end) {
    			end = currEnd;
    		}else {
    			discontinued = currStart - end;
    			if(discontinued > mDiscontinued) {
    				mDiscontinued = discontinued;
    			}
    			chain = end - start;
    			if(chain > mChain) {
    				mChain = chain;
    			}
    			start = currStart;
    			end = currEnd;
    		} 
    	}
    	
    	int conti = end - start;
    	if(conti > mChain) {
    		mChain = conti;
    	}
    	
    	/*for(int i = 0; i < list.length;i++) {
    		System.out.println(list[i].start + " " + list[i].end);
    	}*/
        return mChain + " " + mDiscontinued;

    }

    //Algorithm methods
//    private static int change(String s) {
//
//
//    }


}