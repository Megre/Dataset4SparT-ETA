package test.auto;

public class Strategy_HandleTracker_Handle_15
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Handle strategy = new CH.ifa.draw.figures.FontSizeHandle(new CH.ifa.draw.figures.NumberTextFigure(), new CH.ifa.draw.standard.OffsetLocator());
		CH.ifa.draw.standard.HandleTracker context = new CH.ifa.draw.standard.HandleTracker(new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.nothing.NothingApplet(), 1, 1), strategy);		
		context.mouseDrag(new java.awt.event.MouseEvent(new java.awt.Button(), java.awt.event.MouseEvent.MOUSE_CLICKED, 1, java.awt.event.InputEvent.CTRL_DOWN_MASK, 1, 1, 1, false), 1, 1);
	}
}
