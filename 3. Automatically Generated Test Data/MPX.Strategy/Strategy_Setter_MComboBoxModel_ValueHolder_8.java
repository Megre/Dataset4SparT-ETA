package test.auto;

public class Strategy_Setter_MComboBoxModel_ValueHolder_8
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.ValueHolder strategy = new com.taursys.model.AbstractCollectionValueHolder(new com.taursys.model.ObjectValueHolder(), new com.taursys.model.AbstractListValueHolder(new com.taursys.model.ObjectValueHolder()));
		com.taursys.swing.MComboBoxModel context = new com.taursys.swing.MComboBoxModel();
		context.setValueHolder(strategy);
		context.setSelectedItem(new java.lang.Object());
	}
} 
