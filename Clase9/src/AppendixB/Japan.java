package AppendixB;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Japan extends Canvas{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new Japan();
		canvas.setSize(600, 400);
		canvas.setBackground(Color.white);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(200, 100, 200, 200);
	}
}
