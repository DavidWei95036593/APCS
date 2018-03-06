package setStuff;

public class union {
	//this method will take two arguments, both of them array of ints
	//and will return a new array that contains the union of both 
	//array a and array b
	//union will combine two arrays into a bigger array, and delete any element
	//that repeats 
	public int[] union(int[] a, int[] b){
		//if both array is empty, then returns an empty array
		//it does not matter if the return is b or a
		  if(a.length ==0 && b.length ==0){
		    return b;
		  }
		  //if one of the arrays is empty, returns the another one
		  else if(a.length ==0&& b.length >=1){
		    return b;
		  }
		  else if(a.length >=1&& b.length ==0){
		    return a;
		  }
		  //if both arrays are not empty, do the following
		  else{
			//create a new array of int that has the length of 
			  //the sum of a and b's length
		    int[] c = new int[a.length+b.length];
		    //go through all element in the new array
		    for(int i =0;i<c.length;i++){
		      //compare if the new array's length smaller than
		    	//a's length and copy all the int into c
		      if(i<a.length){
		      c[i] =a[i];
		      }
		      //then adds the rest element in b that's not in c already
		      else{
		        c[i]=b[i-a.length];
		      }
		    }
		    //this code was added later when doing the test case
		    for(int i =0;i<c.length;i++) {
		    	System.out.print(c[i]);
		    }
		    //and return the new array
		    return c;
		  }
		  
		}

}
