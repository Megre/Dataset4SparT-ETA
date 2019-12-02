package test.auto;

public class Strategy_TestHierarchyRunView_TestRunContext_1
{
	public static void main(String[] args) throws java.lang.Exception {
		junit.swingui.TestRunContext strategy = new junit.swingui.TestRunner();
		junit.swingui.TestHierarchyRunView context = new junit.swingui.TestHierarchyRunView(strategy);		
		context.activate();
	}
}
