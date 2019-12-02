package test.auto;

public class Command_AlignCommand_4
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.DrawingView receiver = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.javadraw.JavaDrawApplet(), 1, 1);
		CH.ifa.draw.util.Command command = new CH.ifa.draw.standard.AlignCommand("test", receiver, 1);
		command.execute();
	}
}
