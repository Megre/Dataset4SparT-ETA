package test.auto;

public class Strategy_Setter_Parameter_TextModel_6
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.TextModel strategy = new com.taursys.model.DefaultTextModel(1);
		com.taursys.xml.Parameter context = new com.taursys.xml.Parameter(1);
		context.setModel(strategy);
		context.getValue();
	}
} 