package test.auto;

public class TemplateMethod_ParserFactory_2
{
	public static void main(String[] args) throws java.lang.Exception {
		org.acm.seguin.parser.factory.ParserFactory abstractClass = new org.acm.seguin.parser.factory.FileParserFactory(new java.io.File("D:/test_input_file.txt"));
		abstractClass.getAbstractSyntaxTree(true);
	}
}
