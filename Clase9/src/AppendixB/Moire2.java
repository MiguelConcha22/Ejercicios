package AppendixB;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Moire2 extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        Canvas canvas = new Moire2();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
    	//origin(g, 90, 3);
        //center(g, 60, 4);
        radial(g, 0, 0.5);
    }
    
    public static double cot(double radian){
        return 1 / Math.tan(radian);
     }
    
    public void origin(Graphics g, int inicio, int espacio){
        int i = inicio;
        while (i < getWidth()) {
           g.drawOval (0, 0, i, i);
           i += espacio;
        }
     }
     
     public void center(Graphics g, int inicio, int espacio){
        int i = inicio;
        while (i < Math.min(getWidth(), getHeight())) {
           g.drawOval ((getWidth() - i) / 2, (getHeight() - i) / 2, i, i);
           i += espacio;
        }
     }
    
    public void radial(Graphics g, double anguloInicio, double espacio){
        double angulo = anguloInicio;
        while (angulo < 180){ 
           if (angulo > 45 && angulo < 135){
              int x1 = (int)((1 - cot(Math.toRadians(angulo))) * getWidth() / 2);
              int y1 = getHeight();
              int x2 = (int)((1 + cot(Math.toRadians(angulo))) * getWidth() / 2);
              int y2 = 0;
              g.drawLine(x1,y1,x2,y2);
           } 
           else {
              int x1 = 0;
              int y1 = (int)((1 + Math.tan(Math.toRadians(angulo))) * getHeight() / 2);
              int x2 = getWidth();
              int y2 = (int)((1 - Math.tan(Math.toRadians(angulo))) * getHeight() / 2);
              g.drawLine(x1,y1,x2,y2);
           
           } 
           angulo += espacio;
        }
     }
}