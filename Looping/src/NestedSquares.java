import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class NestedSquares extends JFrame{
	public NestedSquares() {
		super("Nested Squares");
		 setSize(600,600);
		 setVisible(true);
	 }
	 public void paint(Graphics g) {
		 final int gap = 50;
		 super.paint(g);
		 int c = 1;
		g.setColor(Color.RED);
			for(int y =50; y <= 400; y+=gap) {
				c++;
				for(int x = 50; x <= 400; x+=gap) {
					c++;
					if(c % 2 == 0) {
						g.setColor(Color.RED);
						g.fillRect(x,y,50,50);
					} else {
						g.setColor(Color.BLACK);
						g.fillRect(x,y,50,50);
					}
					
				 
			 }
			}
		}

		 
	 public static void main(String[] args) {
		 NestedSquares applicationC = new NestedSquares();
	        applicationC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}


