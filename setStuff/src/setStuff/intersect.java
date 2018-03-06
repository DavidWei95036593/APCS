package setStuff;

public class intersect {
	//this method takes two array of int as its agrument
	//return a new array that contains
	//only the repeated value in the two arrays
	public int[] intersect(int[] a, int[] b){
		//default the new array's size to zero, so if no repeated value
		//was found in array a and array b, it will return an
		//empty array
		int arraysize =0;
		//go through all the element in array a
		for(int i=0;i<a.length;i++){
			//for each element in array a, go through all element
			//in array b and see if the element in array a equals to
			//the element in array b
			for(int inner=0;inner<b.length;inner++){
				//if it does, then the size of the new array plus one
				if(a[i] ==b[inner]){
					arraysize++;
				}
			}
		}
		//create the new array with the calculated size.
		int []c =new int [arraysize];
		//go through all element in the new array
		for(int I =0;I<arraysize;I++){
			//this checks if any element in a is equals to any element
			//in b, if it happens, then adds it to the new array
			for(int i=0;i<a.length;i++){
				for(int inner=0;inner<b.length;inner++){
					if(a[i] ==b[inner]){
						c[I] =a[i];
						I++;
					}
				}
			}
		}
		//this code was added later when doing the test case
		    for(int i =0;i<c.length;i++) {
		    	System.out.print(c[i]);
		    }
		return c;
	}
}
