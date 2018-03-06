package setStuff;

public class anyContains {
	//bascially the same as the contains class, but this method
	//will take two array of int
	//and check if argument b has any elements in argument a
	public boolean anyContains(int[] a, int[] b){
		  //default the return value to be false
		  boolean result = false;
		  //this for loop is to go through all the element in array a
		  for(int i =0; i<a.length ; i++){
			//this for loop is to go through all the element in array b
		    for(int inner=0;inner< b.length; inner ++){
		      //check if one element of a is equal to any element of b
		    	//if it does, then terminate the loop and return true
		    	//if it doesn't then i(index of a) will plus one and 
		    	//do the same process again
		      if (a[i]==b[inner]){
		        result = true;
		      break;
		      }
		    }
		  }
		  return result;
		}
}
