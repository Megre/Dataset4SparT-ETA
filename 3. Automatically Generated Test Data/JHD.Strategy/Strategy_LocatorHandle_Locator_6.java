package test.auto;

public class Strategy_LocatorHandle_Locator_6
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Locator strategy = new CH.ifa.draw.standard.OffsetLocator();
		CH.ifa.draw.standard.LocatorHandle context = new CH.ifa.draw.standard.LocatorHandle(new CH.ifa.draw.figures.ImageFigure(new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_3BYTE_BGR), "test", new java.awt.Point()), strategy);		
		context.locate();
	}
}
