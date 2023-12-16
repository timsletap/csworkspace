import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Squares extends JFrame{
	public Squares() {
		super("Squares");
		 setSize(600,600);
		 setVisible(true);
	 }
	 public void paint(Graphics g) {
		 final int gap = 10;
		 super.paint(g);
		g.setColor(Color.RED);
		for(int c = 1; c <= 10; c++) {
			for(int i =600; i >= gap; i-=gap) {
				if(i % 20 == 0) {
					g.setColor(Color.BLACK);
				} else {
					g.setColor(Color.RED);
				}
				g.fillRect(50, 50, i, i);
				 try {
					 Thread.sleep(20);
				 } catch (InterruptedException e) {
					 e.printStackTrace();
				 }
			 }
		}
		

		}
		 
		 
	 public static void main(String[] args) {
	        Squares applicationx = new Squares();
	        applicationx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
