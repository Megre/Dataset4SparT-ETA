package test.auto;

public class Strategy_LocatorHandle_Locator_2
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Locator strategy = new CH.ifa.draw.standard.RelativeLocator(1.0, 1.0);
		CH.ifa.draw.standard.LocatorHandle context = new CH.ifa.draw.standard.LocatorHandle(new CH.ifa.draw.figures.GroupFigure(), strategy);		
		context.locate();
	}
}
