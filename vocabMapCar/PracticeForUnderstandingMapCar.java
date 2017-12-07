
package vocabMapCar;

public class PracticeForUnderstandingMapCar {
	static int[] b = {1,2,3,4,5};
	    
	 public static void main(String[]args) {
		//calls the mapCar function, there are four functions, plus, minus, muti and divide
		 //to change which function you want to appy to the mapcar. change the first argument of the mapcar
		 //to whatever function you want
		 //to change how much value you want to apply, change the number in the function
		 mapCar(muti(11, b),b);
	 }
	 
	 public static void mapCar(int a, int[] b){	
		 for(int i = 0; i <b.length; i++) {
			 System.out.print(b[i]+" ");
		 }
	}
	 //make a function that adds int a to every element in the array b
	 public static int plus(int a,int[] b) {
		 for (int i = 0; i < b.length; i++) {
				b[i] += a;
				}
		return a;
	 }
	 //make a function that subtract int a to every element in the array b
	 public static int minus(int a1,int[] b) {
		 for (int i = 0; i < b.length; i++) {
				b[i] -= a1;
				}
		return a1;
	 }
	 //make a function that multiply every element in the array b by int a
	 public static int muti(int a3,int[] b) {
		 for (int i = 0; i < b.length; i++) {
				b[i] *= a3;
				}
		return a3;
	 }
	//make a function that divides every element in the array b by int a
	 public static int divide(int a4, int[]b) {
		 for (int i = 0; i < b.length; i++) {
				b[i] /= a4;
				}
		return a4;
	 }
}

