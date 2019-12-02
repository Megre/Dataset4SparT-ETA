package test.auto;

public class Bridge_DecoratorFigure_Figure_26
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Figure implementor = new CH.ifa.draw.contrib.DiamondFigure(new java.awt.Point(), new java.awt.Point());
		CH.ifa.draw.standard.DecoratorFigure abstraction = new CH.ifa.draw.samples.javadraw.AnimationDecorator(implementor);
		abstraction.decorate(new CH.ifa.draw.standard.StandardDrawing());
	}
}
