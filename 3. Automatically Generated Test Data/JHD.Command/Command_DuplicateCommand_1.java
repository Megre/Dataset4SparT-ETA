package test.auto;

public class Command_DuplicateCommand_1
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.DrawingView receiver = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.pert.PertApplet(), 1, 1);
		CH.ifa.draw.util.Command command = new CH.ifa.draw.standard.DuplicateCommand("test", receiver);
		command.execute();
	}
}