package test.auto;

public class Strategy_NameOccurrence_SimpleNode_11
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.ast.SimpleNode strategy = new net.sourceforge.pmd.ast.ASTForUpdate(new net.sourceforge.pmd.ast.JavaParser(new net.sourceforge.pmd.ast.JavaParserTokenManager(new net.sourceforge.pmd.ast.JavaCharStream(new java.io.FileInputStream(new java.io.File("D:/test_input_file.txt")), 1, 1), 1)), 1);
		net.sourceforge.pmd.symboltable.NameOccurrence context = new net.sourceforge.pmd.symboltable.NameOccurrence(strategy, "test");		
		context.getScope();
	}
}
