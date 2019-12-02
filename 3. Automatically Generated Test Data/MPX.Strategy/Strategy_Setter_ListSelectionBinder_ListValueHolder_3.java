package test.auto;

public class Strategy_Setter_ListSelectionBinder_ListValueHolder_3
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.ListValueHolder strategy = new com.taursys.model.AbstractListValueHolder(new com.taursys.model.ObjectValueHolder());
		com.taursys.swing.ListSelectionBinder context = new com.taursys.swing.ListSelectionBinder();
		context.setListValueHolder(strategy);
		context.valueChanged(new javax.swing.event.ListSelectionEvent(new java.lang.Object(), 1, 1, true));
	}
} 
