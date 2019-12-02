package test.auto;

public class State_CreationTool_Figure_8
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Figure state = new CH.ifa.draw.contrib.DiamondFigure(new java.awt.Point(), new java.awt.Point());
		CH.ifa.draw.standard.CreationTool context = new CH.ifa.draw.standard.CreationTool(new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.javadraw.JavaDrawViewer(), 1, 1), state);
		context.mouseDown(new java.awt.event.MouseEvent(new java.awt.Button(), java.awt.event.MouseEvent.MOUSE_CLICKED, 1, 0, 1, 1, 1, false), 1, 1);
	}
} 
