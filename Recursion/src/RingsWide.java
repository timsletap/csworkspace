package Recursion.src;
import java.awt.*;
import javax.swing.*;

public class RingsWide extends JFrame
{ 
    public RingsWide(){
        super ("My Picture");
        setSize(600,600);
        setVisible(true);
        //repaint();
    }
   
    public void paint(Graphics g) {
		 super.paint(g);
		 bullseyeRecursive(g, 50,50, 500);
		/*for(int c = 1; c <= 20; c++) {
			int size = 500;
		 for(int i = 40; i < 300; i+=10) {
			if(i%20==0) {
			 g.setColor(Color.black);;
		 } else {
				 g.setColor(Color.RED);;
			 }
			 g.fillOval(i,i,size,size);
			 size-=20;
			 
		 }
		}
		*/
		 }
    
    public void bullseyeRecursive(Graphics g, int x, int y, int size) {
    	if(size < 10) {
    	g.fillOval(x,y,size,size);
    	} else {
    		if(size%3==0) {
   			 g.setColor(Color.RED);;
   		 } else {
   				 g.setColor(Color.BLACK);;
   			 }
    		g.fillOval(x,y,size,size);
    		 bullseyeRecursive(g, x+5, y+5, size-10);
    	}
    }
		
   public static void main(String args[]) {
        RingsWide application = new RingsWide();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}