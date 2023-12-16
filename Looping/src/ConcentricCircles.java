import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ConcentricCircles extends JFrame{
	public ConcentricCircles() {
		 super("Concentric Circles");
		 setSize(600,600);
		 setVisible(true);
	 }
	 public void paint(Graphics g) {
		 super.paint(g);
		for(int c = 1; c <= 20; c++) {
			int size = 500;
		 for(int i = 40; i < 300; i+=10) {
			if(i%20==0) {
			 g.setColor(Color.black);;
		 } else {
				 g.setColor(Color.RED);;
			 }
			 g.fillOval(i,i,size,size);
			 size-=20;
			 try {
				 Thread.sleep(35);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		}
		 
		 
	 }
	 public static void main(String[] args) {
	        ConcentricCircles applicationx = new ConcentricCircles();
	        applicationx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
