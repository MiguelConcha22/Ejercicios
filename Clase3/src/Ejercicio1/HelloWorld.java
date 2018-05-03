package Ejercicio1;

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorld extends Applet{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.drawString("Hello World", 10, 10);
	}
}