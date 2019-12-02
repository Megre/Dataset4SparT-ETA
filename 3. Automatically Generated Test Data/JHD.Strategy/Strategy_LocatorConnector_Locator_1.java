package test.auto;

public class Strategy_LocatorConnector_Locator_1
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Locator strategy = new CH.ifa.draw.standard.RelativeLocator(1.0, 1.0);
		CH.ifa.draw.standard.LocatorConnector context = new CH.ifa.draw.standard.LocatorConnector(new CH.ifa.draw.figures.NumberTextFigure(), strategy);		
		context.displayBox();
	}
}
