import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Sonar extends JFrame{
	public Sonar() {
		super("Sonar");
		 setSize(1920,1080);
		 setVisible(true);
	 }
	 public void paint(Graphics g) {
		 super.paint(g);
		 g.setColor(Color.WHITE);
		 g.fillRect(0, 0, 1920, 1080);
		 for(int a = 1; a<=8; a++) {
		 int c = (int)(Math.random()*800)+1;
		 int d= (int)(Math.random()*800)+1;
		 g.setColor(Color.RED);{
		for(int i = 1; i<= 25; i++) {
			 g.drawOval(c-(i*10),d-(i*10),i*20,i*20);
			 try {
				 Thread.sleep(2);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
			}
		for(int f = 25; f > 0; f--) {
			try {
				 Thread.sleep(2);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
			g.setColor(Color.WHITE);
			
			g.drawOval(c-(f*10),d-(f*10),f*20,f*20);
		}
		
		 }
		}
		 
		 
					
				 
			 
		
	 }
		 
	 public static void main(String[] args) {
		 Sonar applicationC = new Sonar();
	        applicationC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}




