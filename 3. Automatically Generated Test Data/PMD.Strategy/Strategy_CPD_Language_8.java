package test.auto;

public class Strategy_CPD_Language_8
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.cpd.Language strategy = new net.sourceforge.pmd.cpd.JavaLanguage();
		net.sourceforge.pmd.cpd.CPD context = new net.sourceforge.pmd.cpd.CPD(1, strategy);		
		context.add("test", true);
	}
}
