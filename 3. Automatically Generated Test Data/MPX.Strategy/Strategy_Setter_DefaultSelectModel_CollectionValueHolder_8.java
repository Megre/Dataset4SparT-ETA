package test.auto;

public class Strategy_Setter_DefaultSelectModel_CollectionValueHolder_8
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.CollectionValueHolder strategy = new com.taursys.model.VOListValueHolder();
		com.taursys.model.DefaultSelectModel context = new com.taursys.model.DefaultSelectModel();
		context.setList(strategy);
		context.getSelectedItem();
	}
} 
