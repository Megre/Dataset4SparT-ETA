package test.auto;

public class Strategy_Setter_StandardDrawingView_Drawing_154
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Drawing strategy = new CH.ifa.draw.samples.javadraw.BouncingDrawing();
		CH.ifa.draw.standard.StandardDrawingView context = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.applet.DrawApplet(), 1, 1);
		context.setDrawing(strategy);
		context.add(new CH.ifa.draw.figures.RoundRectangleFigure(new java.awt.Point(), new java.awt.Point()));
	}
} 
