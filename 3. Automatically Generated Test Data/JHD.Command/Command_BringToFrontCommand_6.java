package test.auto;

public class Command_BringToFrontCommand_6
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.DrawingView receiver = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.application.DrawApplication(), 1, 1);
		CH.ifa.draw.util.Command command = new CH.ifa.draw.standard.BringToFrontCommand("test", receiver);
		command.execute();
	}
}
