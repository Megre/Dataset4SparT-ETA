package test.auto;

public class Strategy_BasicScopeCreationVisitor_ScopeFactory_7
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.symboltable.ScopeFactory strategy = new net.sourceforge.pmd.symboltable.BasicScopeFactory();
		net.sourceforge.pmd.symboltable.BasicScopeCreationVisitor context = new net.sourceforge.pmd.symboltable.BasicScopeCreationVisitor(strategy);		
		context.visit(new net.sourceforge.pmd.ast.ASTBlock(new net.sourceforge.pmd.ast.JavaParser(new net.sourceforge.pmd.ast.JavaCharStream(new java.lang.Object() { public java.io.FileReader func() { 	try { 		return new java.io.FileReader(new java.io.File("D:/test_input_file.txt")); 	} catch (java.io.FileNotFoundException e) { } 	return null; } }.func(), 1, 1)), 1), new java.lang.Object());
	}
}
