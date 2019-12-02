package test.auto;

public class Strategy_Setter_DOM_1_20000929_DocumentAdapter_AbstractWriter_1
{
	public static void main(String[] args) throws java.lang.Exception {
		com.taursys.dom.AbstractWriter strategy = new com.taursys.dom.HTMLWriter();
		com.taursys.dom.DOM_1_20000929_DocumentAdapter context = new com.taursys.dom.DOM_1_20000929_DocumentAdapter(new java.lang.Object() { public org.w3c.dom.Document fun() throws Exception { 	javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance(); 	javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();     org.w3c.dom.Document doc = db.newDocument();     doc.appendChild(doc.createElement("html")); 	return doc; } }.fun());
		context.setXMLWriter(strategy);
		context.write(new java.lang.Object() { public java.io.FileOutputStream fun() { 	try { 		return new java.io.FileOutputStream(new java.io.File("D:/test_output_file.txt")); 	} catch (java.io.FileNotFoundException e) { } 	return null; } }.fun());
	}
} 
