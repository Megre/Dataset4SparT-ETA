package test.auto;

public class Strategy_Setter_StandardDrawingView_PointConstrainer_2
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.PointConstrainer strategy = new CH.ifa.draw.standard.GridConstrainer(1, 1);
		CH.ifa.draw.standard.StandardDrawingView context = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.nothing.NothingApplet(), 1, 1);
		context.setConstrainer(strategy);
		context.mouseReleased(new java.awt.event.MouseEvent(new java.awt.Button(), java.awt.event.MouseEvent.MOUSE_CLICKED, 1, java.awt.event.InputEvent.ALT_DOWN_MASK, 1, 1, 1, false));
	}
} 
