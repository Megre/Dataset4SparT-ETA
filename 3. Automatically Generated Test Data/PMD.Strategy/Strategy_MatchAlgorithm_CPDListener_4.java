package test.auto;

public class Strategy_MatchAlgorithm_CPDListener_4
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.cpd.CPDListener strategy = new net.sourceforge.pmd.cpd.GUI();
		net.sourceforge.pmd.cpd.MatchAlgorithm context = new net.sourceforge.pmd.cpd.MatchAlgorithm(new java.util.HashMap(), new net.sourceforge.pmd.cpd.Tokens(), 1, strategy);		
		context.findMatches();
	}
}