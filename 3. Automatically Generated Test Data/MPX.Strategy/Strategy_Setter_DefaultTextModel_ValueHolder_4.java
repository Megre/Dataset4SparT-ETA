package test.auto;

public class Strategy_Setter_DefaultTextModel_ValueHolder_4
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.ValueHolder strategy = new com.taursys.model.VOValueHolder();
		com.taursys.model.DefaultTextModel context = new com.taursys.model.DefaultTextModel();
		context.setValueHolder(strategy);
		context.getText();
	}
} 
