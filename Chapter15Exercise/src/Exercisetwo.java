
public class Exercisetwo extends Complex {
	
	//this is the original code
	public static double abs(Complex c) {
	    return Math.sqrt(c.real * c.real + c.imag * c.imag);
	}
	
	//transfer it to an object method
	//I removed the static keyword
	//then removed the parameter and change c.real or c.imag to this.real and this.imag
	public double complexnumbers() {
		 return Math.sqrt(this.real * this.real + this.imag * this.imag);
	}
	


}