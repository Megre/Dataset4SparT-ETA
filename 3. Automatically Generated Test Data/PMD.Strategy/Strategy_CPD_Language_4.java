package test.auto;

public class Strategy_CPD_Language_4
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.cpd.Language strategy = new net.sourceforge.pmd.cpd.CPPLanguage();
		net.sourceforge.pmd.cpd.CPD context = new net.sourceforge.pmd.cpd.CPD(1, strategy);		
		context.add(new java.io.File("D:/test_input_file.txt"));
	}
}
