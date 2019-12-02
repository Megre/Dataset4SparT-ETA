package test.auto;

public class TemplateMethod_AbstractScope_3
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.symboltable.AbstractScope abstractClass = new net.sourceforge.pmd.symboltable.ClassScope("test");
		abstractClass.contains(new net.sourceforge.pmd.symboltable.NameOccurrence(new net.sourceforge.pmd.ast.ASTPackageDeclaration(new net.sourceforge.pmd.ast.JavaParser(new net.sourceforge.pmd.ast.JavaParserTokenManager(null)), 1), "test"));
	}
}
