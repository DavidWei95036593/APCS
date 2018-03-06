package setStuff;

public class contains {
	//this method takes two arguments
	//one int and another one is array of int
	//it will check if the array of int has the element that equals
	//the first element int, returns ture if it does
	public boolean contains(int a, int[] ar){
		//default the return value to be false
		  boolean result = false;
		  //check each element in the array
		  for(int i =0; i< ar.length;i++){
			//if the element in the array matches int a
		    if (ar[i] ==a){
		      //return value would be true
		      result = true;
		      //terminates the loop
		      break;}
		  }
		  //returns the value
		  return result; 
		}

}
