package test.auto;

public class Strategy_Setter_CPD_CPDListener_4
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.cpd.CPDListener strategy = new net.sourceforge.pmd.cpd.GUI();
		net.sourceforge.pmd.cpd.CPD context = new net.sourceforge.pmd.cpd.CPD(1, new net.sourceforge.pmd.cpd.PHPLanguage());
		context.setCpdListener(strategy);
		context.go();
	}
} 
