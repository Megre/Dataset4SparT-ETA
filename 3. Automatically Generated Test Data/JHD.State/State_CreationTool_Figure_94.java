package test.auto;

public class State_CreationTool_Figure_94
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Figure state = new CH.ifa.draw.figures.PolyLineFigure(1);
		CH.ifa.draw.standard.CreationTool context = new CH.ifa.draw.standard.CreationTool(new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.applet.DrawApplet(), 1, 1), state);
		context.mouseDown(new java.awt.event.MouseEvent(new java.awt.Button(), java.awt.event.MouseEvent.MOUSE_CLICKED, 1, java.awt.event.InputEvent.ALT_DOWN_MASK, 1, 1, 1, false), 1, 1);
	}
} 
