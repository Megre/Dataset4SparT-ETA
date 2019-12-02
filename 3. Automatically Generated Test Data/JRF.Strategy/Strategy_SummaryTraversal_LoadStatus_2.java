package test.auto;

public class Strategy_SummaryTraversal_LoadStatus_2
{
	public static void main(String[] args) throws java.lang.Exception {
		org.acm.seguin.summary.load.LoadStatus strategy = new org.acm.seguin.summary.load.TextLoadStatus();
		org.acm.seguin.summary.SummaryTraversal context = new org.acm.seguin.summary.SummaryTraversal("test", strategy);		
		context.go();
	}
}
