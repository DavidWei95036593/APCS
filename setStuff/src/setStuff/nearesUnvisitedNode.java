package setStuff;

public class nearesUnvisitedNode {
	//this mathod takes a mechanic version of a graph, in this case it takes three arrays
	//one array of booleans which represents weither each nodes have been accessed of each nodes in the graph
	//one array of int that represents the distance of each nodes in the graph
	//one array of String that represents the name of each node
	//check which node has the smallest distance and its unvisited
	//return the name of the node
	//if all nodes are visited, return an empty string
	public 	String nearesUnvisitedNode(boolean[] visited, int[] distance, String[] nodeName){
		//default the return value to an empty string
		String result ="";
		//first go through all the elements in the boolean array
		//only mark those are visited
		for(int i =0; i< visited.length; i ++){
			if(visited[i] ==false){
				//then it will check if the previous element is also true
				//or false, if it is false, it will compare the distance 
				//between and return the smallest
				if(i-1>=0){
					if(visited[i-1] ==false){
						if(distance[i] > distance[i-1]){
							result = nodeName[i-1];
							break;
						}

						else{
							result = nodeName[i];
							break;
						}
					}
				}
				//it will also checks the previous second values
				//and do the same process
				if(i-2>=0){
					if(visited[i-2]==false){
						if(distance[i]>distance[i-2]){
							result = nodeName[i-2];
							break;
						}
						else{
							result = nodeName[i];
							break;
						}
					}
				}
				//and it will checks the nodes around the selected node
				//see if they meet the standard and compare them
				if(i+1<=distance.length&&i-1>=0){
					if(visited[distance.length-1] ==false){
						result = nodeName[distance.length-1];
					}
				}
			}
		}
		return result;
	}
}
