package test.auto;

public class Strategy_BasicScopeCreationVisitor_ScopeFactory_1
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.symboltable.ScopeFactory strategy = new net.sourceforge.pmd.symboltable.BasicScopeFactory();
		net.sourceforge.pmd.symboltable.BasicScopeCreationVisitor context = new net.sourceforge.pmd.symboltable.BasicScopeCreationVisitor(strategy);		
		context.visit(new net.sourceforge.pmd.ast.ASTBlock(1), new java.lang.Object());
	}
}
