
public class LogicalSentence {
	private PropositionConstant a;
		//private TruthAssignment ta1;
	public LogicalSentence(PropositionConstant a) {
		//set the ProperstionConstant into the input in main
				this.a = a;
	}

	public boolean evaluate(TruthAssignment ta1) {
	/*	if(ta1) {
			return false;
		}*/
		return true;

	}

	public LogicalSentence() {
		
	}
}


