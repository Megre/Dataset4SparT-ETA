package test.auto;

public class Strategy_Setter_MComboBoxModel_ListValueHolder_2
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.ListValueHolder strategy = new com.taursys.model.VOListValueHolder();
		com.taursys.swing.MComboBoxModel context = new com.taursys.swing.MComboBoxModel();
		context.setListValueHolder(strategy);
		context.getSize();
	}
} 
