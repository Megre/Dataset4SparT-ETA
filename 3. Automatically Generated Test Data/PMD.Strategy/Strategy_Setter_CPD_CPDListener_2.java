package test.auto;

public class Strategy_Setter_CPD_CPDListener_2
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.cpd.CPDListener strategy = new net.sourceforge.pmd.cpd.CPDNullListener();
		net.sourceforge.pmd.cpd.CPD context = new net.sourceforge.pmd.cpd.CPD(1, new net.sourceforge.pmd.cpd.JavaLanguage());
		context.setCpdListener(strategy);
		context.go();
	}
} 
