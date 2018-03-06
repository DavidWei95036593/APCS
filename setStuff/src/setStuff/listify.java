package setStuff;

import java.util.ArrayList;
//this method will simply take three integer and return an arraylist of int
//that contains them
public class listify {
	public ArrayList<Object> listify(int a, int b, int c){
		//create the new arrayList
		ArrayList<Object> hi = new ArrayList<Object> ();
		//add each element into the new arrayList
		hi.add(a);
		hi.add(b);
		hi.add(c);
		
		//return the new arrayList
		return hi;
	}
}
