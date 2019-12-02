package test.auto;

public class Strategy_Setter_DefaultSelectModel_CollectionValueHolder_7
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.CollectionValueHolder strategy = new com.taursys.model.ObjectArrayValueHolder();
		com.taursys.model.DefaultSelectModel context = new com.taursys.model.DefaultSelectModel(1);
		context.setList(strategy);
		context.getSelectedItem();
	}
} 
