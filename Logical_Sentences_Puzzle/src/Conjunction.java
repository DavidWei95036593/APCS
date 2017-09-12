
public class Conjunction extends LogicalSentence {
	private LogicalSentence l5;
//	public Conjunction(PropositionConstant a) {
//		super(a);
//	}

	public Conjunction(LogicalSentence l3, Negation negation) {
		
		this.l5 = l3;
	}

}
