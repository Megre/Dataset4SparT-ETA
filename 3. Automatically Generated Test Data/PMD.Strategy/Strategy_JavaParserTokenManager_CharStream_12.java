package test.auto;

public class Strategy_JavaParserTokenManager_CharStream_12
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.ast.CharStream strategy = new net.sourceforge.pmd.ast.JavaCharStream(new java.io.FileInputStream(new java.io.File("D:/test_input_file.txt")));
		net.sourceforge.pmd.ast.JavaParserTokenManager context = new net.sourceforge.pmd.ast.JavaParserTokenManager(strategy);		
		context.MoreLexicalActions();
	}
}
