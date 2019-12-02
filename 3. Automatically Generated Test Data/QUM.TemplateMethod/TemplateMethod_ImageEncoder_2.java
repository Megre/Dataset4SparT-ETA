package test.auto;

public class TemplateMethod_ImageEncoder_2
{
	public static void main(String[] args) throws java.lang.Exception {
		acme.ImageEncoder abstractClass = new acme.GifEncoder(new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_3BYTE_BGR), new java.io.FileOutputStream(new java.io.File("D:/test_output_file.txt")), true);
		abstractClass.encodeFinish();
	}
}
