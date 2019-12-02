package test.auto;

public class Strategy_PolygonHandle_Locator_3
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Locator strategy = new CH.ifa.draw.standard.OffsetLocator();
		CH.ifa.draw.contrib.PolygonHandle context = new CH.ifa.draw.contrib.PolygonHandle(new CH.ifa.draw.contrib.PolygonFigure(1, 1), strategy, 1);		
		context.locate();
	}
}
