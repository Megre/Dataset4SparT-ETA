package test.auto;

public class TemplateMethod_AbstractScope_1
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.symboltable.AbstractScope abstractClass = new net.sourceforge.pmd.symboltable.ClassScope("test");
		abstractClass.contains(new net.sourceforge.pmd.symboltable.NameOccurrence(new net.sourceforge.pmd.ast.ASTEnumDeclaration(1), "test"));
	}
}
