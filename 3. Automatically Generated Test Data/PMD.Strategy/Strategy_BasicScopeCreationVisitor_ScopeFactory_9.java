package test.auto;

public class Strategy_BasicScopeCreationVisitor_ScopeFactory_9
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.symboltable.ScopeFactory strategy = new net.sourceforge.pmd.symboltable.BasicScopeFactory();
		net.sourceforge.pmd.symboltable.BasicScopeCreationVisitor context = new net.sourceforge.pmd.symboltable.BasicScopeCreationVisitor(strategy);		
		context.visit(new net.sourceforge.pmd.ast.ASTMethodDeclaration(new net.sourceforge.pmd.ast.JavaParser(new net.sourceforge.pmd.ast.JavaCharStream(new java.lang.Object() { public java.io.FileInputStream fun() { 	 		return new java.io.FileInputStream(new java.io.File("D:/test_input_file.txt")); 	} catch (java.io.FileNotFoundException e) { } 	return null; } }.fun())), 1), new java.lang.Object());
	}
}
