package test.auto;

public class Strategy_Setter_MTableModel_ListValueHolder_1
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.ListValueHolder strategy = new com.taursys.model.VOListValueHolder();
		com.taursys.swing.MTableModel context = new com.taursys.swing.MTableModel();
		context.setListValueHolder(strategy);
		context.setList(new com.taursys.model.AbstractListValueHolder(new com.taursys.model.ObjectValueHolder()));
	}
} 
