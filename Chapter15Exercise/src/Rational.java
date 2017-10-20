//1

//Answer is the code bellow


//2. Make a few mistakes. Try invoking class methods as if they were object
//	  methods and vice-versa. Try to get a sense for what is legal and what
//	  is not, and for the error messages that you get when you mess up.


//Answer
//We cannot invoke an object method from static content without invoking with a variable.
//however, by removing the keyword static, we can in fact invoke object methods without using 
//variables and pass this as default.



// 3.Think about the pros and cons of class and object methods. Which
// is more concise (usually)? Which is a more natural way to express
// computation (or, maybe more fairly, what kind of computations can be
// expressed most naturally using each style)?

//Answer
//Class methods are not invoked on objects and they do not have a current object.
//Object methods operates on the invoked object and do not have the keyword static
	

public class Rational { 
	
int numerator, denominator;

	
	public void main(String[] args) {
		Rational r = new Rational(0, 0);
		Rational anotherr = new Rational(5, 7);
		reset(r);
		printRational(r);
		reset(r);
		negate(r);
		printRational(r);
		reset(r);
		invert(r);
		printRational(r);
		reset(r);
		//test the new method.
		double doubleValue = toDouble(r);
		System.out.println(doubleValue);
		
		reset(r);
		
		reduce(r);
		
		printRational(add(r, anotherr));
	}

	//make the constructor that takes no arguments
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	//make a second constructor that takes two arguments and initialize the instance variables.
	public Rational(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}
	
	//resetting the values after testing
	public void reset(Rational test) {
		test.numerator = 10;
		test.denominator = 20;
	}
	
	// Write a method called printRational  prints a Rational object
	public void printRational(Rational tPrint) {
		System.out.println(tPrint.numerator +  "/"  + tPrint.denominator);
	}
	
	// Write a method called negate that reverses the sign of a rational number. This method should be a modifier, so it should return void.
	public void negate(Rational test) {
		test.numerator = test.numerator * -1;
		if(test.denominator <= 0) {
			test.numerator = test.numerator * -1;
			test.denominator = test.denominator * -1;
		}
	}
	
	//Write a method called invert that inverts the number by swapping the numerator and denominator
	public void invert(Rational test) {
		int tempN = test.numerator;
		int tempD = test.denominator;
		
		test.numerator = tempD;
		test.denominator = tempN;
	}
	
	// Write a method called toDouble that converts the rational number to a double (floating-point number) and returns the result. This method is a pure function; it does not modify the object. 
	public double toDouble(Rational test) {
		double retval = (double)test.numerator / (double)test.denominator;
		return retval;
	}
	
	// Write a modifier named reduce that reduces a rational number to its lowest terms
	public void reduce(Rational test) {
		int remain, num1, num2;
		num1 = test.numerator;
		num2 = test.denominator;
		remain = num1 % num2;
		while(remain != 0) {
			remain = num1 % num2 ;
			num1 = num2;
			num2 = remain;
		}
		int GCD = num1;
		
		Rational ret = new Rational(test.numerator/GCD, test.denominator/GCD);
		
		printRational(ret);
	}
	
	//Write a method called add that takes two Rational numbers as arguments and returns a new Rational object. The return object should contain the sum of the arguments.
	public Rational add(Rational test, Rational testAdd) {
		Rational retAdd = new Rational(0, 0);
		if(test.denominator == testAdd.denominator) {
			retAdd.numerator = test.numerator + testAdd.numerator;
			retAdd.denominator = test.denominator;
			return retAdd;
		} else {
			retAdd.numerator = test.numerator * testAdd.denominator;
			retAdd.denominator = test.denominator * testAdd.denominator;
			testAdd.numerator = testAdd.numerator * test.denominator;
			testAdd.denominator = testAdd.denominator * test.denominator;
			retAdd.numerator += testAdd.numerator;
			int remain, num1, num2;
			num1 = retAdd.numerator;
			num2 = retAdd.denominator;
			remain = num1 % num2;
			while(remain != 0) {
				remain = num1 % num2 ;
				num1 = num2;
				num2 = remain;
			}
			int GCD = num1;
			retAdd.numerator = retAdd.numerator/GCD;
			retAdd.denominator = retAdd.denominator/GCD;
			return retAdd;
		}
	}
}
