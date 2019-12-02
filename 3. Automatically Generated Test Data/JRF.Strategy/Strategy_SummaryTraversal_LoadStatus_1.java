package test.auto;

public class Strategy_SummaryTraversal_LoadStatus_1
{
	public static void main(String[] args) throws java.lang.Exception {
		org.acm.seguin.summary.load.LoadStatus strategy = new org.acm.seguin.summary.load.SilentLoadStatus();
		org.acm.seguin.summary.SummaryTraversal context = new org.acm.seguin.summary.SummaryTraversal("test", strategy);		
		context.go();
	}
}
