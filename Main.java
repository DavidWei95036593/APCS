
public class Main {
//	Problem #1: Write a method, called ret, that takes in no arguments and returns 17.  

	public static int ret() {
		 return 17;
		}
	
//	Problem #2: Write a method, that takes in three parameters, and returns the logical and of the parameters 
//	together (find and return the value of a and b and c)
	public static boolean logic(boolean a, boolean b, boolean c) {
		return (a & b & c);

	}

	
//Write a function that takes in a number and returns a string of the multiline triangle of stars.
	//Make sure that you use \n as the character that represents a new-line. 
	public static String stars(int n) {
		String stars = "";
		 for(int num = 0; num <= n ;num ++){
		// This prints the number of "*" in one line
			 for (int num2 = 0; num2 < num ;num2 ++) {
				  // this adds * into the empty string stars
				 stars += "*";
			 }
		// This adds a new line after the number of * in one line is finished.
			stars += "\n";
		}
		return stars;
		}


//Problem #4: Jim has a large supply of coins that he likes to maintain. 
//However, when his friend asked him to exchange coins, he agreed.  His friend told him that
//he wanted to exchange for 5 cent and 2 cent coins (the 2 cent coin exists where Jim is). 
//Jim wants to exchange as few coins as possible, so print the minimum number of 5c and 2c coins Jim needs to use. 
//If the exchange isn¡¯t possible, return -1.  The method stub is included on the following page.
	
	public static int coins(int n) {
		//this creates the number of five cents and number of two cents
		int nfc = 0;
		int ntc = 0;
	if(n%5 != 0) {
		//if the money that he asks can not be replace by five cents coins and two cents coins totally,
		//return -1
		if((n%5)%2 !=0) {
			return -1;
		}
		//this check if the money that he asks can be replace by five cents coins and 
		//two cents coins together.
		if ((n%5)%2 == 0){
			nfc += n/5;
			ntc += (n%5)/2;
		}
	}
	// this check if the money that he asks can be replace by all the five cents coins.
	if(n%5 ==0) {
		nfc += n/5;
	}
	//this returns the sum of the numbers of the five cents coins and the number of the two cents coins.
		return nfc+ntc;

	}

}
