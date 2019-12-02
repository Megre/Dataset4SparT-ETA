package test.auto;

public class Strategy_Setter_LineConnection_Connector_7
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.Connector strategy = new CH.ifa.draw.figures.ShortestDistanceConnector(new CH.ifa.draw.figures.NumberTextFigure());
		CH.ifa.draw.figures.LineConnection context = new CH.ifa.draw.figures.LineConnection();
		context.connectStart(strategy);
		context.startFigure();
	}
} 
