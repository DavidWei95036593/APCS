
public class LogicalSentence {
	private PropositionConstant a;
			//private TruthAssignment ta1;
	public LogicalSentence(PropositionConstant a) {
		//set the ProperstionConstant into the input in main
				this.a = a;
	}

	public boolean evaluate(TruthAssignment ta1) {
		String args1 = "~h&|ds<=>dsds=>i";
		if (checkifspace(args1) != true)  {
			 {if (checkifqp(args1)!= true) {
				boolean answer = false;
//				while (answer != true){
//					if (checkifmeetsthelogicaloperators(args1) != true) {
//						return false;
//						
//					}else {
//						answer = true;
//					}
//				 }
//				}
			}
			 
			}
		}
	
		

	}

	public LogicalSentence() {
		
	}
	

	

	//import java.util.*;

	// this check whether the sentence is a actually sentence or just an empty space
	public  boolean checkifspace (String a) {
		if (a.isEmpty()) {
			return false;
		}else {
			return true;}
		}
	
	public String checkfortilde (String r){
		if (r.contains("~")){
			r = r.replace("~","");
			
		}
		return r;
				
	}
	//this check if the string is just a single letter
	public boolean checkifqp(String a) {
		if (a== "q" || a=="p") {
		return true;}
		else {
			return false;}
		}
	
	// these check if the whole string split by logical operators &,|,<=>,=>
	public boolean checkifmeetsthelogicaloperators(String a) {
		if (a.contains("&") || a.contains("|")||a.contains("<=>")|| a.contains("=>")) {
			return false;
			
		}else {
		return true;
		}
	}
	//this method will fix the checkifmeetsthelogicaloperators method
	public  String[] fixthelogicaloperators (String a) {
		String[] parts = a.split("|&<=>=>");
		return parts;
	}

		
	
	
	
	
	public  void main (String[] args) {
		String args1 = "~h&|ds<=>dsds=>i";
		
	if (checkifspace(args1) != true)  {
		 {if (checkifqp(args1)!= true) {
			boolean answer = false;
			while (answer != true){
				
				if (checkifmeetsthelogicaloperators(args1) != true) {
					fixthelogicaloperators(args1);
					
				}else {
					answer = true;
				}
			 }
			}
		}
		}
	}
	


//legal()
//is the whole a p or q
//is the whole string a ~ followed by a legal()
//is the whole string legal() split by logical operators &,|,<=>,=>, ex p&q would be split as [p,q]



}


