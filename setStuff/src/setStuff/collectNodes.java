package setStuff;

import java.util.ArrayList;

public class collectNodes {
	public ArrayList<Integer> collectNodes(ArrayList<ArrayList<Integer>> edgelist){
		ArrayList<Integer>resultArray = new ArrayList<Integer>();
		//add the first two elements to the new arraylist because we don't need to
		//check the union for that
		for(int i =0;i<2;i++){
			resultArray.add(edgelist.get(0).get(i));
		}
		//use a for loop to go through all the element in the edgelist
		for(int i =0;i<edgelist.size();i++){
			//since we only need the first two, so the second for loop
			//would only run twice
			for(int inner =0; inner<2;inner ++){
				//if the resutArray contains either the first index of the arrays in edgelist
				//it will not add the element in it,
				//if is not the case, then resultArray will add the element.
				if(!resultArray.contains(edgelist.get(i).get(inner))){
					resultArray.add(edgelist.get(i).get(inner));
				}
			}
		}
		return resultArray;
	}

}
