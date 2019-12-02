package test.auto;

public class Strategy_PolygonHandle_Locator_2
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Locator strategy = new CH.ifa.draw.standard.RelativeLocator(1.0, 1.0);
		CH.ifa.draw.contrib.PolygonHandle context = new CH.ifa.draw.contrib.PolygonHandle(new CH.ifa.draw.contrib.PolygonFigure(new java.awt.Polygon()), strategy, 1);		
		context.locate();
	}
}
