package setStuff;

import java.util.ArrayList;

public class main {
	//testing cases
	public static void main(String[]args) {
	addEdge addedge = new addEdge();
	anyContains anycontains = new anyContains();
	collectNodes collectnodes = new collectNodes();
	contains contains = new contains();
	intersect intersect = new intersect();
	listify listify = new listify();
	nearesUnvisitedNode nearesunvisitednode =new nearesUnvisitedNode();
	ret17 ret17 = new ret17();
	setInfinity setinfinity = new setInfinity();
	union union = new union();
	zerothElement zerothelement = new zerothElement();
	
	
	
	
	//test case for ret17
	System.out.println(ret17.ret17());
	
	//test case for zerothElement
	ArrayList<Integer>al = new ArrayList<Integer>();
	al.add(5);
	al.add(2);
	al.add(3);
	System.out.println(zerothelement.zerothElement(al));
	
	//test case for contains
	int[] ar = {1,2};
	System.out.println(contains.contains(1,ar));
	
	//test case for anyContains
	int[]a = {1};
	int[] b = {};
	System.out.println(anycontains.anyContains(a, b));
	
	//test case for union
	int []uniona = {1,2};
	int []unionb = {2,4};
	union.union(uniona, unionb);
	System.out.println("");
	//test case for intersect
	intersect.intersect(uniona, unionb);
	
	//test case for nearesUnvisitedNode	
	boolean[]visited = {true,false,false};
	int[] distance = {1,2,3};
	String[]nodeName = {"A","B","C"};
	System.out.println("");
	System.out.println(nearesunvisitednode.nearesUnvisitedNode(visited,distance,nodeName));
	
	//test case for listify
	System.out.println(listify.listify(1,2,3));
	
	//test case for addEdge 
	ArrayList<ArrayList<Object>> graph= new ArrayList<ArrayList<Object>>();
	ArrayList<Object> arrayList = new ArrayList<Object>();
	arrayList.add(1);
	arrayList.add(2);
	arrayList.add(3);
	graph.add(arrayList);
	System.out.println(addedge.addEdge(graph, 4,5,6));
	
	
	
	//test case for collectNodes
	ArrayList<ArrayList<Integer>>hi = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> OarrayList = new ArrayList<Integer>();
	OarrayList.add(1);
	OarrayList.add(2);
	OarrayList.add(3);
	ArrayList<Integer>NarrayList = new ArrayList<Integer>();
	NarrayList.add(2);
	NarrayList.add(3);
	NarrayList.add(4);
	hi.add(NarrayList);
	hi.add(OarrayList);
	System.out.println(collectnodes.collectNodes(hi));
	
	//test case for setInfinity
	System.out.println(setinfinity.setInfinity(3,0));
	
	}
}
