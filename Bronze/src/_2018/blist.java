package _2018;

import java.util.*;
import java.io.*;

public class blist {
	static Scanner in;
    static PrintWriter out;
    static int[] bList;
    static int largest;
    static int beginning;
    static int ending;
    static int buckets;
    static int size;

    public static void main(String[] args) {
    	 try {

             in = new Scanner(new File("blist.in"));
             out = new PrintWriter(new File("blist.out"));

             out.print(init());

             out.close();
             in.close();

         }catch(Exception e) {
             e.printStackTrace();
         }
     	in.close();
     	out.close();

    }

    public static int init() {
    	size = in.nextInt();
    	largest = 0;
    	int[] bList = new int[1001];
    	for(int j = 0; j < size; j++) {
    		beginning = in.nextInt();
    		ending = in.nextInt();
    		buckets = in.nextInt();

    		for(int x = beginning; x < ending; x++) {
    			bList[x] += buckets;
    		}
    	}
    	for(int j = 0; j < bList.length; j++) {
    		if(bList[j] > largest) {
    			largest = bList[j];
    		}
    	}
    	return largest;
    }
}
