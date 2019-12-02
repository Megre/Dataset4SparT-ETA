package test.auto;

public class State_DragTracker_Figure_29
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Figure state = new CH.ifa.draw.contrib.DiamondFigure();
		CH.ifa.draw.standard.DragTracker context = new CH.ifa.draw.standard.DragTracker(new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.pert.PertApplet(), 1, 1), state);
		context.mouseDown(new java.awt.event.MouseEvent(new java.awt.Button(), java.awt.event.MouseEvent.MOUSE_CLICKED, 1, java.awt.event.InputEvent.SHIFT_DOWN_MASK, 1, 1, 1, false), 1, 1);
	}
} 
