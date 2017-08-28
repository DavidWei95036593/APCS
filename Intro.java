
public class Main {
	public int ret() {
		 return 17;
		}
	//Problem #2: Write a method, that takes in three parameters,
	//and returns the logical and of the parameters together (find and return the value of a and b and c)


	public boolean logic(boolean a, boolean b, boolean c) {
		return (a & b & c);

	}

//	Write a function that takes in a number and returns a string of the multiline triangle of stars.
//	Make sure that you use \n as the character that represents a new-line. 

	public String  stars(int n) {
		String stars = "";
		 for(int num = 0; num < n ;num ++){
		// This prints the number of "*" in one line
			 for (int num2 = 0; num2< n ;num2 ++) {
				  // this adds * into the empty string stars
				 stars += "*";
			 }
		// This adds a new line after the number of * in one line is finished.
			stars += "/n";
		}
		return stars;
		}

	
	public int coins(int n) {
		return n;

	}

}
