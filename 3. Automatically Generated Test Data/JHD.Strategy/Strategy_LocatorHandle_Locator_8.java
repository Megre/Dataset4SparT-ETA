package test.auto;

public class Strategy_LocatorHandle_Locator_8
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Locator strategy = new CH.ifa.draw.standard.OffsetLocator();
		CH.ifa.draw.standard.LocatorHandle context = new CH.ifa.draw.standard.LocatorHandle(new CH.ifa.draw.contrib.DiamondFigure(), strategy);		
		context.locate();
	}
}
