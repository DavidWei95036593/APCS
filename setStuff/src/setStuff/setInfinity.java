package setStuff;

import java.util.ArrayList;

public class setInfinity {
	//this method takes two arguments and return an arraylist of int
	//that is either infinity or 0
	//based on its first argument n which represent the number of int in the array
	//and itssecond argument start which represent where should the zero be 
	public ArrayList<Integer> setInfinity(int n, int start){
		//create a new arrayList of integer 
		ArrayList<Integer> hi = new ArrayList<Integer>();
		//use for loop to check where the n th element is and set the rest to infinity
		for(int i =0; i<n; i++){
			if(i ==start){
				hi.add(0);
			}else{
				//2147483647 is the biggest value in java
				hi.add(2147483647);
			}

		}
		return hi;
	}

}
