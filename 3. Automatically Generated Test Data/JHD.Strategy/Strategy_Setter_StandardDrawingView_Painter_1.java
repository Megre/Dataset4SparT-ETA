package test.auto;

public class Strategy_Setter_StandardDrawingView_Painter_1
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Painter strategy = new CH.ifa.draw.standard.SimpleUpdateStrategy();
		CH.ifa.draw.standard.StandardDrawingView context = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.nothing.NothingApplet(), 1, 1);
		context.setDisplayUpdate(strategy);
		context.paint(new javax.swing.DebugGraphics());
	}
} 
