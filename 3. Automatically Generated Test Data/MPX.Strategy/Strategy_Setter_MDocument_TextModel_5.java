package test.auto;

public class Strategy_Setter_MDocument_TextModel_5
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.TextModel strategy = new com.taursys.model.DefaultTextModel(1);
		com.taursys.swing.MDocument context = new com.taursys.swing.MDocument();
		context.setModel(strategy);
		context.setFormatPattern("test");
	}
} 