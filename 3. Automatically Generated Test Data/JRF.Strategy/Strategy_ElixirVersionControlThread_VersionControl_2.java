package test.auto;

public class Strategy_ElixirVersionControlThread_VersionControl_2
{
	public static void main(String[] args) throws java.lang.Exception {
		org.acm.seguin.version.VersionControl strategy = new org.acm.seguin.version.UserDirectedVersionControl();
		org.acm.seguin.ide.elixir.version.ElixirVersionControlThread context = new org.acm.seguin.ide.elixir.version.ElixirVersionControlThread(strategy, "test", 1);		
		context.run();
	}
}
