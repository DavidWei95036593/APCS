
public class Main {
	public static void main(String[] args) {
		PropositionConstant a = new PropositionConstant("a");
		PropositionConstant b = new PropositionConstant("b");
		LogicalSentence l1 = new LogicalSentence(a);
		LogicalSentence l2 = new LogicalSentence(b);
		LogicalSentence l3 = new Negation(l1);
		LogicalSentence l4 = new Negation(l3);
		//l5 is 
		LogicalSentence l5 =  new Conjunction(l3, new Negation(l4));

		TruthAssignment ta1 = new TruthAssignment();
		//it is an array
		
		//put just add element into the array
		ta1.put(b,true);
		ta1.put(a, false); 
		System.out.println(l5.evaluate(ta1));
		System.out.println(legal("a&"));
		System.out.println(findMatch("a(b)", 0));
		//findmatch("((((:,4( should return 4;
		String[] pc = {"p"};
		truthTable(pc);
	}

	private static boolean legal(String string) {
		String args1 = string;
		
		if (checkifspace(args1) != true)  {
			return false;}
			 if (checkifqp(args1)!= true) {
			return false;
				}
			 return true;
			}
			 
	//this check whether the sentence is a actually sentence or just an empty space
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
	private static char[] findMatch(String string, int i) {
		i = 0;
		if(string.contains(")")){
			for(int index = 0; index < string.length(); index ++) {
				if(string.index == "(");
			}
		}
		return null;
		
			
		
	}

	private static void truthTable(String[] pc) {
		
	}
}
//evaluate l5 needs to be a conjunction (what the truth value of the conjunction is)
//the goal of findmatch 