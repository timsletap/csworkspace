package Recursion.src;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class myFractal extends JFrame {
	private int iters;
	public myFractal(int iters) {
		setBounds(100, 100, 1000, 1000);
		setResizable(true);
		this.iters = iters;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		drawFract(g, iters, 100, 100, 700, 100, 100, 700, 700, 700);
	}

	public void drawFract(Graphics g, int iteration, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		int[] xPoints = new int[] { x1, x2, x4, x3 };
		int[] yPoints = new int[] { y1, y2, y4, y3};
		if (iteration == 1) {
			g.setColor(Color.BLUE);
			g.drawPolygon(xPoints, yPoints, 4);
		} else {
			int x5 = (x1+x2)/2;
			int y5 = (y1+y2)/2;
			int x6 = (x2+x4)/2;
			int y6 = (y2+y4)/2;
			int x7 = (x4+x3)/2;
			int y7 = (y4+y3)/2;
			int x8 = (x1+x3)/2;
			int y8 = (y1+y3)/2;
			if(iteration % 2 == 0) {
				g.setColor(Color.BLACK);
			} else {
				g.setColor(Color.BLUE);
			}
			g.drawPolygon(xPoints, yPoints, 4);
			drawFract(g, iteration-1, x5,y5,x6,y6,x8,y8,x7,y7);
			
			
		}
	}

	public static void main(String[] args) {
		myFractal x = new myFractal(11);
		x.setDefaultCloseOperation(EXIT_ON_CLOSE);
		x.setVisible(true);
	}
}



