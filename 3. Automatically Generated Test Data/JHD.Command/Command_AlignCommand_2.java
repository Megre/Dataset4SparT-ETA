package test.auto;

public class Command_AlignCommand_2
{
	public static void main(String[] args) throws java.lang.Exception {
		CH.ifa.draw.framework.DrawingView receiver = new CH.ifa.draw.standard.StandardDrawingView(new CH.ifa.draw.samples.javadraw.JavaDrawViewer(), 1, 1);
		CH.ifa.draw.util.Command command = new CH.ifa.draw.standard.AlignCommand("test", receiver, 1);
		command.execute();
	}
}
