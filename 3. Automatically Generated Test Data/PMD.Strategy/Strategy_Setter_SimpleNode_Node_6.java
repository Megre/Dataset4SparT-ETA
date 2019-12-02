package test.auto;

public class Strategy_Setter_SimpleNode_Node_6
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.ast.Node strategy = new net.sourceforge.pmd.ast.ASTForUpdate(new net.sourceforge.pmd.ast.JavaParser(new net.sourceforge.pmd.ast.JavaParserTokenManager(new net.sourceforge.pmd.ast.JavaCharStream(new java.io.FileReader(new java.io.File("D:/test_input_file.txt")), 1, 1, 1), 1)), 1);
		net.sourceforge.pmd.ast.SimpleNode context = new net.sourceforge.pmd.ast.SimpleNode(new net.sourceforge.pmd.ast.JavaParser(new net.sourceforge.pmd.ast.JavaParserTokenManager(new net.sourceforge.pmd.ast.JavaCharStream(new java.io.FileReader(new java.io.File("D:/test_input_file.txt")), 1, 1, 1), 1)), 1);
		context.jjtReplaceChild(strategy, strategy);
		context.getScope();
	}
} 
