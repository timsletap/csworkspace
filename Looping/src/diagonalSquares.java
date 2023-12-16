import java.awt.*;

import javax.swing.JFrame;
public class diagonalSquares extends JFrame {
	 public diagonalSquares() {
		 super("DIAGONAL SQUARES");
		 setSize(600,600);
		 setVisible(true);
	 }
	 public void paint(Graphics g) {
		 super.paint(g);
		 g.fillRect(40,40,20,20);
		 g.fillRect(60,60,20,20);
		 g.fillRect(80,80,20,20);
		for(int c = 1; c <= 20; c++) {
		 for(int i = 40; i <= 560; i+=20) {
			 Color rand = new Color((int)(Math.random()* 256), (int)(Math.random()* 256), (int)(Math.random()* 256));
			 g.setColor(rand);
			 g.fillRect(i,i,20,20);
			 g.fillRect(600-i,i,20,20);
			 try {
				 Thread.sleep(35);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		}
		 
		 
	 }
	 public static void main(String[] args) {
	        diagonalSquares application = new diagonalSquares();
	        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
