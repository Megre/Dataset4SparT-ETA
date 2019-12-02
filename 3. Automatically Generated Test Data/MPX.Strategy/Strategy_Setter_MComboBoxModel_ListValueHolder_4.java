package test.auto;

public class Strategy_Setter_MComboBoxModel_ListValueHolder_4
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.ListValueHolder strategy = new com.taursys.model.AbstractListValueHolder(new com.taursys.model.ObjectValueHolder());
		com.taursys.swing.MComboBoxModel context = new com.taursys.swing.MComboBoxModel();
		context.setListValueHolder(strategy);
		context.getSize();
	}
} 
