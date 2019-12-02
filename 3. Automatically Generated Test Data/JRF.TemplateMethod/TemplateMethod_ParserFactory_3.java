package test.auto;

public class TemplateMethod_ParserFactory_3
{
	public static void main(String[] args) throws java.lang.Exception {
		org.acm.seguin.parser.factory.ParserFactory abstractClass = new org.acm.seguin.parser.factory.InputStreamParserFactory(new java.io.FileInputStream(new java.io.File("D:/test_input_file.txt")), "test");
		abstractClass.getAbstractSyntaxTree(true);
	}
}
