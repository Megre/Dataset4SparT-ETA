package test.auto;

public class Strategy_Setter_LineConnection_Connector_2
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Connector strategy = new CH.ifa.draw.figures.ShortestDistanceConnector();
		CH.ifa.draw.figures.LineConnection context = new CH.ifa.draw.figures.LineConnection();
		context.connectStart(strategy);
		context.endFigure();
	}
} 
