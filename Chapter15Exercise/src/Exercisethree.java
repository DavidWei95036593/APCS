
public class Exercisethree extends Complex {
		//this is the original code
	  public boolean equals(Complex b) {
	        return(real == b.real && imag == b.imag);
	    }
	//transfer it to a class method
	//Add static keyword
	//Add a new Argument.
	
	public static boolean equals(Complex a,Complex b) {
		 return(a.real == b.real && a.imag == b.imag);
	}
}
