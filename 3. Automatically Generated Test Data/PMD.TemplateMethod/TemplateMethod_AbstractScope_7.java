package test.auto;

public class TemplateMethod_AbstractScope_7
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.symboltable.AbstractScope abstractClass = new net.sourceforge.pmd.symboltable.ClassScope("test");
		abstractClass.contains(new net.sourceforge.pmd.symboltable.NameOccurrence(new net.sourceforge.pmd.ast.ASTPackageDeclaration(new net.sourceforge.pmd.ast.JavaParser(new net.sourceforge.pmd.ast.JavaCharStream(new java.io.FileInputStream(new java.io.File("D:/test_input_file.txt")), 1, 1, 1)), 1), "test"));
	}
}
