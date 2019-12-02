package test.auto;

public class Command_ASTPanel_6
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.util.viewer.model.ViewerModel receiver = new net.sourceforge.pmd.util.viewer.model.ViewerModel();
		javax.swing.event.TreeSelectionListener command = new net.sourceforge.pmd.util.viewer.gui.ASTPanel(receiver);
		command.valueChanged(new javax.swing.event.TreeSelectionEvent(new javax.swing.JTree(), null, false, null, null));
	}
}
