package test.auto;

public class Strategy_PMD_TargetJDKVersion_4
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.TargetJDKVersion strategy = new net.sourceforge.pmd.TargetJDK1_3();
		net.sourceforge.pmd.PMD context = new net.sourceforge.pmd.PMD(strategy);		
		context.processFile(new java.io.FileReader(new java.io.File("D:/test_input_file.txt")), new net.sourceforge.pmd.RuleSet(), new net.sourceforge.pmd.RuleContext());
	}
}
