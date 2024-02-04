package Recursion.src;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Fractal extends JFrame {
	public Fractal() {
		setBounds(100, 100, 800, 900);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		drawTri(g, 8, 100, 100, 700, 100, 400, 700);
	}

	public void drawTri(Graphics g, int iteration, int x1, int y1, int x2, int y2, int x3, int y3) {
		int[] xPoints = new int[] { x1, x2, x3 };
		int[] yPoints = new int[] { y1, y2, y3 };
		if (iteration == 1) {
			g.drawPolygon(xPoints, yPoints, 3);
		} else {
			int x4 = (x1+x2)/2;
			int y4 = (y1+y2)/2;
			int x5 = (x2+x3)/2;
			int y5 = (y2+y3)/2;
			int x6 = (x1+x3)/2;
			int y6 = (y1+y3)/2;
			g.drawPolygon(xPoints, yPoints, 3);
			drawTri(g, iteration-1, x1,y1,x4,y4,x6,y6);
			drawTri(g, iteration-1, x4,y4,x2,y2, x5,y5);
			drawTri(g, iteration-1, x6,y6,x5,y5, x3,y3);
			
		}
	}

	public static void main(String[] args) {
		Fractal x = new Fractal();
		x.setDefaultCloseOperation(EXIT_ON_CLOSE);
		x.setVisible(true);
	}
}


