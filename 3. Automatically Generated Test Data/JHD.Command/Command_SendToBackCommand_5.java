package test.auto;

public class Command_SendToBackCommand_5
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.DrawingView receiver = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.nothing.NothingApplet(), 1, 1);
		CH.ifa.draw.util.Command command = new CH.ifa.draw.standard.SendToBackCommand("test", receiver);
		command.execute();
	}
}
