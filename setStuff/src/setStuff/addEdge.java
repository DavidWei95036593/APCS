package setStuff;

import java.util.ArrayList;

//this method is basically the same as listify except this method would
//return an arrayList of arrayList of object that contains the arrayList that contains
//the three int given by the user
public class addEdge {
	public ArrayList<ArrayList<Object>> addEdge(ArrayList<ArrayList<Object>> graph, int a, int b, int c){
		//create the new arrayList 
		ArrayList<Object> hi = new ArrayList<Object> ();
		//adds three int into the new arrayList
		hi.add(a);
		hi.add(b);
		hi.add(c);
		//add the new arrayList into the arrayList of arrayList object and return 
		//the arrayList of arrayList of object
		graph.add(hi);
		return graph;
	}

}
