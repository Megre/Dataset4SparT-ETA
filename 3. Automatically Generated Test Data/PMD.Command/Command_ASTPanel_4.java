package test.auto;

public class Command_ASTPanel_4
{
	public static void main(String[] args) throws java.lang.Exception {
		net.sourceforge.pmd.util.viewer.model.ViewerModel receiver = new net.sourceforge.pmd.util.viewer.model.ViewerModel();
		javax.swing.event.TreeSelectionListener command = new net.sourceforge.pmd.util.viewer.gui.ASTPanel(receiver);
		command.viewerModelChanged(new net.sourceforge.pmd.util.viewer.model.ViewerModelEvent(new java.lang.Object(), 1));
	}
}
