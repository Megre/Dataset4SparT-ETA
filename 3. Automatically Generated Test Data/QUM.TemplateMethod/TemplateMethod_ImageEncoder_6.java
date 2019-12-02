package test.auto;

public class TemplateMethod_ImageEncoder_6
{
	public static void main(String[] args) throws java.lang.Exception {
		acme.ImageEncoder abstractClass = new acme.GifEncoder(new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_3BYTE_BGR), new java.io.FileOutputStream(new java.io.File("D:/test_output_file.txt")));
		abstractClass.encodePixelsWrapper(1, 1, 1, 1, new int[]{ 1}, 1, 1);
	}
}
