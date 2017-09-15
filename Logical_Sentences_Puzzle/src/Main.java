
public class Main {
	public static void main(String[] args) {
		//
		PropositionConstant a = new PropositionConstant("a");
		PropositionConstant b = new PropositionConstant("b");
		LogicalSentence l1 = new LogicalSentence(a);
		LogicalSentence l2 = new LogicalSentence(b);
		LogicalSentence l3 = new Negation(l1);
		LogicalSentence l4 = new Negation(l3);
		//Conjunction(l3, new Negation(l4)) means to check if both l3 and Negation(l4) are true or false
		//if it is not, then it returns false
		LogicalSentence l5 =  new Conjunction(l3, new Negation(l4));
		//truth assignment is an empty array list
		TruthAssignment ta1 = new TruthAssignment();
		
		
		//put just add element into the array
		ta1.put(b,true);
		ta1.put(a, false); 
		System.out.println(l5.evaluate(ta1));
		System.out.println(legal("a&"));
		System.out.println(findMatch("a(dsb)(ds)", 0));
		//findmatch("((((:,4( should return 4;
		String[] pc = {"p"};
		truthTable(pc);
	}
	//this check if a string is a legal sentence
	private static boolean legal(String string) {
		String args1 = string;
		//if it has space then it is true
		if (checkifspace(args1) != true)  {
			return false;}
		//if it has character q p then it is true
			 if (checkifqp(args1)!= true) {
			return false;
				}
			 return true;
			}
			 
	// this check whether the sentence is a actually sentence or just an empty space
	public static  boolean checkifspace (String a) {
		if (a.isEmpty()) {
			return false;
		}else {
			return true;}
		}
	
	//this check if the string is just a single letter
	public static boolean checkifqp(String a) {
		if (a== "q" || a=="p") {
		return true;}
		else {
			return false;}
		}
	
	// these check if the whole string split by logical operators &,|,<=>,=>
	public static boolean checkifmeetsthelogicaloperators(String a) {
		if (a.contains("&") || a.contains("|")||a.contains("<=>")|| a.contains("=>")) {
			return false;	
		}else {
		return true;
		}
	}
	
	//this find the last 
	private static String findMatch(String str, int i) {
		//this finds the last "(" of the string and then move 1 character unit forward
		str = str.substring(str.lastIndexOf("(") + 1);
		//this 
		str = str.substring(0, str.indexOf(")"));
		return str;
		}

			
	
//	 "(abc(d(e)))"
	
	//(abc(edf(g(hi))))
		
		
		
	

	private static void truthTable(String[] pc) {
		
	}
}
//evaluate l5 needs to be a conjunction (what the truth value of the conjunction is)
//the goal of findmatch 