package test.auto;

public class Strategy_Setter_MComboBoxModel_ValueHolder_1
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.model.ValueHolder strategy = new com.taursys.model.VariantValueHolder(1);
		com.taursys.swing.MComboBoxModel context = new com.taursys.swing.MComboBoxModel();
		context.setValueHolder(strategy);
		context.setSelectedItem(new java.lang.Object());
	}
} 