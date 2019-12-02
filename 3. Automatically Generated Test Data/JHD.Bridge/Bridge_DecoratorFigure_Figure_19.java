package test.auto;

public class Bridge_DecoratorFigure_Figure_19
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Figure implementor = new CH.ifa.draw.contrib.DiamondFigure(new java.awt.Point(), new java.awt.Point());
		CH.ifa.draw.standard.DecoratorFigure abstraction = new CH.ifa.draw.samples.javadraw.AnimationDecorator(implementor);
		abstraction.decorate(new CH.ifa.draw.figures.ImageFigure(new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_3BYTE_BGR), "test", new java.awt.Point()));
	}
}
