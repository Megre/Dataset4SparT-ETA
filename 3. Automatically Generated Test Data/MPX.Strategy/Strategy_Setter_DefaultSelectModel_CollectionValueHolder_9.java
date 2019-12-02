package test.auto;

public class Strategy_Setter_DefaultSelectModel_CollectionValueHolder_9
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.CollectionValueHolder strategy = new com.taursys.model.AbstractListValueHolder(new com.taursys.model.ObjectValueHolder());
		com.taursys.model.DefaultSelectModel context = new com.taursys.model.DefaultSelectModel();
		context.setList(strategy);
		context.getSelectedItem();
	}
} 
