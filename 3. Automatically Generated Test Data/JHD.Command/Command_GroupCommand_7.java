package test.auto;

public class Command_GroupCommand_7
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.DrawingView receiver = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.application.DrawApplication("test"), 1, 1);
		CH.ifa.draw.util.Command command = new CH.ifa.draw.figures.GroupCommand("test", receiver);
		command.execute();
	}
}
