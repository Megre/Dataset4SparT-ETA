package test.auto;

public class State_CreationTool_Figure_69
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Figure state = new CH.ifa.draw.figures.LineConnection();
		CH.ifa.draw.standard.CreationTool context = new CH.ifa.draw.standard.CreationTool(new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.javadraw.JavaDrawApplet(), 1, 1), state);
		context.mouseDown(new java.awt.event.MouseEvent(new java.awt.Button(), java.awt.event.MouseEvent.MOUSE_CLICKED, 1, java.awt.event.InputEvent.SHIFT_DOWN_MASK, 1, 1, 1, false), 1, 1);
	}
} 
