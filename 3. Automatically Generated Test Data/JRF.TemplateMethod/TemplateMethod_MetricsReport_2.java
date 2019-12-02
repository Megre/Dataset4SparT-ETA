package test.auto;

public class TemplateMethod_MetricsReport_2
{
	public static void main(String[] args) throws java.lang.Exception {
		org.acm.seguin.metrics.MetricsReport abstractClass = new org.acm.seguin.metrics.TextReport();
		abstractClass.typeReport(new org.acm.seguin.metrics.TypeMetrics("test", "test"));
	}
}
